package com.arshad.BookMyShow.Service.Interface;

import com.arshad.BookMyShow.Model.ShowSeat;

public interface ShowSeatService {
    ShowSeat getShowSeat(int showSeatId);
    ShowSeat saveShowseat(ShowSeat showSeat);
    ShowSeat getSeatByName(ShowSeat showSeat);
}
