package com.arshad.BookMyShow.DTO;

import com.arshad.BookMyShow.Model.User;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Setter
@Getter
public class BookTicketRequestDTO {
    private List<Integer> showSeatIds;
    private User user;
}
