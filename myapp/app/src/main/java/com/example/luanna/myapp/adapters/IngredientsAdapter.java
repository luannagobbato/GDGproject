package com.example.luanna.myapp.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.luanna.myapp.R;
import com.example.luanna.myapp.models.Ingredient;
import java.util.List;

//
//Created by Luanna on 27/05/2017.

public class IngredientsAdapter extends RecyclerView.Adapter<IngredientsAdapter.ViewHolder> {
    private List<Ingredient> ingredients;
    private Context context;


    // data você recebe no construtor
    public IngredientsAdapter(List<Ingredient> data, Context context) {
        this.ingredients = data;
        this.context = context;

    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        TextView nameIngredient, priceIngredient, quantityIngredient;

        ViewHolder(View itemView) {
            super(itemView);
            nameIngredient = (TextView) itemView.findViewById(R.id.rv_ingredient_name);
            priceIngredient = (TextView) itemView.findViewById(R.id.rv_ingredient_price);
            quantityIngredient = (TextView) itemView.findViewById(R.id.rv_ingredient_quantity);
        }
    }

    @Override
    public IngredientsAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.ingredient_item, parent, false);
       return new ViewHolder(view);
    }

    // coloca o data em cada célula
    // coloca o texto que irá aparecer em cada célula
    // dados que voce pretende passar para outras telas

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Ingredient batman = ingredients.get(position);
        holder.nameIngredient.setText(batman.getName());
        holder.priceIngredient.setText(String.valueOf(batman.getPrice()));
        holder.quantityIngredient.setText(String.valueOf(batman.getQuantity()));
    }

    // numero de celulas
    @Override
    public int getItemCount() {
        return ingredients.size();
    }
}
