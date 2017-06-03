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

//Created by Luanna on 24/05/2017.
 
public class Ingredients extends AppCompatActivity {

    private RecyclerView rvIngredients;
    private List<Ingredient> ingredients;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ingredients);

        //variável para armazenar os ingredientes da lista
        ingredients = Cons.getIngredients();
        findViews();
        setRecyclerView();
    }

    //ligando o recyclerview ao id
    private void findViews(){
        rvIngredients = (RecyclerView) findViewById(R.id.rv_ingredients);
       }


    private void setRecyclerView(){
        rvIngredients.setHasFixedSize(true);

        //define o estilo do reclycler utilizado
        // a forma como os itens serão mostrados
        RecyclerView.LayoutManager mLayout = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        rvIngredients.setLayoutManager(mLayout);

        // Pega a lista de dados, e coloca para tela
        IngredientsAdapter ingredientsAdapter = new IngredientsAdapter(ingredients, Ingredients.this);

        rvIngredients.setAdapter(ingredientsAdapter);
    }
}
