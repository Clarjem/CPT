package HealthyCooking;

import java.util.ArrayList;

public class Recipe {
    private ArrayList<Ingredient> ingredients;
    private ArrayList<Cookware> cookware;
    private int healthscore;

    public Recipe(){
        this.ingredients = new ArrayList<>();
        this.cookware = new ArrayList<>();
        
    }
}