package com.cpp.mscs.cricscore.services;

import com.cpp.mscs.cricscore.models.Player;
import com.cpp.mscs.cricscore.models.Team;
import com.cpp.mscs.cricscore.repositories.TeamNameAndCity;
import com.cpp.mscs.cricscore.repositories.TeamRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Created by IntelliJ IDEA.
 * User: jayavardhanpatil
 * Date: 2/5/21
 * Time:  23:44
 */

@Service
public class TeamService {


    @Autowired
    TeamRepo teamRepo;

    public Long addTeam(Team team){
        teamRepo.save(team);
        return team.getTeamId();
    }

    public Optional<Team> getTeam(Long teamId){
        return teamRepo.findById(teamId);
    }

    public List<Team> getAllTeams() {
        return teamRepo.findAll();
    }

    public List<TeamNameAndCity> getTeamByName(String teamName) {
        List<TeamNameAndCity> respone = teamRepo.findByteamNameStartsWithIgnoreCase(teamName);
        System.out.println(respone);
        return respone;
    }
}