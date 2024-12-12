package com.arshad.BookMyShow.DTO;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class AuditoriumRequestDTO {
    private String name;
    private int capacity;
    private int theaterId;
}
