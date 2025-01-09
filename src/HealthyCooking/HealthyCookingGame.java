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

        System.out.println("Game: Start or Exit");
        String startGame = input.nextLine();

        if (startGame == "Start"){ 
            System.out.println("!");
        } else {
            System.out.println("Goodbye!");
        }
    }
}
    