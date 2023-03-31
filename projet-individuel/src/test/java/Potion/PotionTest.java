package Potion;

import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PotionTest {

    private Potion potionUnderTest;

    @Before
    public void setUp() {
        potionUnderTest = new Potion("name", 0);
    }

    @Test
    public void testToString() {
        assertEquals("name", potionUnderTest.toString());
    }

    @Test
    public void testGetPotion() {
        // Setup
        // Run the test
        Potion.getPotion();

        // Verify the results
    }

    @Test
    public void testChoosePotion() {
        // Run the test
        final Potion result = Potion.choosePotion(0);
        assertEquals("name", result.toString());
        assertEquals("name", result.getName());
        assertEquals(0, result.getAddHP());
    }
}
