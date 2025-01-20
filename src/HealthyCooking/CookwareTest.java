package HealthyCooking;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * author: Clarenz Ferrer
 * date: 01/09/2025
 * CookwareTest Class

 */
public class CookwareTest {
    @Test
    public void testGetType() {
        // Arrange
        Cookware cookware = new Cookware("Pan", 1);

        // Act
        String type = cookware.getType();

        // Assert
        assertEquals("Pan", type);
    }

    @Test
    public void testGetHealthImpact() {
        // Arrange
        Cookware cookware = new Cookware("Pan", 1);

        // Act
        double healthImpact = cookware.getHealthImpact();

        // Assert
        assertEquals(1, healthImpact);
    }

    @Test
    public void testToString() {
        // Arrange
        Cookware cookware = new Cookware("Pan", 1);

        // Act
        String result = cookware.toString();

        // Assert
        assertEquals("Pan (Health Impact: 1.0)", result);
    }
}
