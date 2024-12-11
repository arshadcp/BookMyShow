package com.arshad.BookMyShow.Repository;

import com.arshad.BookMyShow.Model.Show;
import com.arshad.BookMyShow.Model.ShowSeat;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShowSeatRepository extends JpaRepository<ShowSeat,Integer> {

}
