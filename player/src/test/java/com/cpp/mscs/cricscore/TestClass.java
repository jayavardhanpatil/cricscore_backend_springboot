package com.cpp.mscs.cricscore;

import com.cpp.mscs.cricscore.models.CurrentPlaying;
import com.cpp.mscs.cricscore.models.MatchSummary;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import redis.clients.jedis.Jedis;

import java.util.HashMap;

/**
 * Created by IntelliJ IDEA.
 * User: jayavardhanpatil
 * Date: 4/4/21
 * Time:  16:43
 */

public class TestClass {


    ObjectMapper objectMapper = new ObjectMapper();

    @Test
    public void testredis() throws JsonProcessingException {
        Jedis jedis = JedisPoolHelper.getResource();
        HashMap<String, String> map = new HashMap<>();
        MatchSummary matchSummary = new MatchSummary();
        matchSummary.setLive(true);
        matchSummary.setFirstInningsScore(new CurrentPlaying());
        matchSummary.setResult("Test Jedis");
        map.put("matchId", objectMapper.writeValueAsString(matchSummary));
        jedis.hmset("test",map);

        jedis.hgetAll("test");
        System.out.println("hello");
    }
}