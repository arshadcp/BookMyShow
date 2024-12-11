package com.arshad.BookMyShow.Controller;

import com.arshad.BookMyShow.DTO.CityRequestDTO;
import com.arshad.BookMyShow.Exceptions.InvalidIdException;
import com.arshad.BookMyShow.Exceptions.invalidCityException;
import com.arshad.BookMyShow.Model.City;
import com.arshad.BookMyShow.Service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class CityController {
    @Autowired
    private CityService cityService;

    @PostMapping("/city")
    public ResponseEntity createCity(@RequestBody CityRequestDTO cityRequestDTO){
        try{
            String cityName=cityRequestDTO.getName();
            if(cityName==null||cityName.length()==0||cityName.isBlank()
                ||cityName.isEmpty()) {
                throw new invalidCityException("City Name is invalid");
            }
                City savedCity = cityService.saveCity(cityName);
                return ResponseEntity.ok(savedCity);

        }catch(Exception e){
                e.printStackTrace();
        }
        return null;

    }

    @DeleteMapping("/city/{id}")
    public ResponseEntity deleteCity(@PathVariable("id")int cityId)throws Exception{
        if(cityService.findCity(cityId)==null){
            throw new InvalidIdException("city with id does not exist");
        }
        boolean a=cityService.deleteCity(cityId);
       return ResponseEntity.ok(a);
    }
    //find city by name
    @GetMapping("/city/{name}")
    public ResponseEntity getCityByName(@PathVariable("name") String cityName){
        City city=cityService.getCityByName(cityName);
        return ResponseEntity.ok(city);
    }
}
