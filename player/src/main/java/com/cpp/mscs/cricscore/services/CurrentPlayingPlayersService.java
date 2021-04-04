package com.cpp.mscs.cricscore.services;

import com.cpp.mscs.cricscore.JedisPoolHelper;
import com.cpp.mscs.cricscore.models.CurrentPlaying;
import com.cpp.mscs.cricscore.models.PlayerInningStat;
import com.cpp.mscs.cricscore.models.ReferencePKPlayerInningTable;
import com.cpp.mscs.cricscore.models.ReferencePrimaryKey;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import redis.clients.jedis.Jedis;

import javax.transaction.Transactional;

/**
 * Created by IntelliJ IDEA.
 * User: jayavardhanpatil
 * Date: 2/4/21
 * Time:  13:28
 */

@Service
public class CurrentPlayingPlayersService {

    ObjectMapper mapper = new ObjectMapper();

    @Autowired
    CurrentPlayingPlayersService currentPlayingPlayersService;

    @Autowired
    MatchService matchService;

    @Autowired
    InningsService inningsService;

    @Transactional
    public void saveCurrentPlayers(CurrentPlaying currentPlaying, long matchId, String inningType) throws JsonProcessingException {
        String key = matchId + "-" +inningType.toUpperCase();
        Jedis jedis = JedisPoolHelper.getResource();
        jedis.set(key, mapper.writeValueAsString(currentPlaying));

        currentPlaying.getBattingTeamPlayer().forEach(
                (k, v) -> inningsService.updatePlayersBattingInning(v, matchId, k)
        );

        currentPlaying.getBowlingTeamPlayer().forEach(
                (k, v) -> inningsService.updatePlayersBowlingInning(v, matchId, k)
        );

    }

    @Transactional
    public CurrentPlaying getCurrentPlayers(String key) throws JsonProcessingException {
        Jedis jedis = JedisPoolHelper.getResource();
        return mapper.readValue(jedis.get(key), CurrentPlaying.class);
    }
}