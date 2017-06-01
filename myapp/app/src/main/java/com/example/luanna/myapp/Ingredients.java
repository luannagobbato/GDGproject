package com.example.luanna.myapp;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Build;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.support.v7.widget.Toolbar;
import android.transition.Explode;
import android.view.View;
import android.widget.ImageView;

import android.app.ActivityOptions;

import com.example.luanna.myapp.adapters.IngredientsAdapter;
import com.example.luanna.myapp.models.Ingredient;
import com.example.luanna.myapp.utils.Cons;

import java.util.List;

/**
 * Created by Luanna on 24/05/2017.
 */

public class Ingredients extends AppCompatActivity {
    private RecyclerView rvIngredients;
    private Toolbar toolbar;
    private FloatingActionButton addIngredient;
    private List<Ingredient> ingredients;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ingredients);

        ingredients = Cons.getIngredients();
        findViews();
        setToolbar();
        setRecyclerView();
    }



    private void findViews(){
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        rvIngredients = (RecyclerView) findViewById(R.id.rv_ingredients);
        addIngredient = (FloatingActionButton) findViewById(R.id.btn_add_ingredient);
       }

    private void setToolbar() {
        toolbar.setTitle(getString(R.string.app_ingredients));
        setSupportActionBar(toolbar);
    }

    private void setRecyclerView(){
        rvIngredients.setHasFixedSize(true);
        RecyclerView.LayoutManager mLayout = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        rvIngredients.setLayoutManager(mLayout);

        IngredientsAdapter ingredientsAdapter = new IngredientsAdapter(this, ingredients);

        rvIngredients.setAdapter(ingredientsAdapter);
    }
}
