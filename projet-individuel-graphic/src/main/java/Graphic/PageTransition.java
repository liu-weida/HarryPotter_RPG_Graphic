package Graphic;

import javafx.animation.FadeTransition;
import javafx.scene.Node;
import javafx.stage.Stage;
import javafx.util.Duration;

public class PageTransition {

    public static void smoothTransition(Stage stage, Node oldNode, Runnable onFinished) {
        FadeTransition fadeOut = new FadeTransition(Duration.millis(500), oldNode);
        fadeOut.setFromValue(1.0);
        fadeOut.setToValue(0.0);
        fadeOut.setOnFinished(event -> {
            onFinished.run();

            FadeTransition fadeIn = new FadeTransition(Duration.millis(500), stage.getScene().getRoot());
            fadeIn.setFromValue(0.0);
            fadeIn.setToValue(1.0);
            fadeIn.play();
        });
        fadeOut.play();
    }
}
