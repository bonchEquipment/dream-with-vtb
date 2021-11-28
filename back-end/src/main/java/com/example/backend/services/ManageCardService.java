package com.example.backend.services;

import com.example.backend.entyties.BankCard;
import org.springframework.stereotype.Service;

import com.squareup.okhttp.MediaType;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.RequestBody;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

import java.io.IOException;

@Service
public class ManageCardService {
    String resource  = "http://hackaton.bankingapi.ru";
    String accessToken = "AQIC5wM2LY4SfcxjIMtc7JUj2_-LM3exxfbgqbbX5AQcCvE.*AAJTSQACMDIAAlNLABMzNTQwOTA3NzQ1Njc4Nzg5NTUzAAJTMQACMDE.*";
    public void createBankCard(BankCard bankCard) throws IOException {
        OkHttpClient client = new OkHttpClient();

        MediaType mediaType = MediaType.parse("application/json");
        RequestBody body = RequestBody.create(mediaType, "{\"partnerId\":\"8568554873946112\"}");
        Request request = new Request.Builder()
                .url(resource+"/api/rb/dks/cardemission/hackathon/v1")
                .post(body)
                .addHeader("X-IBM-Client-Id", "ИД клиента")
                .addHeader("X-Mdm-Id", "REPLACE_THIS_VALUE")
                .addHeader("X-Global-Transaction-ID", "REPLACE_THIS_VALUE")
                .addHeader("Authorization", accessToken)
                .addHeader("x-client-channel", "REPLACE_THIS_VALUE")
                .addHeader("X-PARTNER-ID", "REPLACE_THIS_VALUE")
                .addHeader("content-type", "application/json")
                .addHeader("accept", "application/json")
                .build();

        Response response = client.newCall(request).execute();
    }
}
