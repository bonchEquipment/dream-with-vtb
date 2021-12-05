package com.example.backend.controllers;

import com.example.backend.entyties.DreamEntity;
import com.example.backend.services.DreamService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ExecutionException;

@RestController
@RequestMapping("/dream")
public class DreamController {
    @Autowired
    private DreamService dreamService;
    @PostMapping("/dreams")
    public String saveProduct(@RequestBody DreamEntity dreamEntity) throws ExecutionException, InterruptedException {
        System.out.println(dreamEntity.toString());
        return dreamService.saveDream(dreamEntity);
        // здесь не понятно что, кажется надо менять, тестовая штука
    }
}
