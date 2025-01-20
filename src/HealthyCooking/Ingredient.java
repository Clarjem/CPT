package HealthyCooking;

/**
 * author: Clarenz Ferrer
 * date: 01/09/2025
 * Ingredient Class (Part of Recipe Class). This class represents an ingredient with a name, nutrition value, and health score.
 */
public class Ingredient { 
    private String name; // The name of the ingredient
    private double nutritionValue; // The nutrition value of the ingredient
    private double healthScore; // The health score of the ingredient
    
    /**
     * Constructor for the Ingredient class.
     * @param name the name of the ingredient
     * @param nutritionValue the nutrition value of the ingredient
     * @param healthScore the health score of the ingredient
     */
    public Ingredient(String name, double nutritionValue, double healthScore) { 
        this.name = name; 
        this.nutritionValue = nutritionValue; 
        this.healthScore = healthScore; 
    } 
        
    /**
     * Gets the name of the ingredient.
     * @return the name of the ingredient
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the nutrition value of the ingredient.
     * @return the nutrition value of the ingredient
     */
    public double getNutritionValue() { 
        return nutritionValue; 
    } 
        
    /**
     * Gets the health score of the ingredient.
     * @return the health score of the ingredient
     */
    public double getHealthScore() { 
        return healthScore; 
    }
        
    /**
     * Returns a string representation of the ingredient.
     * @return a string representation of the ingredient
     */
    @Override 
    public String toString() {
        return name + " (Nutrition: " + nutritionValue + ", Health: " + healthScore + ")";
    } 
}