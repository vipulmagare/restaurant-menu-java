package com.vipul.restaurant.domain;

public class Menu {
    String category;
    String name;
    double price;

    public Menu(String name, double price) {
        this.name = name;
        this.price = price;

    }

    public Menu(String category, String name, double price) {
        this.category = category;
        this.name = name;
        this.price = price;
    }

    public Menu() {


    }

    public void displayItem() {
        System.out.println(name + " - $" + price);
    }


    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}




