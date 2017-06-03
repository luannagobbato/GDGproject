package com.example.luanna.myapp.adapters;

// Created by Luanna on 03/06/2017.


import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.luanna.myapp.R;
import com.example.luanna.myapp.models.RecipeIngredient;

import java.util.List;

public class RecipeIngredientsAdapter extends RecyclerView.Adapter<RecipeIngredientsAdapter.ViewHolder> {

    private List<RecipeIngredient> recipeIngredients;
    private Context context;

    //construtor
    public RecipeIngredientsAdapter(List<RecipeIngredient> data, Context context) {
        this.recipeIngredients = data;
        this.context = context;
    }
    
    //função liga os objetos com as views no xml    
    static class ViewHolder extends RecyclerView.ViewHolder {
        TextView nameIngredient, quantityIngredient;

        ViewHolder(View itemView) {
            super(itemView);
            nameIngredient = (TextView) itemView.findViewById(R.id.rv_ingredient_name);
            quantityIngredient = (TextView) itemView.findViewById(R.id.rv_ingredient_quantity);
        }
    }

    @Override
    public RecipeIngredientsAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recipe_ingredient_item, parent, false);
        return new ViewHolder(view);
    }

    //define o conteúdo das view que será mostrado
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        RecipeIngredient batgirl = recipeIngredients.get(position);
        holder.nameIngredient.setText(batgirl.getNameIngredient());
        holder.quantityIngredient.setText(String.valueOf(batgirl.getIngredientQuantity()));
    }

    //busca a quantidade de itens que serão mostrados
    @Override
    public int getItemCount() {
        return recipeIngredients.size();
    }

}
