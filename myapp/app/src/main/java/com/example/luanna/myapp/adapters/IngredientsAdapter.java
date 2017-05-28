package com.example.luanna.myapp.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.luanna.myapp.models.Ingredient;
import java.util.List;

/**
 * Created by Luanna on 27/05/2017.
 */
//extends RecyclerView.Adapter<IngredientsAdapter.ViewHolder>
public class IngredientsAdapter {
    private List<Ingredient> ingredients;
    private LayoutInflater mInflater;
//    private ItemClickListener mClickListener;

    // data você recebe no construtor
    public IngredientsAdapter(Context context, List<Ingredient> data) {
        this.mInflater = LayoutInflater.from(context);
        this.ingredients = data;
    }

//    @Override
//    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
//        View view = mInflater.inflate(R.layout.ingredient_item, parent, false);
//        ViewHolder viewHolder = new ViewHolder(view);
//        return viewHolder;
//    }
//    // a activity pai vai sobrescrever esse cara pra setar um click event
//    public interface ItemClickListener {
//        void onItemClick(View view, int position);
//    }
}
