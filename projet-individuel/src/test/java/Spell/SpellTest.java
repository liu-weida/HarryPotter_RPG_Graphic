package Spell;

import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SpellTest {

    private Spell spellUnderTest;

    @Before
    public void setUp() {
        spellUnderTest = new Spell("name", 0, 0.0f);
    }

    @Test
    public void testToString() {
        assertEquals("name", spellUnderTest.toString());
    }

    @Test
    public void testGetSpell() {
        // Setup
        // Run the test
       Spell.getSpell();

        // Verify the results
    }

    @Test
    public void testChooseSpell() {
        // Run the test
        final Spell result = Spell.chooseSpell(0);
        assertEquals("name", result.toString());
        assertEquals("name", result.getName());
        assertEquals(0, result.getDamage());
        assertEquals(0.0f, result.getPrecise(), 0.0001);
    }
}
