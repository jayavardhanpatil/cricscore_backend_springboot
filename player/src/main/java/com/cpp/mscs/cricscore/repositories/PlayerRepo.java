package com.cpp.mscs.cricscore.repositories;

import com.cpp.mscs.cricscore.models.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by IntelliJ IDEA.
 * User: jayavardhanpatil
 * Date: 2/2/21
 * Time:  11:56
 */
@Repository
public interface PlayerRepo extends JpaRepository<Player, String> {

}