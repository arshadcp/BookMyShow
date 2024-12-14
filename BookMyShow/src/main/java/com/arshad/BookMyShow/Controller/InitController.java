package com.arshad.BookMyShow.Controller;

import com.arshad.BookMyShow.Service.InitServiceImpl;
import com.arshad.BookMyShow.Service.Interface.InitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InitController {
    @Autowired
    private InitService initService;

    @GetMapping("/init")
    public ResponseEntity initiaiseEntity(){
        return ResponseEntity.ok(initService.initialise());
    }
}
