package com.example.backend.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
    @GetMapping("/get")
    public ResponseEntity getUsers(){
        try {
            return ResponseEntity.ok("Сервер работает!");
        }catch (Exception e){
            return ResponseEntity.badRequest().body("Ошибка!");
        }
    }
}
