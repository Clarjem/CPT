package HealthyCooking;

public class Ingredient { 
    private String name; 
    private double nutritionValue;
    private double healthScore; 
    
    public Ingredient(String name, double nutritionValue, double healthScore) { 
        this.name = name; 
        this.nutritionValue = nutritionValue; 
        this.healthScore = healthScore; } 
        
    public String getName() {
        return name;
    }

    public double getNutritionValue() { 
        return nutritionValue; 
    } 
        
    public double getHealthScore() { 
        return healthScore; 
    }
        
    @Override public String toString() {
        return null;
    } 
}