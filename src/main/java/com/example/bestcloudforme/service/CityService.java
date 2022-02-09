package com.example.bestcloudforme.service;

import com.example.bestcloudforme.domain.City;
import com.example.bestcloudforme.repository.CityRepository;
import org.springframework.stereotype.Service;

@Service
public class CityService {

private final CityRepository cityRepository;


    public CityService(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    public City getByCity(String cityName){
        return cityRepository.findByName(cityName);
    }

    public City add(City city){
     return  this.cityRepository.save(city);
    }

}
