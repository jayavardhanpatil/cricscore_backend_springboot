package com.cpp.mscs.cricscore.match.repositories;

import com.cpp.mscs.cricscore.match.models.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

/**
 * Created by IntelliJ IDEA.
 * User: jayavardhanpatil
 * Date: 2/4/21
 * Time:  13:26
 */

public interface CityRepo extends JpaRepository<City, Long> {


}
