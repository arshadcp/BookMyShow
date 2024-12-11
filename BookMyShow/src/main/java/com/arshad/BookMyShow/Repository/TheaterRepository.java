package com.arshad.BookMyShow.Repository;

import com.arshad.BookMyShow.Model.Theater;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TheaterRepository extends JpaRepository<Theater,Integer> {
    Theater findTheaterByName(String name);
}
