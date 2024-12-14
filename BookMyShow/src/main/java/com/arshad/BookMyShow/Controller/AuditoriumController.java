package com.arshad.BookMyShow.Controller;

import com.arshad.BookMyShow.DTO.AuditoriumRequestDTO;
import com.arshad.BookMyShow.Service.Interface.AuditoriumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuditoriumController {
    @Autowired
    AuditoriumService auditoriumService;
    @PostMapping("/Audi")
    public ResponseEntity createAudi(@RequestBody AuditoriumRequestDTO auditoriumRequestDTO) throws Exception{
        return ResponseEntity.ok(auditoriumService.saveAudi(auditoriumRequestDTO.getName(),
                auditoriumRequestDTO.getCapacity(),auditoriumRequestDTO.getTheaterId()));
    }
}
