package com.arshad.BookMyShow.Controller;

import com.arshad.BookMyShow.DTO.BookTicketRequestDTO;
import com.arshad.BookMyShow.Service.Interface.TicketService;
import com.arshad.BookMyShow.Service.TicketServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TicketController {
    @Autowired
    private TicketService ticketService;

    @GetMapping("/Ticket")
    public ResponseEntity getTicket(@RequestBody BookTicketRequestDTO bookTicketRequestDto)throws Exception{

       return ResponseEntity.ok(ticketService.bookTicket(bookTicketRequestDto.getShowSeatIds()));
    }



}
