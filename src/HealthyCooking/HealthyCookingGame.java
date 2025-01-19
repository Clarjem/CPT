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

            Meal chosenMeal = new Meal(mealToCook); 
            chosenMeal.showDetails();

            ArrayList<Ingredient> selectedIngredients = new ArrayList<>();
            ArrayList<Cookware> selectedCookware = new ArrayList<>();
            boolean isAllRequirementsMet = false;

            while (!isAllRequirementsMet) {
                System.out.println("Select ingredients:");
                selectedIngredients = chosenMeal.selectIngredients(input);
                
                System.out.println("Select cookware:");
                selectedCookware = chosenMeal.selectCookware(input);
            
                isAllRequirementsMet = chosenMeal.verifySelection(selectedIngredients, selectedCookware);
                if (!isAllRequirementsMet) {
                    System.out.println("You did not select all required items. Please try again.");
                }
            }

            System.out.println("Congratulations! You have selected all the required items for " + chosenMeal.getName() + ".");
            chosenMeal.cookMeal(input, selectedIngredients, selectedCookware);
             System.out.println("You have successfully created a delicious " + chosenMeal.getName() + "!");
        }
    }
}
