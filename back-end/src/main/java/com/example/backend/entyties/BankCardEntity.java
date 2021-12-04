package com.example.backend.entyties;

public class BankCardEntity {
    String PAN;
    String embossingName;
    String cardExpiry;
    String publicId;

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
}
