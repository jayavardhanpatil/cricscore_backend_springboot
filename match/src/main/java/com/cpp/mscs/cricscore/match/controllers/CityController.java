package com.cpp.mscs.cricscore.match.controllers;

import com.cpp.mscs.cricscore.match.models.City;
import com.cpp.mscs.cricscore.match.services.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: jayavardhanpatil
 * Date: 2/4/21
 * Time:  13:26
 */

@RestController
public class CityController {

    @Autowired
    CityService cityService;

    @PostMapping("cities/add")
    public ResponseEntity<?> addCity(@RequestBody City city){
        cityService.addCity(city);
        return ResponseEntity.ok().body(city);
    }

//    @PutMapping("cities/update/{cityId}")
//    public ResponseEntity<?> updateCity(@RequestBody City city, @PathVariable Long cityId){
//        cityService.addCity(city);
//        return ResponseEntity.ok().body(city);
//    }

    @GetMapping("cities")
    public ResponseEntity<?> getAllCityList(){
        List<City> cities = cityService.getALlCities();
        return ResponseEntity.ok().body(cities);
    }
}