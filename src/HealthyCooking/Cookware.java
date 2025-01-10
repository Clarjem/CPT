package HealthyCooking;

public class Cookware {
    private String type; // Type of cookware to be used
    private double healthImapct; // Is the cookware healthy?

    public Cookware(String type, double healthImapct) { 
        this.type = type; 
        this.healthImapct = healthImapct;
    } 
    
    public String getType() {
        return type;
    }

    public double getHealthImapct() {
        return healthImapct;
    }
    
    @Override 
    public String toString() { 
        return null;
    }
}