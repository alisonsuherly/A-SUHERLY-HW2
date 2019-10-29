package com.example.homework2;

public class Burger {

    private int burgerID;
    private String name;
    private String description;
    private String price;
    private int imageID;

    public Burger(int burgerID, String name, String description, String price, int imageID) {
        this.burgerID = burgerID;
        this.name = name;
        this.description = description;
        this.price = price;
        this.imageID = imageID;
    }

    public int getBurgerID() {
        return burgerID;
    }

    public void setBurgerID(int burgerID) {
        this.burgerID = burgerID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getImageID() {
        return imageID;
    }

    public void setImageID(int imageID) {
        this.imageID = imageID;
    }

}
