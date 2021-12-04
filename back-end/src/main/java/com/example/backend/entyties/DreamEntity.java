package com.example.backend.entyties;

public class DreamEntity {
    private Integer moneyToDream = null;
    private String description = null;
    private String nameDream = null;

    public Integer getMoneyToDream() {
        return moneyToDream;
    }

    public void setMoneyToDream(Integer moneyToDream) {
        this.moneyToDream = moneyToDream;
    }

    @Override
    public String toString() {
        return "DreamEntity{" +
                "moneyToDream=" + moneyToDream +
                ", description='" + description + '\'' +
                ", nameDream='" + nameDream + '\'' +
                '}';
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getNameDream() {
        return nameDream;
    }

    public void setNameDream(String nameDream) {
        this.nameDream = nameDream;
    }
}
