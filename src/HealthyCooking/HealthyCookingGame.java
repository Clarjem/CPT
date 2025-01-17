package HealthyCooking;

import java.util.ArrayList;

/**
 * author: Clarenz Ferrer
 * date: 01/09/2025
 * CPT (Making an educational game on cooking)
 */ 

import java.util.Scanner;

public class HealthyCookingGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=====================================================");
        System.out.println("Game: Start or Exit");
        String startGame = input.nextLine();

        if (startGame.equalsIgnoreCase("Start")){  //GPT introduced to equalsIgnoreCase method
            //Begin by choosing a meal to cook
            System.out.println("Welcome to the Cooking Game. You may choose one of the three meals to cook: \n1. Quinoa Salad with Roasted Vegetables\n2. Lentil and Sweet Potato Stew\n3. Grilled Chicken and Mango Salad\nInput a number."); 
            int mealToCook = input.nextInt(); // User input to choose a meal to cook
            input.nextLine(); //Flush the next line

            String mealName = ""; //Define meal-sepcfic variables
            ArrayList<Ingredient> requiredIngredients = new ArrayList<>();
            ArrayList<Ingredient> selectedIngredients = new ArrayList<>();
            ArrayList<Ingredient> optionalIngredients = new ArrayList<>(); //TODO Need to fix this so ingredients are suggested along with required ingredients
            ArrayList<Cookware> requiredCookware = new ArrayList<>();
            ArrayList<Cookware> selectedCookware = new ArrayList<>();
            ArrayList<Cookware> optionalCookware = new ArrayList<>();

            // GPT HELPED WITH INGREDIENTS AND COOKWARE!!

            if (mealToCook == 1){ // User has chosen Quinoa Salad with Roasted Vegetables
                mealName = "Quinoa Salad with Roasted Vegetables";
                System.out.println("Good choice! You have chosen Quinoa Salad with Roasted Vegetables.");
                System.out.println("Ingredients: Quinoa, Carrots, Bell Peppers, Zucchini, Cherry tomatoes, Red Onion, Sweet Potatoes, Olive Oil, Salt, Pepper, Lemon Juice, Parsley, Feta Cheese, Chickpeas, Avocado, Pumpkin seeds, Almonds");
                System.out.println("Cookware: Baking Sheet, Large bowl, Small bowl, Saucepan, Mixing Bowl, Knife, Cutting Board, Measuring spoons");
                System.out.println("Cooking Time: 30 minutes");

                //Add ingredients to the Ingredients ArrayList
                Ingredient quinoa = new Ingredient("Quinoa", 222, 9, true); //Required
                Ingredient carrots = new Ingredient("Carrots", 41, 3, true); //Required 
                Ingredient bellPeppers = new Ingredient("Bell Peppers", 31, 1, true); //Required
                Ingredient zucchini = new Ingredient("Zucchini", 20, 1, true); //Required
                Ingredient cherryTomatoes = new Ingredient("Cherry Tomatoes", 18, 1, true); //Required
                Ingredient redOnion = new Ingredient("Red Onion", 40, 2, true); //Required
                Ingredient sweetPotatoes = new Ingredient("Sweet Potatoes", 112, 5, true); //Required
                Ingredient oliveOil = new Ingredient("Olive Oil", 119, 7, true); //Required
                Ingredient salt = new Ingredient("Salt", 0, 0, true); //Required
                Ingredient pepper = new Ingredient("Pepper", 0, 0, true); //Required
                Ingredient lemonJuice = new Ingredient("Lemon Juice", 4, 0, true); //Required
                Ingredient parsley = new Ingredient("Parsley", 1, 0, true); //Required
                Ingredient fetaCheese = new Ingredient("Feta Cheese", 264, 21, true); //Required
                Ingredient chickpeas = new Ingredient("Chickpeas", 164, 3, true); //Required
                Ingredient avocado = new Ingredient("Avocado", 240, 10, false);
                Ingredient pumpkinSeeds = new Ingredient("Pumpkin Seeds", 153, 13, false);
                Ingredient almonds = new Ingredient("Almonds", 7, 1, false);

                requiredIngredients.add(quinoa);
                requiredIngredients.add(carrots);  
                requiredIngredients.add(bellPeppers);
                requiredIngredients.add(zucchini); 
                requiredIngredients.add(cherryTomatoes);
                requiredIngredients.add(redOnion);  
                requiredIngredients.add(sweetPotatoes);
                requiredIngredients.add(oliveOil);
                requiredIngredients.add(salt);
                requiredIngredients.add(pepper);  
                requiredIngredients.add(lemonJuice);
                requiredIngredients.add(parsley);
                requiredIngredients.add(fetaCheese);
                requiredIngredients.add(chickpeas);
                optionalIngredients.add(avocado);  
                optionalIngredients.add(pumpkinSeeds);
                optionalIngredients.add(almonds);
                
                // Add Cookwares to the Cookware ArrayList
                Cookware bakingSheet = new Cookware("Baking Sheet", 5, true); //Required
                Cookware largeBowl = new Cookware("Large Bowl", 4, true); //Required
                Cookware smallBowl = new Cookware("Small Bowl", 3, true); //Required
                Cookware saucepan = new Cookware("Saucepan", 3, true); //Required
                Cookware mixingBowl = new Cookware("Mixing Bowl", 2, true); //Required
                Cookware knife = new Cookware("Knife", 1, true); //Required
                Cookware cuttingBoard = new Cookware("Cutting Board", 1, true); //Required
                Cookware measuringSpoons = new Cookware("Measuring Spoons", 1, true); //Required

                requiredCookware.add(bakingSheet);
                requiredCookware.add(largeBowl);
                requiredCookware.add(smallBowl);
                requiredCookware.add(saucepan);
                requiredCookware.add(mixingBowl);
                requiredCookware.add(knife);
                requiredCookware.add(cuttingBoard);
                requiredCookware.add(measuringSpoons);
            } 
            
            //Repeat the process for the other two meals

            else if (mealToCook == 2){
                mealName = "Lentil and Sweet Potato Stew";
                System.out.println("Interesting. You have chosen Lentil and Sweet Potato Stew.");
                System.out.println("Ingredients: Lentils, Sweet Potatoes, Carrots, Celery, Onion, Garlic, Diced Tomatoes, Vegetable Broth, Salt, Pepper, Olive Oil, Bay Leaves, Paprika, Lemon Juice, Parsley");
                System.out.println("Cookware: Large Pot, Saucepan, Knife, Cutting Board, Wooden Spoon, Measuring Spoons");
                System.out.println("Cooking Time: 45 minutes");

                //Add ingredients to the Ingredient ArrayList
                Ingredient lentils = new Ingredient("Lentils", 230, 10, true); //Required
                Ingredient sweetPotatoes = new Ingredient("Sweet Potatoes", 112, 5, true); //Required
                Ingredient carrots = new Ingredient("Carrots", 41, 3, true); //Required
                Ingredient celery = new Ingredient("Celery", 16, 1, false); 
                Ingredient onion = new Ingredient("Onion", 44, 2, true); //Required
                Ingredient garlic = new Ingredient("Garlic", 4, 0, true); //Required
                Ingredient dicedTomatoes = new Ingredient("Diced Tomatoes", 32, 0, true); //Required
                Ingredient vegetableBroth = new Ingredient("Vegetable Broth", 10, 0, true); //Required
                Ingredient salt = new Ingredient("Salt", 0, 0,true); //Required
                Ingredient pepper = new Ingredient("Pepper", 0, 0, true); //Required
                Ingredient oliveOil = new Ingredient("Olive Oil", 119, 7, true); //Required
                Ingredient bayLeaves = new Ingredient("Bay Leaves", 5, 0, false);
                Ingredient paprika = new Ingredient("Paprika", 20, 1, false);
                Ingredient lemonJuice = new Ingredient("Lemon Juice", 4, 0, false);
                Ingredient parsley = new Ingredient("Parsley", 1, 0, false);

                requiredIngredients.add(lentils);
                requiredIngredients.add(sweetPotatoes);
                requiredIngredients.add(carrots);
                optionalIngredients.add(celery);
                requiredIngredients.add(onion);
                requiredIngredients.add(garlic);
                requiredIngredients.add(dicedTomatoes);
                requiredIngredients.add(vegetableBroth);
                requiredIngredients.add(salt);
                requiredIngredients.add(pepper);
                requiredIngredients.add(oliveOil);
                optionalIngredients.add(bayLeaves);
                optionalIngredients.add(paprika);
                optionalIngredients.add(lemonJuice);
                optionalIngredients.add(parsley);

                //Add cookware to the Cookware ArrayList
                Cookware largePot = new Cookware("Large Pot", 5, true); //Required
                Cookware saucepan = new Cookware("Saucepan", 3, true); //Required
                Cookware knife = new Cookware("Knife", 1, true); //Required
                Cookware cuttingBoard = new Cookware("Cutting Board", 1, true); //Required
                Cookware woodenSpoon = new Cookware("Wooden Spoon", 1, true); //Required
                Cookware measuringSpoon = new Cookware("Measuring Spoon", 1, true); //Required

                requiredCookware.add(largePot);
                requiredCookware.add(saucepan);
                requiredCookware.add(knife);
                requiredCookware.add(cuttingBoard);
                requiredCookware.add(woodenSpoon);
                requiredCookware.add(measuringSpoon);
            }

            else if (mealToCook == 3){
                mealName = "Grilled Chicken and Mango Salad";
                System.out.println("Perfect Choice! You have chosen Grilled Chicken and Mango Salad.");
                System.out.println("Ingredients: Chicken Breast, Cherry Tomatoes, Mango, Mixed Greens, Cucumber, Red Onion, Avocado, Olive Oil, Salt, Pepper, Fresh Cilantro, Lime Wedges");
                System.out.println("Cookware: Grill Pan, Tongs, Large Bowl, Small Bowl, Knife, Cutting Board, Measuring Spoons, Measuring Cups, Fork");
                System.out.println("Cooking Time: 20 minutes");


                //Add ingredients to the Ingredients ArrayList
                Ingredient chickenBreast = new Ingredient("Chicken Breast", 165, 8, true); //Required
                Ingredient cherryTomatoes = new Ingredient("Cherry Tomatoes", 18, 1, true); //Required
                Ingredient mango = new Ingredient("Mango", 60, 3, true); //Required
                Ingredient mixedGreens = new Ingredient("Mixed Greens", 5, 0, true); //Required
                Ingredient cucumber = new Ingredient("Cucumber", 8, 0, true); //Required
                Ingredient redOnion = new Ingredient("Red Onion", 40, 2, true); //Required
                Ingredient avocado = new Ingredient("Avocado", 240, 10, false); 
                Ingredient oliveOil = new Ingredient("Olive Oil", 119, 7, true); //Required
                Ingredient salt = new Ingredient("Salt", 0, 0, true); //Required
                Ingredient pepper = new Ingredient("Pepper", 0, 0, true); //Required
                Ingredient freshCilantro = new Ingredient("Fresh Cilantro", 1, 0, false); 
                Ingredient limeWedges = new Ingredient("Lime Wedges", 4, 0, true); //Required

                requiredIngredients.add(chickenBreast);
                requiredIngredients.add(cherryTomatoes);
                requiredIngredients.add(mango);
                requiredIngredients.add(mixedGreens);
                requiredIngredients.add(cucumber);
                requiredIngredients.add(redOnion);
                optionalIngredients.add(avocado);
                requiredIngredients.add(oliveOil);
                requiredIngredients.add(salt);
                requiredIngredients.add(pepper);
                optionalIngredients.add(freshCilantro);
                requiredIngredients.add(limeWedges);

                //Add cookware to the Cookware ArrayList
                Cookware grillPan = new Cookware("Grill Pan", 5, true); //Required
                Cookware tongs = new Cookware("Tongs", 2, true); //Required
                Cookware largeBowl = new Cookware("Large Bowl", 4, true); //Required
                Cookware smallBowl = new Cookware("Small Bowl", 3, true); //Required
                Cookware knife = new Cookware("Knife", 1, true); //Required
                Cookware cuttingBoard = new Cookware("Cutting Board", 1, true); //Required
                Cookware measuringSpoons = new Cookware("Measuring Spoons", 2, true); //Required
                Cookware measuringCups = new Cookware("Measuring Cups", 2, true); //Required
                Cookware fork = new Cookware("Fork", 1, true); //Required

                requiredCookware.add(grillPan);
                requiredCookware.add(tongs);
                requiredCookware.add(largeBowl);
                requiredCookware.add(smallBowl);
                requiredCookware.add(knife);
                requiredCookware.add(cuttingBoard);
                requiredCookware.add(measuringSpoons);
                requiredCookware.add(measuringCups);
                requiredCookware.add(fork);
            }

            else {
                System.out.println("Invalid input. Please try again.");
                return;
            }
            
            // User must now choose the ingredients and cookware for the meal
            boolean isAllRequirementsMet = false; 
            while (!isAllRequirementsMet) {
                selectedIngredients.clear();
                selectedCookware.clear();  
                // Ingredients
                System.out.println("Please choose your ingredients from the list:"); //TODO fix the way it's printed cuz it looks weird
                for (Ingredient ingredient : requiredIngredients) { 
                    System.out.println(ingredient.getName());
                } 
                
                System.out.println("Type the name of an ingredient:");
                 String ingredientName = input.nextLine();
                  for (Ingredient ingredient : requiredIngredients) {
                    if (ingredient.getName().equalsIgnoreCase(ingredientName)) { 
                        selectedIngredients.add(ingredient); 
                    } 
                } 
                
                //Cookware
                System.out.println("Please choose your cookware from the list:");
                for (Cookware cookware : requiredCookware) {
                    System.out.println(cookware.getType());
                } System.out.println("Type the name of a cookware:");
                String cookwareName = input.nextLine();
                for (Cookware cookware : requiredCookware) {
                    if (cookware.getType().equalsIgnoreCase(cookwareName)) {
                        selectedCookware.add(cookware); 
                    } 
                }
                    // Check if all required ingredients and cookware are selected 
                    isAllRequirementsMet = selectedIngredients.containsAll(requiredIngredients) && selectedCookware.containsAll(requiredCookware); 
                    if (!isAllRequirementsMet) {
                        System.out.println("You did not select all required ingredients and cookware. Please try again."); 
                        } 
                    } 
                    System.out.println("Congratulations! You have selected all the required ingredients and cookware for " + mealName + "."); 
                    
                    //TODO COOKING STEPS                                         
        }
    }
}
    