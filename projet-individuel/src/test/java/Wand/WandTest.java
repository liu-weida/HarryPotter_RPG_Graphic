package Wand;

import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class WandTest {

    private Wand wandUnderTest;

    @Before
    public void setUp() {
        wandUnderTest = new Wand(Core.PHOENIX_FEATHER, 0, "wood", 0, 0, 0, 0);
    }

    @Test
    public void testToString() {
        assertEquals("result", wandUnderTest.toString());
    }

    @Test
    public void testChooseWand() {
        // Run the test
        final Wand result = Wand.chooseWand(0);
        assertEquals(Core.PHOENIX_FEATHER, result.getCore());
        assertEquals("result", result.toString());
    }

    @Test
    public void testGetWand() {
        // Setup
        // Run the test
        Wand.getWand();

        // Verify the results
    }

    @Test
    public void testGetPharmacyBonus() {
        assertEquals(0, Wand.getPharmacyBonus());
    }

    @Test
    public void testGetAttackBonus() {
        assertEquals(0, Wand.getAttackBonus());
    }

    @Test
    public void testGetDefenseBonus() {
        assertEquals(0, Wand.getDefenseBonus());
    }

    @Test
    public void testGetPreciseBonus() {
        assertEquals(0, Wand.getPreciseBonus());
    }
}
