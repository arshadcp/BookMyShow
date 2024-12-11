package com.arshad.BookMyShow.Repository;

import com.arshad.BookMyShow.Model.City;
import com.arshad.BookMyShow.Model.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketRepository extends JpaRepository<Ticket,Integer> {

}
