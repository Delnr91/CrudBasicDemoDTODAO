package com.example.demo.presentation.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")

public class UserController {

    //Crear el Usuario

    @PostMapping("/create")
    public ResponseEntity <?> createUser(){
        return null;
    }

}
