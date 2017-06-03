package com.example.luanna.myapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Home extends AppCompatActivity {
    //declarando variáveis para linkar com os botões
    private ImageButton btnRecipes;
    private ImageButton btnIngredients;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        findViews();
        setActions();
    }

    //função que liga os objetos com as views no xml
    private void findViews() {
        btnRecipes = (ImageButton) findViewById(R.id.btn_recipes);
        btnIngredients = (ImageButton) findViewById(R.id.btn_ingredients);
    }

    //definindo ação para os botões quando clicados 
    private void setActions() {
        btnRecipes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToRecipes();
            }
        });

        btnIngredients.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v){
                goToIngredients();
            }
        });
    }

    private void goToRecipes() {
        Intent intent = new Intent(Home.this, Recipes.class);
        startActivity(intent);
    }


    private void goToIngredients(){
        Intent intent = new Intent(Home.this, Ingredients.class);
        startActivity(intent);
    }
}
