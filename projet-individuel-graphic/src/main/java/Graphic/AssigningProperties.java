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

public class AssigningProperties extends Application{

    private ImageView imageView;
    private Image AssigningProperties1;
    private Image AssigningProperties2;


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Harry Potter at home V1.0");

        // 加载默认图像

        InputStream input1 = getClass().getResourceAsStream("/image/AssigningProperties1.jpg");
        AssigningProperties1 = new Image(input1);

        InputStream input2 = getClass().getResourceAsStream("/image/AssigningProperties2.jpg");
        AssigningProperties2 = new Image(input2);


        // 创建 ImageView 控件并设置默认图像
        imageView = new ImageView(AssigningProperties1);


        // 创建 Button 控件
        Button buttonCreate = new Button("");
        buttonCreate.setPrefSize(240, 80);
        buttonCreate.setTranslateY(230);
        buttonCreate.setTranslateX(0);
        buttonCreate.setOpacity(0);




        // 添加鼠标移入事件监听器
        buttonCreate.setOnMouseEntered(event -> {
            imageView.setImage(AssigningProperties2);
        });

        // 添加鼠标移出事件监听器
        buttonCreate.setOnMouseExited(event -> {
            imageView.setImage(AssigningProperties1);
        });

        buttonCreate.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                // 创建 ArrivalHouse3 实例
                AssignHouse1 assignHouse1 = new AssignHouse1();
                // 调用 ArrivalHouse3 实例的 start() 方法显示新的场景
                try {
                    assignHouse1.start(new Stage());
                } catch (Exception e) {
                    e.printStackTrace();
                }
                // 关闭当前场景
                stage.close();
            }
        });

        int[] properties = Game.property;


        TextField textField0 = new TextField();
        textField0.setPrefWidth(50);
        textField0.setText(String.valueOf(properties[0]));
        textField0.setStyle(" -fx-translate-x: 250; -fx-translate-y:-112;-fx-font-size: 30px; -fx-text-fill: #e7c254; -fx-font-family:Courier New;-fx-background-color: transparent; -fx-border-color: transparent;");

        TextField textField1 = new TextField();
        textField1.setPrefWidth(50);
        textField1.setText(String.valueOf(properties[1]));
        textField1.setStyle(" -fx-translate-x: 250; -fx-translate-y:-76;-fx-font-size: 30px; -fx-text-fill: #e7c254; -fx-font-family:Courier New;-fx-background-color: transparent; -fx-border-color: transparent;");

        TextField textField2 = new TextField();
        textField2.setPrefWidth(50);
        if (Game.wizard.getHouse().toString().equals("Hufflepuff")){
            textField2.setText(String.valueOf(properties[2]-40));
        }else {
        textField2.setText(String.valueOf(properties[2]-20));}
        textField2.setStyle(" -fx-translate-x: 320; -fx-translate-y:-36;-fx-font-size: 30px; -fx-text-fill: #e7c254; -fx-font-family:Courier New;-fx-background-color: transparent; -fx-border-color: transparent;");

        TextField textField3 = new TextField();
        textField3.setPrefWidth(50);
        if (Game.wizard.getHouse().toString().equals("Slytherin")){
        textField3.setText(String.valueOf(properties[3]-10));}else{
            textField3.setText(String.valueOf(properties[3]));
        }
        textField3.setStyle(" -fx-translate-x: 320; -fx-translate-y:0;-fx-font-size: 30px; -fx-text-fill: #e7c254; -fx-font-family:Courier New;-fx-background-color: transparent; -fx-border-color: transparent;");

        TextField textField4 = new TextField();
        textField4.setPrefWidth(50);
        if (Game.wizard.getHouse().toString().equals("Gryffindor")){
        textField4.setText(String.valueOf(properties[4]-10));}else {
            textField4.setText(String.valueOf(properties[4]));
        }
        textField4.setStyle(" -fx-translate-x: 320; -fx-translate-y:38;-fx-font-size: 30px; -fx-text-fill: #e7c254; -fx-font-family:Courier New;-fx-background-color: transparent; -fx-border-color: transparent;");

        TextField textField5 = new TextField();
        textField5.setPrefWidth(50);
        if (Game.wizard.getHouse().toString().equals("Ravenclaw")){
        textField5.setText(String.valueOf(properties[5]-10));}else {
            textField5.setText(String.valueOf(properties[5]));
        }
        textField5.setStyle(" -fx-translate-x: 320; -fx-translate-y:76;-fx-font-size: 30px; -fx-text-fill: #e7c254; -fx-font-family:Courier New;-fx-background-color: transparent; -fx-border-color: transparent;");

        // 创建 StackPane 布局容器，并将图像和按钮添加到其中
        StackPane stackPane = new StackPane(imageView, buttonCreate,textField0,textField1,textField2,textField3,textField4,textField5);

        // 创建场景并显示
        Scene scene = new Scene(stackPane, 1120, 700);
        stage.setScene(scene);
        stage.show();
    }



}
