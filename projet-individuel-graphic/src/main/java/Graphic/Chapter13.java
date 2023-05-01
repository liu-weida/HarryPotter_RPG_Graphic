package Graphic;

import Game.Game;
import javafx.animation.FadeTransition;
import javafx.application.Application;
import javafx.scene.ImageCursor;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.event.EventHandler;
import javafx.scene.input.KeyCode;
import javafx.util.Duration;
import java.io.InputStream;

public class Chapter13 extends Application {

    private ImageView imageView;
    private Image arrivalhouse;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Harry Potter at home V1.0");

        // 加载默认图像
        InputStream input1 = getClass().getResourceAsStream("/image/Chapter12.jpg");
        arrivalhouse = new Image(input1);

        // 创建 ImageView 控件并设置默认图像
        imageView = new ImageView(arrivalhouse);

        // 创建 Button 控件
        Button buttonCreate = new Button("");
        buttonCreate.setPrefSize(400, 300);
        buttonCreate.setTranslateY(-230);
        buttonCreate.setTranslateX(6);
        buttonCreate.setOpacity(0);

        // 创建 StackPane 布局容器，并将图像和按钮添加到其中
        StackPane stackPane = new StackPane(imageView, buttonCreate);
        Scene scene = new Scene(stackPane, 1120, 700);

        InputStream cursorInput = getClass().getResourceAsStream("/image/Rocks.png");
        double width = 1000; // 设置鼠标指针的宽度
        double height = 1000; // 设置鼠标指针的高度
        Image cursorImage = new Image(cursorInput, width, height, true, true);
        scene.setCursor(new ImageCursor(cursorImage));

        // 添加鼠标点击事件监听器
        buttonCreate.setOnMouseClicked(event -> {
            Chapter14 chapter14 = new Chapter14();
            try {
                chapter14.start(stage);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });


        // 创建场景并显示
        stage.setScene(scene);
        stage.show();
    }
}
