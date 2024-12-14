package com.arshad.BookMyShow.Controller;

import com.arshad.BookMyShow.Service.TicketServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BmsController {
    @Autowired
    TicketServiceImpl ticketService;

    @GetMapping("/hello")
   public ResponseEntity greet(){
        String greet=ticketService.greet();
        return ResponseEntity.ok(greet);
    }
}
