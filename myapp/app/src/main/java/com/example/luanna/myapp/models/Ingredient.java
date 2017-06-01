package com.example.luanna.myapp.models;

import com.example.luanna.myapp.utils.Cons;
import com.example.luanna.myapp.adapters.IngredientsAdapter;
import com.example.luanna.myapp.R;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.List;

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

    public void setName(String name) {
        this.name = name;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

}
