package com.arshad.BookMyShow.Service;

import com.arshad.BookMyShow.Exceptions.SeatNotAvailableException;
import com.arshad.BookMyShow.Model.City;
import com.arshad.BookMyShow.Model.Enum.ShowSeatStatus;
import com.arshad.BookMyShow.Model.Enum.TicketStatus;
import com.arshad.BookMyShow.Model.ShowSeat;
import com.arshad.BookMyShow.Model.Ticket;
import com.arshad.BookMyShow.Model.User;
import com.arshad.BookMyShow.Repository.TicketRepository;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class TicketService {
   @Autowired
    private TicketRepository ticketRepository;
   @Autowired
   private ShowSeatService showSeatService;

    public String greet(){
       return "Hello World";
    }

@Transactional(isolation = Isolation.SERIALIZABLE)
    public Ticket  bookTicket(List<Integer> showSeatId) throws Exception {
       // ArrayList<Integer> PaySeats=new ArrayList<>();
        ArrayList<ShowSeat> BookedSeats=new ArrayList<>();
       Ticket ticket=new Ticket();
        for(int a:showSeatId){
            ShowSeat seat=showSeatService.getShowSeat(a);
            if(!seat.getShowSeatStatus().equals(ShowSeatStatus.AVAILABLE)){
                throw new SeatNotAvailableException("Seat Not Available");
            }
        }
        for(int a:showSeatId){//if available make seat locked and save
                ShowSeat seat= showSeatService.getShowSeat(a);
                seat.setShowSeatStatus(ShowSeatStatus.LOCKED);
                showSeatService.saveShowseat(seat);

        }
      if(payment(showSeatId)) {

          for (int a : showSeatId) {
              ShowSeat showSeat= showSeatService.getShowSeat(a);
              showSeat.setShowSeatStatus(ShowSeatStatus.BOOKED);
                ticket.setTicketStatus(TicketStatus.BOOKED);
          }

      }else{//if payment fail
          for(int a:showSeatId) {
             ShowSeat showseat= showSeatService.getShowSeat(a);
             showseat.setShowSeatStatus(ShowSeatStatus.AVAILABLE);
             ticket.setTicketStatus(TicketStatus.CANCELLED);
          }
      }
      return ticket;
    }

    public boolean payment(List<Integer> ids){
        return true;
    }

}
