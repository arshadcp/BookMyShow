package com.arshad.BookMyShow.Model;

import com.arshad.BookMyShow.Model.Enum.PaymentMode;
import com.arshad.BookMyShow.Model.Enum.PaymentStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
public class Payment extends BaseModel{
    private String referenceNumber;
    private double amount;
    private LocalDateTime paymentTime;
    @Enumerated(EnumType.STRING)
    private PaymentStatus paymentStatus;
    @ManyToOne
    private Ticket ticket;
    @Enumerated(EnumType.STRING)
    private PaymentMode paymentModes;
}
