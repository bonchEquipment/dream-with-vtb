package com.example.backend.services;

import com.example.backend.entyties.DreamEntity;
import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.WriteResult;
import com.google.firebase.cloud.FirestoreClient;
import org.springframework.stereotype.Service;

import java.util.concurrent.ExecutionException;
@Service
public class DreamService {
    private static final String COLLECTION_NAME = "dreams";
    public String saveDream(DreamEntity dreamEntity) throws ExecutionException, InterruptedException {
        Firestore dbFirestore = FirestoreClient.getFirestore();
        ApiFuture<WriteResult> collectionApiFuture =dbFirestore.collection(COLLECTION_NAME)
                .document(dreamEntity.getNameDream()).set(dreamEntity);
        return collectionApiFuture.get().getUpdateTime().toString();
    }
}
