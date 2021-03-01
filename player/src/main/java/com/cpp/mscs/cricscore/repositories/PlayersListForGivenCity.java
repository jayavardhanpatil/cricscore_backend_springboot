package com.cpp.mscs.cricscore.repositories;

import com.cpp.mscs.cricscore.models.Player;

/**
 * Created by IntelliJ IDEA.
 * User: jayavardhanpatil
 * Date: 2/14/21
 * Time:  21:25
 */

public interface PlayersListForGivenCity {

    String getUuid();
    String getName();
    String getPhotoUrl();
    Long getPhoneNumber();
}
