package com.cpp.mscs.cricscore.repositories;

import com.cpp.mscs.cricscore.models.MatchPlayer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by IntelliJ IDEA.
 * User: jayavardhanpatil
 * Date: 3/28/21
 * Time:  18:18
 */

public interface MatchPlayedRepo extends JpaRepository<MatchPlayer, Long> {


}
