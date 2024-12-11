package com.arshad.BookMyShow.Service;

import com.arshad.BookMyShow.Model.City;
import com.arshad.BookMyShow.Model.Theater;
import com.arshad.BookMyShow.Repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityService {
    @Autowired
   private CityRepository cityRepository;

    public City saveCity(String cityName){
            City city=new City();
            city.setName(cityName);
            return cityRepository.save(city);
    }
    public City saveCity(City city){
        return cityRepository.save(city);
    }
    public City findCity(int id){
        return cityRepository.findById(id).get();
    }
    public boolean deleteCity(int id){

       cityRepository.deleteById(id);
       return true;

    }
    public City getCityByName(String name){

        City city=cityRepository.findCityByName(name);
        return city;
    }
}
