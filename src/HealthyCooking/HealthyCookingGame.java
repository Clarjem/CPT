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

        if (startGame.equalsIgnoreCase("Start")){ 
            //Begin by choosing a meal to cook
            System.out.println("Welcome to the Cooking Game. You may choose one of the three meals to cook: \n1. Quinoa Salad with Roasted Vegetables\n2. Lentil and Sweet Potato Stew\n3. Grilled Chicken and Mango Salad\nInput a number."); 
            int mealToCook = input.nextInt(); // User input to choose a meal to cook
            input.nextLine(); //Flush the next line

            String mealName = ""; //Define meal-sepcfic variables
            ArrayList<Ingredient> ingredients = new ArrayList<>();
            ArrayList<Cookware> cookware = new ArrayList<>();

            if (mealToCook == 1){ // User has chosen Quinoa Salad with Roasted Vegetables
                mealName = "Quinoa Salad with Roasted Vegetables";
                System.out.println("Good choice! You have chosen Quinoa Salad with Roasted Vegetables.");
                System.out.println("Ingredients: Quinoa, Carrots, Bell Peppers, Zucchini, Olive Oil, Salt, Pepper, Lemon Juice, Parsley");
                System.out.println("Cookware: Baking Sheet, Saucepan, Mixing Bowl, Knife, Cutting Board");
                System.out.println("Cooking Time: 30 minutes");

                //Add ingredients
                Ingredient quinoa = new Ingredient("Quinoa", 120, 8);
                Ingredient carrots = new Ingredient("Carrots", 41, 3);
                Ingredient bellPeppers = new Ingredient("Bell Peppers", 31, 2);
                Ingredient zucchini = new Ingredient("Zucchini", 20, 1);
                Ingredient oliveOil = new Ingredient("Olive Oil", 119, 7);
                Ingredient salt = new Ingredient("Salt", 0, 0);
                Ingredient pepper = new Ingredient("Pepper", 0, 0);
                Ingredient lemonJuice = new Ingredient("Lemon Juice", 4, 0);
                Ingredient parsley = new Ingredient("Parsley", 1, 0);

                ingredients.add(quinoa);
                ingredients.add(carrots);
                ingredients.add(bellPeppers);
                ingredients.add(zucchini);
                ingredients.add(oliveOil);
                ingredients.add(salt);
                ingredients.add(pepper);
                ingredients.add(lemonJuice);
                ingredients.add(parsley);

                //Add cookware
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

                           
            
        

            
            
            
            
            //Begin cooking the meal
            
        }
    }
}
    