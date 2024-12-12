package com.arshad.BookMyShow.Model;

import com.arshad.BookMyShow.Model.Enum.SeatStatus;
import com.arshad.BookMyShow.Model.Enum.SeatType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Seat extends BaseModel{
    private  String seatNumber;
    @Column(name="bms_rows")
    private int row;
    @Column(name="bms_cols")
    private int col;
    @Enumerated(EnumType.STRING)
    private SeatType seatType;
    @Enumerated(EnumType.STRING)
    private SeatStatus seatStatus;

    public Seat( int row, int col, String seatNumber,SeatType seatType,SeatStatus seatStatus) {
        this.row = row;
        this.col = col;
        this.seatNumber = seatNumber;
        this.seatType = seatType;
       this.seatStatus=seatStatus;
    }
    public Seat(){

    }
}
