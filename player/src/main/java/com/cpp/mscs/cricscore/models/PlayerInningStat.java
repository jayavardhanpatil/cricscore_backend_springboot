package com.cpp.mscs.cricscore.models;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by IntelliJ IDEA.
 * User: jayavardhanpatil
 * Date: 4/3/21
 * Time:  12:23
 */

@Data
@Entity
@Table(name = "playerInningStat")
public class PlayerInningStat {


    @EmbeddedId
    private ReferencePKPlayerInningTable primaryKey;

    @Column(name = "isOnStrike")
    private boolean isOnStrike;
    @Column(name = "run")
    private int run;
    @Column(name = "wicket")
    private int wicket;
    @Column(name = "extra")
    private int extra;
    @Column(name = "overs")
    private double overs;
    @Column(name = "ballsFaced")
    private int ballsFaced;
    @Column(name = "runsGiven")
    private int runsGiven;
    @Column(name = "numberOfDours")
    private int numberOfFours;
    @Column(name = "numberOfSixes")
    private int numberOfsixes;
    @Column(name = "playedPosition")
    private int playedPosition;
    @Column(name = "isOut")
    private boolean isOut;

    public PlayerInningStat(){}

    public PlayerInningStat(long matchId, String inningType, String playerUuid){
        this.primaryKey = new ReferencePKPlayerInningTable(
            matchId, inningType, playerUuid);
    }
}