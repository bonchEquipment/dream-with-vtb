package com.example.backend.controllers;

import com.example.backend.entyties.BankCardEntity;
import com.example.backend.exceptions.BankCardIsAlreadyCreatedException;
import com.example.backend.exceptions.BankCardIsNotEmptyException;
import com.example.backend.pojo.requests.BankCardRq;
import com.example.backend.services.ManageCardService;
import com.squareup.okhttp.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.Optional;

@RestController
@RequestMapping("/manage_bank_card")
public class ManageCardController {


    private final ManageCardService manageCardService;

    @Autowired
    public ManageCardController(ManageCardService manageCardService) {
        this.manageCardService = manageCardService;
    }

    @PostMapping("/create")
    public ResponseEntity<?> createBankCard(@RequestBody BankCardRq bankCardRqReq) throws IOException {
        try {
            BankCardEntity response = manageCardService.createBankCard(bankCardRqReq);
            return ResponseEntity.ok().body(response);
        }catch (BankCardIsAlreadyCreatedException e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }catch (Exception e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }

    }

    @PostMapping("/close")
    public ResponseEntity<?> closeBankCard(@RequestBody BankCardRq bankCardRqReq){
        try {
            Response response = manageCardService.closeBankCard(bankCardRqReq);
            return ResponseEntity.ok().body(response);
        }catch (BankCardIsNotEmptyException e){
            return ResponseEntity.badRequest().body(e.getMessage());
        } catch (Exception e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    public void executePayment() throws IOException {

    }

}
