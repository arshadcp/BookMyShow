package com.arshad.BookMyShow.Model;

import com.arshad.BookMyShow.Model.Enum.SeatStatus;
import com.arshad.BookMyShow.Model.Enum.SeatType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name="bms_seat")

public class Seat extends BaseModel{
    private  int seatNumber;
    @Column(name="bms_rows")
    private int row;
    @Column(name="bms_cols")
    private int col;
    @Enumerated(EnumType.STRING)
    private SeatType seatType;
    @Enumerated(EnumType.STRING)
    private SeatStatus seatStatus;
}
