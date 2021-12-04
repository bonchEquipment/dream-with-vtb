package com.example.backend.services;

import com.example.backend.pojo.responses.AuthVTBTokensRsp;
import com.squareup.okhttp.*;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class UserService {
    public AuthVTBTokensRsp getVTBTokens() throws IOException {
        OkHttpClient client = new OkHttpClient();

        MediaType mediaType = MediaType.parse("application/json");
        RequestBody body = RequestBody.create(mediaType, "{\"grant_type\":\"client_credentials\"," +
                "\"client_id\":\"team11@app.hackaton.bankingapi.ru\"," +
                "\"client_secret\":\"cZtKk6eY\"" +
                "}");
        Request request = new Request.Builder()
                .url("https://hackaton.bankingapi.ru/passport/oauth2/token")
                .post(body)
                .addHeader("content-type", "application/json")
                .addHeader("accept", "application/json")
                .build();

        Response response = client.newCall(request).execute();
        System.out.println(response.body().toString());
        return null;
    }
}