package com.example.luanna.myapp.models;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Luanna on 24/05/2017.
 */

public class Recipe {

    //private String urlPhoto;
    private String name;
    private String time;
    private Double profit, revenue, netProfit, priceSell;
    private Integer portion;
    private List<RecipeIngredient> recipeIngredients;

    public Recipe(String name, String time, Integer portion, List<RecipeIngredient> recipeIngredients) {
        this.name = name;
        this.time = time;
        this.priceSell = 3.50;
        this.portion = portion;
        this.recipeIngredients = recipeIngredients;
        this.revenue = getRevenue();
        this.netProfit = getNetProfit();
        this.profit = getProfit();
    }

    public Recipe() {
    }


    public Double getRevenue() {
        return getPriceSell()*getPortion();
    }

    public Double getNetProfit(){
        Double sum = 0.0 ;
        for (RecipeIngredient recipeIngredient : recipeIngredients) {
            sum += recipeIngredient.getRecipeIngredientPrice();
        }
        return revenue - sum;
    }

    public void setRevenue(Double revenue) {
        this.revenue = revenue;
    }

    public void setNetProfit(Double netProfit) {
        this.netProfit = netProfit;
    }

    public Double getPriceSell() {
        return priceSell;
    }

    public void setPriceSell(Double priceSell) {
        this.priceSell = priceSell;
    }

    public Double getProfit() {
        return (revenue / netProfit - 1) * 100;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
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