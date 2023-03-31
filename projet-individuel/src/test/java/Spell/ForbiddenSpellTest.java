package Spell;

import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ForbiddenSpellTest {

    private ForbiddenSpell forbiddenSpellUnderTest;

    @Before
    public void setUp() {
        forbiddenSpellUnderTest = new ForbiddenSpell("name", 0, 0.0f);
    }

    @Test
    public void testToString() {
        assertEquals("name", forbiddenSpellUnderTest.toString());
    }

    @Test
    public void testGetForbiddenSpell() {
        // Setup
        // Run the test
        ForbiddenSpell.getForbiddenSpell();

        // Verify the results
    }

    @Test
    public void testChooseForbiddenSpell() {
        // Run the test
        final ForbiddenSpell result = ForbiddenSpell.chooseForbiddenSpell(0);
        assertEquals("name", result.toString());
        assertEquals("name", result.getName());
        assertEquals(0, result.getDamage());
        assertEquals(0.0f, result.getPrecise(), 0.0001);
    }
}
