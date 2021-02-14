package com.cpp.mscs.cricscore.controller;

import com.cpp.mscs.cricscore.models.Team;
import com.cpp.mscs.cricscore.services.TeamService;
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
        teamService.addTeam(team);
        return ResponseEntity.ok().body(team);
    }

    @GetMapping("teams/{teamId}")
    public ResponseEntity<?> getTeam(@PathVariable Long teamId){
        return ResponseEntity.ok().body(teamService.getTeam(teamId));
    }

    @GetMapping("teams/all")
    public ResponseEntity<?> getTeam(){
        return ResponseEntity.ok().body(teamService.getAllTeams());
    }
}