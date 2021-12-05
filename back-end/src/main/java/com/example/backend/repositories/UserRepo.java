package com.example.backend.repositories;

import com.example.backend.entyties.DreamEntity;
import com.example.backend.entyties.UserEntity;
import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.WriteResult;
import com.google.firebase.cloud.FirestoreClient;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.concurrent.ExecutionException;

@Repository
public class UserRepo {
    private static final String COLLECTION_NAME = "users";
    public String saveUser(UserEntity userEntity) throws ExecutionException, InterruptedException {
        Firestore dbFirestore = FirestoreClient.getFirestore();
        ApiFuture<WriteResult> collectionApiFuture =dbFirestore.collection(COLLECTION_NAME)
                .document(userEntity.getUserId()).set(userEntity);
        return collectionApiFuture.get().getUpdateTime().toString();
    }

    public UserEntity getUser(String userId){
        Firestore dbFirestore = FirestoreClient.getFirestore();
        return (UserEntity) dbFirestore.collection(COLLECTION_NAME)
                .document(userId).get();
    }
}
