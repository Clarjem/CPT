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
    private boolean required; // If this cookware is required for the recipe //TODO FIX THIS

    public Cookware(String type, double healthImpact, boolean isRequired) { 
        this.type = type; 
        this.healthImpact = healthImpact;
        this.required = isRequired;
    } 
    
    public String getType() {
        return type;
    }

    public double getHealthImapct() {
        return healthImpact;
    }
    
    public boolean isRequired() {
        return required;
    }

    @Override 
    public String toString() { 
        return type + " (Health Impact: " + healthImpact + ")"; 
    }

    
}