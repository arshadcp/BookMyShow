package com.arshad.BookMyShow.Service.Interface;

import com.arshad.BookMyShow.Model.Auditorium;

public interface AuditoriumService {
    Auditorium saveAudi(String name, int capacity, int theaterId);
    Auditorium saveAudi(Auditorium auditorium);
    Auditorium getAuditoriumByName(String name);
}
