package com.arshad.BookMyShow.DTO;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class TheaterRequestDTO {
    private String name;
    private String address;
    private int cityId;
}
