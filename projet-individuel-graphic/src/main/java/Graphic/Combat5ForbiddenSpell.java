package Graphic;

import Enemy.Enemy;
import Enemy.Boss;
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

public class Combat5ForbiddenSpell extends Application{

    private ImageView imageView;
    private Image CombatForbiddenSpell1;
    private Image CombatForbiddenSpell2;
    private Image CombatForbiddenSpell3;
    private Image CombatForbiddenSpell4;
    private Image CombatForbiddenSpell5;
    private Image CombatForbiddenSpell6;
    private Image CombatForbiddenSpell7;
    private Image CombatForbiddenSpell8;
    private Image CombatForbiddenSpell9;

    private Image BOSS;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Harry Potter at home V1.0");

        //Game.combat(Enemy.gargoyle);

        int n = Game.forbiddenSpells.size();


        // 加载默认图像

        InputStream input1 = getClass().getResourceAsStream("/image/CombatForbiddenSpell1.jpg");
        CombatForbiddenSpell1 = new Image(input1);

        InputStream input2 = getClass().getResourceAsStream("/image/CombatForbiddenSpell2.jpg");
        CombatForbiddenSpell2 = new Image(input2);

        InputStream input3 = getClass().getResourceAsStream("/image/CombatForbiddenSpell3.jpg");
        CombatForbiddenSpell3 = new Image(input3);

        InputStream input4 = getClass().getResourceAsStream("/image/CombatForbiddenSpell4.jpg");
        CombatForbiddenSpell4 = new Image(input4);

        InputStream input5 = getClass().getResourceAsStream("/image/CombatForbiddenSpell5.jpg");
        CombatForbiddenSpell5 = new Image(input5);

        InputStream input6 = getClass().getResourceAsStream("/image/CombatForbiddenSpell6.jpg");
        CombatForbiddenSpell6 = new Image(input6);

        InputStream input7 = getClass().getResourceAsStream("/image/CombatForbiddenSpell7.jpg");
        CombatForbiddenSpell7 = new Image(input7);

        InputStream input8 = getClass().getResourceAsStream("/image/CombatForbiddenSpell8.jpg");
        CombatForbiddenSpell8 = new Image(input8);

        InputStream input9 = getClass().getResourceAsStream("/image/CombatForbiddenSpell9.jpg");
        CombatForbiddenSpell9 = new Image(input9);


        InputStream input = getClass().getResourceAsStream("/image/Boss5.png");
        BOSS = new Image(input);
        ImageView imageView6 = new ImageView(BOSS);
        // 调整 imageView6 的位置
        imageView6.setTranslateX(320);
        imageView6.setTranslateY(-40);
        imageView6.setFitWidth(200);
        imageView6.setFitHeight(300);


        // 创建 Button 控件
        Button buttonCreate1 = new Button("");
        buttonCreate1.setPrefSize(215, 60);
        buttonCreate1.setTranslateY(-85);
        buttonCreate1.setTranslateX(-10);
        buttonCreate1.setOpacity(0);

        Button buttonCreate2 = new Button("");
        buttonCreate2.setPrefSize(215, 60);
        buttonCreate2.setTranslateY(-10);
        buttonCreate2.setTranslateX(-10);
        buttonCreate2.setOpacity(0);

        Button buttonCreate3 = new Button("");
        buttonCreate3.setPrefSize(215, 60);
        buttonCreate3.setTranslateY(65);
        buttonCreate3.setTranslateX(-10);
        buttonCreate3.setOpacity(0);


        switch (n){
            case 0:
                NoForbiddenSpell noForbiddenSpell = new NoForbiddenSpell();
                // 调用 ArrivalHouse3 实例的 start() 方法显示新的场景
                try {
                    noForbiddenSpell.start(new Stage());
                } catch (Exception e) {
                    e.printStackTrace();
                }
                // 关闭当前场景
                stage.close();
                break;
            case 1:
                imageView = new ImageView(CombatForbiddenSpell1);

                // 添加鼠标移入事件监听器
                buttonCreate1.setOnMouseEntered(event -> {
                    imageView.setImage(CombatForbiddenSpell2);
                });

                // 添加鼠标移出事件监听器
                buttonCreate1.setOnMouseExited(event -> {
                    imageView.setImage(CombatForbiddenSpell1);
                });

                break;
            case 2:
                imageView = new ImageView(CombatForbiddenSpell3);

                // 添加鼠标移入事件监听器
                buttonCreate1.setOnMouseEntered(event -> {
                    imageView.setImage(CombatForbiddenSpell4);
                });

                // 添加鼠标移出事件监听器
                buttonCreate1.setOnMouseExited(event -> {
                    imageView.setImage(CombatForbiddenSpell3);
                });

                // 添加鼠标移入事件监听器
                buttonCreate2.setOnMouseEntered(event -> {
                    imageView.setImage(CombatForbiddenSpell5);
                });

                // 添加鼠标移出事件监听器
                buttonCreate2.setOnMouseExited(event -> {
                    imageView.setImage(CombatForbiddenSpell3);
                });

                break;
            case 3:
                imageView = new ImageView(CombatForbiddenSpell6);

                // 添加鼠标移入事件监听器
                buttonCreate1.setOnMouseEntered(event -> {
                    imageView.setImage(CombatForbiddenSpell7);
                });

                // 添加鼠标移出事件监听器
                buttonCreate1.setOnMouseExited(event -> {
                    imageView.setImage(CombatForbiddenSpell6);
                });

                // 添加鼠标移入事件监听器
                buttonCreate2.setOnMouseEntered(event -> {
                    imageView.setImage(CombatForbiddenSpell8);
                });

                // 添加鼠标移出事件监听器
                buttonCreate2.setOnMouseExited(event -> {
                    imageView.setImage(CombatForbiddenSpell6);
                });

                // 添加鼠标移入事件监听器
                buttonCreate3.setOnMouseEntered(event -> {
                    imageView.setImage(CombatForbiddenSpell9);
                });

                // 添加鼠标移出事件监听器
                buttonCreate3.setOnMouseExited(event -> {
                    imageView.setImage(CombatForbiddenSpell6);
                });

                break;

            default:

                break;
        }

        TextField textField0 = new TextField();
        textField0.setText(String.valueOf(Game.property[1]));
        textField0.setMaxWidth(120);
        textField0.setStyle(" -fx-translate-x:-480; -fx-translate-y:-130;-fx-font-size: 25px; -fx-text-fill: #e7c254; -fx-font-family:Courier New;-fx-background-color: transparent; -fx-border-color: transparent;");

        TextField textField1 = new TextField();
        textField1.setText("1000");
        textField1.setMaxWidth(120);
        textField1.setStyle(" -fx-translate-x: -480; -fx-translate-y:-10;-fx-font-size: 25px; -fx-text-fill: #e7c254; -fx-font-family:Courier New;-fx-background-color:transparent; -fx-border-color: transparent;");

        TextField textField2 = new TextField();
        textField2.setText(String.valueOf(Boss.doloresOmbrage.getHP()));
        textField2.setMaxWidth(120);
        textField2.setStyle(" -fx-translate-x: 515; -fx-translate-y:-130;-fx-font-size: 25px; -fx-text-fill: #e7c254; -fx-font-family:Courier New;-fx-background-color: transparent; -fx-border-color: transparent;");

        TextField textField3 = new TextField();
        textField3.setText("600");
        textField3.setMaxWidth(120);
        textField3.setStyle(" -fx-translate-x: 515; -fx-translate-y:-10;-fx-font-size: 25px; -fx-text-fill: #e7c254; -fx-font-family:Courier New;-fx-background-color: transparent; -fx-border-color: transparent;");

<<<<<<< HEAD
        StackPane stackPane = new StackPane(imageView, imageView6, buttonCreate1, buttonCreate2, buttonCreate3, textField0, textField1, textField2, textField3);
=======
        StackPane stackPane = new StackPane(imageView, buttonCreate1, buttonCreate2, buttonCreate3, textField0, textField1, textField2, textField3);
>>>>>>> c31add4f7965e31170118d219d5ddf7199c9d4cc


        buttonCreate1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                // 创建 ArrivalHouse3 实例
                Combat5ForbiddenSpell1 combatForbiddenSpell1 = new Combat5ForbiddenSpell1();
                // 调用 ArrivalHouse3 实例的 start() 方法显示新的场景
                try {
                    combatForbiddenSpell1.start(new Stage());
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
                Combat5ForbiddenSpell2 combatForbiddenSpell2 = new Combat5ForbiddenSpell2();
                // 调用 ArrivalHouse3 实例的 start() 方法显示新的场景
                try {
                    combatForbiddenSpell2.start(new Stage());
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
                Combat5ForbiddenSpell3 combatForbiddenSpell3 = new Combat5ForbiddenSpell3();
                // 调用 ArrivalHouse3 实例的 start() 方法显示新的场景
                try {
                    combatForbiddenSpell3.start(new Stage());
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
