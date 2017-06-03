package com.example.luanna.myapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;

import com.example.luanna.myapp.adapters.RecipesAdapter;
import com.example.luanna.myapp.models.Recipe;
import com.example.luanna.myapp.utils.Cons;

import java.util.List;

/**
 * Created by Luanna on 24/05/2017.
 */

public class Recipes extends AppCompatActivity {
    private RecyclerView rvRecipes;
    private List<Recipe> recipes;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipes);

        recipes = Cons.getRecipes();
        findViews();
        setRecyclerView();
    }

    private void findViews() {
        rvRecipes = (RecyclerView) findViewById(R.id.rv_recipes);
    }

    private void setRecyclerView() {
        rvRecipes.setHasFixedSize(true);
        StaggeredGridLayoutManager mLayout = new StaggeredGridLayoutManager(3, StaggeredGridLayoutManager.VERTICAL);
        rvRecipes.setLayoutManager(mLayout);

        // Pega a lista de dados, e coloca para tela
        final RecipesAdapter recipesAdapter = new RecipesAdapter(recipes, Recipes.this);
        recipesAdapter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int position = rvRecipes.getChildLayoutPosition(view);
                goToRecipe(position);
            }
        });

        rvRecipes.setAdapter(recipesAdapter);
    }

    private void goToRecipe(Integer position){
        Intent intent = new Intent(Recipes.this, OpenRecipe.class);
        intent.putExtra("position", position);
        startActivity(intent);
    }
}