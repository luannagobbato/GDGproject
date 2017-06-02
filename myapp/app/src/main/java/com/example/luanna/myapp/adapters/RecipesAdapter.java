//package com.example.luanna.myapp.adapters;
//
//import android.content.Context;
//import android.support.v7.widget.RecyclerView;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.ImageView;
//import android.widget.TextView;
//
//import com.example.luanna.myapp.R;
//import com.example.luanna.myapp.models.Recipe;
//import com.squareup.picasso.Picasso;
///**
// * Created by Luanna on 01/06/2017.
// */
//
//public class RecipesAdapter RecyclerView.Adapter<RecipesAdapter.ViewHolder>
//        implements View.OnClickListener{
//
//        private List<Recipe> mData;
//        private View.OnClickListener listener;
//        private Context context;
//
//        public Recipes Adapter(List<Recipe> mData, Context context){
//            this.mData = myData;
//            this.context = context;
//        }
//
//    static class ViewHolder extends RecyclerView.ViewHolder {
//        ImageView rPhoto;
//        TextView rName;
//
//        ViewHolder(View view) {
//            super(view);
//            // seta rPhoto e rName com o id do recipe_item
//            rPhoto = (ImageView) view.findViewById(R.id.l_recipe_photo);
//            rName = (TextView) view.findViewById(R.id.l_recipe_name);
//        }
//    }
//
//        @Override
//        public RecipesAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
//            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recipe_item, parent, false);
//            view.setOnClickListener(this);
//            return new ViewHolder(view);
//        }
//
//        @Override
//        public void onBindViewHolder(ViewHolder holder, int position) {
//
//            String urlPhoto = mData.get(position).getUrlPhoto() == null ?
//                    "" : mData.get(position).getUrlCover();
//            Picasso.with(context)
//                    .load(urlPhoto)
//                    .placeholder(R.drawable.imgtest)
//                    .error(R.drawable.imgtest)
//                    .into(holder.rPhoto);
//
//            holder.rName.setText(mData.get(position).getName());
//        }
//
//        @Override
//        public int getItemCount() {
//            return mData.size();
//        }
//
//        public void setOnClickListener(View.OnClickListener listener) {
//            this.listener = listener;
//        }
//
//        @Override
//        public void onClick(View v) {
//            if (listener != null)
//                listener.onClick(v);
//        }
//
//
//}
