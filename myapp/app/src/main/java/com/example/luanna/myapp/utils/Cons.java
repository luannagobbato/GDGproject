package com.example.luanna.myapp.utils;
import com.example.luanna.myapp.models.*;

import com.example.luanna.myapp.Recipes;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Luanna on 19/05/2017.
 */

// Lista com os ingredientes e receitas
public class Cons {
    public static List<Recipe> getRecipes(){
        List<Recipe> default_recipes = new ArrayList<>();

        default_recipes.add(new Recipe("http://is5.mzstatic.com/image/thumb/Music122/v4/50/89/c3/5089c3f8-ed7c-cdeb-fe3b-2931deee3a98/source/1200x630bb.jpg", "Bombom De Paçoquita"));
        default_recipes.add(new Recipe("https://images.genius.com/79a2201c67a9aa386cda76562666c62d.500x500x1.jpg", "Bolo de Chocolate"));
        default_recipes.add(new Recipe("http://sassipan.com.br/site/wp-content/uploads/2014/09/Torta-de-requeij%C3%A3o-com-lim%C3%A3o.jpg", "Torta de Requeijão"));
        default_recipes.add(new Recipe("https://www.altoastral.com.br/wp-content/uploads/2004/01/torta-limao-superfacil.jpg", "Torta de Limão"));
        default_recipes.add(new Recipe("http://gastrolandia.com.br/wp-content/uploads/2015/12/Captura-de-Tela-2015-12-14-a%CC%80s-16.28.12.png", "Pudim de Leite"));
        default_recipes.add(new Recipe("http://www.daltonrangel.com.br/wp-content/uploads/2015/08/Bolo-de-fub%C3%A1-cremoso.jpg", "Bolo de Fubá"));
        default_recipes.add(new Recipe("https://s-media-cache-ak0.pinimg.com/736x/ef/de/3e/efde3edfd916218cf2b4e77b3f10d1c0.jpg", "Mousse de maracujá"));
        default_recipes.add(new Recipe("https://img.r7.com/images/2015/08/11/4f5l7u8eu4_4u05e2lbd0_file?dimensions=780x536&no_crop=true", "Brigadeiro"));
        default_recipes.add(new Recipe("http://www.receitas-sem-fronteiras.com/uploads/media/86139_highlight-42.jpg?1393611640", "Bem casado"));

        return default_recipes;
    }

    public static List<Ingredient> getIngredients(){
        List<Ingredient> default_ingredients = new ArrayList<>();

        default_ingredients.add(new Ingredient("Chocolate", 1000, 15.00));
        default_ingredients.add(new Ingredient("Leite condensado", 1000, 16.00));
        default_ingredients.add(new Ingredient("Leite", 1000, 2.00));
        default_ingredients.add(new Ingredient("Ovos", 30, 10.00));
        default_ingredients.add(new Ingredient("Manteiga", 150, 5.00));

        return default_ingredients;
    }

}
