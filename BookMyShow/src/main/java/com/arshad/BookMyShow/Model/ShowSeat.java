package com.arshad.BookMyShow.Model;

import com.arshad.BookMyShow.Model.Enum.ShowSeatStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class ShowSeat extends BaseModel{
    private int price;
    @ManyToOne
    private Show show;
    @ManyToOne
    private Seat seat;
    @Enumerated(EnumType.STRING)
    private ShowSeatStatus showSeatStatus;

    public ShowSeat(int price, Show show, Seat seat, ShowSeatStatus showSeatStatus) {

        this.price = price;
        this.show = show;
        this.seat = seat;
        this.showSeatStatus = showSeatStatus;
    }

    public ShowSeat(){

    }
}
