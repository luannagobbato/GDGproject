package com.example.luanna.myapp.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.luanna.myapp.R;
import com.example.luanna.myapp.models.Recipe;
import java.util.List;

//Created by Luanna on 02/06/2017.

public class RecipesAdapter extends RecyclerView.Adapter<RecipesAdapter.ViewHolder> implements View.OnClickListener{
    private List<Recipe> recipes;
    private Context context;
    private View.OnClickListener listener;

    // data você recebe no construtor
    public RecipesAdapter(List<Recipe> data, Context context) {
        this.recipes = data;
        this.context = context;
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        TextView nameRecipe;

        ViewHolder(View itemView) {
            super(itemView);
            nameRecipe = (TextView) itemView.findViewById(R.id.rv_recipe_name);
        }
    }

    @Override
    public RecipesAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recipe_item, parent, false);
        view.setOnClickListener(this);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Recipe robin = recipes.get(position);
        holder.nameRecipe.setText(robin.getName());
    }

    //
    @Override
    public int getItemCount() {
        return recipes.size();
    }

    public void setOnClickListener(View.OnClickListener listener) {
        this.listener = listener;
    }

    @Override
    public void onClick(View view) {
        if (listener != null)
            listener.onClick(view);
    }

}
