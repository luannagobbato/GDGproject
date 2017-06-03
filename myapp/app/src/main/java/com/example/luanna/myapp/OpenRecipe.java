package com.example.luanna.myapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import com.example.luanna.myapp.adapters.RecipeIngredientsAdapter;
import com.example.luanna.myapp.models.Recipe;
import com.example.luanna.myapp.models.RecipeIngredient;
import com.example.luanna.myapp.utils.Cons;

import java.util.List;

//
//Ceated by Luanna on 25/05/2017.



public class OpenRecipe extends AppCompatActivity {
    private TextView portion, profit, time, name, priceSell, revenue, netProfit;
    private RecyclerView rvRecipeIngredients;
    private List<RecipeIngredient> recipeIngredients;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_open_recipe);
        List<Recipe> recipes = Cons.getRecipes();

        // pega a posição do recycler view que foi clicada
        Integer aux = getIntent().getIntExtra("position", -1);

        //lista os ingredientes da receita
        recipeIngredients = recipes.get(aux).getRecipeIngredients();

        findViews();
        setInfo(recipes.get(aux));
        setRecyclerView();

    }

    public void findViews() {
        name = (TextView) findViewById(R.id.recipe_name);
        portion = (TextView) findViewById(R.id.r_portion);
        profit = (TextView) findViewById(R.id.r_profit);
        priceSell = (TextView) findViewById(R.id.r_price_sell);
        revenue = (TextView) findViewById(R.id.r_revenue);
        netProfit = (TextView) findViewById(R.id.r_net_profit);
        time = (TextView) findViewById(R.id.r_time);
        rvRecipeIngredients = (RecyclerView) findViewById(R.id.rv_recipe_ingredients);

    }

    public void setInfo(Recipe recipe) {
        name.setText(recipe.getName());
        portion.setText(String.valueOf(recipe.getPortion()));
        profit.setText(String.format("%.2f",recipe.getProfit()) + "%");
        priceSell.setText("R$" + String.format("%.2f",recipe.getPriceSell()));
        revenue.setText("R$" + String.format("%.2f", recipe.getRevenue()));
        netProfit.setText("R$" + String.format("%.2f", recipe.getNetProfit()));
        time.setText(recipe.getTime());
    }

    private void setRecyclerView() {
        rvRecipeIngredients.setHasFixedSize(true);
        RecyclerView.LayoutManager mLayout = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        rvRecipeIngredients.setLayoutManager(mLayout);

        RecipeIngredientsAdapter recipeIngredientsAdapter = new RecipeIngredientsAdapter(recipeIngredients, OpenRecipe.this);

        rvRecipeIngredients.setAdapter(recipeIngredientsAdapter);
    }
}
