package com.example.luanna.myapp.utils;

import com.example.luanna.myapp.Recipes;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Luanna on 19/05/2017.
 */

public class Cons {
    public static List<Recipes> getRecipes(){
        List<Recipes> allrecipes = new ArrayList<>();

        allrecipes.add(new allrecipes("http://is5.mzstatic.com/image/thumb/Music122/v4/50/89/c3/5089c3f8-ed7c-cdeb-fe3b-2931deee3a98/source/1200x630bb.jpg", "Bombom De Paçoquita"));
        allrecipes.add(new allrecipes("https://images.genius.com/79a2201c67a9aa386cda76562666c62d.500x500x1.jpg", "Bolo de Chocolate"));
        allrecipes.add(new allrecipes("https://upload.wikimedia.org/wikipedia/en/3/37/Followthereaper.jpg", "Torta de Requeijão"));
        allrecipes.add(new allrecipes("https://images-na.ssl-images-amazon.com/images/I/61P0M5B0V0L.jpg", "Torta de Limão"));
        allrecipes.add(new allrecipes("https://i.ytimg.com/vi/WKrXsbjiKRA/hqdefault.jpg", "Pudim de Leite"));
        allrecipes.add(new allrecipes("https://upload.wikimedia.org/wikipedia/en/1/17/The_Killers_-_Hot_Fuss.png", "Bolo de Fubá"));
        allrecipes.add(new allrecipes("https://upload.wikimedia.org/wikipedia/en/8/8a/EvFallencover01.jpg", "Mousse de maracujá"));
        allrecipes.add(new allrecipes("https://upload.wikimedia.org/wikipedia/en/e/ec/PapaRoachFEAR.png", "Brigadeiro"));
        allrecipes.add(new allrecipes("https://upload.wikimedia.org/wikipedia/en/9/95/Skilletawake2009albumart.jpg", "Bem casado"));

        return allrecipes;
    }

    public static List<Ingredients> getIngredients(){
        List<Ingredients> allingredients = new ArrayList<>();

        allingredients.add(new allingredients("Chocolate", "1000", "15,00"));



    }

}
