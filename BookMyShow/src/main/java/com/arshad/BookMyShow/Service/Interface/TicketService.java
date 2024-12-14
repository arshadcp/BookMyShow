package com.arshad.BookMyShow.Service.Interface;

import com.arshad.BookMyShow.Model.Ticket;

import java.util.List;

public interface TicketService {
    Ticket bookTicket(List<Integer> showSeatId)throws Exception;
    boolean payment(List<Integer> ids);
}
