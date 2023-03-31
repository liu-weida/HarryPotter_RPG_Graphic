package Spell;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ApplySpellTest {

    @Test
    public void testChooseApplySpell() {
        // Run the test
        final ApplySpell result = ApplySpell.chooseApplySpell(0);
        assertEquals("name", result.getName());
        assertEquals(0, result.getDamage());
        assertEquals(0.0f, result.getPrecise(), 0.0001);
    }
}
