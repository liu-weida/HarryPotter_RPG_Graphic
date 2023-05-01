package Graphic;
import Game.StartGame;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.InputStream;
import java.io.InputStream;

public class StartPgae extends Application{

        private ImageView imageView;
        private Image defaultImage;
        private Image hoverImageStartGame;
        private Image hoverImageQuitGame;

        private StartGame main;

        public static void main(String[] args) {
            launch(args);
        }

        @Override
        public void start(Stage stage) throws Exception {
            stage.setTitle("Harry Potter at home V1.0");


            // 加载默认图像
            InputStream input1 = getClass().getResourceAsStream("/image/startPage1.jpg");
            defaultImage = new Image(input1);

// 加载悬停图像
            InputStream input2 = getClass().getResourceAsStream("/image/startPage2.jpg");
            hoverImageStartGame = new Image(input2);

            InputStream input3 = getClass().getResourceAsStream("/image/startPage3.jpg");
            hoverImageQuitGame = new Image(input3);


            // 创建 ImageView 控件并设置默认图像
            imageView = new ImageView(defaultImage);

            // 创建 Button 控件
            Button buttonStartGame = new Button("");
            buttonStartGame.setPrefSize(450, 100);
            buttonStartGame.setTranslateY(58);
            buttonStartGame.setTranslateX(15);
            buttonStartGame.setOpacity(0);


            buttonStartGame.setOnAction(event -> {
                Chapter0 chapter0 = new Chapter0();
                main = new StartGame();

                try {
                    // 使用 PageTransition.smoothTransition 进行页面切换
                    PageTransition.smoothTransition(stage, stage.getScene().getRoot(), () -> {
                        try {
                            chapter0.start(stage);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        StartGame.startGame();
                    });
                } catch (Exception e) {
                    e.printStackTrace();
                }
            });

            Button buttonQuitGame = new Button("");
            buttonQuitGame.setPrefSize(450, 100);
            buttonQuitGame.setTranslateY(200);
            buttonQuitGame.setTranslateX(15);
            buttonQuitGame.setOpacity(0);

            buttonQuitGame.setOnAction(event -> {
                System.exit(0);
            });

            // 创建 StackPane 布局容器，并将图像和按钮添加到其中
            StackPane stackPane = new StackPane(imageView, buttonStartGame, buttonQuitGame);

            // 添加鼠标移入事件监听器
            buttonStartGame.setOnMouseEntered(event -> {
                imageView.setImage(hoverImageStartGame);
            });

            // 添加鼠标移出事件监听器
            buttonStartGame.setOnMouseExited(event -> {
                imageView.setImage(defaultImage);
            });

            buttonQuitGame.setOnMouseEntered(event -> {
                imageView.setImage(hoverImageQuitGame);
            });

            // 添加鼠标移出事件监听器
            buttonQuitGame.setOnMouseExited(event -> {
                imageView.setImage(defaultImage);
            });

            // 创建场景并显示
            Scene scene = new Scene(stackPane, 1120, 700);
            stage.setScene(scene);
            stage.show();
        }



}


