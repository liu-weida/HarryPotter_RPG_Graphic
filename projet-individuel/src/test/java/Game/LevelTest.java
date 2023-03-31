package Game;


import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class LevelTest {

    @Test
    public void testAdventure1st() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        System.setIn(new ByteArrayInputStream("1\n".getBytes()));
        Level.adventure1st();

        String expectedOutput = "The first level:  The Philosopher’s Stone.\n" +
                "\"Kid, this adventure is very dangerous, please be very careful. I divined for you yesterday and the stars show that you need Wingardium leviosa to help you with this adventure.\" Dean Dumbledore instructed. After saying that, he taught you a brand new magic.\n" +
                "<Expected output of the ApplySpell.chooseApplySpell(1) method>\n" +
                "Congratulations on learning Wingardium leviosa. start your adventure.\n" +
                "In order to explore the secrets of the Sage's Stone, you came alone to the dungeon.\n" +
                "There are a few Juvenile Trolls in front of you, so tackle them.\n" +
                "<Expected output of the Game.combat(Enemy.juvenileTrolls) method>\n" +
                "After some exploration you came to the door of the dungeon toilet, which seems to have a dangerous atmosphere, whether to enter?\n" +
                "1. Enter\n" + "2. Don't enter\n" +
                "After thinking about it, you decide to enter the dungeon toilet full of danger.\n" +
                "<Expected output of the boss1st() method>\n";

        assertEquals(expectedOutput, outContent.toString());

        // 模拟输入2
        System.setIn(new ByteArrayInputStream("2\n".getBytes()));
        outContent.reset();
        Level.adventure1st();

        expectedOutput = "The first level:  The Philosopher’s Stone.\n" +
                "\"Kid, this adventure is very dangerous, please be very careful. I divined for you yesterday and the stars show that you need Wingardium leviosa to help you with this adventure.\" Dean Dumbledore instructed. After saying that, he taught you a brand new magic.\n" +
                "<Expected output of the ApplySpell.chooseApplySpell(1) method>\n" +
                "Congratulations on learning Wingardium leviosa. start your adventure.\n" +
                "In order to explore the secrets of the Sage's Stone, you came alone to the dungeon.\n" +
                "There are a few Juvenile Trolls in front of you, so tackle them.\n" +
                "<Expected output of the Game.combat(Enemy.juvenileTrolls) method>\n" +
                "After some exploration you came to the door of the dungeon toilet, which seems to have a dangerous atmosphere, whether to enter?\n" +
                "1. Enter\n" + "2. Don't enter\n" +
                "After thinking about it, you decide not to enter the dungeon toilet.\n" +
                "But you find that you are surrounded by enemies.\n" +
                "<Expected output of the Game.combat(Enemy.juvenileTrolls) method>\n" +
                "You find yourself surrounded by enemies, and you fight and retreat, and finally retreat to the door of the dungeon toilet. You find that the enemy seems to be afraid of the dungeon toilet, so you enter the dungeon toilet anyway.\n" +
                "<Expected output of the boss1st() method>\n";

        assertEquals(expectedOutput, outContent.toString());
    }


    @Test
    public void testBoss1st() {
        // Create a new Game object and Level object to test
        Game game = new Game();
        Level level = new Level(game);

        // Call the method to be tested
        level.boss1st();

    }

    @Test
    public void testAdventure2nd() {
        // Create a new Game object and Level object to test
        Game game = new Game();
        Level level = new Level(game);

        // Call the method to be tested
        level.adventure2nd();

    }

    @Test
    public void testBoss2nd() {
        // Create a new Game object and Level object to test
        Game game = new Game();
        Level level = new Level(game);

        // Call the method to be tested
        level.boss2nd();

    }

    public void testAdventure3rd() {
        // Create a new Game object and Level object to test
        Game game = new Game();
        Level level = new Level(game);

        // Call the method to be tested
        level.adventure3rd();

    }

    @Test
    public void testBoss3rd() {
        // Create a new Game object and Level object to test
        Game game = new Game();
        Level level = new Level(game);

        // Call the method to be tested
        level.boss3rd();

    }

    public void testAdventure4th() {
        // Create a new Game object and Level object to test
        Game game = new Game();
        Level level = new Level(game);

        // Call the method to be tested
        level.adventure4th();

    }

    @Test
    public void testBoss4th() {
        // Create a new Game object and Level object to test
        Game game = new Game();
        Level level = new Level(game);

        // Call the method to be tested
        level.boss4th();

    }
    @Test
    public void testAdventure5th() {
        // Create a new Game object and Level object to test
        Game game = new Game();
        Level level = new Level(game);

        // Call the method to be tested
        level.adventure5th();

    }

    @Test
    public void testBoss5th() {
        // Create a new Game object and Level object to test
        Game game = new Game();
        Level level = new Level(game);

        // Call the method to be tested
        level.boss5th();

    }
    public void testAdventure6th() {
        // Create a new Game object and Level object to test
        Game game = new Game();
        Level level = new Level(game);

        // Call the method to be tested
        level.adventure6th();

    }

    @Test
    public void testBoss6th() {
        // Create a new Game object and Level object to test
        Game game = new Game();
        Level level = new Level(game);

        // Call the method to be tested
        level.boss6th();

    }

    public void testAdventure7th() {
        // Create a new Game object and Level object to test
        Game game = new Game();
        Level level = new Level(game);

        // Call the method to be tested
        level.adventure7th();

    }

    @Test
    public void testBoss7th() {
        // Create a new Game object and Level object to test
        Game game = new Game();
        Level level = new Level(game);

        // Call the method to be tested
        level.boss7th();

    }

    @Test
    public void testGraduationCeremony() {
        // Create a new Game object and Level object to test
        Game game = new Game();
        Level level = new Level(game);

        // Call the method to be tested
        level.graduationCeremony();

    }
}
