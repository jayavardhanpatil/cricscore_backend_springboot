package com.cpp.mscs.cricscore.match.repositories;

import com.cpp.mscs.cricscore.match.models.Team;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by IntelliJ IDEA.
 * User: jayavardhanpatil
 * Date: 2/3/21
 * Time:  13:57
 */

public interface TeamRepo extends JpaRepository<Team, Long> {

}