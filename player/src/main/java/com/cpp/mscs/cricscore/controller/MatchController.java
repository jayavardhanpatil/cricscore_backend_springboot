package com.cpp.mscs.cricscore.controller;

import com.cpp.mscs.cricscore.models.City;
import com.cpp.mscs.cricscore.models.Match;
import com.cpp.mscs.cricscore.repositories.MatchRepo;
import com.cpp.mscs.cricscore.services.MatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * Created by IntelliJ IDEA.
 * User: jayavardhanpatil
 * Date: 3/28/21
 * Time:  18:17
 */

@Controller
public class MatchController {

    @Autowired
    MatchService matchService;

    @PostMapping("match/add")
    public ResponseEntity<?> addCity(@RequestBody Match match){
        matchService.addMatch(match);
        return ResponseEntity.ok().body(match);
    }

    @GetMapping("match/{matchId}")
    public ResponseEntity<?> getCity(@PathVariable Long matchId){
        return ResponseEntity.ok().body(matchService.getMatch(matchId));
    }
}