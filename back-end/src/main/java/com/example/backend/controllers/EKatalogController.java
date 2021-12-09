package com.example.backend.controllers;

import com.squareup.okhttp.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ekatalog")
public class EKatalogController {

    @GetMapping("/macbook")
    public ResponseEntity<?> getEMacBook(){
        String url ="https://www.e-katalog.ru/APPLE-MACBOOK-PRO-14--2021-.htm";
        return ResponseEntity.ok().body(url);
    }
    @GetMapping("/iphone13")
    public ResponseEntity<?> getEIphone(){
        String url ="https://www.e-katalog.ru/APPLE-IPHONE-13-128GB.htm";
        return ResponseEntity.ok().body(url);
    }
    @GetMapping("/ps5")
    public ResponseEntity<?> getEPlaystation(){
        String url ="https://www.e-katalog.ru/SONY-PLAYSTATION-5.htm";
        return ResponseEntity.ok().body(url);
    }
    @GetMapping("/nintendo")
    public ResponseEntity<?> getENintendo(){
        String url ="https://www.e-katalog.ru/NINTENDO-SWITCH--OLED-MODEL-.htm";
        return ResponseEntity.ok().body(url);
    }

}
