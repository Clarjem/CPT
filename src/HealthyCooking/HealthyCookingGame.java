package HealthyCooking;

/**
 * author: Clarenz Ferrer
 * date: 01/09/2025
 * CPT (Making an educational game on cooking)
 */ 

import java.util.Scanner;

public class HealthyCookingGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=======================");
        System.out.println("Game: Start or Exit");
        String startGame = input.nextLine();

        if (startGame.equals("Start")){ 
            System.out.println("Welcome to the Cooking Game. You may choose one of the three meals to cook: \n1. Quinoa Salad with Roasted Vegetables\n2. Lentil and Sweet Potato Stew\n3. Grilled Chicken and Mango Salad\nInput a number.");
            int mealToCook = input.nextInt();
            if (mealToCook == 1){
                System.out.println("Good choice!");

            } else if (mealToCook == 2){
                System.out.println("Interesting.");
            } else if (mealToCook == 3){
                System.out.println("Perfect choice!");
            }
        } else {
            System.out.println("Goodbye!");
        }
    }
}
    