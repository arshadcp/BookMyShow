package com.arshad.BookMyShow.DTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserLoginRequestDTO {
    private  String email;
    private String password;
}
