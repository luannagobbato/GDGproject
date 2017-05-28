package com.example.luanna.myapp;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Build;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.support.v7.widget.Toolbar;
import android.transition.Explode;
import android.view.View;
import android.widget.ImageView;

import android.app.ActivityOptions;

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

//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_ingredients);
//
//        String name = getIntent().getExtras().getString("name");
//        ingredients = Cons.getIngredients();
//        findViews();
//        setToolbar(name);
//        setRecyclerView();
//    }
//
//    private void findViews(){
//        toolbar = (Toolbar) findViewById(R.id.toolbar);
//        rvIngredients = (RecyclerView) findViewById(R.id.rv_ingredients);
//        addIngredient = (FloatingActionButton) findViewById(R.id.btn_add_ingredient);
//    }
//
//    private void setToolbar(String name){
//        toolbar.setTitle(getString(R.string.s_hi) + name);
//        setSupportActionBar(toolbar);
//    }

    private void setRecyclerView(){
//        rviSongs.setHasFixedSize(true);
//        StaggeredGridLayoutManager mLayoutManager = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);
//        rviSongs.setLayoutManager(mLayoutManager);
//
//        SongsAdapter songsAdapter = new SongsAdapter(songs, SongsActivity.this);
//        songsAdapter.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                int position = rviSongs.getChildLayoutPosition(view);
//                ImageView img = (ImageView) view.findViewById(R.id.ivi_cover);
//                Bundle bundle = new Bundle();
//                bundle.putSerializable("song", songs.get(position));
//                goToPlaySong(img, bundle);
//            }
//        });
//
//        rviSongs.setAdapter(songsAdapter);
//        rviSongs.setItemAnimator(new DefaultItemAnimator());
    }
}
