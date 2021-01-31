package com.cpp.mscs.cricscore.player.models;

import lombok.Data;

import java.math.BigInteger;
import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * User: jayavardhanpatil
 * Date: 1/31/21
 * Time:  14:32
 */


@Data
public class Player {

    private String uuid;
    private String name;
    private String city;
    private BigInteger phNumber;
    private Date dob;
    private String email;
    private String profilePicUrl;
}