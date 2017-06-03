package com.example.luanna.myapp.models;

// Created by Luanna on 02/06/2017.


import java.util.List;

public class RecipeIngredient {

    private Ingredient recipeIngredient;
    private Integer ingredientQuantity;

    public RecipeIngredient(Ingredient recipeIngredient, Integer ingredientQuantity) {
        this.recipeIngredient = recipeIngredient;
        this.ingredientQuantity = ingredientQuantity;
    }

    public RecipeIngredient() {
    }

    public Ingredient getRecipeIngredient() {
        return recipeIngredient;
    }

    public void setRecipeIngredient(Ingredient recipeIngredients) {
        this.recipeIngredient = recipeIngredients;
    }

    public Integer getIngredientQuantity() {
        return ingredientQuantity;
    }

    public void setIngredientQuantity(Integer ingredientQuantity) {
        this.ingredientQuantity = ingredientQuantity;
    }

    public String getNameIngredient(){
        return this.getRecipeIngredient().getName();
    }

}