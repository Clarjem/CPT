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
            ArrayList<Ingredient> ingredients = new ArrayList<>();
            ArrayList<Cookware> cookware = new ArrayList<>();

            // GPT HELPED WITH INGREDIENTS AND COOKWARE!!

            if (mealToCook == 1){ // User has chosen Quinoa Salad with Roasted Vegetables
                mealName = "Quinoa Salad with Roasted Vegetables";
                System.out.println("Good choice! You have chosen Quinoa Salad with Roasted Vegetables.");
                System.out.println("Ingredients: Quinoa, Carrots, Bell Peppers, Zucchini, Cherry tomatoes, Red Onion, Sweet Potatoes, Olive Oil, Salt, Pepper, Lemon Juice, Parsley, Feta Cheese, Chickpeas, Avocado, Pumpkin seeds, Almonds");
                System.out.println("Cookware: Baking Sheet, Large bowl, Small bowl, Saucepan, Mixing Bowl, Knife, Cutting Board, Measuring spoons");
                System.out.println("Cooking Time: 30 minutes");

                //Add ingredients
                Ingredient quinoa = new Ingredient("Quinoa", 222, 9);
                Ingredient carrots = new Ingredient("Carrots", 41, 3);
                Ingredient bellPeppers = new Ingredient("Bell Peppers", 31, 1);
                Ingredient zucchini = new Ingredient("Zucchini", 20, 1);
                Ingredient cherryTomatoes = new Ingredient("Cherry Tomatoes", 18, 1);
                Ingredient redOnion = new Ingredient("Red Onion", 40, 2);
                Ingredient sweetPotatoes = new Ingredient("Sweet Potatoes", 112, 5);
                Ingredient oliveOil = new Ingredient("Olive Oil", 119, 7);
                Ingredient salt = new Ingredient("Salt", 0, 0);
                Ingredient pepper = new Ingredient("Pepper", 0, 0);
                Ingredient lemonJuice = new Ingredient("Lemon Juice", 4, 0);
                Ingredient parsley = new Ingredient("Parsley", 1, 0);
                Ingredient fetaCheese = new Ingredient("Feta Cheese", 264, 21);
                Ingredient chickpeas = new Ingredient("Chickpeas", 164, 3);
                Ingredient avocado = new Ingredient("Avocado", 240, 10);
                Ingredient pumpkinSeeds = new Ingredient("Pumpkin Seeds", 153, 13);
                Ingredient almonds = new Ingredient("Almonds", 7, 1);

                ingredients.add(quinoa);
                ingredients.add(carrots);  //TODO Fix the ingredients below this
                ingredients.add(pumpkinSeeds);
                ingredients.add(almonds); 
                ingredients.add(quinoa);
                ingredients.add(carrots);  
                ingredients.add(pumpkinSeeds);
                ingredients.add(almonds);
                ingredients.add(quinoa);
                ingredients.add(carrots);  
                ingredients.add(pumpkinSeeds);
                ingredients.add(almonds);
                

                //Add cookware
                //TODO: Fix Cookware
                Cookware bakingSheet = new Cookware("Baking Sheet", 5); 
                Cookware saucepan = new Cookware("Saucepan", 3);
                Cookware mixingBowl = new Cookware("Mixing Bowl", 2);
                Cookware knife = new Cookware("Knife", 1);
                Cookware cuttingBoard = new Cookware("Cutting Board", 1);


                cookware.add(bakingSheet);
                cookware.add(saucepan);
                cookware.add(mixingBowl);
                cookware.add(knife);
                cookware.add(cuttingBoard);
            } 
            
            else if (mealToCook == 2){
                mealName = "Lentil and Sweet Potato Stew";
                System.out.println("Interesting. You have chosen Lentil and Sweet Potato Stew.");
                System.out.println("Ingredients: Lentils, Sweet Potatoes, Carrots, Celery, Onion, Garlic, Diced Tomatoes, Vegetable Broth, Salt, Pepper, Olive Oil, Bay Leaves, Paprika, Lemon Juice, Parsley");
                System.out.println("Cookware: Large Pot, Saucepan, Knife, Cutting Board, Wooden Spoon, Measuring Spoons");
                System.out.println("Cooking Time: 45 minutes");


                //Add ingredients
                Ingredient lentils = new Ingredient("Lentils", 230, 10);
                Ingredient sweetPotatoes = new Ingredient("Sweet Potatoes", 112, 5);
                Ingredient carrots = new Ingredient("Carrots", 41, 3);
                Ingredient celery = new Ingredient("Celery", 16, 1);
                Ingredient onion = new Ingredient("Onion", 44, 2);
                Ingredient garlic = new Ingredient("Garlic", 4, 0);
                Ingredient vegetableBroth = new Ingredient("Vegetable Broth", 10, 0);
                Ingredient salt = new Ingredient("Salt", 0, 0);
                Ingredient pepper = new Ingredient("Pepper", 0, 0);
                Ingredient oliveOil = new Ingredient("Olive Oil", 119, 7);


                ingredients.add(lentils);
                ingredients.add(sweetPotatoes);
                ingredients.add(carrots);
                ingredients.add(celery);
                ingredients.add(onion);
                ingredients.add(garlic);
                ingredients.add(vegetableBroth);
                ingredients.add(salt);
                ingredients.add(pepper);
                ingredients.add(oliveOil);


                //Add cookware
                Cookware saucepan = new Cookware("Saucepan", 3);
                Cookware knife = new Cookware("Knife", 1);
                Cookware cuttingBoard = new Cookware("Cutting Board", 1);
                Cookware woodenSpoon = new Cookware("Wooden Spoon", 1);


                cookware.add(saucepan);
                cookware.add(knife);
                cookware.add(cuttingBoard);
                cookware.add(woodenSpoon);
            }

            else if (mealToCook == 3){
                mealName = "Grilled Chicken and Mango Salad";
                System.out.println("Perfect Choice! You have chosen Grilled Chicken and Mango Salad.");
                System.out.println("Ingredients: Chicken Breast, Cherry Tomatoes, Mango, Mixed Greens, Cucumber, Red Onion, Avocado, Olive Oil, Salt, Pepper, Fresh Cilantro, Lime Wedges");
                System.out.println("Cookware: Grill Pan, Tongs, Large Bowl, Small Bowl, Knife, Cutting Board, Measuring Spoons, Measuring Cups, Fork");
                System.out.println("Cooking Time: 20 minutes");


                //Add ingredients
                Ingredient chickenBreast = new Ingredient("Chicken Breast", 165, 8);
                Ingredient mango = new Ingredient("Mango", 60, 3);
                Ingredient mixedGreens = new Ingredient("Mixed Greens", 5, 0);
                Ingredient redOnion = new Ingredient("Red Onion", 40, 2);
                Ingredient avocado = new Ingredient("Avocado", 240, 10);
                Ingredient oliveOil = new Ingredient("Olive Oil", 119, 7);
                Ingredient salt = new Ingredient("Salt", 0, 0);
                Ingredient pepper = new Ingredient("Pepper", 0, 0);
                Ingredient lemonJuice = new Ingredient("Lemon Juice", 4, 0);


                ingredients.add(chickenBreast);
                ingredients.add(mango);
                ingredients.add(mixedGreens);
                ingredients.add(redOnion);
                ingredients.add(avocado);
                ingredients.add(oliveOil);
                ingredients.add(salt);
                ingredients.add(pepper);
                ingredients.add(lemonJuice);


                //Add cookware
                Cookware grillPan = new Cookware("Grill Pan", 5);
                Cookware knife = new Cookware("Knife", 1);
                Cookware cuttingBoard = new Cookware("Cutting Board", 1);
                Cookware mixingBowl = new Cookware("Mixing Bowl", 2);


                cookware.add(grillPan);
                cookware.add(knife);
                cookware.add(cuttingBoard);
                cookware.add(mixingBowl);
            }

            else {
                System.out.println("Invalid input. Please try again.");
                return;
            }

            
        }
    }
}
    