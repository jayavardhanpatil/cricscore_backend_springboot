package com.cpp.mscs.cricscore.repositories;

import com.cpp.mscs.cricscore.models.City;
import com.cpp.mscs.cricscore.models.Match;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by IntelliJ IDEA.
 * User: jayavardhanpatil
 * Date: 3/28/21
 * Time:  18:18
 */

public interface MatchRepo extends JpaRepository<Match, Long> {


}
