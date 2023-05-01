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

public class AssignWand2 extends Application{

    private ImageView imageView;
    private Image AssignWand1;
    private Image AssignWand2;


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Harry Potter at home V1.0");

        // 加载默认图像

        InputStream input1 = getClass().getResourceAsStream("/image/WandsPets3.jpg");
        AssignWand1 = new Image(input1);

        InputStream input2 = getClass().getResourceAsStream("/image/WandsPets4.jpg");
        AssignWand2 = new Image(input2);


        // 创建 ImageView 控件并设置默认图像
        imageView = new ImageView(AssignWand1);


        // 创建 Button 控件
        Button buttonCreate = new Button("");
        buttonCreate.setPrefSize(400, 100);
        buttonCreate.setTranslateY(235);
        buttonCreate.setTranslateX(0);
        buttonCreate.setOpacity(0);

        TextField textField1 = new TextField("Holly wood" +"    "+ "11 inches");
        TextField textField2 = new TextField("Phoenix feather");
        TextField textField3 = new TextField("Wand's gain:");
        TextField textField4 = new TextField("Attack +5");
        TextField textField5 = new TextField("Defense +5");
        textField1.setStyle(" -fx-translate-x: 630; -fx-translate-y:-60;-fx-font-size: 30px; -fx-text-fill: #e7c254; -fx-font-family:Courier New;-fx-background-color: transparent; -fx-border-color: transparent;");
        textField2.setStyle(" -fx-translate-x: 680; -fx-translate-y:-20;-fx-font-size: 30px; -fx-text-fill: #e7c254; -fx-font-family:Courier New;-fx-background-color: transparent; -fx-border-color: transparent;");
        textField3.setStyle(" -fx-translate-x: 680; -fx-translate-y:40;-fx-font-size: 30px; -fx-text-fill: #e7c254; -fx-font-family:Courier New;-fx-background-color: transparent; -fx-border-color: transparent;");
        textField4.setStyle(" -fx-translate-x: 700; -fx-translate-y:80;-fx-font-size: 30px; -fx-text-fill: #e7c254; -fx-font-family:Courier New;-fx-background-color: transparent; -fx-border-color: transparent;");
        textField5.setStyle(" -fx-translate-x: 690; -fx-translate-y:120;-fx-font-size: 30px; -fx-text-fill: #e7c254; -fx-font-family:Courier New;-fx-background-color: transparent; -fx-border-color: transparent;");


        // 创建 StackPane 布局容器，并将图像和按钮添加到其中
        StackPane stackPane = new StackPane(imageView, buttonCreate,textField1,textField2,textField3,textField4,textField5);

        // 添加鼠标移入事件监听器
        buttonCreate.setOnMouseEntered(event -> {
            imageView.setImage(AssignWand2);
        });

        // 添加鼠标移出事件监听器
        buttonCreate.setOnMouseExited(event -> {
            imageView.setImage(AssignWand1);
        });

        buttonCreate.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                // 创建 ArrivalHouse3 实例
                AssignPet1 assignPet1 = new AssignPet1();
                // 调用 ArrivalHouse3 实例的 start() 方法显示新的场景
                try {
                    assignPet1.start(new Stage());
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
