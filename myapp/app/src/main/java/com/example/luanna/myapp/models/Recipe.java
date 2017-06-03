package com.example.luanna.myapp.models;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Luanna on 24/05/2017.
 */

public class Recipe {

    //private String urlPhoto;
    private String name;
    private String pepareMethod;
    private String time;
    private Double profit;
    private Integer portion;
    private List<RecipeIngredient> recipeIngredients;


    public Recipe(String name, String pepareMethod, String time, Double profit, Integer portion, List<RecipeIngredient> recipeIngredients) {
        this.name = name;
        this.pepareMethod = pepareMethod;
        this.time = time;
        this.profit = profit;
        this.portion = portion;
        this.recipeIngredients = recipeIngredients;
    }

    public Recipe() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPepareMethod() {
        return pepareMethod;
    }

    public void setPepareMethod(String pepareMethod) {
        this.pepareMethod = pepareMethod;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Double getProfit() {
        return profit;
    }

    public void setProfit(Double profit) {
        this.profit = profit;
    }

    public Integer getPortion() {
        return portion;
    }

    public void setPortion(Integer portion) {
        this.portion = portion;
    }

    public List<RecipeIngredient> getRecipeIngredients() {
        return recipeIngredients;
    }

    public void setRecipeIngredients(List<RecipeIngredient> recipeIngredients) {
        this.recipeIngredients = recipeIngredients;
    }

}