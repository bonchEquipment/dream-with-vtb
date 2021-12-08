package com.example.backend.controllers;

import com.example.backend.services.PaymentTermService;
import com.example.backend.services.UserService;
import com.squareup.okhttp.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pay")
public class PaymentTermController {

    @Autowired
    private PaymentTermService paymentTermService;

    //вместе запросом передаем :накопленную сумму, сумму которую нужно накопить, и сумму которую откладываем ежемесячно
    @PostMapping("/payment")
    public ResponseEntity<?> getPaymentTerm(@RequestBody int sum, @RequestBody int maxSum, @RequestBody int salary){
        String response = paymentTermService.getTerm(sum,maxSum,salary);
        return ResponseEntity.ok().body(response);
    }

}
