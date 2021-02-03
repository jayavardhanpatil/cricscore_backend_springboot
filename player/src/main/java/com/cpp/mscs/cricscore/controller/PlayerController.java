package com.cpp.mscs.cricscore.controller;

import com.cpp.mscs.cricscore.models.Player;
import com.cpp.mscs.cricscore.services.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Created by IntelliJ IDEA.
 * User: jayavardhanpatil
 * Date: 2/2/21
 * Time:  11:51
 */

@RestController
public class PlayerController {

    @Autowired
    PlayerService playerService;

    @PostMapping("/players/add")
    public ResponseEntity<Player> addPlayer(@RequestBody Player player){
        System.out.println(player.toString());
        playerService.addPlayer(player);
        return ResponseEntity.ok().body(player);
    }

    @GetMapping("/players/{playerId}")
    public Player getPlayer(@PathVariable String playerId){
        return playerService.getPlayer(playerId);
    }
}