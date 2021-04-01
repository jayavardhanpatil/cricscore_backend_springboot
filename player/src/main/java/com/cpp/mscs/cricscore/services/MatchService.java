package com.cpp.mscs.cricscore.services;

import com.cpp.mscs.cricscore.models.Match;
import com.cpp.mscs.cricscore.models.MatchPlayer;
import com.cpp.mscs.cricscore.repositories.MatchPlayedRepo;
import com.cpp.mscs.cricscore.repositories.MatchRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Created by IntelliJ IDEA.
 * User: jayavardhanpatil
 * Date: 2/4/21
 * Time:  13:28
 */

@Service
public class MatchService {

    @Autowired
    MatchRepo matchRepo;

    @Autowired
    MatchPlayedRepo matchPlayedRepo;

    @Transactional
    public void addMatch(Match match) {
        long matchId = matchRepo.save(match).getMatchId();
        addSelectedPlayers(match, matchId);
    }

    @Transactional
    public void addSelectedPlayers(Match match, long matchId) {
        List<MatchPlayer> collections = new ArrayList<>();
        for(String players : match.getTeamAplayers()){
            collections.add(new MatchPlayer(matchId, players, match.getTeamAId()));
        }
        matchPlayedRepo.saveAll(collections);

        for(String players : match.getTeamBplayers()){
            collections.add(new MatchPlayer(matchId, players, match.getTeamBId()));
        }
        matchPlayedRepo.saveAll(collections);

    }

    public Optional<Match> getMatch(long matchId) {
        return matchRepo.findById(matchId);
    }
}