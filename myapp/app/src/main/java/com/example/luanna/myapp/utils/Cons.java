package com.example.luanna.myapp.utils;
import com.example.luanna.myapp.models.*;

import java.util.ArrayList;
import java.util.List;

//Created by Luanna on 19/05/2017.
 

// Lista com os ingredientes, receitas, e Ingredientes + quantidades para setar na Receita
public class Cons {
    public static List<Recipe> getRecipes(){

        List<Recipe> recipes = new ArrayList<>();
        //Lista para pegar todos os ingredientes de todas as receitas
        List<RecipeIngredient> recipeIngredients = getRecipeIngredients();


        //Implementando a quantidade de ingredientes para cada receita
        List<RecipeIngredient> recipe1 = new ArrayList<>();
        recipe1.add(recipeIngredients.get(0));
        recipe1.add(recipeIngredients.get(3));
        recipe1.add(recipeIngredients.get(7));
        List<RecipeIngredient> recipe2 = new ArrayList<>();
        recipe2.add(recipeIngredients.get(1));
        recipe2.add(recipeIngredients.get(2));
        recipe2.add(recipeIngredients.get(3));
        List<RecipeIngredient> recipe3 = new ArrayList<>();
        recipe3.add(recipeIngredients.get(5));
        recipe3.add(recipeIngredients.get(3));
        recipe3.add(recipeIngredients.get(2));
        List<RecipeIngredient> recipe4 = new ArrayList<>();
        recipe4.add(recipeIngredients.get(3));
        recipe4.add(recipeIngredients.get(6));
        recipe4.add(recipeIngredients.get(7));

        //Define alista de Receitas
        recipes.add(new Recipe("Bombom de Paçoca", "150min", 10, recipe1));
        recipes.add(new Recipe("Bolo de Cenoura", "130min", 20, recipe2));
        recipes.add(new Recipe("Pudim de Leite", "100min", 30, recipe3));
        recipes.add(new Recipe("Bolo de Fubá", "90min", 40, recipe4));
        recipes.add(new Recipe("Brigadeiro de Paçoca", "50min", 100, recipe2));
        recipes.add(new Recipe("Brigadeiro", "50min", 50, recipe1));
        recipes.add(new Recipe("Mousse de Maracujá", "30min", 200, recipe4));

        return recipes;
    }

    //Lista com os ingredientes e seus atributos (Nome, quantidade e preço)
    public static List<Ingredient> getIngredients(){
        List<Ingredient> ingredients = new ArrayList<>();

        ingredients.add(new Ingredient("Chocolate", 1000, 30.00));
        ingredients.add(new Ingredient("Leite condensado", 395, 2.00));
        ingredients.add(new Ingredient("Leite", 1000, 2.00));
        ingredients.add(new Ingredient("Ovos", 30, 10.00));
        ingredients.add(new Ingredient("Manteiga", 150, 4.00));

        return ingredients;
    }


    //Lista setando os ingredientes e quantidades diferentes para cada receita
    public static List<RecipeIngredient> getRecipeIngredients(){
        List<RecipeIngredient> recipeIngredients = new ArrayList<>();
        List<Ingredient> ingredients = Cons.getIngredients();

        recipeIngredients.add(new RecipeIngredient(ingredients.get(0),350));
        recipeIngredients.add(new RecipeIngredient(ingredients.get(0),400));
        recipeIngredients.add(new RecipeIngredient(ingredients.get(1),395));
        recipeIngredients.add(new RecipeIngredient(ingredients.get(2),300));
        recipeIngredients.add(new RecipeIngredient(ingredients.get(3),2));
        recipeIngredients.add(new RecipeIngredient(ingredients.get(3),3));
        recipeIngredients.add(new RecipeIngredient(ingredients.get(4),100));
        recipeIngredients.add(new RecipeIngredient(ingredients.get(4),50));

        return recipeIngredients;
    }

}
