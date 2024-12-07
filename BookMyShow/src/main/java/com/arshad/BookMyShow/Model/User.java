package com.arshad.BookMyShow.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
@Entity(name="bms_user")
public class User extends BaseModel {
    private String name;
    private String email;
    @OneToMany
    private List<Ticket> tickets;
}
