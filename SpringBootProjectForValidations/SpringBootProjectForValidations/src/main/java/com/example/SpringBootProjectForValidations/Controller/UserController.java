package com.example.SpringBootProjectForValidations.Controller;

import com.example.SpringBootProjectForValidations.Model.User;
import com.example.SpringBootProjectForValidations.Service.UserInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/validations")
public class UserController
{
    @Autowired
    public UserInterface userInterface;

    public ResponseEntity<?> addUser(@RequestBody User user)

    private Object user;
    User savedUser = userInterface.addUser(user);



}
