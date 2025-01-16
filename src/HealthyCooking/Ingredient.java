package HealthyCooking;

/**
 * author: Clarenz Ferrer
 * date: 01/09/2025
 * Ingredient Class (Part of Recipe Class)
 */ 

 //TODO Comments
public class Ingredient { 
    private String name; 
    private double nutritionValue;
    private double healthScore; 
    private boolean required; // If this ingredient is required for the recipe //TODO FIX THIS
    
    public Ingredient(String name, double nutritionValue, double healthScore, boolean isRequired) { 
        this.name = name; 
        this.nutritionValue = nutritionValue; 
        this.healthScore = healthScore; 
        this.required = isRequired;
    } 
        
    public String getName() {
        return name;
    }

    public double getNutritionValue() { 
        return nutritionValue; 
    } 
        
    public double getHealthScore() { 
        return healthScore; 
    }

    public boolean isRequired() {
        return required;
    }
        
    @Override public String toString() {
        return null;
    } 
}