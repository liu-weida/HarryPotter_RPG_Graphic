package Graphic;

import Game.Game;

import javafx.animation.FadeTransition;
import javafx.application.Application;
import javafx.event.ActionEvent;
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

public class Chapter63 extends Application{

    private ImageView imageView;
    private Image surrender1;
    private Image surrender2;
    private Image surrender3;
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Harry Potter at home V1.0");

        // 加载默认图像

        InputStream input1 = getClass().getResourceAsStream("/image/Chapter63.jpg");
        surrender1 = new Image(input1);

        InputStream input2 = getClass().getResourceAsStream("/image/Chapter64.jpg");
        surrender2 = new Image(input2);

        InputStream input3 = getClass().getResourceAsStream("/image/Chapter65.jpg");
        surrender3 = new Image(input3);

        // 创建 ImageView 控件并设置默认图像
        imageView = new ImageView(surrender1);


        // 创建 Button 控件
        Button buttonCreate = new Button("");
        buttonCreate.setPrefSize(210, 70);
        buttonCreate.setTranslateY(-12);
        buttonCreate.setTranslateX(4);
        buttonCreate.setOpacity(0);

        Button buttonCreate2 = new Button("");
        buttonCreate2.setPrefSize(210, 70);
        buttonCreate2.setTranslateY(108);
        buttonCreate2.setTranslateX(4);
        buttonCreate2.setOpacity(0);



        // 创建 StackPane 布局容器，并将图像和按钮添加到其中
        StackPane stackPane = new StackPane(imageView, buttonCreate, buttonCreate2);

        // 添加鼠标移入事件监听器
        buttonCreate.setOnMouseEntered(event -> {
            imageView.setImage(surrender2);
        });

        // 添加鼠标移出事件监听器
        buttonCreate.setOnMouseExited(event -> {
            imageView.setImage(surrender1);
        });

        // 添加鼠标移入事件监听器
        buttonCreate2.setOnMouseEntered(event -> {
            imageView.setImage(surrender3);
        });

        // 添加鼠标移出事件监听器
        buttonCreate2.setOnMouseExited(event -> {
            imageView.setImage(surrender1);
        });

        buttonCreate.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                // 创建 ArrivalHouse3 实例
                Chapter64 assigningProperties = new Chapter64();
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

        buttonCreate2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                // 创建 ArrivalHouse3 实例
                Chapter65 assigningProperties = new Chapter65();
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
