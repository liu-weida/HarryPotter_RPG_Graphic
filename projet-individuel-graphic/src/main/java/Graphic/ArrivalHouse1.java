package Graphic;

import Game.Game;

import javafx.animation.FadeTransition;
import javafx.application.Application;
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
import javafx.scene.input.KeyEvent;
import javafx.util.Duration;

import java.io.InputStream;
import java.io.InputStream;

public class ArrivalHouse1 extends Application{

    private ImageView imageView;
    private Image arrivalhouse;


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Harry Potter at home V1.0");

        // 加载默认图像

        InputStream input1  =  getClass().getResourceAsStream("/image/ArrivalHouse1.jpg");
        arrivalhouse = new Image(input1);


        // 创建 ImageView 控件并设置默认图像
        imageView = new ImageView(arrivalhouse);


        // 创建 Button 控件
        Button buttonCreate = new Button("");
        buttonCreate.setPrefSize(400, 90);
        buttonCreate.setTranslateY(53);
        buttonCreate.setTranslateX(6);
        buttonCreate.setOpacity(0);




        // 创建 StackPane 布局容器，并将图像和按钮添加到其中
        StackPane stackPane = new StackPane(imageView, buttonCreate);

        // 添加鼠标移入事件监听器
        buttonCreate.setOnMouseEntered(event -> {

            ArrivalHouse2 arrivalHouse2 = new ArrivalHouse2();

                    try {
                        arrivalHouse2.start(stage);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

        });

        // 创建场景并显示
        Scene scene = new Scene(stackPane, 1120, 700);
        stage.setScene(scene);
        stage.show();
    }



}
