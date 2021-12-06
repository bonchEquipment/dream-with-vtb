package com.example.backend.entyties;

public class BankCardEntity {
    String PAN; //"489350******8081" - Маскированый PAN
    String embossingName; //"ИМЯ ФАМИЛИЯ"
    String cardExpiry; //"MM/yy" - Дата окончания действия карты
    String publicId; //"2991748655611904" - Публичный идентификатор продукта
    int value = 0; //деньги

    public String getPAN() {
        return PAN;
    }

    public void setPAN(String PAN) {
        this.PAN = PAN;
    }

    public String getEmbossingName() {
        return embossingName;
    }

    public void setEmbossingName(String embossingName) {
        this.embossingName = embossingName;
    }

    public String getCardExpiry() {
        return cardExpiry;
    }

    public void setCardExpiry(String cardExpiry) {
        this.cardExpiry = cardExpiry;
    }

    public String getPublicId() {
        return publicId;
    }

    public void setPublicId(String publicId) {
        this.publicId = publicId;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
