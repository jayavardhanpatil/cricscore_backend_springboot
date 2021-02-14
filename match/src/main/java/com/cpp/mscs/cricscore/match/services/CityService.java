package com.cpp.mscs.cricscore.match.services;

import com.cpp.mscs.cricscore.match.models.City;
import com.cpp.mscs.cricscore.match.repositories.CityRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: jayavardhanpatil
 * Date: 2/4/21
 * Time:  13:28
 */

@Service
public class CityService {

    @Autowired
    CityRepo cityRepo;

    public void addCity(City city){
        cityRepo.save(city);
    }

    public void updateCity(City city){
        cityRepo.save(city);
    }

    public List<City> getALlCities(){
        return cityRepo.findAll();
    }

}