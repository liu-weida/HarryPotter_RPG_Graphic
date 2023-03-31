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

public class EnemyTest {

    private Enemy enemyUnderTest;

    @Before
    public void setUpTEST() {
        enemyUnderTest = new Enemy(0, 0, "name", 0, 0, 0, 0, 0, List.of(new Spell("name", 0, 0.0f)), 0);
    }

    @Test
    public void testAttack() {
        // Setup
        final Wizard wizard = new Wizard(0, "name", 0, 0, 0, 0, 0, Pet.OWL,
                new Wand(Core.DRAGON_HEARTSTRING, 0, "wood", 0, 0, 0, 0), new House("name", 0, 0, 0, 0),
                List.of(new Spell("name", 0, 0.0f)), List.of(new ForbiddenSpell("name", 0, 0.0f)),
                List.of(new ApplySpell("name", 0, 0.0f)), List.of(new Potion("name", 0)), 0);
        final Enemy enemy = Enemy.juvenileTrolls;
        final Spell spell = new Spell("name", 0, 0.0f);

        // Run the test
        enemyUnderTest.attack(wizard, enemy, spell);

        // Verify the results
    }

    @Test
    public void testResetHP() {
        // Setup
        // Run the test
        enemyUnderTest.resetHP();

        // Verify the results
    }
}
