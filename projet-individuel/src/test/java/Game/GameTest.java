package Game;

import Enemy.Enemy;
import Enemy.Boss;
import Spell.Spell;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class GameTest {

    private Game gameUnderTest;

    @Before
    public void setUp() {
        gameUnderTest = new Game();
        gameUnderTest.adventurelevel = 0;
    }

    @Test
    public void testPlay() {
        // Setup
        // Run the test
        gameUnderTest.play();

        // Verify the results
    }

    @Test
    public void testInitializationProperty() {
        assertArrayEquals(new int[]{0}, gameUnderTest.initializationProperty());
    }

    @Test
    public void testCreatePlayers() {
        // Setup
        // Run the test
        gameUnderTest.createPlayers();

        // Verify the results
    }

    @Test
    public void testAssignHouse() {
        // Setup
        // Run the test
        gameUnderTest.assignHouse();

        // Verify the results
    }

    @Test
    public void testChooseWand() {
        // Setup
        // Run the test
        gameUnderTest.chooseWand();

        // Verify the results
    }

    @Test
    public void testChoosePet() {
        // Setup
        // Run the test
        gameUnderTest.choosePet();

        // Verify the results
    }

    @Test
    public void testPrintPets() {
        // Setup
        // Run the test
        gameUnderTest.printPets();

        // Verify the results
    }

    @Test
    public void testProperties() {
        // Setup
        // Run the test
        gameUnderTest.Properties();

        // Verify the results
    }

    @Test
    public void testCurrentProperties() {
        // Setup
        // Run the test
        gameUnderTest.currentProperties();

        // Verify the results
    }

    @Test
    public void testArrivalHouse() {
        // Setup
        // Run the test
        gameUnderTest.arrivalHouse();

        // Verify the results
    }

    @Test
    public void testAdventure() {
        // Setup
        // Run the test
        gameUnderTest.adventure();

        // Verify the results
    }

    @Test
    public void testLearnSpell() {
        // Setup
        // Run the test
        gameUnderTest.learnSpell();

        // Verify the results
    }

    @Test
    public void testLearnForbiddenSpell() {
        // Setup
        // Run the test
        gameUnderTest.learnForbiddenSpell();

        // Verify the results
    }

    @Test
    public void testBuyPotion() {
        // Setup
        // Run the test
        gameUnderTest.buyPotion();

        // Verify the results
    }

    @Test
    public void testTrainingGround() {
        // Setup
        // Run the test
        gameUnderTest.trainingGround();

        // Verify the results
    }

    @Test
    public void testCombat() {
        // Setup
        final Enemy enemy = new Enemy(0, 0, "name", 0, 0, 0, 0, 0, List.of(new Spell("name", 0, 0.0f)), 0);

        // Run the test
        Game.combat(enemy);

        // Verify the results
    }

    @Test
    public void testUseSpells() {
        // Setup
        final Enemy enemy = new Enemy(0, 0, "name", 0, 0, 0, 0, 0,
                List.of(new Spell("name", 0, 0.0f)), 0);

        // Run the test
        Game.useSpells(enemy);

        // Verify the results
    }

    @Test
    public void testUsePotion() {
        // Setup
        final Enemy enemy = new Enemy(0, 0, "name", 0, 0, 0, 0, 0,
                List.of(new Spell("name", 0, 0.0f)), 0);

        // Run the test
        Game.usePotion(enemy);

        // Verify the results
    }

    @Test
    public void testUseForbiddenSpell() {
        // Setup
        final Enemy enemy = new Enemy(0, 0, "name", 0, 0, 0, 0, 0,
                List.of(new Spell("name", 0, 0.0f)), 0);

        // Run the test
        Game.useForbiddenSpell(enemy);

        // Verify the results
    }

    @Test
    public void testDefense1() {
        // Setup
        final Enemy enemy = new Enemy(0, 0, "name", 0, 0, 0, 0, 0,
                List.of(new Spell("name", 0, 0.0f)), 0);

        // Run the test
        Game.defense(enemy);

        // Verify the results
    }

    @Test
    public void testCombatBoss() {
        // Setup
        final Boss enemy = new Boss(0, 0, "name", 0, 0, 0, 0, 0, List.of(new Spell("name", 0, 0.0f)),
                0);

        // Run the test
        Game.combatBoss(enemy);

        // Verify the results
    }

    @Test
    public void testUseSpellsBoss() {
        // Setup
        final Boss enemy = new Boss(0, 0, "name", 0, 0, 0, 0, 0, List.of(new Spell("name", 0, 0.0f)),
                0);

        // Run the test
        Game.useSpellsBoss(enemy);

        // Verify the results
    }

    @Test
    public void testUsePotionBoss() {
        // Setup
        final Boss enemy = new Boss(0, 0, "name", 0, 0, 0, 0, 0, List.of(new Spell("name", 0, 0.0f)),
                0);
        // Run the test
        Game.usePotionBoss(enemy);

        // Verify the results
    }

    @Test
    public void testUseForbiddenSpellBoss() {
        // Setup
        final Boss enemy = new Boss(0, 0, "name", 0, 0, 0, 0, 0, List.of(new Spell("name", 0, 0.0f)),
                0);

        // Run the test
        Game.useForbiddenSpellBoss(enemy);

        // Verify the results
    }

    @Test
    public void testDefense2() {
        // Setup
        final Enemy enemy = new Enemy(0, 0, "name", 0, 0, 0, 0, 0, List.of(new Spell("name", 0, 0.0f)),
                0);

        // Run the test
        Game.defense(enemy);

        // Verify the results
    }

    @Test
    public void testBattleVictory() {
        // Setup
        // Run the test
        Game.battleVictory();

        // Verify the results
    }

    @Test
    public void testWaitForInput() {
        // Setup
        // Run the test
        Game.waitForInput();

        // Verify the results
    }
}
