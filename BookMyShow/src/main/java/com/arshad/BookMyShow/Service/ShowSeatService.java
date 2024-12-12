package com.arshad.BookMyShow.Service;

import com.arshad.BookMyShow.Model.Enum.ShowSeatStatus;
import com.arshad.BookMyShow.Model.ShowSeat;
import com.arshad.BookMyShow.Repository.ShowSeatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShowSeatService {
    @Autowired
    ShowSeatRepository showSeatRepository;
//
    public ShowSeat getShowSeat(int showSeatId){
       return showSeatRepository.findById(showSeatId).get();
    }
    public ShowSeat saveShowseat(ShowSeat showSeat){
       return showSeatRepository.save(showSeat);
    }
//    public ShowSeat getSeatByName(ShowSeat showSeat){
//        return showSeatRepository.save(showSeat);
//    }


}
