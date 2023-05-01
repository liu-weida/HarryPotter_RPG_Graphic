package Graphic;

import Enemy.Enemy;
import Game.Game;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.event.ActionEvent;

import javafx.event.EventHandler;

import java.io.InputStream;

public class TrainingGround2 extends Application{

    private ImageView imageView;
    private Image TrainingGround1;
    private Image TrainingGround2;
    private Image TrainingGround3;
    private Image TrainingGround4;
    private Image TrainingGround5;
    private Image TrainingGround6;


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Harry Potter at home V1.0");


        // 加载默认图像

        InputStream input1 = getClass().getResourceAsStream("/image/TrainingGround1.jpg");
        TrainingGround1 = new Image(input1);

        InputStream input2 = getClass().getResourceAsStream("/image/TrainingGround2.jpg");
        TrainingGround2 = new Image(input2);

        InputStream input3 = getClass().getResourceAsStream("/image/TrainingGround3.jpg");
        TrainingGround3 = new Image(input3);

        InputStream input4 = getClass().getResourceAsStream("/image/TrainingGround4.jpg");
        TrainingGround4 = new Image(input4);

        InputStream input5 = getClass().getResourceAsStream("/image/TrainingGround5.jpg");
        TrainingGround5 = new Image(input5);

        InputStream input6 = getClass().getResourceAsStream("/image/TrainingGround6.jpg");
        TrainingGround6 = new Image(input6);



        // 创建 ImageView 控件并设置默认图像
        imageView = new ImageView(TrainingGround1);


        // 创建 Button 控件
        Button buttonCreate1 = new Button("");
        buttonCreate1.setPrefSize(215, 60);
        buttonCreate1.setTranslateY(-120);
        buttonCreate1.setTranslateX(0);
        buttonCreate1.setOpacity(0);

        Button buttonCreate2 = new Button("");
        buttonCreate2.setPrefSize(215, 60);
        buttonCreate2.setTranslateY(-30);
        buttonCreate2.setTranslateX(0);
        buttonCreate2.setOpacity(0);

        Button buttonCreate3 = new Button("");
        buttonCreate3.setPrefSize(215, 60);
        buttonCreate3.setTranslateY(60);
        buttonCreate3.setTranslateX(0);
        buttonCreate3.setOpacity(0);

        Button buttonCreate4 = new Button("");
        buttonCreate4.setPrefSize(215, 60);
        buttonCreate4.setTranslateY(150);
        buttonCreate4.setTranslateX(0);
        buttonCreate4.setOpacity(0);

        Button buttonCreate5 = new Button("");
        buttonCreate5.setPrefSize(215, 60);
        buttonCreate5.setTranslateY(240);
        buttonCreate5.setTranslateX(0);
        buttonCreate5.setOpacity(0);

        TextField textField0 = new TextField();
        textField0.setText(String.valueOf(Game.property[1]));
        textField0.setMaxWidth(120);
        textField0.setStyle(" -fx-translate-x:-480; -fx-translate-y:-130;-fx-font-size: 25px; -fx-text-fill: #e7c254; -fx-font-family:Courier New;-fx-background-color: transparent; -fx-border-color: transparent;");

        TextField textField1 = new TextField();
        textField1.setText("1000");
        textField1.setMaxWidth(120);
        textField1.setStyle(" -fx-translate-x: -480; -fx-translate-y:-10;-fx-font-size: 25px; -fx-text-fill: #e7c254; -fx-font-family:Courier New;-fx-background-color:transparent; -fx-border-color: transparent;");

        TextField textField2 = new TextField();
        textField2.setText(String.valueOf(Enemy.gargoyle.getHP()));
        textField2.setMaxWidth(120);
        textField2.setStyle(" -fx-translate-x: 515; -fx-translate-y:-130;-fx-font-size: 25px; -fx-text-fill: #e7c254; -fx-font-family:Courier New;-fx-background-color: transparent; -fx-border-color: transparent;");

        TextField textField3 = new TextField();
        textField3.setText("100");
        textField3.setMaxWidth(120);
        textField3.setStyle(" -fx-translate-x: 515; -fx-translate-y:-10;-fx-font-size: 25px; -fx-text-fill: #e7c254; -fx-font-family:Courier New;-fx-background-color: transparent; -fx-border-color: transparent;");


        // 创建 StackPane 布局容器，并将图像和按钮添加到其中
        StackPane stackPane = new StackPane(imageView, buttonCreate1, buttonCreate2, buttonCreate3, buttonCreate4, buttonCreate5,textField0,textField1,textField2,textField3);

        // 添加鼠标移入事件监听器
        buttonCreate1.setOnMouseEntered(event -> {
            imageView.setImage(TrainingGround2);
        });

        // 添加鼠标移出事件监听器
        buttonCreate1.setOnMouseExited(event -> {
            imageView.setImage(TrainingGround1);
        });

        // 添加鼠标移入事件监听器
        buttonCreate2.setOnMouseEntered(event -> {
            imageView.setImage(TrainingGround3);
        });

        // 添加鼠标移出事件监听器
        buttonCreate2.setOnMouseExited(event -> {
            imageView.setImage(TrainingGround1);
        });

        // 添加鼠标移入事件监听器
        buttonCreate3.setOnMouseEntered(event -> {
            imageView.setImage(TrainingGround4);
        });

        // 添加鼠标移出事件监听器
        buttonCreate3.setOnMouseExited(event -> {
            imageView.setImage(TrainingGround1);
        });

        // 添加鼠标移入事件监听器
        buttonCreate4.setOnMouseEntered(event -> {
            imageView.setImage(TrainingGround5);
        });

        // 添加鼠标移出事件监听器
        buttonCreate4.setOnMouseExited(event -> {
            imageView.setImage(TrainingGround1);
        });

        // 添加鼠标移入事件监听器
        buttonCreate5.setOnMouseEntered(event -> {
            imageView.setImage(TrainingGround6);
        });

        // 添加鼠标移出事件监听器
        buttonCreate5.setOnMouseExited(event -> {
            imageView.setImage(TrainingGround1);
        });



        buttonCreate1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                // 创建 ArrivalHouse3 实例
                FightingGargoylesSpell fightingGargoylesSpell = new FightingGargoylesSpell();
                // 调用 ArrivalHouse3 实例的 start() 方法显示新的场景
                try {
                    fightingGargoylesSpell.start(new Stage());
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
                FightingGargoylesPotion fightingGargoylesPotion = new FightingGargoylesPotion();
                // 调用 ArrivalHouse3 实例的 start() 方法显示新的场景
                try {
                    fightingGargoylesPotion.start(new Stage());
                } catch (Exception e) {
                    e.printStackTrace();
                }
                // 关闭当前场景
                stage.close();
            }
        });

        buttonCreate3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                // 创建 ArrivalHouse3 实例
                FightingGargoylesForbiddenSpell fightingGargoylesForbiddenSpell = new FightingGargoylesForbiddenSpell();
                // 调用 ArrivalHouse3 实例的 start() 方法显示新的场景
                try {
                    fightingGargoylesForbiddenSpell.start(new Stage());
                } catch (Exception e) {
                    e.printStackTrace();
                }
                // 关闭当前场景
                stage.close();
            }
        });

        buttonCreate4.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                // 创建 ArrivalHouse3 实例
                FightingGargoylesDefense fightingGargoylesDefense = new FightingGargoylesDefense();
                // 调用 ArrivalHouse3 实例的 start() 方法显示新的场景
                try {
                    fightingGargoylesDefense.start(new Stage());
                } catch (Exception e) {
                    e.printStackTrace();
                }
                // 关闭当前场景
                stage.close();
            }
        });

        buttonCreate5.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                // 创建 ArrivalHouse3 实例
                Menu menu = new Menu();
                // 调用 ArrivalHouse3 实例的 start() 方法显示新的场景
                try {
                    menu.start(new Stage());
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
