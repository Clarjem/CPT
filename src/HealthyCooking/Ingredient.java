package HealthyCooking;

public class Ingredient { 
    private String name; 
    private int nutritionValue;
    private boolean isHealthy; 
    
    public Ingredient(String name, int nutritionValue, boolean isHealthy) { 
        this.name = name; 
        this.nutritionValue = nutritionValue; 
        this.isHealthy = isHealthy; } 
        
    public int getNutritionValue() { 
        return nutritionValue; } 
        
    public boolean isHealthy() { 
        return isHealthy; }
        
    @Override public String toString() {
        return null;
    } 
}