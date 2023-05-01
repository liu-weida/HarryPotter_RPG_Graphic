package Game;

import javafx.scene.control.TextArea;

public class StartGame {

    public static void main(String[] args) {
        startGame();
    }

    public static void startGame() {
        Thread gameThread = new Thread(() -> {
            Game game = new Game();
            game.play();
        });

        gameThread.setDaemon(true);
        gameThread.start();
    }
}
