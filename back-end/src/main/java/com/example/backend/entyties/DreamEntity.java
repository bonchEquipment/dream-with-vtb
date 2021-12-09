package com.example.backend.entyties;

import javax.persistence.*;

@Entity(name = "dreams")
public class DreamEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long dreamId;
    private Integer moneyToDream = null;
    private String description = null;
    private String dreamName = null;
    private int userId;
    private int priorityLevel;


    public DreamEntity() {
    }

    public DreamEntity(Long dreamId, Integer moneyToDream, String description, String dreamName, int userId, int priorityLevel) {
        this.dreamId = dreamId;
        this.moneyToDream = moneyToDream;
        this.description = description;
        this.dreamName = dreamName;
        this.userId = userId;
        this.priorityLevel = priorityLevel;
    }

    public DreamEntity(Integer moneyToDream, String description, String dreamName, int userId, int priorityLevel) {
        this.moneyToDream = moneyToDream;
        this.description = description;
        this.dreamName = dreamName;
        this.userId = userId;
        this.priorityLevel = priorityLevel;
    }

    public Integer getMoneyToDream() {
        return moneyToDream;
    }

    public void setMoneyToDream(Integer moneyToDream) {
        this.moneyToDream = moneyToDream;
    }

    @Override
    public String toString() {
        return "DreamEntity{" +
                "dreamId=" + dreamId +
                ", moneyToDream=" + moneyToDream +
                ", description='" + description + '\'' +
                ", dreamName='" + dreamName + '\'' +
                ", userId=" + userId +
                '}';
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDreamName() {
        return dreamName;
    }

    public void setDreamName(String nameDream) {
        this.dreamName = nameDream;
    }
}
