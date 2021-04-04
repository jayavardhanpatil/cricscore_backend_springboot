package com.cpp.mscs.cricscore.services;

import com.cpp.mscs.cricscore.models.Inning;
import com.cpp.mscs.cricscore.models.Match;
import com.cpp.mscs.cricscore.models.MatchPlayer;
import com.cpp.mscs.cricscore.models.PlayerInningStat;
import com.cpp.mscs.cricscore.repositories.InningsRepo;
import com.cpp.mscs.cricscore.repositories.MatchPlayedRepo;
import com.cpp.mscs.cricscore.repositories.MatchRepo;
import com.cpp.mscs.cricscore.repositories.PlayerInningsRepo;
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
public class InningsService {

    final
    InningsRepo inningsRepo;

    MatchPlayedRepo matchPlayedRepo;

    public InningsService(InningsRepo inningsRepo) {
        this.inningsRepo = inningsRepo;
    }

    public void addInnings(Inning innings) {
        inningsRepo.save(innings);
    }

    @Transactional
    public void updatePlayersBattingInning(MatchPlayer matchPlayer, long matchId, String playerUuId) {
        matchPlayedRepo.updateBattingScore(matchPlayer.getBallsFaced(),
                matchPlayer.getNumberOfFours(), matchPlayer.getNumberOfsixes(), matchPlayer.getOut(),matchPlayer.getPlayedPosition()
        ,matchPlayer.getRun(), matchId, playerUuId);
    }

    @Transactional
    public void updatePlayersBowlingInning(MatchPlayer matchPlayer, long matchId, String playerUuId) {
        matchPlayedRepo.updateBowlingcore(matchPlayer.getExtra(),
                matchPlayer.getWicket(), matchPlayer.getOvers(), matchPlayer.getRunsGiven(), matchId, playerUuId);
    }
}