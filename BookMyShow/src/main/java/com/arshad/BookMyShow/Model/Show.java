package com.arshad.BookMyShow.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@Entity
public class Show extends BaseModel{
    private String name;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    @ManyToOne
    private Movie movie;
    @OneToMany
    private List<ShowSeat> showSeat;
    @ManyToOne
    private Auditorium auditorium;
}
