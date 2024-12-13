package com.arshad.BookMyShow.Model;

import com.arshad.BookMyShow.Model.Enum.SeatStatus;
import com.arshad.BookMyShow.Model.Enum.SeatType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name ="bms-Seat")
public class Seat extends BaseModel{
    private String seatNumber;
    @Column(name="bms_row")
    private int row;
    @Column(name="bms_col")
    private int col;
    @Enumerated(EnumType.STRING)
    private SeatStatus seatStatus;
    @Enumerated(EnumType.STRING)
    private SeatType seatType;

    public Seat( int row, int col,String seatNumber,SeatType seatType, SeatStatus seatStatus) {
        this.seatNumber = seatNumber;
        this.row = row;
        this.col = col;
        this.seatStatus = seatStatus;
        this.seatType = seatType;
    }

    public Seat(){

    }
}
