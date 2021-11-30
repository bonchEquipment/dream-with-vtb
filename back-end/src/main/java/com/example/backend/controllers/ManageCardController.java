package com.example.backend.controllers;

import com.example.backend.entyties.BankCard;
import com.example.backend.services.ManageCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequestMapping("/manage_bank_card")
public class ManageCardController {

    @Autowired
    ManageCardService manageCardService;

    @GetMapping("/create")
    public void createBankCard() throws IOException {
        manageCardService.createBankCard();
    }

}
