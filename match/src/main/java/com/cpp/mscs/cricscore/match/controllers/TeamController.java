package com.cpp.mscs.cricscore.match.controllers;

import com.cpp.mscs.cricscore.match.models.Team;
import com.cpp.mscs.cricscore.match.services.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Created by IntelliJ IDEA.
 * User: jayavardhanpatil
 * Date: 2/5/21
 * Time:  23:41
 */

@RestController
public class TeamController {

    @Autowired
    TeamService teamService;

    @PostMapping("teams/add")
    public ResponseEntity<?> addTeam(@RequestBody Team team){
        Long teamId = teamService.addTeam(team);
        return ResponseEntity.ok().body("Team Id : "+ teamId);
    }

    @GetMapping("teams/{teamId}")
    public ResponseEntity<?> getTeam(@PathVariable Long teamId){
        return ResponseEntity.ok().body(teamService.getTeam(teamId));
    }
}