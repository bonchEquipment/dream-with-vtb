package com.example.backend.services;


import com.example.backend.entyties.DreamEntity;
import com.example.backend.repositories.DreamEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.concurrent.ExecutionException;

@Service
public class DreamService {

    @Autowired
    DreamEntityRepository dreamEntityRepository;

    public String saveDream(DreamEntity dreamEntity) throws ExecutionException, InterruptedException {
        dreamEntityRepository.save(dreamEntity);
        return "success";
    }
}
