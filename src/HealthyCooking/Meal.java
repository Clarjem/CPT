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
                addIngredients(new Ingredient("Quinoa", 222, 9, true)); //TODO remove the isrequired stuff later
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
                addCookware(new Cookware("Measuring Cups", 1, true));
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
                System.out.println("That's an invalid meal choice. Please choose a valid meal next time :)");
                System.exit(0);
        }
    }

    public void showDetails() {
        System.out.println("You have chosen " + getName() + ".");
    }

    public ArrayList<Ingredient> selectIngredients(Scanner input) { //ChatGPT gave me the idea to add the Scanner input
        ArrayList<Ingredient> selectedIngredients = new ArrayList<>();
        System.out.println("Required ingredients:");
        for (Ingredient ingredient : getIngredients()) {
            System.out.println("- " + ingredient.getName());
        }
        System.out.println("Optional ingredients:");
        for (Ingredient ingredient : optionalIngredients) {
            System.out.println("- " + ingredient.getName());
        }
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
        System.out.println("Required cookware:");
        for (Cookware cookware : getCookware()) {
            System.out.println("- " + cookware.getType());
        }
        System.out.println("Optional cookware:");
        for (Cookware cookware : optionalCookware) {
            System.out.println("- " + cookware.getType());
        }
        System.out.println("Type the name of the cookware you're going to use (type 'done' when finished):");
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
                System.out.println("Missing required ingredient: " + requiredIngredient.getName());
                return false;
            }
        }
    
        for (Cookware requiredCookware : getCookware()) {
            if (!selectedCookware.contains(requiredCookware.getType().toLowerCase())) {
                System.out.println("Missing required cookware: " + requiredCookware.getType());
                return false;
            }
        }
        return true;
    }    

    public void cookMeal(Scanner input, ArrayList<Ingredient> selectedIngredients, ArrayList<Cookware> selectedCookware) {
        int score = 0;
        int totalNutrition = 0;
        int totalHealthScore = 0;
        int totalHealthImpact = 0;
    
        if (getName().equals("Quinoa Salad and Roasted Vegetables")) {
            System.out.println("Step 1: Rinse quinoa under cold water.");
            System.out.println("Will you rinse the quinoa? (yes/no)");
            String rinse = input.nextLine();
            if (rinse.equalsIgnoreCase("yes")) {
                score += 10;
                System.out.println("Great choice! Rinsing the quinoa helps remove bitterness.");
                
                System.out.println("*Running Water* 💦💦💦💦💦💦");
            } else {
                score -= 5;
                System.out.println("Skipping the rinsing process means the quinoa might taste bitter.");
            }
    
            System.out.println("Step 2: In a medium saucepan, combine quinoa and water or vegetable broth. Bring to a boil, then reduce heat to low. Cover and simmer for about 15 minutes or until the liquid is absorbed. Fluff with a fork and set aside.");
            System.out.println("Will you use a saucepan to cook the quinoa? (yes/no)");
            String useSaucepan = input.nextLine();
            if (useSaucepan.equalsIgnoreCase("yes")) {
                score += 10;
                System.out.println("Great! Using a saucepan ensures even cooking.");
            } else {
                score -= 5;
                System.out.println("Not using a saucepan might lead to uneven cooking.");
            }
    
            System.out.println("How long will you cook the quinoa for? (minutes)");
            int cookQuinoaTime = input.nextInt();
            input.nextLine(); 
            if (cookQuinoaTime >= 15 && cookQuinoaTime <= 20) {
                score += 20;
                System.out.println("Incredible cooking time! The quinoa is cooked just right.");
            } else if (cookQuinoaTime < 5) {
                score -= 15;
                System.out.println("The quinoa is rather raw.");
            } else if (cookQuinoaTime < 15) {
                score -= 10;
                System.out.println("The quinoa is undercooked.");
            } else if (cookQuinoaTime < 25) {
                score -= 10;
                System.out.println("The quinoa is overcooked.");
            } else {
                score -= 25;
                System.out.println("You've burnt your quinoa.");
            }
    
            System.out.println("Step 3: Preheat the oven to 400°F (200°C).");
            System.out.println("Will you preheat the oven? (yes/no)");
            String preheatOven = input.nextLine();
            if (preheatOven.equalsIgnoreCase("yes")) {
                score += 10;
                System.out.println("Excellent! Preheating the oven ensures even roasting.");
                System.out.println("Beep beep! 🌡️🔥");
            } else {
                score -= 5;
                System.out.println("Not preheating the oven can lead to uneven roasting.");
            }
    
            System.out.println("Step 4: Spread diced carrots, bell pepper, zucchini, cherry tomatoes, red onion, and sweet potato on a large baking sheet. Drizzle with olive oil, season generously with salt and pepper, and toss to coat evenly.");
            System.out.println("Will you use a baking sheet to prepare the vegetables? (yes/no)");
            String useBakingSheet = input.nextLine();
            if (useBakingSheet.equalsIgnoreCase("yes")) {
                score += 10;
                System.out.println("Great! Using a baking sheet ensures even roasting.");
            } else {
                score -= 5;
                System.out.println("Not using a baking sheet might lead to uneven roasting.");
            }
    
            System.out.println("Step 5: Roast vegetables in the oven for 25-30 minutes, stirring halfway, until tender and slightly caramelized.");
            System.out.println("How long will you roast the vegetables for? (minutes)");
            int roastVeggiesTime = input.nextInt();
            input.nextLine(); 
            if (roastVeggiesTime >= 25 && roastVeggiesTime <= 30) {
                score += 20;
                System.out.println("Perfect roasting time! The vegetables are tender and caramelized.");
                System.out.println("sizzle... sizzle... (tss tss)");
            } else if (roastVeggiesTime < 10) {
                score -= 15;
                System.out.println("The vegetables are barely cooked.");
            } else if (roastVeggiesTime < 25) {
                score -= 10;
                System.out.println("The vegetables are undercooked.");
            } else if (roastVeggiesTime < 40) {
                score -= 10;
                System.out.println("The vegetables are overcooked.");
            } else {
                score -= 25;
                System.out.println("Wow! You've successfully created charcoal.");
            }
    
            System.out.println("Step 6: Add the rinsed and drained chickpeas to the baking sheet during the last 10 minutes of roasting to warm them up and give them a slight crisp.");
            System.out.println("Will you add the chickpeas correctly? (yes/no)");
            String prepareChickpeas = input.nextLine();
            if (prepareChickpeas.equalsIgnoreCase("yes")) {
                score += 10;
                System.out.println("Great! Adding the chickpeas ensures they are warm and slightly crispy.");
                System.out.println("Crunchy crunch!");
            } else {
                score -= 5;
                System.out.println("Not adding the chickpeas correctly will affect the texture.");
            }
    
            System.out.println("Step 7: In a large mixing bowl, combine the cooked quinoa, roasted vegetables, and chickpeas.");
            System.out.println("Will you use a large mixing bowl to combine the ingredients? (yes/no)");
            String useMixingBowl = input.nextLine();
            if (useMixingBowl.equalsIgnoreCase("yes")) {
                score += 10;
                System.out.println("Wonderful! Using a large mixing bowl ensures even mixing.");
            } else {
                score -= 5;
                System.out.println("Not using a large mixing bowl might lead to uneven mixing.");
            }
    
            System.out.println("Step 8: Add lemon juice, chopped parsley, and crumbled feta cheese. Toss everything gently to combine.");
            System.out.println("Will you add lemon juice, parsley, and feta cheese? (yes/no)");
            String addIngredients = input.nextLine();
            if (addIngredients.equalsIgnoreCase("yes")) {
                score += 10;
                System.out.println("Great! Adding these ingredients enhances the flavor.");
            } else {
                score -= 5;
                System.out.println("Not adding these ingredients means less flavor.");
            }
    
            for (Ingredient ingredient : selectedIngredients) {
                if (ingredient.getName().equalsIgnoreCase("Avocado")) {
                    System.out.println("Will you add avocado? (yes/no)");
                    String addAvocado = input.nextLine();
                    if (addAvocado.equalsIgnoreCase("yes")) {
                        score += 10;
                        System.out.println("Avocado adds a rich, creamy texture to the salad.");
                    }
                }
    
                if (ingredient.getName().equalsIgnoreCase("Pumpkin Seeds")) {
                    System.out.println("Will you add pumpkin seeds? (yes/no)");
                    String addPumpkinSeeds = input.nextLine();
                    if (addPumpkinSeeds.equalsIgnoreCase("yes")) {
                        score += 10;
                        System.out.println("Pumpkin seeds add a nice crunch and extra nutrition.");
                    }
                }
    
                if (ingredient.getName().equalsIgnoreCase("Almonds")) {
                    System.out.println("Will you add almonds? (yes/no)");
                    String addAlmonds = input.nextLine();
                    if (addAlmonds.equalsIgnoreCase("yes")) {
                        score += 10;
                        System.out.println("Almonds add a lovely crunch and enhance the flavor.");
                    }
                }
    
                if (ingredient.getName().equalsIgnoreCase("Feta Cheese")) {
                    System.out.println("Will you add feta cheese? (yes/no)");
                    String addFetaCheese = input.nextLine();
                    if (addFetaCheese.equalsIgnoreCase("yes")) {
                        score += 10;
                        System.out.println("Feta cheese adds a tangy flavor to the salad.");
                    }
                }
            }
    
            System.out.println("Step 9: Serve warm, at room temperature, or chilled, depending on your preference.");
            System.out.println("Serving the salad! ");
            score += 10;
            System.out.println("Perfect! The salad is ready to be enjoyed.");
    
            System.out.println("You have finished preparing the Quinoa Salad and Roasted Vegetables.");
            System.out.println("Your score for this meal is: " + score);
        }
    
        // Add similar blocks for other meals with their specific cooking steps and score interactions
    }
    
    private void addOptionalIngredient(Ingredient ingredient) {
        optionalIngredients.add(ingredient);
    }
        
}
