package HealthyCooking;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;

/**
 * author: Clarenz Ferrer
 * date: 01/09/2025
 * RecipeTest Class
 */
public class RecipeTest {
    @Test
    public void testGetName() {
        // Arrange
        Recipe recipe = new Recipe(1);
        recipe.setName("Pasta");

        // Act
        String name = recipe.getName();

        // Assert
        assertEquals("Pasta", name);
    }

    @Test
    public void testGetIngredients() {
        // Arrange
        Recipe recipe = new Recipe(1);
        Ingredient ingredient = new Ingredient("Tomato", 2, 1);
        recipe.addIngredients(ingredient);

        // Act
        ArrayList<Ingredient> ingredients = recipe.getIngredients();

        // Assert
        assertEquals(1, ingredients.size());
        assertEquals("Tomato", ingredients.get(0).getName());
    }

    @Test
    public void testGetCookware() {
        // Arrange
        Recipe recipe = new Recipe(1);
        Cookware cookware = new Cookware("Pan", 1);
        recipe.addCookware(cookware);

        // Act
        ArrayList<Cookware> cookwareList = recipe.getCookware();

        // Assert
        assertEquals(1, cookwareList.size());
        assertEquals("Pan", cookwareList.get(0).getType());
    }

    @Test
    public void testAddIngredients() {
        // Arrange
        Recipe recipe = new Recipe(1);
        Ingredient ingredient = new Ingredient("Tomato", 2, 1);

        // Act
        recipe.addIngredients(ingredient);
        ArrayList<Ingredient> ingredients = recipe.getIngredients();

        // Assert
        assertTrue(ingredients.contains(ingredient));
    }

    @Test
    public void testAddCookware() {
        // Arrange
        Recipe recipe = new Recipe(1);
        Cookware cookware = new Cookware("Pan", 1);

        // Act
        recipe.addCookware(cookware);
        ArrayList<Cookware> cookwareList = recipe.getCookware();

        // Assert
        assertTrue(cookwareList.contains(cookware));
    }

}
