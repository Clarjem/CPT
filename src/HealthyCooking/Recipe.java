package HealthyCooking;

import java.util.ArrayList;

public class Recipe {
    private String name;
    private ArrayList<Ingredient> ingredients;
    private ArrayList<Cookware> cookware;
    private double cookingTime;

    public Recipe(String name, double cookingTime){
        this.name = name;
        this.ingredients = new ArrayList<>();
        this.cookware = new ArrayList<>();    
        this.cookingTime = cookingTime;    
    }

    public void addIngredients (Ingredient ingredient){
        this.ingredients.add(ingredient);
    }

    public void addCookware (Cookware cookware){
        this.cookware.add(cookware);
    }

    public double getCookingTime() {
        return cookingTime;
    }

    public void setCookingTime(double cookingTime) {
        this.cookingTime = cookingTime;
    }

    public String toString(){
        return null;
    }

}