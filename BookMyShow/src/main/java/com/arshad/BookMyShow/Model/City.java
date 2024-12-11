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
public class City extends  BaseModel{
    private String name;
    @OneToMany
    private List<Theater> theaters;

    public City(int id, LocalDateTime createdAt, LocalDateTime updatedAt, String createdBy, String updatedBy, String name, List<Theater> theaters) {
        super(id, createdAt, updatedAt, createdBy, updatedBy);
        this.name = name;
        this.theaters = theaters;
    }
public City(){

}
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Theater> getTheaters() {
        return theaters;
    }

    public void setTheaters(List<Theater> theaters) {
        this.theaters = theaters;
    }
}
