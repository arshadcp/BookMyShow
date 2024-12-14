package com.arshad.BookMyShow.Service.Interface;

import com.arshad.BookMyShow.Model.Show;

public interface ShowService {
    Show saveShow(Show show);
    Show getShowById(int id);
}
