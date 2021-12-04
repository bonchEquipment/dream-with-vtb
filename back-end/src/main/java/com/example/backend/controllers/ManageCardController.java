package com.example.backend.controllers;

import com.example.backend.pojo.requests.BankCardRq;
import com.example.backend.services.ManageCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequestMapping("/manage_bank_card")
public class ManageCardController {

    @Autowired
    ManageCardService manageCardService;

    @PostMapping("/create")
    public void createBankCard(@RequestBody BankCardRq bankCardRqReq) throws IOException {
        manageCardService.createBankCard();
    }

    public void executePayment() throws IOException {

    }

}
