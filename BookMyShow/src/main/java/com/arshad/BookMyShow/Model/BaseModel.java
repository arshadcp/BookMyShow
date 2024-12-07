package com.arshad.BookMyShow.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
@Setter
@Getter
@MappedSuperclass
public abstract class BaseModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="ID")
    private int id;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private  String createdBy;
    private String updatedBy;

}
