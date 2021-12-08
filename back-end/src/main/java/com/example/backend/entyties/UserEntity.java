package com.example.backend.entyties;


import javax.persistence.*;
import java.util.List;

@Entity(name = "users")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long userId;
    @OneToMany(targetEntity = DreamEntity.class, cascade =  CascadeType.ALL)
    @JoinColumn( referencedColumnName = "userId")
    private List<DreamEntity> dreams;
    @OneToMany(targetEntity = BankCardEntity.class, cascade =  CascadeType.ALL)
    @JoinColumn( referencedColumnName = "userId")
    private List<BankCardEntity> dreamsMoneyCard;
    private String cardId; //номер карты по, которой прошла авторизация

    public UserEntity(List<DreamEntity> dreams, List<BankCardEntity> dreamsMoneyCard, String cardId) {
        this.dreams = dreams;
        this.dreamsMoneyCard = dreamsMoneyCard;
        this.cardId = cardId;
    }

    public UserEntity() {
    }

    public List<DreamEntity> getDreams() {
        return dreams;
    }

    public void setDreams(List<DreamEntity> dreams) {
        this.dreams = dreams;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public List<BankCardEntity> getDreamsMoneyCard() {
        return dreamsMoneyCard;
    }

    public void setDreamsMoneyCard(List<BankCardEntity> dreamsMoneyCard) {
        this.dreamsMoneyCard = dreamsMoneyCard;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }
}
