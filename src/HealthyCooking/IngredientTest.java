package HealthyCooking;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * author: Clarenz Ferrer
 * date: 01/09/2025
 * IngredientTest Class
 */
public class IngredientTest {
    @Test
    public void testGetName() {
        // Arrange
        Ingredient ingredient = new Ingredient("Tomato", 2, 1);

        // Act
        String name = ingredient.getName();

        // Assert
        assertEquals("Tomato", name);
    }

    @Test
    public void testGetNutritionValue() {
        // Arrange
        Ingredient ingredient = new Ingredient("Tomato", 2, 1);

        // Act
        double nutritionValue = ingredient.getNutritionValue();

        // Assert
        assertEquals(2, nutritionValue);
    }

    @Test
    public void testGetHealthScore() {
        // Arrange
        Ingredient ingredient = new Ingredient("Tomato", 2, 1);

        // Act
        double healthScore = ingredient.getHealthScore();

        // Assert
        assertEquals(1, healthScore);
    }

    @Test
    public void testToString() {
        // Arrange
        Ingredient ingredient = new Ingredient("Tomato", 2, 1);

        // Act
        String result = ingredient.toString();

        // Assert
        assertEquals("Tomato (Nutrition: 2.0, Health: 1.0)", result);
    }
}
