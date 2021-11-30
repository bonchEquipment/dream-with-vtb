package com.example.backend.controllers;

import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequestMapping("/auth")
public class AuthorizationController {
    private String cardNumber;
    @GetMapping("/login")
    public String login() throws IOException {
        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder()
                .url("https://epa.api.vtb.ru/vtb/openapi/id.vtb.ru/oauth2/authorize?redirect_uri=https://vk.com/&state=FDsdfsS&client_id=5445654378901234&response_type=code")
                .get()
                .addHeader("Authorization", "Bearer {AQIC5wM2LY4SfcxjIMtc7JUj2_-LM3exxfbgqbbX5AQcCvE.*AAJTSQACMDIAAlNLABMzNTQwOTA3NzQ1Njc4Nzg5NTUzAAJTMQACMDE.*}")
                .addHeader("accept", "application/json")
                .build();

        Response response = client.newCall(request).execute();
        System.out.println(response.toString());
        return response.toString();
    }
}
