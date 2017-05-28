package com.example.luanna.myapp;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import static com.example.luanna.myapp.R.layout.activity_recipes;

public class Home extends AppCompatActivity {
    private ImageButton btnRecipes;
//    private ImageButton btnIngredients;

        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        findViews();
        setActions();
    }

    private void findViews(){
       btnRecipes = (ImageButton) findViewById(R.id.btn_recipes);
//       btnIngredients = (ImageButton) findViewById(R.id.btn_ingredients);
       }
    private void setActions(){
        btnRecipes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                goToRecipes();
            }
//        btnIngredients.setOnClickListener(new View.OnClickListener() {
//            @Override
//             public void onClick(View v){
//                    goToIngredients();
//                }
//            })
        });
    }
    private void goToRecipes() {

        Intent intent = new Intent(Home.this, Recipes.class);
        startActivity(intent);
    }

//    private void goToIngredients(){
//
//        Intent intent new Intent(Home.this, Ingredients.class);
//        startActivity(intent);
//    }
}
