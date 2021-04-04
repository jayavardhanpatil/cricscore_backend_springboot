package com.cpp.mscs.cricscore.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.Id;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: jayavardhanpatil
 * Date: 4/3/21
 * Time:  11:12
 */

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class CurrentPlaying {
    private int run;
    private int wickets;
    private Double overs;
    private int extra;
    private String currentBattingteamName;
    private Map<String, MatchPlayer> battingTeamPlayer;
    private Map<String, MatchPlayer> bowlingTeamPlayer;
    private String inningsType;
    private int matchId;

}