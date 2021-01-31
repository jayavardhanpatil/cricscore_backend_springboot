package com.cpp.mscs.cricscore.player.controller;

import com.cpp.mscs.cricscore.player.models.Player;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * User: jayavardhanpatil
 * Date: 1/31/21
 * Time:  14:30
 */

@RestController("/player")
public class PlayerProfile {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @GetMapping("/{playerId}")
    public Player getPlayer(@PathVariable String playerId) {
        Player player = new Player();
        player.setUuid(playerId);
        player.setCity("Bangalore");
        player.setName("Jayavardhan");
        player.setDob(new Date(1990, Calendar.MARCH, 14));

        return player;
    }

}