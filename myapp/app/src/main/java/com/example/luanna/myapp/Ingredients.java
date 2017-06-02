package com.example.luanna.myapp;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import com.example.luanna.myapp.adapters.IngredientsAdapter;
import com.example.luanna.myapp.models.Ingredient;
import com.example.luanna.myapp.utils.Cons;

import java.util.List;

/**
 * Created by Luanna on 24/05/2017.
 */

public class Ingredients extends AppCompatActivity {
    private RecyclerView rvIngredients;
//    private Toolbar toolbar;
    private FloatingActionButton addIngredient;
    private List<Ingredient> ingredients;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ingredients);

        ingredients = Cons.getIngredients();
        findViews();
//        setToolbar();
        setRecyclerView();
    }

    private void findViews(){
//        toolbar = (Toolbar) findViewById(R.id.toolbar);
        rvIngredients = (RecyclerView) findViewById(R.id.rv_ingredients);
        addIngredient = (FloatingActionButton) findViewById(R.id.btn_add_ingredient);
       }

//    private void setToolbar() {
//        setSupportActionBar(toolbar);
//    }


    private void setRecyclerView(){
        rvIngredients.setHasFixedSize(true);
        RecyclerView.LayoutManager mLayout = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        rvIngredients.setLayoutManager(mLayout);

        // Pega a lista de dados, e coloca para tela
        IngredientsAdapter ingredientsAdapter = new IngredientsAdapter(ingredients, Ingredients.this);

        rvIngredients.setAdapter(ingredientsAdapter);
    }
}
