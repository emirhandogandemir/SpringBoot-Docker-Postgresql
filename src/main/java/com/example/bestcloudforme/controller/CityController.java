package com.example.bestcloudforme.controller;

import com.example.bestcloudforme.domain.City;
import com.example.bestcloudforme.service.CityService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class CityController {

    private final CityService cityService;


    public CityController(CityService cityService) {
        this.cityService = cityService;
    }

    @GetMapping("temperature")
     public City getByCity(@RequestParam String city){
        return cityService.getByCity(city);
    }

}
