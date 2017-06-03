package com.example.luanna.myapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import com.example.luanna.myapp.models.Recipe;
import com.example.luanna.myapp.utils.Cons;

import java.util.List;

//
//Ceated by Luanna on 25/05/2017.



public class OpenRecipe extends AppCompatActivity {
    private TextView portion, profit, time, name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_open_recipe);
        List<Recipe> recipes = Cons.getRecipes();

        Integer aux = getIntent().getIntExtra("position", -1);
        
        findViews();
        setInfo(recipes.get(aux));

    }

    public void findViews(){
        name = (TextView) findViewById(R.id.recipe_name);
        portion = (TextView) findViewById(R.id.r_portion);
        profit = (TextView) findViewById(R.id.r_profit);
        time = (TextView) findViewById(R.id.r_time);
    }

    public void setInfo(Recipe recipe){
        name.setText(recipe.getName());
        portion.setText(String.valueOf(recipe.getPortion()));
        profit.setText(String.valueOf(recipe.getProfit()));
        time.setText(recipe.getTime());
    }
}
