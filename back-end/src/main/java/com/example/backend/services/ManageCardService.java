package com.example.backend.services;

import com.example.backend.pojo.requests.BankCardRq;
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
    private String xMdmId;
    private String authorizationToken;
    private String xClientChannel;
    private String xPartnerId;
    private String xGlobalTransactionID;

    public void createBankCard(BankCardRq bankCardRq) throws IOException {
        OkHttpClient client = new OkHttpClient();

        MediaType mediaType = MediaType.parse("application/json");
        RequestBody body = RequestBody.create(mediaType, "{\"partnerId\":\"8568554873946112\"}");
        Request request = new Request.Builder()
                .url(resource+"/api/rb/dks/cardemission/hackathon/v1")
                .post(body)
                .addHeader("X-IBM-Client-Id", bankCardRq.getxIBMClientId())
                .addHeader("X-Mdm-Id", xMdmId)
                .addHeader("X-Global-Transaction-ID", xGlobalTransactionID)
                .addHeader("Authorization", bankCardRq.getAccessToken())
                .addHeader("x-client-channel", xClientChannel)
                .addHeader("X-PARTNER-ID", xPartnerId)
                .addHeader("content-type", "application/json")
                .addHeader("accept", "application/json")
                .build();

        Response response = client.newCall(request).execute();
    }
}
