package HealthyCooking;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

/**
 * author: Clarenz Ferrer
 * date: 01/09/2025
 * MealTest Class
 */
public class MealTest {
    @Test
    public void testInitializeMeal() {
        // Arrange
        Meal meal = new Meal(1);

        // Act
        String name = meal.getName();
        ArrayList<Ingredient> ingredients = meal.getIngredients();
        ArrayList<Cookware> cookware = meal.getCookware();

        // Assert
        assertEquals("Quinoa Salad and Roasted Vegetables", name);
        assertFalse(ingredients.isEmpty());
        assertFalse(cookware.isEmpty());
    }

    @Test
    public void testShowDetails() {
        // Arrange
        Meal meal = new Meal(1);

        // Act
        meal.showDetails();

        // Assert
        // This test is to verify the output, no assertions needed
    }

    @Test
    public void testSelectIngredients() {
        // Arrange
        Meal meal = new Meal(1);
        Scanner input = new Scanner("quinoa\ncarrots\ndone\n");

        // Act
        ArrayList<Ingredient> selectedIngredients = meal.selectIngredients(input);

        // Assert
        assertEquals(2, selectedIngredients.size());
    }

    @Test
    public void testSelectCookware() {
        // Arrange
        Meal meal = new Meal(1);
        Scanner input = new Scanner("baking sheet\nlarge bowl\ndone\n");

        // Act
        ArrayList<Cookware> selectedCookware = meal.selectCookware(input);

        // Assert
        assertEquals(2, selectedCookware.size());
    }

    @Test
    public void testVerifySelection() {
        // Arrange
        Meal meal = new Meal(1);
        ArrayList<Ingredient> selectedIngredients = new ArrayList<>();
        selectedIngredients.add(new Ingredient("Quinoa", 22, 9));
        selectedIngredients.add(new Ingredient("Carrots", 41, 3));
        ArrayList<Cookware> selectedCookware = new ArrayList<>();
        selectedCookware.add(new Cookware("Baking Sheet", 5));
        selectedCookware.add(new Cookware("Large Bowl", 4));

        // Act
        boolean isValid = meal.verifySelection(selectedIngredients, selectedCookware);

        // Assert
        assertTrue(isValid);
    }

    @Test
    public void testDisplayScoreHistory() {
        // Arrange
        Meal meal = new Meal(1);
        Queue<Integer> scoreHistory = new LinkedList<>();
        scoreHistory.add(85);
        scoreHistory.add(90);

        // Act
        meal.displayScoreHistory();

        // Assert
        // This test is to verify the output, no assertions needed
    }
}
