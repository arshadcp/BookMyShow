package com.arshad.BookMyShow.Service;

import com.arshad.BookMyShow.Model.Seat;
import com.arshad.BookMyShow.Model.ShowSeat;
import com.arshad.BookMyShow.Repository.SeatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SeatService {
    @Autowired
    SeatRepository seatRepository;

    public Seat saveSeat(Seat seat){
        return seatRepository.save(seat);
    }
    public Seat getSeatBySeatNumber(String number){
        return seatRepository.findSeatBySeatNumber(number);
    }

}
