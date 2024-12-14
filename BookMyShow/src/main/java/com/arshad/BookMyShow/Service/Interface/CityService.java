package com.arshad.BookMyShow.Service.Interface;

import com.arshad.BookMyShow.Model.City;

import java.util.List;

public interface CityService {
    City saveCity(String cityName);
    City saveCity(City city);
    City findCity(int id);
    boolean deleteCity(int id);
    City getCityByName(String name);
    List<City> getAllCities();


}
