package com.example.luanna.myapp.models;

// Created by Luanna on 02/06/2017.


import java.util.List;

public class RecipeIngredient {

    private Ingredient recipeIngredients;
    private Integer ingredientQuantity;

    public RecipeIngredient(Ingredient recipeIngredients, Integer ingredientQuantity) {
        this.recipeIngredients = recipeIngredients;
        this.ingredientQuantity = ingredientQuantity;
    }

    public RecipeIngredient() {
    }

    public Ingredient getRecipeIngredients() {
        return recipeIngredients;
    }

    public void setRecipeIngredients(Ingredient recipeIngredients) {
        this.recipeIngredients = recipeIngredients;
    }

    public Integer getIngredientQuantity() {
        return ingredientQuantity;
    }

    public void setIngredientQuantity(Integer ingredientQuantity) {
        this.ingredientQuantity = ingredientQuantity;
    }

}