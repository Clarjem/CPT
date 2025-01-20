package HealthyCooking;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Queue;

/**
 * author: Clarenz Ferrer
 * date: 01/09/2025
 * Meal Class: This class represents a meal with ingredients and cookware (sub class of recipe).
 */

public class Meal extends Recipe {
    private ArrayList<Ingredient> optionalIngredients;     // List of optional ingredients for the meal
    private ArrayList<Cookware> optionalCookware; // List of optional cookware for the meal
    private Queue<Integer> scoreHistory;     // Queue to store the score history of the meals cooked

    /**
     * Constructor to initialize a Meal object based on the meal to cook.
     * @param mealToCook the meal choice to initialize
     */
    public Meal(int mealToCook) {
        super(mealToCook);
        // Initialize the optional ingredients list
        optionalIngredients = new ArrayList<>();
        // Initialize the optional cookware list
        optionalCookware = new ArrayList<>();
        // Initialize the score history queue
        scoreHistory = new LinkedList<>();
        
        // Initialize the meal based on the user's choice
        initializeMeal(mealToCook);
    }
    
    /**
     * Initialize the meal based on the user's choice.
     * @param mealToCook the meal choice to initialize
     */
    private void initializeMeal(int mealToCook) {
        switch (mealToCook) {
            case 1:
                // Initialize ingredients and cookware for Quinoa Salad and Roasted Vegetables
                setName("Quinoa Salad and Roasted Vegetables");
                // Add required ingredients
                addIngredients(new Ingredient("Quinoa", 22, 9)); 
                addIngredients(new Ingredient("Carrots", 41, 3));
                addIngredients(new Ingredient("Bell Peppers", 31, 1));
                addIngredients(new Ingredient("Zucchini", 20, 1));
                addIngredients(new Ingredient("Cherry Tomatoes", 18, 1));
                addIngredients(new Ingredient("Red Onion", 40, 2));
                addIngredients(new Ingredient("Sweet Potatoes", 11, 5));
                addIngredients(new Ingredient("Olive Oil", 19, 7));
                addIngredients(new Ingredient("Salt", 0, 0));
                addIngredients(new Ingredient("Pepper", 0, 0));
                addIngredients(new Ingredient("Lemon Juice", 4, 0));
                addIngredients(new Ingredient("Parsley", 1, 0));
                addIngredients(new Ingredient("Feta Cheese", 24, 2));
                addIngredients(new Ingredient("Chickpeas", 16, 3));
                // Add optional ingredients
                addOptionalIngredient(new Ingredient("Avocado", 24, 1));
                addOptionalIngredient(new Ingredient("Pumpkin Seeds", 15, 3));
                addOptionalIngredient(new Ingredient("Almonds", 7, 1));
                // Add required cookware
                addCookware(new Cookware("Baking Sheet", 5));
                addCookware(new Cookware("Large Bowl", 4));
                addCookware(new Cookware("Small Bowl", 3));
                addCookware(new Cookware("Saucepan", 3));
                addCookware(new Cookware("Mixing Bowl", 2));
                addCookware(new Cookware("Knife", 1));
                addCookware(new Cookware("Cutting Board", 1));
                addCookware(new Cookware("Measuring Spoons", 1));
                addCookware(new Cookware("Measuring Cups", 1));
                break;
            case 2:
                // Initialize ingredients and cookware for Lentil and Sweet Potato Stew
                setName("Lentil and Sweet Potato Stew");
                // Add required ingredients
                addIngredients(new Ingredient("Lentils", 23, 10));
                addIngredients(new Ingredient("Sweet Potatoes", 11, 5));
                addIngredients(new Ingredient("Carrots", 41, 3));
                addIngredients(new Ingredient("Onion", 44, 2));
                addIngredients(new Ingredient("Garlic", 4, 0));
                addIngredients(new Ingredient("Diced Tomatoes", 3, 0));
                addIngredients(new Ingredient("Vegetable Broth", 10, 0));
                addIngredients(new Ingredient("Salt", 0, 0));
                addIngredients(new Ingredient("Pepper", 0, 0));
                addIngredients(new Ingredient("Olive Oil", 11, 7));
                // Add optional ingredients
                addOptionalIngredient(new Ingredient("Celery", 16, 1));
                addOptionalIngredient(new Ingredient("Bay Leaves", 5, 0));
                addOptionalIngredient(new Ingredient("Paprika", 20, 1));
                addOptionalIngredient(new Ingredient("Lemon Juice", 4, 0));
                addOptionalIngredient(new Ingredient("Parsley", 1, 0));
                // Add required cookware
                addCookware(new Cookware("Large Pot", 5));
                addCookware(new Cookware("Saucepan", 3));
                addCookware(new Cookware("Knife", 1));
                addCookware(new Cookware("Cutting Board", 1));
                addCookware(new Cookware("Wooden Spoon", 1));
                addCookware(new Cookware("Measuring Spoon", 1));
                break;
            case 3:
                // Initialize ingredients and cookware for Grilled Chicken and Mango Salad
                setName("Grilled Chicken and Mango Salad");
                // Add required ingredients
                addIngredients(new Ingredient("Chicken Breast", 16, 8));
                addIngredients(new Ingredient("Cherry Tomatoes", 18, 1));
                addIngredients(new Ingredient("Mango", 6, 3));
                addIngredients(new Ingredient("Mixed Greens", 5, 0));
                addIngredients(new Ingredient("Cucumber", 8, 0));
                addIngredients(new Ingredient("Red Onion", 40, 2));
                addIngredients(new Ingredient("Olive Oil", 11, 7));
                addIngredients(new Ingredient("Salt", 0, 0));
                addIngredients(new Ingredient("Pepper", 0, 0));
                addIngredients(new Ingredient("Lime Wedges", 4, 0));
                // Add optional ingredients
                addOptionalIngredient(new Ingredient("Avocado", 24, 10));
                addOptionalIngredient(new Ingredient("Fresh Cilantro", 1, 0));
                // Add required cookware
                addCookware(new Cookware("Grill Pan", 5));
                addCookware(new Cookware("Tongs", 2));
                addCookware(new Cookware("Large Bowl", 4));
                addCookware(new Cookware("Small Bowl", 3));
                addCookware(new Cookware("Knife", 1));
                addCookware(new Cookware("Cutting Board", 1));
                addCookware(new Cookware("Measuring Spoons", 2));
                addCookware(new Cookware("Measuring Cups", 2));
                addCookware(new Cookware("Fork", 1));
                break;
            default:
                // Handle invalid meal choice
                setName("Unknown");
                System.out.println("That's an invalid meal choice. Please choose a valid meal next time :)");
                System.exit(0);
        }
    }

    /**
     * Display the details of the chosen meal.
     */
    public void showDetails() {
        System.out.println("You have chosen " + getName() + ".");
    }

    /**
     * Select ingredients for the meal based on user input.
     * @param input the Scanner object for user input
     * @return the list of selected ingredients
     */
    public ArrayList<Ingredient> selectIngredients(Scanner input) { //ChatGPT gave me the idea to use the Scanner input
        ArrayList<Ingredient> selectedIngredients = new ArrayList<>();
        System.out.println("Required ingredients:");
        // Display required ingredients
        for (Ingredient ingredient : getIngredients()) {
            System.out.println("- " + ingredient.getName());
        }
        System.out.println("Optional ingredients:");
        // Display optional ingredients
        for (Ingredient ingredient : optionalIngredients) {
            System.out.println("- " + ingredient.getName());
        }
        System.out.println("Type the name of the ingredients you're going to use (type 'done' when finished):");
        while (true) {
            String ingredientName = input.nextLine().toLowerCase(); // Convert input to lowercase
            if (ingredientName.equals("done")) break;
            boolean found = false;
            // Check if the ingredient is in the required ingredients list
            for (Ingredient ingredient : getIngredients()) {
                if (ingredient.getName().toLowerCase().equals(ingredientName)) {
                    selectedIngredients.add(ingredient);
                    found = true;
                    break;
                }
            }
            // Check if the ingredient is in the optional ingredients list
            for (Ingredient ingredient : optionalIngredients) {
                if (ingredient.getName().toLowerCase().equals(ingredientName)) {
                    selectedIngredients.add(ingredient);
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("Ingredient (Wrong Spelling/There's Space) not recognized. Please type it out again.");
            }
        }
        return selectedIngredients;
    }
    
    /**
     * Select cookware for the meal based on user input.
     * @param input the Scanner object for user input
     * @return the list of selected cookware
     */
    public ArrayList<Cookware> selectCookware(Scanner input) {
        ArrayList<Cookware> selectedCookware = new ArrayList<>();
        System.out.println("Required cookware:");
        // Display required cookware
        for (Cookware cookware : getCookware()) {
            System.out.println("- " + cookware.getType());
        }
        System.out.println("Optional cookware: None"); // There's not really any optional cookwares
        // Display optional cookware
        for (Cookware cookware : optionalCookware) {
            System.out.println("- " + cookware.getType());
        }

        System.out.println("Type the name of the cookware you're going to use (type 'done' when finished):");
        while (true) {
            String cookwareName = input.nextLine().toLowerCase(); // Convert input to lowercase
            if (cookwareName.equals("done")) break;
            boolean found = false;
            // Check if the cookware is in the required cookware list
            for (Cookware cookware : getCookware()) {
                if (cookware.getType().toLowerCase().equals(cookwareName)) {
                    selectedCookware.add(cookware);
                    found = true;
                    break;
                }
            }
            // Check if the cookware is in the optional cookware list
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
    
    /**
     * Verify if the selected ingredients and cookware meet the requirements.
     * @param ingredients the list of selected ingredients
     * @param cookware the list of selected cookware
     * @return true if the selection is valid, false otherwise
     */
    public boolean verifySelection(ArrayList<Ingredient> ingredients, ArrayList<Cookware> cookware) {
        ArrayList<String> selectedIngredients = new ArrayList<>();
        ArrayList<String> selectedCookware = new ArrayList<>();
    
        // Convert selected ingredients to lowercase
        for (Ingredient ingredient : ingredients) {
            selectedIngredients.add(ingredient.getName().toLowerCase());
        }
    
        // Convert selected cookware to lowercase
        for (Cookware cookwareItem : cookware) {
            selectedCookware.add(cookwareItem.getType().toLowerCase());
        }
    
        // Check if all required ingredients are selected
        for (Ingredient requiredIngredient : getIngredients()) {
            if (!selectedIngredients.contains(requiredIngredient.getName().toLowerCase())) {
                System.out.println("Missing required ingredient: " + requiredIngredient.getName());
                return false;
            }
        }
    
        // Check if all required cookware are selected
        for (Cookware requiredCookware : getCookware()) {
            if (!selectedCookware.contains(requiredCookware.getType().toLowerCase())) {
                System.out.println("Missing required cookware: " + requiredCookware.getType());
                return false;
            }
        }
        return true;
    }    

    /**
     * Cook the meal based on the selected ingredients and cookware.
     * @param input the Scanner object for user input
     * @param selectedIngredients the list of selected ingredients
     * @param selectedCookware the list of selected cookware
     */
    public void cookMeal(Scanner input, ArrayList<Ingredient> selectedIngredients, ArrayList<Cookware> selectedCookware) {
        // Ask if the user wants to see previous scores
        System.out.println("Do you want to see your previous scores? (yes/no)");
        String showScores = input.nextLine();
        if (showScores.equalsIgnoreCase("yes")) {
            displayScoreHistory();
        } else {
            System.out.println("Let's start cooking!");
        }
        
        int score = 0;
        int totalNutrition = 0;
        int totalHealthScore = 0;
        int totalHealthImpact = 0;
    
        // Calculate the total nutrition and health score of selected ingredients
        for (Ingredient ingredient : selectedIngredients) {
            totalNutrition += ingredient.getNutritionValue(); 
            totalHealthScore += ingredient.getHealthScore(); 
        }
        // Calculate the total health impact of selected cookware
        for (Cookware cookware : selectedCookware) {
            totalHealthImpact += cookware.getHealthImpact();
        }

        // Cooking steps for Quinoa Salad and Roasted Vegetables
        if (getName().equals("Quinoa Salad and Roasted Vegetables")) { 
            // Step 1: Rinse quinoa
            System.out.println("Step 1: Rinse quinoa under cold water.");
            System.out.println("Will you rinse the quinoa? (yes/no)");
            String rinse = input.nextLine();
            if (rinse.equalsIgnoreCase("yes")) {
                score += 10;
                System.out.println("Great choice! Rinsing the quinoa helps remove bitterness.");
                System.out.println("*Running Water* ");
            } else {
                score -= 5;
                System.out.println("Skipping the rinsing process means the quinoa might taste bitter.");
            }
    
            // Step 2: Cook quinoa
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
    
            // Step 3: Preheat oven
            System.out.println("Step 3: Preheat the oven to 400°F (200°C).");
            System.out.println("Will you preheat the oven? (yes/no)");
            String preheatOven = input.nextLine();
            if (preheatOven.equalsIgnoreCase("yes")) {
                score += 10;
                System.out.println("Excellent! Preheating the oven ensures even roasting.");
                System.out.println("Beep beep!");
            } else {
                score -= 5;
                System.out.println("Not preheating the oven can lead to uneven roasting.");
            }
    
            // Step 4: Prepare vegetables
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
    
            // Step 5: Roast vegetables
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
    
            // Step 6: Add chickpeas
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
    
            // Step 7: Combine ingredients
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
    
            // Step 8: Add final ingredients
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
    
            // Optional ingredients
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
    
            // Step 9: Serve
            System.out.println("Step 9: Serve warm, at room temperature, or chilled, depending on your preference.");
            System.out.println("Serving the salad! ");
            score += 10;
            System.out.println("Perfect! The salad is ready to be enjoyed.");


        } else if (getName().equals("Lentil and Sweet Potato Stew")) {
            // Calculate the total nutrition and health score of selected ingredients
            for (Ingredient ingredient : selectedIngredients) { 
                totalNutrition += ingredient.getNutritionValue(); 
                totalHealthScore += ingredient.getHealthScore(); 
            }
            // Calculate the total health impact of selected cookware
            for (Cookware cookware : selectedCookware) {
                totalHealthImpact += cookware.getHealthImpact();
            }

            // Step 1: Rinse lentils
            System.out.println("Step 1: Rinse the lentils under cold water and drain.");
            System.out.println("Will you rinse the lentils? (yes/no)");
            String rinseLentils = input.nextLine();
            if (rinseLentils.equalsIgnoreCase("yes")) {
                score += 10;
                System.out.println("Great choice! Rinsing the lentils helps remove any debris.");
                System.out.println("*Running Water* ");
            } else {
                score -= 5;
                System.out.println("Skipping the rinsing process means the lentils might have debris.");
            }
            
            // Step 2: Cube sweet potato
            System.out.println("Step 2: Peel and cube the sweet potato into small, evenly sized pieces (about 1-inch cubes).");
            System.out.println("Will you peel and cube the sweet potato? (yes/no)");
            String cubeSweetPotato = input.nextLine();
            if (cubeSweetPotato.equalsIgnoreCase("yes")) {
                score += 10;
                System.out.println("Great! Cubing the sweet potato ensures even cooking.");
                System.out.println("Chop chop chop... ");
            } else {
                score -= 5;
                System.out.println("Skipping this step might lead to uneven cooking.");
            }
            
            // Step 3: Dice carrots
            System.out.println("Step 3: Peel and dice the carrots into similar-sized pieces.");
            System.out.println("Will you peel and dice the carrots? (yes/no)");
            String diceCarrots = input.nextLine();
            if (diceCarrots.equalsIgnoreCase("yes")) {
                score += 10;
                System.out.println("Great! Dicing the carrots ensures even cooking.");
                System.out.println("Chop chop chop... ");
            } else {
                score -= 5;
                System.out.println("Skipping this step might lead to uneven cooking.");
            }
            
            // Step 4: Dice onion and mince garlic
            System.out.println("Step 4: Dice the onion and mince the garlic.");
            System.out.println("Will you dice the onion and mince the garlic? (yes/no)");
            String diceOnionGarlic = input.nextLine();
            if (diceOnionGarlic.equalsIgnoreCase("yes")) {
                score += 10;
                System.out.println("Great! Dicing the onion and mincing the garlic ensures even cooking.");
                System.out.println("Chop chop chop... ");
            } else {
                score -= 5;
                System.out.println("Skipping this step might lead to uneven cooking.");
            }
            
            // Step 5: Heat pot
            System.out.println("Step 5: Place the large pot on the stovetop over medium heat.");
            System.out.println("Will you place the pot on the stovetop? (yes/no)");
            String heatPot = input.nextLine();
            if (heatPot.equalsIgnoreCase("yes")) {
                score += 10;
                System.out.println("Great! Heating the pot ensures even cooking.");
            } else {
                score -= 5;
                System.out.println("Skipping this step might lead to uneven cooking.");
            }
            
            // Step 6: Add olive oil
            System.out.println("Step 6: Add 1 tablespoon of olive oil and let it warm up for about 30 seconds.");
            System.out.println("Will you add olive oil and let it warm up? (yes/no)");
            String addOil = input.nextLine();
            if (addOil.equalsIgnoreCase("yes")) {
                score += 10;
                System.out.println("Great! Warming up the olive oil ensures even cooking.");
                System.out.println("sizzle... sizzle... (tss tss)");
            } else {
                score -= 5;
                System.out.println("Skipping this step might lead to uneven cooking.");
            }
            
            // Step 7: Sauté onion
            System.out.println("Step 7: Add the diced onion to the pot and sauté for 3-4 minutes, stirring with the wooden spoon, until the onion becomes soft and translucent.");
            System.out.println("Will you sauté the diced onion? (yes/no)");
            String sauteOnion = input.nextLine();
            if (sauteOnion.equalsIgnoreCase("yes")) {
                score += 10;
                System.out.println("Great! Sautéing the onion enhances the flavor.");
                System.out.println("sizzle... sizzle... (tss tss)");
            } else {
                score -= 5;
                System.out.println("Skipping this step might lead to less flavor.");
            }
        
            // Step 8: Cook garlic
            System.out.println("Step 8: Stir in the minced garlic and cook for another 1-2 minutes, until fragrant.");
            System.out.println("Will you cook the minced garlic? (yes/no)");
            String cookGarlic = input.nextLine();
            if (cookGarlic.equalsIgnoreCase("yes")) {
                score += 10;
                System.out.println("Great! Cooking the garlic enhances the flavor.");
            } else {
                score -= 5;
                System.out.println("Skipping this step might lead to less flavor.");
            }
        
            // Step 9: Add carrots and sweet potatoes
            System.out.println("Step 9: Add the diced carrots and sweet potatoes to the pot. Stir them with the onions and garlic to coat them in the olive oil. Cook for 3 minutes to slightly soften the vegetables.");
            System.out.println("Will you add the carrots and sweet potatoes? (yes/no)");
            String addCarrotsSweetPotatoes = input.nextLine();
            if (addCarrotsSweetPotatoes.equalsIgnoreCase("yes")) {
                score += 10;
                System.out.println("Great! Adding these vegetables ensures even cooking.");
            } else {
                score -= 5;
                System.out.println("Skipping this step might lead to uneven cooking.");
            }

            // Step 10: Add lentils and tomatoes
            System.out.println("Step 10: Add the rinsed lentils and the can of diced tomatoes (including the liquid). Stir everything to combine evenly.");
            System.out.println("Will you add the lentils and diced tomatoes? (yes/no)");
            String addLentilsTomatoes = input.nextLine();
            if (addLentilsTomatoes.equalsIgnoreCase("yes")) {
                score += 10;
                System.out.println("Great! Adding the lentils and tomatoes ensures even cooking.");
            } else {
                score -= 5;
                System.out.println("Skipping this step might lead to uneven cooking.");
            }
            
            // Step 11: Add vegetable broth
            System.out.println("Step 11: Add 4 cups of vegetable broth to the pot. Stir to mix everything well.");
            System.out.println("Will you add the vegetable broth? (yes/no)");
            String addBroth = input.nextLine();
            if (addBroth.equalsIgnoreCase("yes")) {
                score += 10;
                System.out.println("Great! Adding the broth ensures even cooking.");
            } else {
                score -= 5;
                System.out.println("Skipping this step might lead to uneven cooking.");
            }
            
            // Step 12: Season with salt and pepper
            System.out.println("Step 12: Season with a pinch of salt and pepper, adjusting to taste.");
            System.out.println("Will you season with salt and pepper? (yes/no)");
            String season = input.nextLine();
            if (season.equalsIgnoreCase("yes")) {
                score += 10;
                System.out.println("Great! Seasoning enhances the flavor.");
            } else {
                score -= 5;
                System.out.println("Skipping this step might lead to less flavor.");
            }

            // Step 13: Bring to boil
            System.out.println("Step 13: Bring the mixture to a gentle boil over medium-high heat.");
            System.out.println("Will you bring the mixture to a boil? (yes/no)");
            String boil = input.nextLine();
            if (boil.equalsIgnoreCase("yes")) {
                score += 10;
                System.out.println("Great! Bringing the mixture to a boil ensures even cooking.");
            } else {
                score -= 5;
                System.out.println("Skipping this step might lead to uneven cooking.");
            }
            
            // Step 14: Simmer
            System.out.println("Step 14: Once it starts boiling, reduce the heat to low, cover the pot with a lid, and let it simmer for 25-30 minutes. Stir occasionally to prevent sticking and ensure even cooking.");
            System.out.println("How long will you simmer the stew for? (minutes)");
            int simmerTime = input.nextInt();
            input.nextLine(); // Flush the next line
            if (simmerTime >= 25 && simmerTime <= 30) {
                score += 20;
                System.out.println("Perfect simmering time! The stew is cooked just right.");
            } else if (simmerTime < 15) {
                score -= 15;
                System.out.println("The stew is undercooked.");
            } else if (simmerTime < 25) {
                score -= 10;
                System.out.println("The stew is almost cooked, but not quite there.");
            } else if (simmerTime < 40) {
                score -= 10;
                System.out.println("The stew is overcooked.");
            } else {
                score -= 25;
                System.out.println("The stew is over-simmered and mushy.");
            }
    
            // Step 15: Check doneness
            System.out.println("Step 15: After 25 minutes, check if the lentils and sweet potatoes are tender.");
            System.out.println("Are the lentils and sweet potatoes tender? (yes/no)");
            String checkDoneness = input.nextLine();
            if (checkDoneness.equalsIgnoreCase("yes")) {
                score += 10;
                System.out.println("Fantastic! Your stew is looking great.");
            } else {
                System.out.println("Would you like to simmer it for 10 more minutes or keep it as is? (simmer/keep)");
                String simmerMore = input.nextLine();
                if (simmerMore.equalsIgnoreCase("simmer")) {
                    score += 5;
                    System.out.println("Got it! Letting it simmer for another 10 minutes for perfect tenderness.");
                } else {
                    score -= 5;
                    System.out.println("Alright, but the stew might not be fully tender.");
                }
            }

            // Step 16: Adjust seasoning
            System.out.println("Step 16: Adjust the seasoning with more salt and pepper if needed.");
            System.out.println("Will you adjust the seasoning? (yes/no)");
            String adjustSeasoning = input.nextLine();
            if (adjustSeasoning.equalsIgnoreCase("yes")) {
                score += 10;
                System.out.println("Perfect! Adjusting the seasoning ensures the stew is flavorful.");
            } else {
                score -= 5;
                System.out.println("Skipping this step might lead to less flavor.");
            }

            // Optional ingredients
            for (Ingredient ingredient : selectedIngredients) {
                if (ingredient.getName().equalsIgnoreCase("Avocado")) {
                    System.out.println("Will you add avocado? (yes/no)");
                    String addAvocado = input.nextLine();
                    if (addAvocado.equalsIgnoreCase("yes")) {
                        score += 10;
                        System.out.println("Avocado adds a rich, creamy texture to the stew.");
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
                        System.out.println("Feta cheese adds a tangy flavor to the stew.");
                    }
                }

            // Step 17: Serve
            System.out.println("Step 17: Ladle the stew into bowls and serve warm. You can pair it with crusty bread or enjoy it on its own!");
            score += 10;
            System.out.println("Your Lentil and Sweet Potato Stew is ready to be enjoyed.");
            }


        } else if (getName().equals("Grilled Chicken and Mango Salad")) {
            // Calculate the total nutrition and health score of selected ingredients
            for (Ingredient ingredient : selectedIngredients) { 
                totalNutrition += ingredient.getNutritionValue(); 
                totalHealthScore += ingredient.getHealthScore(); 
            }
            // Calculate the total health impact of selected cookware
            for (Cookware cookware : selectedCookware) {
                totalHealthImpact += cookware.getHealthImpact();
            }

            // Step 1: Prepare chicken
            System.out.println("Step 1: Pat the chicken breasts dry with a paper towel. Season both sides generously with salt and pepper.");
            System.out.println("Will you pat the chicken breasts dry and season them? (yes/no)");
            String prepareChicken = input.nextLine();
            if (prepareChicken.equalsIgnoreCase("yes")) {
                score += 10;
                System.out.println("Great choice! Seasoning the chicken adds wonderful flavor.");
            } else {
                score -= 5;
                System.out.println("Skipping this step might lead to bland chicken.");
            }
        
            // Step 2: Halve cherry tomatoes
            System.out.println("Step 2: Halve the cherry tomatoes.");
            System.out.println("Will you halve the cherry tomatoes? (yes/no)");
            String chopTomatoes = input.nextLine();
            if (chopTomatoes.equalsIgnoreCase("yes")) {
                score += 10;
                System.out.println("Awesome! Halving the cherry tomatoes adds a fresh touch.");
                System.out.println("Chop chop chop...");
            } else {
                score -= 5;
                System.out.println("Skipping this step might lead to uneven ingredient distribution.");
            }
            
            // Step 3: Dice mango
            System.out.println("Step 3: Peel and dice the mango into bite-sized pieces.");
            System.out.println("Will you peel and dice the mango? (yes/no)");
            String diceMango = input.nextLine();
            if (diceMango.equalsIgnoreCase("yes")) {
                score += 10;
                System.out.println("Fantastic! Dicing the mango adds a sweet, juicy flavor.");
                System.out.println("Chop chop chop... ");
            } else {
                score -= 5;
                System.out.println("Skipping this step might lead to uneven ingredient distribution.");
            }
            
            // Step 4: Slice cucumber and red onion
            System.out.println("Step 4: Slice the cucumber and red onion thinly.");
            System.out.println("Will you slice the cucumber and red onion? (yes/no)");
            String sliceVegetables = input.nextLine();
            if (sliceVegetables.equalsIgnoreCase("yes")) {
                score += 10;
                System.out.println("Great! Slicing the cucumber and red onion adds a crisp, refreshing touch.");
                System.out.println("Chop chop chop... ");
            } else {
                score -= 5;
                System.out.println("Skipping this step might lead to uneven ingredient distribution.");
            }
            
            // Step 5: Prepare mixed greens
            System.out.println("Step 5: Rinse and pat the mixed greens dry if needed.");
            System.out.println("Will you rinse and pat the mixed greens dry? (yes/no)");
            String prepareGreens = input.nextLine();
            if (prepareGreens.equalsIgnoreCase("yes")) {
                score += 10;
                System.out.println("Perfect! Rinsing and drying the greens ensures they're fresh and crisp.");
            } else {
                score -= 5;
                System.out.println("Skipping this step might lead to less fresh greens.");
            }
        
            // Step 6: Heat grill pan
            System.out.println("Step 6: Place the grill pan over medium-high heat.");
            System.out.println("Will you place the grill pan on the stovetop? (yes/no)");
            String heatGrillingPan = input.nextLine();
            if (heatGrillingPan.equalsIgnoreCase("yes")) {
                score += 10;
                System.out.println("Great! Heating the grill pan ensures even cooking.");
            } else {
                score -= 5;
                System.out.println("Skipping this step might lead to uneven cooking.");
            }
            
            // Step 7: Add olive oil to pan
            System.out.println("Step 7: Brush or drizzle 1 tablespoon of olive oil on the pan to prevent sticking.");
            System.out.println("Will you brush or drizzle olive oil on the pan? (yes/no)");
            String oilPan = input.nextLine();
            if (oilPan.equalsIgnoreCase("yes")) {
                score += 10;
                System.out.println("Fantastic! Adding olive oil ensures the chicken doesn't stick.");
                System.out.println("sizzle... sizzle... (tss tss)");
            } else {
                score -= 5;
                System.out.println("Skipping this step might lead to sticking.");
            }
            
            // Step 8: Add chicken to pan
            System.out.println("Step 8: Add the seasoned chicken breasts to the hot grill pan.");
            System.out.println("Will you add the chicken to the grill pan? (yes/no)");
            String addChickenToPan = input.nextLine();
            if (addChickenToPan.equalsIgnoreCase("yes")) {
                score += 10;
                System.out.println("Great! Adding the chicken to the hot grill pan ensures even cooking.");
            } else {
                score -= 5;
                System.out.println("Skipping this step might lead to uneven cooking.");
            }
            
            // Step 9: Cook chicken
            System.out.println("Step 9: Cook for 4-5 minutes on one side without moving them to achieve nice grill marks. Flip using the tongs and cook for another 4–5 minutes, or until the internal temperature reaches 165°F (74°C).");
            System.out.println("How long will you cook the chicken for on each side? (minutes)");
            int grillTime = input.nextInt();
            input.nextLine(); // Flush the next line
            if (grillTime >= 4 && grillTime <= 5) {
                score += 20;
                System.out.println("Perfect grilling time! The chicken is cooked just right.");
                System.out.println("sizzle... sizzle... (tss tss)");
            } else if (grillTime < 3) {
                score -= 15;
                System.out.println("The chicken is undercooked.");
            } else if (grillTime < 4) {
                score -= 10;
                System.out.println("The chicken is almost cooked, but not quite there.");
            } else if (grillTime < 7) {
                score -= 10;
                System.out.println("The chicken is overcooked.");
            } else {
                score -= 25;
                System.out.println("The chicken is burnt.");
            }
            
            // Step 10: Rest chicken
            System.out.println("Step 10: Remove the chicken from the pan and let it rest for 5 minutes.");
            System.out.println("Will you let the chicken rest? (yes/no)");
            String restChicken = input.nextLine();
            if (restChicken.equalsIgnoreCase("yes")) {
                score += 10;
                System.out.println("Great! Letting the chicken rest ensures it stays juicy.");
            } else {
                score -= 5;
                System.out.println("Skipping this step might lead to dry chicken.");
            }

            // Step 11: Assemble salad base
            System.out.println("Step 11: In a large bowl, combine the mixed greens, halved cherry tomatoes, sliced cucumber, and red onion. Toss gently to distribute evenly.");
            System.out.println("Will you assemble the salad base? (yes/no)");
            String assembleSalad = input.nextLine();
            if (assembleSalad.equalsIgnoreCase("yes")) {
                score += 10;
                System.out.println("Fantastic! Assembling the salad base ensures a well-mixed salad.");
            } else {
                score -= 5;
                System.out.println("Skipping this step might lead to uneven ingredient distribution.");
            }
            
            // Step 12: Prepare dressing
            System.out.println("Step 12: In a small bowl, whisk together the remaining 1 tablespoon of olive oil and a squeeze of lime juice. Add a pinch of salt and pepper to taste. (Optional: Add a bit of honey or mustard for a sweeter or tangier flavor.)");
            System.out.println("Will you prepare the dressing? (yes/no)");
            String prepareDressing = input.nextLine();
            if (prepareDressing.equalsIgnoreCase("yes")) {
                score += 10;
                System.out.println("Great! Preparing the dressing adds a tangy flavor.");
            } else {
                score -= 5;
                System.out.println("Skipping this step might lead to less flavor.");
            }
            
            // Step 13: Slice chicken
            System.out.println("Step 13: Once the chicken has rested, slice it into thin strips or bite-sized pieces using the knife and cutting board.");
            System.out.println("Will you slice the chicken? (yes/no)");
            String sliceChicken = input.nextLine();
            if (sliceChicken.equalsIgnoreCase("yes")) {
                score += 10;
                System.out.println("Fantastic! Slicing the chicken ensures even distribution.");
                System.out.println("Chop chop chop... ");
            } else {
                score -= 5;
                System.out.println("Skipping this step might lead to uneven ingredient distribution.");
            }
            
            // Step 14: Add toppings
            System.out.println("Step 14: Place the sliced grilled chicken and diced mango on top of the salad base.");
            System.out.println("Will you top the salad with chicken and mango? (yes/no)");
            String saladToppings = input.nextLine();
            if (saladToppings.equalsIgnoreCase("yes")) {
                score += 10;
                System.out.println("Perfect! Adding chicken and mango ensures a flavorful salad.");
            } else {
                score -= 5;
                System.out.println("Skipping this step might lead to an incomplete salad.");
            }

            // Step 15: Add dressing and toss
            System.out.println("Step 15: Drizzle the dressing over the salad. Toss lightly with a fork to coat the greens evenly.");
            System.out.println("Will you add the dressing and toss the salad? (yes/no)");
            String tossSalad = input.nextLine();
            if (tossSalad.equalsIgnoreCase("yes")) {
                score += 10;
                System.out.println("Perfect! Adding the dressing and tossing ensures the flavors are well combined.");
            } else {
                score -= 5;
                System.out.println("Skipping this step might lead to uneven flavor distribution.");
            }

            // Optional ingredients
            for (Ingredient ingredient : selectedIngredients) { 
                if (ingredient.getName().equalsIgnoreCase("Avocado")) {
                    System.out.println("Will you add avocado? (yes/no)");
                    String addAvocado = input.nextLine();
                    if (addAvocado.equalsIgnoreCase("yes")) {
                        score += 10;
                        System.out.println("Avocado adds a rich, creamy texture to the salad.");
                    }
                }

                if (ingredient.getName().equalsIgnoreCase("Fresh Cilantro")) {
                    System.out.println("Will you add fresh cilantro? (yes/no)");
                    String addCilantro = input.nextLine();
                    if (addCilantro.equalsIgnoreCase("yes")) {
                        score += 10;
                        System.out.println("Fresh cilantro adds a burst of flavor to the salad.");
                    }
                }
            }

            // Step 16: Serve
            System.out.println("Step 16: Serve the Grilled Chicken and Mango Salad immediately and enjoy your delicious creation!");
            score += 10;
            System.out.println("Your Grilled Chicken and Mango Salad is ready to be enjoyed. ");
        }

        // Deduct points for missing optional ingredients
        for (Ingredient ingredient : optionalIngredients) { 
            if (!selectedIngredients.contains(ingredient)) { 
                score -= 10; // Deducts points to make the scoring more balanced
            } 
        }

        // Calculate the grades 
        String nutritionGrade = calculateNutritionValueGrade(totalNutrition); 
        String healthScoreGrade = calculateHealthScoreGrade(totalHealthScore); 
        String healthImpactGrade = calculateHealthImpactGrade(totalHealthImpact); 
        
        // Calculate overall grade 
        String overallGrade = calculateOverallGrade(score, nutritionGrade, healthScoreGrade, healthImpactGrade); 
        // Output final score and grades 
        System.out.println("You have finished preparing " + getName() + "."); 
        System.out.println("Your score for this meal is: " + score); 
        System.out.println("Nutrition Value Grade: " + nutritionGrade); 
        System.out.println("Health Score Grade: " + healthScoreGrade); 
        System.out.println("Health Impact Grade: " + healthImpactGrade); 
        System.out.println("Overall Grade: " + overallGrade); 

        feedbackProvider(overallGrade); // Provide feedback based on overall grade

        scoreHistory.add(score); // Record the score in the score history
    }
    
    /**
     * Display the score history of the meals cooked.
     */
    public void displayScoreHistory(){
        System.out.println("Score History: ");
        for (Integer recordedScore : scoreHistory) {
            System.out.println(recordedScore);
        }
    }

    /**
     * Provide feedback based on the overall grade.
     * @param overallGrade the overall grade of the meal
     */
    private void feedbackProvider(String overallGrade){ 
        if (overallGrade.equals("S")) { 
            System.out.println("Outstanding performance! You are a culinary master."); 
        } else if (overallGrade.startsWith("A")) { 
            System.out.println("Excellent job! Keep up the great work."); 
        } else if (overallGrade.startsWith("B")) { 
            System.out.println("Good job! With a little more practice, you'll be even better.");
        } else if (overallGrade.startsWith("C")) {
            System.out.println("Not bad, but there's room for improvement. Keep trying!");
        } else if (overallGrade.startsWith("D")) {
            System.out.println("Keep practicing, and you'll get better!");
        } else {
            System.out.println("Don't give up! Cooking takes practice. Try again and improve your skills.");
        }
        
    }

    /**
     * Add an optional ingredient to the meal.
     * @param ingredient the optional ingredient to add
     */
    private void addOptionalIngredient(Ingredient ingredient) {
        optionalIngredients.add(ingredient);
    }

    /**
     * Calculate the nutrition value grade based on the value.
     * @param value the nutrition value
     * @return the grade for the nutrition value
     */
    private String calculateNutritionValueGrade(int value) {
        if (value >= 250) return "S"; 
        else if (value >= 220) return "A+";
        else if (value >= 190) return "A";
        else if (value >= 160) return "A-";
        else if (value >= 130) return "B+";
        else if (value >= 100) return "B";
        else if (value >= 70) return "B-";
        else if (value >= 50) return "C+";
        else if (value >= 40) return "C";
        else if (value >= 30) return "C-";
        else if (value >= 20) return "D+";
        else if (value >= 10) return "D";
        else return "F";
    }
    
    /**
     * Calculate the health score grade based on the value.
     * @param value the health score value
     * @return the grade for the health score
     */
    private String calculateHealthScoreGrade(int value) {
        if (value >= 30) return "S";
        else if (value >= 26) return "A+";
        else if (value >= 22) return "A";
        else if (value >= 18) return "A-";
        else if (value >= 14) return "B+";
        else if (value >= 10) return "B";
        else if (value >= 7) return "B-";
        else if (value >= 5) return "C+";
        else if (value >= 3) return "C";
        else if (value >= 2) return "C-";
        else if (value >= 1) return "D+";
        else return "F";
    }
    
    /**
     * Calculate the health impact grade based on the value.
     * @param value the health impact value
     * @return the grade for the health impact
     */
    private String calculateHealthImpactGrade(int value) {
        if (value >= 20) return "S"; 
        else if (value >= 18) return "A+";
        else if (value >= 16) return "A";
        else if (value >= 14) return "A-";
        else if (value >= 12) return "B+";
        else if (value >= 10) return "B";
        else if (value >= 8) return "B-";
        else if (value >= 6) return "C+";
        else if (value >= 4) return "C";
        else if (value >= 2) return "C-";
        else return "F";
    }    

    /**
     * Calculate the overall grade based on the score and individual grades.
     * @param score the score of the meal
     * @param nutritionGrade the nutrition value grade
     * @param healthScoreGrade the health score grade
     * @param healthImpactGrade the health impact grade
     * @return the overall grade for the meal
     */
    private String calculateOverallGrade(int score, String nutritionGrade, String healthScoreGrade, String healthImpactGrade) {
        String[] grades = {nutritionGrade, healthScoreGrade, healthImpactGrade};
        int totalGradeValue = 0;
        for (String grade : grades) {
            switch (grade) {
                case "S":
                    totalGradeValue += 13;
                    break;
                case "A+":
                    totalGradeValue += 12;
                    break;
                case "A":
                    totalGradeValue += 11;
                    break;
                case "A-":
                    totalGradeValue += 10;
                    break;
                case "B+":
                    totalGradeValue += 9;
                    break;
                case "B":
                    totalGradeValue += 8;
                    break;
                case "B-":
                    totalGradeValue += 7;
                    break;
                case "C+":
                    totalGradeValue += 6;
                    break;
                case "C":
                    totalGradeValue += 5;
                    break;
                case "C-":
                    totalGradeValue += 4;
                    break;
                case "D+":
                    totalGradeValue += 3;
                    break;
                case "D":
                    totalGradeValue += 2;
                    break;
                case "D-":
                    totalGradeValue += 1;
                    break;
                case "F":
                    totalGradeValue += 0;
                    break;
            }
        }
    
        // Adjust totalGradeValue based on score
        if (score < 0) {
            totalGradeValue -= Math.abs(score) / 10; // Deduct a point for each 10 points below zero
        } else {
            totalGradeValue += score / 10; // Add a point for each 10 points above zero
        }
    
        if (totalGradeValue >= 36) {
            return "S";
        } else if (totalGradeValue >= 34) {
            return "A+";
        } else if (totalGradeValue >= 31) {
            return "A";
        } else if (totalGradeValue >= 28) {
            return "A-";
        } else if (totalGradeValue >= 25) {
            return "B+";
        } else if (totalGradeValue >= 22) {
            return "B";
        } else if (totalGradeValue >= 19) {
            return "B-";
        } else if (totalGradeValue >= 16) {
            return "C+";
        } else if (totalGradeValue >= 13) {
            return "C";
        } else if (totalGradeValue >= 10) {
            return "C-";
        } else if (totalGradeValue >= 7) {
            return "D+";
        } else if (totalGradeValue >= 4) {
            return "D";
        } else if (totalGradeValue >= 1) {
            return "D-";
        } else {
            return "F";
        }
    }
}