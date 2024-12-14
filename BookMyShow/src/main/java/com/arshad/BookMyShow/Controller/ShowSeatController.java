package com.arshad.BookMyShow.Controller;

import com.arshad.BookMyShow.Service.Interface.ShowSeatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShowSeatController {
    @Autowired
    ShowSeatService showSeatService;
}
