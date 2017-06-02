package com.example.luanna.myapp;

import android.os.Bundle;
//import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
//import android.support.v7.widget.RecyclerView;
//import android.support.v7.widget.Toolbar;
//import android.widget.ImageButton;
//import android.widget.ImageView;
//
//import com.example.luanna.myapp.adapters.RecipesAdapter;
//import com.example.luanna.myapp.models.Ingredient;
//import com.example.luanna.myapp.models.Recipe;
//import com.example.luanna.myapp.utils.Cons;

import java.util.List;

/**
 * Created by Luanna on 24/05/2017.
 */

public class Recipes extends AppCompatActivity {

//    private RecyclerView rvRecipes;
//    private Toolbar toolbar;
//    private FloatingActionButton addIngredient;
//    private List<Recipe> recipes;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipes);

//        recipes = Cons.getRecipes();
//        findViews();
//        setRecyclerView();
    }
//
//    private void findViews(){
////        toolbar = (Toolbar) findViewById(R.id.toolbar);
//        rvRecipes = (RecyclerView) findViewById(R.id.rv_recipes);
//    }
//
////    private void setToolbar(){
////        setSupportActionBar(toolbar);
////    }
//
//    private void setRecyclerView(){
//        rvRecipes.setHasFixedSize(true);
//        StaggeredGridLayoutManager mLayoutManager = new StaggeredGridLayoutManager(3, StaggeredGridLayoutManager.VERTICAL);
//        rvRecipes.setLayoutManager(mLayoutManager);
//
//        //Criar o adapter e falar pra ele lista de dados (songs)
//        RecipesAdapter recipesAdapter = new RecipesAdapter(recipes, Recipes.this);
//        recipesAdapter.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                int position = rvRecipes.getChildLayoutPosition(view); //obter a posição do item que foi escolhido (0, 1, 2... n-1)
//                ImageView img = (ImageView) view.findViewById(R.id.l_recipe_photo);//Para fazer a animação, simplesmente identificamos o view que vai fazer a animação
//                Bundle bundle = new Bundle();
//                bundle.putSerializable("recipe", recipes.get(position));//obtemos o objeto escolidho pelo usuário
//                goToRecipe(img, bundle);//esse metodo indica pra onde vão ser enviados os dados
//            }
//        });
//
//        rvRecipes.setAdapter(recipesAdapter);
//        rvRecipes.setItemAnimator(new DefaultItemAnimator());
//
//        private void goToRecipes(View view, Bundle bundle){
//            Intent intent = new Intent(Recipes.this, OpenRecipe.class);
//            if (bundle != null) {
//                intent.putExtra("extra", bundle);
//            }
//
//            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
//                getWindow().setExitTransition(new Explode());
//                ActivityOptions options = view != null ?
//                        ActivityOptions.makeSceneTransitionAnimation(this, view, "view") :
//                        ActivityOptions.makeSceneTransitionAnimation(this);
//                startActivity(intent, options.toBundle());//Chama OpenRecipe com animação
//
//            } else {
//                startActivity(intent);//Chama o OpenRecipe
//            }
//        }
}
