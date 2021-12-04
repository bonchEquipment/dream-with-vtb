package com.example.backend.services;

import com.example.backend.entyties.BankCardEntity;
import com.example.backend.pojo.requests.BankCardRq;
import com.example.backend.pojo.responses.BankCardRsp;
import com.example.backend.repositories.UserRepo;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.squareup.okhttp.MediaType;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.RequestBody;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;

@Service
public class ManageCardService {
    String resource  = "http://hackaton.bankingapi.ru";
    private String xMdmId;
    private String authorizationToken;
    private String xClientChannel;
    private String xPartnerId;
    private String xGlobalTransactionID;

    @Autowired
    private UserRepo userRepo;

    public BankCardRsp createBankCard(BankCardRq bankCardRq) throws IOException {
        if(userRepo.getUser(bankCardRq.getUserId()).getDreamsMoneyCard()==null) {
            OkHttpClient client = new OkHttpClient();

            MediaType mediaType = MediaType.parse("application/json");
            RequestBody body = RequestBody.create(mediaType, "{\"partnerId\":\"8568554873946112\"}");
            Request request = new Request.Builder()
                    .url(resource + "/api/rb/dks/cardemission/hackathon/v1/prepaid")
                    .post(body)
                    .addHeader("X-IBM-Client-Id", bankCardRq.getUserId())
                    .addHeader("X-Mdm-Id", xMdmId)
                    .addHeader("X-Global-Transaction-ID", xGlobalTransactionID)
                    .addHeader("Authorization", bankCardRq.getAccessToken())
                    .addHeader("x-client-channel", xClientChannel)
                    .addHeader("X-PARTNER-ID", xPartnerId)
                    .addHeader("content-type", "application/json")
                    .addHeader("accept", "application/json")
                    .build();

            Response response = client.newCall(request).execute();

            ObjectMapper objectMapper = new ObjectMapper();
            BankCardEntity bankCardEntity = objectMapper.readValue(response.body().string(), BankCardEntity.class);

            return new BankCardRsp();
        }else
        return null;
    }
}
