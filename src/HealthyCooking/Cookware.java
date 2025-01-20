package HealthyCooking;

/**
 * author: Clarenz Ferrer
 * date: 01/09/2025
 * Cookware Class (Part of Recipe Class)
 */ 

 //TODO Comments

public class Cookware {
    private String type; // Type of cookware to be used
    private double healthImpact; // Health impact of using this cookware (depends on type of cookware)

    public Cookware(String type, double healthImpact) { 
        this.type = type; 
        this.healthImpact = healthImpact;
    } 
    
    public String getType() {
        return type;
    }

    public double getHealthImpact() {
        return healthImpact;
    }

    @Override 
    public String toString() { 
        return type + " (Health Impact: " + healthImpact + ")"; 
    }

    
}