package com.arshad.BookMyShow.Service;

import com.arshad.BookMyShow.Model.Auditorium;
import com.arshad.BookMyShow.Model.Theater;
import com.arshad.BookMyShow.Repository.AuditoriumRepository;
import com.arshad.BookMyShow.Service.Interface.AuditoriumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuditoriumServiceImpl implements AuditoriumService {
    @Autowired
    AuditoriumRepository auditoriumRepository;
    @Autowired
    TheaterServiceImpl theaterService;

    public Auditorium saveAudi(String name, int capacity,int theaterId){
        Auditorium audi =new Auditorium();
        audi.setName(name);
        audi.setCapacity(capacity);
       Auditorium saveAudi= auditoriumRepository.save(audi);
        Theater theater=theaterService.getTheaterById(theaterId);
        List<Auditorium> audiList=theater.getAudi();
        audiList.add(audi);
        theater.setAudi(audiList);
        theaterService.saveTheater(theater);
        return  audi;
    }
    public  Auditorium saveAudi(Auditorium auditorium){
       return auditoriumRepository.save(auditorium);
    }
    public  Auditorium getAuditoriumByName(String name){
        return auditoriumRepository.getAuditoriumByName(name);
    }
}
