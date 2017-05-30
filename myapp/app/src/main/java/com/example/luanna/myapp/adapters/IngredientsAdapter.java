package com.example.luanna.myapp.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import com.example.luanna.myapp.R;
import com.example.luanna.myapp.models.Ingredient;
import java.util.List;

/**
 * Created by Luanna on 27/05/2017.
 */
//
public class IngredientsAdapter extends RecyclerView.Adapter<IngredientsAdapter.ViewHolder> {
    private List<Ingredient> ingredients;
    private LayoutInflater mInflater;

    @Override
    // data você recebe no construtor
    public IngredientsAdapter(Context context, List<Ingredient> data) {
        this.mInflater = LayoutInflater.from(context);
        this.ingredients = data;
    }


    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.ingredient_item, parent, false);
        ViewHolder viewHolder;
        viewHolder = new ViewHolder(view);
        return viewHolder;
    }

}
