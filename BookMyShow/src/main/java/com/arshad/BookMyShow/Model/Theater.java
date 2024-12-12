package com.arshad.BookMyShow.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;
@Getter
@Setter
@Entity
public class Theater extends BaseModel{
    private String name;
    @OneToMany
    private List<Auditorium> audi;
    private String address;

    public Theater(int id, LocalDateTime createdAt, LocalDateTime updatedAt, String createdBy, String updatedBy, String name, String address) {
        super(id, createdAt, updatedAt, createdBy, updatedBy);
        this.name = name;
        this.address = address;
    }
    public Theater(String name, String address){
        this.name=name;
        this.address=address;
    }
    public Theater(){

    }
}
