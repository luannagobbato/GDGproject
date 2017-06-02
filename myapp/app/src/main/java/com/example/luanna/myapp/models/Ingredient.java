package com.example.luanna.myapp.models;

import android.support.v7.app.AppCompatActivity;

/**
 * Created by Luanna on 27/05/2017.
 */

public class Ingredient extends AppCompatActivity {
    private String name;
    private Integer quantity;
    private Double price;

    public Ingredient(String name, Integer quantity, Double price){
        this.name = name;
        this.quantity= quantity;
        this.price= price;
    }

    public String getName() {
        return name;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

}
