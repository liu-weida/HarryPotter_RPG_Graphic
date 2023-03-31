package Spell;

import org.junit.Before;

public class AbstractSpellTest {

    private AbstractSpell abstractSpellUnderTest;

    @Before
    public void setUp() {
        abstractSpellUnderTest = new AbstractSpell("name", 0, 0.0f) {
        };
    }
}
