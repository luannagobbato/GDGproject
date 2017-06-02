package com.example.luanna.myapp;

import android.os.Build;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import com.example.luanna.myapp.models.Recipe;
import com.squareup.picasso.Picasso;
/**
 * Created by Luanna on 02/06/2017.
 */


public class OpenRecipe extends AppCompatActivity {
//    private ImageView rvRecipePhoto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_see_recipe);

//        Recipe recipe = (Recipe) getIntent().getBundleExtra("extra").getSerializable("recipe");
//        findViews();
//        setInfo(recipe);
//        validateTransitions(photo);
    }
}
