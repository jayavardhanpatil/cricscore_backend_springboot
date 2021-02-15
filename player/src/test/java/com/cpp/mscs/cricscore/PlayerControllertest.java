package com.cpp.mscs.cricscore;

import static org.hamcrest.Matchers.containsString;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.cpp.mscs.cricscore.controller.PlayerController;
import com.cpp.mscs.cricscore.models.Player;
import com.cpp.mscs.cricscore.services.PlayerService;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * User: jayavardhanpatil
 * Date: 2/14/21
 * Time:  17:13
 */

@WebMvcTest(PlayerController.class)
public class PlayerControllertest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private Player player;


    @Test
    public void addPlayer() throws Exception {

        player.setName("jay");
        player.setUuid("test_uuid");
        player.setEmail("test@test.com");
        player.setDateOfBirth(new Date());

        this.mockMvc.perform(get("/players/add")).andDo(print()).andExpect(status().isOk());
    }
}