package com.arshad.BookMyShow.Service.Interface;

import com.arshad.BookMyShow.Model.Seat;

import java.util.List;

public interface SeatService {
    Seat saveSeat(Seat seat);
    Seat getSeatBySeatNumber(String number);
    List<Seat> findAllSeat();
}
