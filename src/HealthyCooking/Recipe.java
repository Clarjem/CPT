package HealthyCooking;

/**
 * author: Clarenz Ferrer
 * date: 01/09/2025
 * Recipe Class: This class represents a recipe which includes a name, a list of ingredients, and a list of cookware.
 */

import java.util.ArrayList;

public class Recipe {
    // Name of the recipe
    private String name;
    // List of ingredients required for the recipe
    private ArrayList<Ingredient> ingredients;
    // List of cookware required for the recipe
    private ArrayList<Cookware> cookware;

    /**
     * Constructor for the Recipe class and initializes the ingredients and cookware lists.
     * @param mealChoice an integer representing the meal choice
     */
    public Recipe(int mealChoice){
        // Initialize the ingredients list
        this.ingredients = new ArrayList<>();
        // Initialize the cookware list
        this.cookware = new ArrayList<>();      
    }

    /**
     * Gets the name of the recipe.
     * @return the name of the recipe
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the recipe.
     * @param name the name to set for the recipe
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the list of ingredients for the recipe.
     * @return the list of ingredients
     */
    public ArrayList<Ingredient> getIngredients() {
        return ingredients;
    }

    /**
     * Gets the list of cookware for the recipe.
     * @return the list of cookware
     */
    public ArrayList<Cookware> getCookware() {
        return cookware;
    }

    /**
     * Adds an ingredient to the recipe.
     * @param ingredient the ingredient to add
     */
    public void addIngredients (Ingredient ingredient){
        this.ingredients.add(ingredient);
    }

    /**
     * Adds cookware to the recipe.
     * @param cookware the cookware to add
     */
    public void addCookware (Cookware cookware){
        this.cookware.add(cookware);
    }

    /**
     * Returns a string representation of the recipe.
     * @return a string representation of the recipe
     */
    @Override
    public String toString() {
        return "Recipe{name='" + name + "', ingredients=" + ingredients + ", cookware=" + cookware + '}';
    }
}