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
        return userService.getVTBTokens();
    }

    @PostMapping("/token")
    public String getToken() throws IOException{
        OkHttpClient client = new OkHttpClient();

        MediaType mediaType = MediaType.parse("application/json");

        com.squareup.okhttp.RequestBody body = com.squareup.okhttp.RequestBody.create(mediaType,
                "{\"grant_type\":\"code\",\"code\":\"abuwacihiebinuzr\",\"refresh_token\":\"0f9665541d8815fdf7da9fd22f437a4544a000c22e40fbeb5af624efdf24be83\"}");
        Request request = new Request.Builder()
                .url("https://epa.api.vtb.ru/vtb/openapi/id.vtb.ru/oauth2/token")
                .post(body)
                .addHeader("Authorization", "Bearer {token}")
                .addHeader("content-type", "application/json")
                .addHeader("accept", "application/json")
                .build();

        Response response = client.newCall(request).execute();
        return response.toString();
    }

    @GetMapping("/login")
    public String login() throws IOException {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url("https://epa.api.vtb.ru/vtb/openapi/id.vtb.ru/oauth2/authorize?redirect_uri=https://vk.com/&state=FDsdfsS&client_id=5445654378901234&response_type=code")
                .get()
                .addHeader("Authorization", "Bearer {AQIC5wM2LY4SfcyBy2fw4_k-7N4eWXik7wtV_T15gjXhrRM.*AAJTSQACMDIAAlNLABI3NTM0NzYwNDQ4NTA5NzgwODQAAlMxAAIwMQ..*}")
                .addHeader("accept", "application/json")
                .build();
        Response response = client.newCall(request).execute();
        System.out.println(response.toString());
        return response.toString();
    }
}
