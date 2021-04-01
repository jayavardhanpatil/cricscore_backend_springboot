package com.cpp.mscs.cricscore.models;

import lombok.Data;

import javax.persistence.*;

/**
 * Created by IntelliJ IDEA.
 * User: jayavardhanpatil
 * Date: 3/29/21
 * Time:  21:22
 */


@Data
@Entity
@Table(name = "inning")
public class Inning {

    @EmbeddedId
    private ReferencePrimaryKeyInningTable primaryKey;

    private Integer battingTeamId;

    private Integer bowlingTeamId;

    private Integer run;

    private Integer wickets;

    private double overs;

    private Integer extra;

    public Inning(){}

    public Inning(long matchId, String inningtype){
        ReferencePrimaryKeyInningTable referencePrimaryKey = new ReferencePrimaryKeyInningTable();
        referencePrimaryKey.setMatchId(matchId);
        referencePrimaryKey.setInningtype(inningtype);
        this.primaryKey = referencePrimaryKey;
    }
}