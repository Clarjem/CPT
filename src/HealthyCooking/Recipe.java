package HealthyCooking;

import java.util.ArrayList;

public class Recipe {
    private String name;
    private ArrayList<Ingredient> ingredients;
    private ArrayList<Cookware> cookware;
    private double cookingTime;

    public Recipe(int mealChoice){
        this.ingredients = new ArrayList<>();
        this.cookware = new ArrayList<>();      
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Ingredient> getIngredients() {
        return ingredients;
    }

    public ArrayList<Cookware> getCookware() {
        return cookware;
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

    public String toString() { 
        return null;

    }

}