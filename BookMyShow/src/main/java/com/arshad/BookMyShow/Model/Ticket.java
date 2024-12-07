package com.arshad.BookMyShow.Model;

import com.arshad.BookMyShow.Model.Enum.TicketStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@Entity
public class Ticket extends BaseModel{

    private LocalDateTime timeOfBooking;
    private int amount;
    @OneToMany
    private List<ShowSeat> showSeat;
    @ManyToOne
    private Show show;
    @Enumerated(EnumType.STRING)
    private TicketStatus ticketStatus;

}
