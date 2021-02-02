package com.cpp.mscs.cricscore.services;

import com.cpp.mscs.cricscore.models.Player;
import com.cpp.mscs.cricscore.repositories.PlayerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * Created by IntelliJ IDEA.
 * User: jayavardhanpatil
 * Date: 2/2/21
 * Time:  13:42
 */

@Service
public class PlayerService {

    @Autowired
    PlayerRepo playerRepo;

    public Player getPlayer(String uuid){
        Optional<Player> player = playerRepo.findById(uuid);
        return player.orElse(null);
    }

    public boolean addPlayer(Player player){
        try {
            playerRepo.save(player);
        }catch (Exception e){
            return false;
        }
        return true;
    }
}