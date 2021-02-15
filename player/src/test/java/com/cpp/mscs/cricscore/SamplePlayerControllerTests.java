package com.cpp.mscs.cricscore;

import com.cpp.mscs.cricscore.models.City;
import com.cpp.mscs.cricscore.models.Player;
import com.cpp.mscs.cricscore.repositories.PlayerRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import java.util.UUID;

@SpringBootTest
class SamplePlayerControllerTests {

	@Autowired
	PlayerRepo playerRepo;

	@Test
	void contextLoads() throws ParseException {
		Player player = new Player();
		Random num = new Random();
		FileReader reader;

		ArrayList<String> list = new ArrayList<>();

		try {

			BufferedReader reader1 = new BufferedReader(new FileReader("/Users/jayavardhanpatil/Desktop/MOCK_DATA.csv"));
			String line = "";
			while ((line = reader1.readLine()) != null){
				list.add(line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");

		for(int i = 0; i<1000; i++){
			player.setUuid(UUID.randomUUID().toString());
			City city = new City();
			city.setCityId((long) num.nextInt(149) + 1);
			player.setCity(city);
			int randomNum = i+1;
			player.setName(list.get(randomNum).split(",")[1]);
			player.setDateOfBirth(simpleDateFormat.parse(list.get(randomNum).split(",")[3]));
			player.setPhoneNumber(Long.parseLong(list.get(randomNum).split(",")[2]));
			player.setEmail(list.get(randomNum).split(",")[4]);
			try{
				playerRepo.save(player);
				i--;
			}catch (Exception e){
				e.printStackTrace();
			}
		}
	}

}
