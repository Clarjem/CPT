package HealthyCooking;

/**
 * author: Clarenz Ferrer
 * date: 01/09/2025
 * Cookware Class (Part of Recipe Class). This class represents cookware with a type and health impact.
 */
public class Cookware {
    private String type; // Type of cookware to be used
    private double healthImpact; // Health impact of using this cookware (depends on type of cookware)

    /**
     * Constructor for the Cookware class.
     * @param type the type of cookware
     * @param healthImpact the health impact of the cookware
     */
    public Cookware(String type, double healthImpact) { 
        this.type = type; 
        this.healthImpact = healthImpact;
    } 
    
    /**
     * Gets the type of cookware.
     * @return the type of cookware
     */
    public String getType() {
        return type;
    }

    /**
     * Gets the health impact of the cookware.
     * @return the health impact of the cookware
     */
    public double getHealthImpact() {
        return healthImpact;
    }

    /**
     * Returns a string representation of the cookware.
     * @return a string representation of the cookware
     */
    @Override 
    public String toString() { 
        return type + " (Health Impact: " + healthImpact + ")"; 
    }
}