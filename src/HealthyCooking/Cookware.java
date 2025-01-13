package HealthyCooking;

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

    public double getHealthImapct() {
        return healthImpact;
    }
    
    @Override 
    public String toString() { 
        return null;
    }
}