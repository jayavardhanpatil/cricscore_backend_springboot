package com.cpp.mscs.cricscore.match.services;

import com.cpp.mscs.cricscore.match.models.Team;
import com.cpp.mscs.cricscore.match.repositories.TeamRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}