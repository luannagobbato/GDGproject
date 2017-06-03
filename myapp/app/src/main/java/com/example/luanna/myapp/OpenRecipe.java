package com.example.luanna.myapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import com.example.luanna.myapp.R;
import com.example.luanna.myapp.models.Recipe;
import com.example.luanna.myapp.utils.Cons;

import org.w3c.dom.Text;

import java.util.List;

/**
 * Created by Luanna on 02/06/2017.
 */


public class OpenRecipe extends AppCompatActivity {
    private TextView portion, profit, time, name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_open_recipe);
        List<Recipe> recipes = Cons.getRecipes();
//        Recipe recipe = (Recipe) getIntent().getBundleExtra("extra").getSerializable("recipe");
        findViews();
        setInfo(recipes.get(0));
//        validateTransitions(photo);
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
