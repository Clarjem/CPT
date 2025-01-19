package HealthyCooking;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * author: Clarenz Ferrer
 * date: 01/09/2025
 * This class represents a meal with ingredients and cookware.
 */

public class Meal extends Recipe {
    private ArrayList<Ingredient> optionalIngredients;
    private ArrayList<Cookware> optionalCookware;

    public Meal(int mealToCook) {
        super(mealToCook);
        optionalIngredients = new ArrayList<>();
        optionalCookware = new ArrayList<>();
        initializeMeal(mealToCook);
    }

    private void initializeMeal(int mealToCook) {
        switch (mealToCook) {
            case 1:
                setName("Quinoa Salad and Roasted Vegetables");
                addIngredients(new Ingredient("Quinoa", 222, 9, true));
                addIngredients(new Ingredient("Carrots", 41, 3, true));
                addIngredients(new Ingredient("Bell Peppers", 31, 1, true));
                addIngredients(new Ingredient("Zucchini", 20, 1, true));
                addIngredients(new Ingredient("Cherry Tomatoes", 18, 1, true));
                addIngredients(new Ingredient("Red Onion", 40, 2, true));
                addIngredients(new Ingredient("Sweet Potatoes", 112, 5, true));
                addIngredients(new Ingredient("Olive Oil", 119, 7, true));
                addIngredients(new Ingredient("Salt", 0, 0, true));
                addIngredients(new Ingredient("Pepper", 0, 0, true));
                addIngredients(new Ingredient("Lemon Juice", 4, 0, true));
                addIngredients(new Ingredient("Parsley", 1, 0, true));
                addIngredients(new Ingredient("Feta Cheese", 264, 21, true));
                addIngredients(new Ingredient("Chickpeas", 164, 3, true));
                addOptionalIngredient(new Ingredient("Avocado", 240, 10, false));
                addOptionalIngredient(new Ingredient("Pumpkin Seeds", 153, 13, false));
                addOptionalIngredient(new Ingredient("Almonds", 7, 1, false));

                addCookware(new Cookware("Baking Sheet", 5, true));
                addCookware(new Cookware("Large Bowl", 4, true));
                addCookware(new Cookware("Small Bowl", 3, true));
                addCookware(new Cookware("Saucepan", 3, true));
                addCookware(new Cookware("Mixing Bowl", 2, true));
                addCookware(new Cookware("Knife", 1, true));
                addCookware(new Cookware("Cutting Board", 1, true));
                addCookware(new Cookware("Measuring Spoons", 1, true));
                break;
            case 2:
                setName("Lentil and Sweet Potato Stew");
                addIngredients(new Ingredient("Lentils", 230, 10, true));
                addIngredients(new Ingredient("Sweet Potatoes", 112, 5, true));
                addIngredients(new Ingredient("Carrots", 41, 3, true));
                addIngredients(new Ingredient("Onion", 44, 2, true));
                addIngredients(new Ingredient("Garlic", 4, 0, true));
                addIngredients(new Ingredient("Diced Tomatoes", 32, 0, true));
                addIngredients(new Ingredient("Vegetable Broth", 10, 0, true));
                addIngredients(new Ingredient("Salt", 0, 0, true));
                addIngredients(new Ingredient("Pepper", 0, 0, true));
                addIngredients(new Ingredient("Olive Oil", 119, 7, true));
                addOptionalIngredient(new Ingredient("Celery", 16, 1, false));
                addOptionalIngredient(new Ingredient("Bay Leaves", 5, 0, false));
                addOptionalIngredient(new Ingredient("Paprika", 20, 1, false));
                addOptionalIngredient(new Ingredient("Lemon Juice", 4, 0, false));
                addOptionalIngredient(new Ingredient("Parsley", 1, 0, false));

                addCookware(new Cookware("Large Pot", 5, true));
                addCookware(new Cookware("Saucepan", 3, true));
                addCookware(new Cookware("Knife", 1, true));
                addCookware(new Cookware("Cutting Board", 1, true));
                addCookware(new Cookware("Wooden Spoon", 1, true));
                addCookware(new Cookware("Measuring Spoon", 1, true));
                break;
            case 3:
                setName("Grilled Chicken and Mango Salad");
                addIngredients(new Ingredient("Chicken Breast", 165, 8, true));
                addIngredients(new Ingredient("Cherry Tomatoes", 18, 1, true));
                addIngredients(new Ingredient("Mango", 60, 3, true));
                addIngredients(new Ingredient("Mixed Greens", 5, 0, true));
                addIngredients(new Ingredient("Cucumber", 8, 0, true));
                addIngredients(new Ingredient("Red Onion", 40, 2, true));
                addIngredients(new Ingredient("Olive Oil", 119, 7, true));
                addIngredients(new Ingredient("Salt", 0, 0, true));
                addIngredients(new Ingredient("Pepper", 0, 0, true));
                addIngredients(new Ingredient("Lime Wedges", 4, 0, true));
                addOptionalIngredient(new Ingredient("Avocado", 240, 10, false));
                addOptionalIngredient(new Ingredient("Fresh Cilantro", 1, 0, false));

                addCookware(new Cookware("Grill Pan", 5, true));
                addCookware(new Cookware("Tongs", 2, true));
                addCookware(new Cookware("Large Bowl", 4, true));
                addCookware(new Cookware("Small Bowl", 3, true));
                addCookware(new Cookware("Knife", 1, true));
                addCookware(new Cookware("Cutting Board", 1, true));
                addCookware(new Cookware("Measuring Spoons", 2, true));
                addCookware(new Cookware("Measuring Cups", 2, true));
                addCookware(new Cookware("Fork", 1, true));
                break;
            default:
                setName("Unknown");
        }
    }

    public void showDetails() {
        System.out.println("You have chosen " + getName() + ".");
        System.out.println("- Required Ingredients:");
        for (Ingredient ingredient : getIngredients()) {
            System.out.println(ingredient.getName());
        }
        System.out.println("- Optional Ingredients:");
        for (Ingredient ingredient : optionalIngredients) {
            System.out.println(ingredient.getName());
        }
        System.out.println("- Required Cookware:");
        for (Cookware cookware : getCookware()) {
            System.out.println(cookware.getType());
        }
        System.out.println("- Optional Cookware:");
        for (Cookware cookware : optionalCookware) {
            System.out.println(cookware.getType());
        }
    }

    public ArrayList<Ingredient> selectIngredients(Scanner input) { //ChatGPT gave me the idea to add the Scanner input
        ArrayList<Ingredient> selectedIngredients = new ArrayList<>();
        System.out.println("Type the name of the ingredients you're going to use (type 'done' when finished):");
        while (true) {
            String ingredientName = input.nextLine().toLowerCase(); // Convert input to lowercase
            if (ingredientName.equals("done")) break;
            boolean found = false;
            for (Ingredient ingredient : getIngredients()) {
                if (ingredient.getName().toLowerCase().equals(ingredientName)) {
                    selectedIngredients.add(ingredient);
                    found = true;
                    break;
                }
            }
            for (Ingredient ingredient : optionalIngredients) {
                if (ingredient.getName().toLowerCase().equals(ingredientName)) {
                    selectedIngredients.add(ingredient);
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("Ingredient (Wrong Spelling) not recognized. Please type it out again.");
            }
        }
        return selectedIngredients;
    }
    
    public ArrayList<Cookware> selectCookware(Scanner input) {
        ArrayList<Cookware> selectedCookware = new ArrayList<>();
        System.out.println("Type the name of the cookwares you're going to use  (type 'done' when finished):");
        while (true) {
            String cookwareName = input.nextLine().toLowerCase(); // Convert input to lowercase
            if (cookwareName.equals("done")) break;
            boolean found = false;
            for (Cookware cookware : getCookware()) {
                if (cookware.getType().toLowerCase().equals(cookwareName)) {
                    selectedCookware.add(cookware);
                    found = true;
                    break;
                }
            }
            for (Cookware cookware : optionalCookware) {
                if (cookware.getType().toLowerCase().equals(cookwareName)) {
                    selectedCookware.add(cookware);
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("Cookware (Wrong Spelling) not recognized. Please type it out again.");
            }
        }
        return selectedCookware;
    }
    
    
    public boolean verifySelection(ArrayList<Ingredient> ingredients, ArrayList<Cookware> cookware) {
        ArrayList<String> selectedIngredients = new ArrayList<>();
        ArrayList<String> selectedCookware = new ArrayList<>();
    
        for (Ingredient ingredient : ingredients) {
            selectedIngredients.add(ingredient.getName().toLowerCase());
        }
    
        for (Cookware cookwareItem : cookware) {
            selectedCookware.add(cookwareItem.getType().toLowerCase());
        }
    
        for (Ingredient requiredIngredient : getIngredients()) {
            if (!selectedIngredients.contains(requiredIngredient.getName().toLowerCase())) { 
                return false;
            }
        }
    
        for (Cookware requiredCookware : getCookware()) {
            if (!selectedCookware.contains(requiredCookware.getType().toLowerCase())) {
                return false;
            }
        }
        return true;
    }    
    
        private void addOptionalIngredient(Ingredient ingredient) {
            optionalIngredients.add(ingredient);
        }
    
        private void addOptionalCookware(Cookware cookware) { //TODO May have to remove later on
            optionalCookware.add(cookware);
        }
        
    }
        