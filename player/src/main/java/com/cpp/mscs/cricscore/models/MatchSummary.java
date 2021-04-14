package com.cpp.mscs.cricscore.models;

import lombok.Data;

/**
 * Created by IntelliJ IDEA.
 * User: jayavardhanpatil
 * Date: 4/4/21
 * Time:  13:13
 */

@Data
public class MatchSummary {

    private int target;
    private boolean live;
    private CurrentPlaying secondInningsScore;
    private CurrentPlaying firstInningsScore;
    private boolean firstInningsOver;
    private String result;
    private String matchTitile;

}