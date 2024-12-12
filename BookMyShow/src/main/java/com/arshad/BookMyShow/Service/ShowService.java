package com.arshad.BookMyShow.Service;

import com.arshad.BookMyShow.Model.Show;
import com.arshad.BookMyShow.Repository.ShowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShowService {
    @Autowired
  private ShowRepository showRepository;

    public Show saveShow(Show show){
      return  showRepository.save(show);
    }
    public Show getShowById(int id){
        return showRepository.findById(id).get();
    }
}
