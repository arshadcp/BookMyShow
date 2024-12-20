package com.arshad.BookMyShow.Controller;

import Mapper.EntityDTOMapper;
import com.arshad.BookMyShow.DTO.UserLoginRequestDTO;
import com.arshad.BookMyShow.DTO.UserSignUpRequestDTO;
import com.arshad.BookMyShow.Model.User;
import com.arshad.BookMyShow.Service.Interface.UserService;
import com.arshad.BookMyShow.Service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
   private UserService userService;

    @PostMapping("/SignUp")
    public ResponseEntity UsersignUp(@RequestBody UserSignUpRequestDTO userSignUpRequestDTO) throws Exception{
        User user= userService.Signup(userSignUpRequestDTO.getName(),
                userSignUpRequestDTO.getEmail(),userSignUpRequestDTO.getPassword());
        return ResponseEntity.ok(EntityDTOMapper.toDTO(user));
    }

    @GetMapping("/login")
    public ResponseEntity UserLogin(@RequestBody UserLoginRequestDTO userLoginRequestDTO){
      return ResponseEntity.ok( userService.Login(userLoginRequestDTO.getEmail()
                ,userLoginRequestDTO.getPassword()));

    }
}
