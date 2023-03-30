package Game;

import org.junit.Test;

import static org.junit.Assert.*;



import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class GameTest {

    @Test
    public void initializationPropertyTest() {
        Game game = new Game();
        int[] property = game.initializationProperty();
        org.junit.Assert.assertNotNull(property);
        assertEquals(7, property.length);
    }

    @Test
    public void createPlayersTest() {
        Game game = new Game();
        game.createPlayers();
        org.junit.Assert.assertNotNull(game.wizard);
        org.junit.Assert.assertNotNull(game.property);
        org.junit.Assert.assertNotNull(game.wizard.getPet());
        org.junit.Assert.assertNotNull(game.wizard.getWand());
        org.junit.Assert.assertNotNull(game.wizard.getHouse());
    }

    @Test
    public void assignHouseTest() {
        Game game = new Game();
        game.createPlayers();
        game.assignHouse();
        org.junit.Assert.assertNotNull(game.wizard.getHouse());
    }

    @Test
    public void chooseWandTest() {
        Game game = new Game();
        game.createPlayers();
        game.assignHouse();
        game.chooseWand();
        org.junit.Assert.assertNotNull(game.wizard.getWand());
    }

    @Test
    public void choosePetTest() {
        Game game = new Game();
        game.createPlayers();
        game.assignHouse();
        game.chooseWand();
        game.choosePet();
        org.junit.Assert.assertNotNull(game.wizard.getPet());
    }
    
}
