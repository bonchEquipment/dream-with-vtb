package com.example.backend.controllers;

import com.example.backend.entyties.BankCard;
import com.example.backend.services.ManageCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/manage_bank_card")
public class ManageCardController {

    @Autowired
    ManageCardService manageCardService;

    @PostMapping("/create")
    public void createBankCard(@RequestBody BankCard bankCard) throws IOException {
        manageCardService.createBankCard(bankCard);
    }

}
