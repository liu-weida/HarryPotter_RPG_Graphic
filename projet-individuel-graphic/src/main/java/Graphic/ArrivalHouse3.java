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
import javafx.event.ActionEvent;

import javafx.event.EventHandler;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.util.Duration;

import java.io.InputStream;

public class ArrivalHouse3 extends Application{

    private ImageView imageView;
    private Image ArrivalHouse1;
    private Image ArrivalHouse2;


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Harry Potter at home V1.0");

        // 加载默认图像

        InputStream input1 = getClass().getResourceAsStream("/image/ArrivalHouse4.jpg");
        ArrivalHouse1 = new Image(input1);

        InputStream input2 = getClass().getResourceAsStream("/image/ArrivalHouse5.jpg");
        ArrivalHouse2 = new Image(input2);


        // 创建 ImageView 控件并设置默认图像
        imageView = new ImageView(ArrivalHouse1);


        // 创建 Button 控件
        Button buttonCreate = new Button("");
        buttonCreate.setPrefSize(210, 83);
        buttonCreate.setTranslateY(167);
        buttonCreate.setTranslateX(21);
        buttonCreate.setOpacity(0);


        // 创建 StackPane 布局容器，并将图像和按钮添加到其中
        StackPane stackPane = new StackPane(imageView, buttonCreate);

        // 添加鼠标移入事件监听器
        buttonCreate.setOnMouseEntered(event -> {
            imageView.setImage(ArrivalHouse2);
        });

        // 添加鼠标移出事件监听器
        buttonCreate.setOnMouseExited(event -> {
            imageView.setImage(ArrivalHouse1);
        });

        buttonCreate.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                // 创建 ArrivalHouse3 实例
                AssigningProperties assigningProperties = new AssigningProperties();
                // 调用 ArrivalHouse3 实例的 start() 方法显示新的场景
                try {
                    assigningProperties.start(new Stage());
                } catch (Exception e) {
                    e.printStackTrace();
                }
                // 关闭当前场景
                stage.close();
            }
        });

        // 创建场景并显示
        Scene scene = new Scene(stackPane, 1120, 700);
        stage.setScene(scene);
        stage.show();
    }




}
