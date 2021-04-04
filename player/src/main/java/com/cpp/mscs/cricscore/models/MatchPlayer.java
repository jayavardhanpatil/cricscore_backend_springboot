package com.cpp.mscs.cricscore.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: jayavardhanpatil
 * Date: 3/28/21
 * Time:  17:09
 */

@Data
@Table(name = "match_players")
@Entity
public class MatchPlayer {

    @EmbeddedId
    private ReferencePrimaryKey primaryKey;

    @Column(name = "team_id")
    private Integer teamId;
    private Integer run;
    private Integer wicket;
    private Integer extra;
    private Double overs;
    private Integer ballsFaced;
    private Integer runsGiven;
    private Integer numberOfFours;
    private Integer numberOfsixes;
    private Integer playedPosition;
    private Boolean out;

    public MatchPlayer(){}

    public MatchPlayer(long matchId, String playerUuid, int teamId){
        ReferencePrimaryKey referencePrimaryKey = new ReferencePrimaryKey();
        referencePrimaryKey.setMatchId(matchId);
        referencePrimaryKey.setPlayeruuid(playerUuid);
        this.teamId = teamId;
        this.primaryKey = referencePrimaryKey;
    }

}
