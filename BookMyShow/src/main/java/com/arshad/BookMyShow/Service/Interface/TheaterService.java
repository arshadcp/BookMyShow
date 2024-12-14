package com.arshad.BookMyShow.Service.Interface;

import com.arshad.BookMyShow.Model.Theater;

public interface TheaterService {
    Theater getTheaterById(int id);
    Theater saveTheater(Theater theater);
    Theater getTheaterByName(String name);
    Theater saveTheater(String name,String address,int cityId);
}
