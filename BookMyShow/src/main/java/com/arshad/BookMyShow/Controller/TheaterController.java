package com.arshad.BookMyShow.Controller;

import com.arshad.BookMyShow.DTO.TheaterRequestDTO;
import com.arshad.BookMyShow.Service.Interface.TheaterService;
import com.arshad.BookMyShow.Service.TheaterServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TheaterController {
    @Autowired
   private TheaterService theaterService;

    @PostMapping("/theater")
    public ResponseEntity createTheater(@RequestBody TheaterRequestDTO theaterRequestDTO){
        return ResponseEntity.ok(theaterService.saveTheater(theaterRequestDTO.getName(),
                theaterRequestDTO.getAddress(),theaterRequestDTO.getCityId()));
    }
}
