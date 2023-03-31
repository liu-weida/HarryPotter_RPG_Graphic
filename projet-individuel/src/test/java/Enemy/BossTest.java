package Enemy;

import House.House;
import Pet.Pet;
import Player.Wizard;
import Potion.Potion;
import Spell.Spell;
import Spell.ForbiddenSpell;
import Spell.ApplySpell;
import Wand.Wand;
import Wand.Core;
import org.junit.Before;
import org.junit.Test;


import java.util.List;

public class BossTest {

    private Boss bossUnderTest;

    @Before
    public void setUp() {
        bossUnderTest = new Boss(0, 0, "name", 0, 0, 0, 0, 0, List.of(new Spell("name", 0, 0.0f)), 0);
    }

    @Test
    public void testAttack() {
        // Setup
        final Wizard wizard = new Wizard(0, "name", 0, 0, 0, 0, 0, Pet.OWL,
                new Wand(Core.PHOENIX_FEATHER, 0, "wood", 0, 0, 0, 0), new House("name", 0, 0, 0, 0),
                List.of(new Spell("name", 0, 0.0f)), List.of(new ForbiddenSpell("name", 0, 0.0f)),
                List.of(new ApplySpell("name", 0, 0.0f)), List.of(new Potion("name", 0)), 0);
        final Boss boss = Boss.dementor;
        final Spell spell = new Spell("name", 0, 0.0f);

        // Run the test
        bossUnderTest.attack(wizard, boss, spell);

        // Verify the results
    }

    @Test
    public void testResetHP() {
        // Setup
        // Run the test
        bossUnderTest.resetHP();

        // Verify the results
    }
}
