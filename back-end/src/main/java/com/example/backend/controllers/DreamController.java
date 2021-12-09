package com.example.backend.controllers;

import com.example.backend.entyties.DreamEntity;
import com.example.backend.services.DreamService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.ExecutionException;

@RestController
@RequestMapping("/dreams")
public class DreamController {
    @Autowired
    private DreamService dreamService;


    @PostMapping()
    public String saveDream(@RequestBody DreamEntity dreamEntity) throws ExecutionException, InterruptedException {
        dreamService.saveDream(dreamEntity);
        return "dream was successfully created";
    }

    @PutMapping("{id}")
    public String updateDream(@PathVariable("id") long id,@RequestBody DreamEntity dreamEntity){
        return dreamService.updateDream(id, dreamEntity);
    }


}
