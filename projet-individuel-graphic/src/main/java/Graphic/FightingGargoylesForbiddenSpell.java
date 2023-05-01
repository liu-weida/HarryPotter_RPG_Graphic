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

public class FightingGargoylesForbiddenSpell extends Application{

    private ImageView imageView;
    private Image FightingGargoylesForbiddenSpell1;
    private Image FightingGargoylesForbiddenSpell2;
    private Image FightingGargoylesForbiddenSpell3;
    private Image FightingGargoylesForbiddenSpell4;
    private Image FightingGargoylesForbiddenSpell5;
    private Image FightingGargoylesForbiddenSpell6;
    private Image FightingGargoylesForbiddenSpell7;
    private Image FightingGargoylesForbiddenSpell8;
    private Image FightingGargoylesForbiddenSpell9;


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Harry Potter at home V1.0");

        //Game.combat(Enemy.gargoyle);

        int n = Game.forbiddenSpells.size();


        // 加载默认图像

        InputStream input1 = getClass().getResourceAsStream("/image/FightingGargoylesForbiddenSpel1.jpg");
        FightingGargoylesForbiddenSpell1 = new Image(input1);

        InputStream input2 = getClass().getResourceAsStream("/image/FightingGargoylesForbiddenSpel2.jpg");
        FightingGargoylesForbiddenSpell2 = new Image(input2);

        InputStream input3 = getClass().getResourceAsStream("/image/FightingGargoylesForbiddenSpel3.jpg");
        FightingGargoylesForbiddenSpell3 = new Image(input3);

        InputStream input4 = getClass().getResourceAsStream("/image/FightingGargoylesForbiddenSpel4.jpg");
        FightingGargoylesForbiddenSpell4 = new Image(input4);

        InputStream input5 = getClass().getResourceAsStream("/image/FightingGargoylesForbiddenSpel5.jpg");
        FightingGargoylesForbiddenSpell5 = new Image(input5);

        InputStream input6 = getClass().getResourceAsStream("/image/FightingGargoylesForbiddenSpel6.jpg");
        FightingGargoylesForbiddenSpell6 = new Image(input6);

        InputStream input7 = getClass().getResourceAsStream("/image/FightingGargoylesForbiddenSpel7.jpg");
        FightingGargoylesForbiddenSpell7 = new Image(input7);

        InputStream input8 = getClass().getResourceAsStream("/image/FightingGargoylesForbiddenSpel8.jpg");
        FightingGargoylesForbiddenSpell8 = new Image(input8);

        InputStream input9 = getClass().getResourceAsStream("/image/FightingGargoylesForbiddenSpel9.jpg");
        FightingGargoylesForbiddenSpell9 = new Image(input9);




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
                imageView = new ImageView(FightingGargoylesForbiddenSpell1);

                // 添加鼠标移入事件监听器
                buttonCreate1.setOnMouseEntered(event -> {
                    imageView.setImage(FightingGargoylesForbiddenSpell2);
                });

                // 添加鼠标移出事件监听器
                buttonCreate1.setOnMouseExited(event -> {
                    imageView.setImage(FightingGargoylesForbiddenSpell1);
                });

                break;
            case 2:
                imageView = new ImageView(FightingGargoylesForbiddenSpell3);

                // 添加鼠标移入事件监听器
                buttonCreate1.setOnMouseEntered(event -> {
                    imageView.setImage(FightingGargoylesForbiddenSpell4);
                });

                // 添加鼠标移出事件监听器
                buttonCreate1.setOnMouseExited(event -> {
                    imageView.setImage(FightingGargoylesForbiddenSpell3);
                });

                // 添加鼠标移入事件监听器
                buttonCreate2.setOnMouseEntered(event -> {
                    imageView.setImage(FightingGargoylesForbiddenSpell5);
                });

                // 添加鼠标移出事件监听器
                buttonCreate2.setOnMouseExited(event -> {
                    imageView.setImage(FightingGargoylesForbiddenSpell3);
                });

                break;
            case 3:
                imageView = new ImageView(FightingGargoylesForbiddenSpell6);

                // 添加鼠标移入事件监听器
                buttonCreate1.setOnMouseEntered(event -> {
                    imageView.setImage(FightingGargoylesForbiddenSpell7);
                });

                // 添加鼠标移出事件监听器
                buttonCreate1.setOnMouseExited(event -> {
                    imageView.setImage(FightingGargoylesForbiddenSpell6);
                });

                // 添加鼠标移入事件监听器
                buttonCreate2.setOnMouseEntered(event -> {
                    imageView.setImage(FightingGargoylesForbiddenSpell8);
                });

                // 添加鼠标移出事件监听器
                buttonCreate2.setOnMouseExited(event -> {
                    imageView.setImage(FightingGargoylesForbiddenSpell6);
                });

                // 添加鼠标移入事件监听器
                buttonCreate3.setOnMouseEntered(event -> {
                    imageView.setImage(FightingGargoylesForbiddenSpell9);
                });

                // 添加鼠标移出事件监听器
                buttonCreate3.setOnMouseExited(event -> {
                    imageView.setImage(FightingGargoylesForbiddenSpell6);
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
        textField2.setText(String.valueOf(Enemy.gargoyle.getHP()));
        textField2.setMaxWidth(120);
        textField2.setStyle(" -fx-translate-x: 515; -fx-translate-y:-130;-fx-font-size: 25px; -fx-text-fill: #e7c254; -fx-font-family:Courier New;-fx-background-color: transparent; -fx-border-color: transparent;");

        TextField textField3 = new TextField();
        textField3.setText("100");
        textField3.setMaxWidth(120);
        textField3.setStyle(" -fx-translate-x: 515; -fx-translate-y:-10;-fx-font-size: 25px; -fx-text-fill: #e7c254; -fx-font-family:Courier New;-fx-background-color: transparent; -fx-border-color: transparent;");

        StackPane stackPane = new StackPane(imageView, buttonCreate1, buttonCreate2, buttonCreate3, textField0, textField1, textField2, textField3);


        buttonCreate1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                // 创建 ArrivalHouse3 实例
                FightingGargoylesForbiddenSpell01 fightingGargoylesSpell01 = new FightingGargoylesForbiddenSpell01();
                // 调用 ArrivalHouse3 实例的 start() 方法显示新的场景
                try {
                    fightingGargoylesSpell01.start(new Stage());
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
                FightingGargoylesForbiddenSpell02 fightingGargoylesSpell02 = new FightingGargoylesForbiddenSpell02();
                // 调用 ArrivalHouse3 实例的 start() 方法显示新的场景
                try {
                    fightingGargoylesSpell02.start(new Stage());
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
                FightingGargoylesForbiddenSpell03 fightingGargoylesSpell03 = new FightingGargoylesForbiddenSpell03();
                // 调用 ArrivalHouse3 实例的 start() 方法显示新的场景
                try {
                    fightingGargoylesSpell03.start(new Stage());
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
