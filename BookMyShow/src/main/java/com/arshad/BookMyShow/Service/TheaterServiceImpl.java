package com.arshad.BookMyShow.Service;

import com.arshad.BookMyShow.Model.City;
import com.arshad.BookMyShow.Model.Theater;
import com.arshad.BookMyShow.Repository.TheaterRepository;
import com.arshad.BookMyShow.Service.Interface.TheaterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TheaterServiceImpl implements TheaterService {
    @Autowired
    TheaterRepository theaterRepository;
    @Autowired
    CityServiceImpl cityService;

     public Theater saveTheater(String name,String address,int cityId){

        Theater theater=new Theater();
        theater.setName(name);
        theater.setAddress(address);
        Theater savedTheater=theaterRepository.save(theater);
        City city=cityService.findCity(cityId);
         List<Theater> theaterlist=city.getTheaters();
         theaterlist.add(savedTheater);
        city.setTheaters(theaterlist);
        cityService.saveCity(city);
        return savedTheater;
     }
     public Theater getTheaterById(int id){
         return theaterRepository.findById(id).get();
     }
    public Theater saveTheater(Theater theater){
        return theaterRepository.save(theater);
    }
    public Theater getTheaterByName(String name){
         return theaterRepository.findTheaterByName(name);
    }

}
