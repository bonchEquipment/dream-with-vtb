package com.example.backend.entyties;


import java.util.HashMap;
import java.util.Map;

public class UserEntity {
    private Map<String, DreamEntity> dreams = new HashMap();
    private BankCardEntity dreamsMoneyCard =null;
    private String userId; //номер карты по, которой прошла авторизация

    public Map<String, DreamEntity> getDreams() {
        return dreams;
    }

    public void setDreams(Map<String, DreamEntity> dreams) {
        this.dreams = dreams;
    }

    public BankCardEntity getDreamsMoneyCard() {
        return dreamsMoneyCard;
    }

    public void setDreamsMoneyCard(BankCardEntity dreamsMoneyCard) {
        this.dreamsMoneyCard = dreamsMoneyCard;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
