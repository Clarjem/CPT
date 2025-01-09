package HealthyCooking;

public class Cookware {
    private String type; // Type of cookware to be used
    private boolean isHealthyCookware; // Is the cookware healthy?

    public Cookware(String type, boolean isHealthyCookware) { 
        this.type = type; this.isHealthyCookware = isHealthyCookware;
    } public boolean isHealthyCookware() { 
        return isHealthyCookware; 
    } 
    
    @Override 
    public String toString() { 
        return null;; 
    }
}