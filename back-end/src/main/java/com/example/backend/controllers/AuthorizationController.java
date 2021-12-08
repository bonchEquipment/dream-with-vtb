package com.example.backend.controllers;


import com.example.backend.services.UserService;
import com.squareup.okhttp.MediaType;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequestMapping("/auth")
public class AuthorizationController {
    private String cardNumber;

    @Autowired
    private UserService userService;

    @PostMapping("/tokenApi")
    public String getTokenApi() throws IOException, InterruptedException {
        return userService.getVTBTokens().toString();
    }


    @GetMapping("/login")
    public ResponseEntity<?> login() throws IOException, InterruptedException {
        String token = getTokenApi();
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url("https://epa.api.vtb.ru/vtb/openapi/id.vtb.ru/oauth2/authorize?redirect_uri=https://vk.com/&state=FDsdfsS&client_id=5445654378901234&response_type=code")
                .get()
                .addHeader("Authorization", "Bearer "+token)
                .addHeader("accept", "application/json")
                .build();
        Response response = client.newCall(request).execute();
        System.out.println(response.toString());
        return ResponseEntity.ok().body(response);
    }
}
