package com.arshad.BookMyShow.Repository;

import com.arshad.BookMyShow.Model.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepository extends JpaRepository<City,Integer> {
    City findCityByName(String cityName);
}
