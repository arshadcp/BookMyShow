package com.arshad.BookMyShow.Model;

import com.arshad.BookMyShow.Model.Enum.AuditoriumFeature;
import com.arshad.BookMyShow.Model.Enum.AuditoriumStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Auditorium extends BaseModel{
    private String name;
    private int Capacity;
    @OneToMany
    private List<Show> shows;
    @OneToMany
    private List<Seat> seats;
    @ElementCollection
    @Enumerated(EnumType.STRING)
    private List<AuditoriumFeature> audiFeature;
    @Enumerated(EnumType.STRING)
    private List<AuditoriumStatus> audiStatus;


    public Auditorium(){

    }

    public Auditorium(String name, int capacity) {
        this.name = name;
        Capacity = capacity;
    }
}
