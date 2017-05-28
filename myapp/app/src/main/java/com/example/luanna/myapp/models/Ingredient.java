package com.example.luanna.myapp.models;

import com.example.luanna.myapp.utils.Cons;
import com.example.luanna.myapp.adapters.IngredientsAdapter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Luanna on 27/05/2017.
 */
// extends AppCompatActivity implements IngredientsAdapter.ItemClickListener
public class Ingredient{
    IngredientsAdapter adapter;
    private String name;
    private Integer quantity;
    private Double price;

    public Ingredient(){
    }

    public Ingredient(String name, Integer quantity, Double price){
        this.name = name;
        this.quantity= quantity;
        this.price= price;
    }
//
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_ingredients);
//
//        // data que ira popular as recyclers
//        List<Ingredient> ingredients = Cons.getIngredients();
//
//        // setup da RecyclerView
//        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rvNumbers);
//        int numberOfColumns = 6;
//        recyclerView.setLayoutManager(new GridLayoutManager(this, numberOfColumns));
//        adapter = new IngredientsAdapter(this, ingredients);
//        adapter.setClickListener(this);
//        recyclerView.setAdapter(adapter);
//    }

}
