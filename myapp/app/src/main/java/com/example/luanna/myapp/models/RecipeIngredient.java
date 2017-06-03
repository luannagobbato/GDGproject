package com.example.luanna.myapp.models;

// Created by Luanna on 01/06/2017.

public class RecipeIngredient {

    //Define os atributos do Ingrediente na Receita
    private Ingredient recipeIngredient;
    private Integer ingredientQuantity;

    public RecipeIngredient(Ingredient recipeIngredient, Integer ingredientQuantity) {
        this.recipeIngredient = recipeIngredient;
        this.ingredientQuantity = ingredientQuantity;
    }

    public RecipeIngredient() {
    }

    //Getters e Setters
    
    //Calcula o preço por quantidade do produto na receita  
    public Double getRecipeIngredientPrice(){
        Ingredient ingredient = getRecipeIngredient();
        return (ingredientQuantity * ingredient.getPrice())/ ingredient.getQuantity();
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