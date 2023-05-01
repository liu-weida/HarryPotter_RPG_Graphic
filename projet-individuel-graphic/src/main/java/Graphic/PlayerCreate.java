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

public class PlayerCreate extends Application{

    private ImageView imageView;
    private Image createPlayer;
    private Image createPlayer2;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Harry Potter at home V1.0");

        // 加载默认图像

        InputStream input1 = getClass().getResourceAsStream("/image/ArrivalHouse1.jpg");
        createPlayer = new Image(input1);

        InputStream input2 = getClass().getResourceAsStream("/image/ArrivalHouse2.jpg");
        createPlayer2 = new Image(input2);

        // 创建 ImageView 控件并设置默认图像
        imageView = new ImageView(createPlayer);


        TextField textField = new TextField();
        textField.setMaxWidth(200);
        textField.setMaxHeight(80);
        textField.setTranslateY(20);
        textField.setTranslateX(20);

        textField.setText("Enter your name");
        //textField.setPrefSize(200, 100);

        // 创建 Button 控件
        Button buttonCreate = new Button("");
        buttonCreate.setPrefSize(200, 80);
        buttonCreate.setTranslateY(200);
        buttonCreate.setTranslateX(15);
        //buttonCreate.setOpacity(0);

//        buttonCreate.setOnAction(event -> {
//            String inputText = textField.getText(); // 获取输入框中的文本
//            System.out.println(inputText + "\n"); // 在控制台输出文本
//        });
        buttonCreate.setOnAction(event -> {
            submitName(textField);
        });


        // 创建 StackPane 布局容器，并将图像和按钮添加到其中
        StackPane stackPane = new StackPane(imageView, buttonCreate,textField);

        // 添加鼠标移入事件监听器
        buttonCreate.setOnMouseEntered(event -> {
            imageView.setImage(createPlayer2);
        });

        // 添加鼠标移出事件监听器
        buttonCreate.setOnMouseExited(event -> {
            imageView.setImage(createPlayer);
        });


        // 创建场景并显示
        Scene scene = new Scene(stackPane, 1120, 700);
        stage.setScene(scene);
        stage.show();
    }
    private void submitName(TextField textField) {
        String inputText = textField.getText(); // 获取输入框中的文本
        System.out.println(inputText); // 在控制台输出文本
    }



}
