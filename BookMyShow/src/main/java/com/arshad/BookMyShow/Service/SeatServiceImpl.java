package com.arshad.BookMyShow.Service;

import com.arshad.BookMyShow.Model.Seat;
import com.arshad.BookMyShow.Repository.SeatRepository;
import com.arshad.BookMyShow.Service.Interface.SeatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SeatServiceImpl implements SeatService {
    @Autowired
    SeatRepository seatRepository;

    public Seat saveSeat(Seat seat){
        return seatRepository.save(seat);
    }
    public Seat getSeatBySeatNumber(String number){
        return seatRepository.findSeatBySeatNumber(number);
    }
    public List<Seat> findAllSeat(){
        return seatRepository.findAll();
    }

}
