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

public class FightingGargoylesSpell extends Application{

    private ImageView imageView;
    private Image FightingGargoylesSpell1;
    private Image FightingGargoylesSpell2;
    private Image FightingGargoylesSpell3;
    private Image FightingGargoylesSpell4;
    private Image FightingGargoylesSpell5;
    private Image FightingGargoylesSpell6;
    private Image FightingGargoylesSpell7;
    private Image FightingGargoylesSpell8;
    private Image FightingGargoylesSpell9;
    private Image FightingGargoylesSpell10;
    private Image FightingGargoylesSpell11;
    private Image FightingGargoylesSpell12;
    private Image FightingGargoylesSpell13;
    private Image FightingGargoylesSpell14;
    private Image FightingGargoylesSpell15;
    private Image FightingGargoylesSpell16;
    private Image FightingGargoylesSpell17;
    private Image FightingGargoylesSpell18;
    private Image FightingGargoylesSpell19;
    private Image FightingGargoylesSpell20;
    private Image FightingGargoylesSpell21;
    private Image FightingGargoylesSpell22;
    private Image FightingGargoylesSpell23;
    private Image FightingGargoylesSpell24;
    private Image FightingGargoylesSpell25;
    private Image FightingGargoylesSpell26;
    private Image FightingGargoylesSpell27;
    private Image FightingGargoylesSpell28;
    private Image FightingGargoylesSpell29;
    private Image FightingGargoylesSpell30;
    private Image FightingGargoylesSpell31;
    private Image FightingGargoylesSpell32;
    private Image FightingGargoylesSpell33;
    private Image FightingGargoylesSpell34;
    private Image FightingGargoylesSpell35;
    private Image FightingGargoylesSpell36;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Harry Potter at home V1.0");

        //Game.combat(Enemy.gargoyle);

        int n = Game.spells.size();

        //int n = 5;

        // 加载默认图像

        InputStream input1 = getClass().getResourceAsStream("/image/FightingGargoylesSpell1.jpg");
        FightingGargoylesSpell1 = new Image(input1);

        InputStream input2 = getClass().getResourceAsStream("/image/FightingGargoylesSpell2.jpg");
        FightingGargoylesSpell2 = new Image(input2);

        InputStream input3 = getClass().getResourceAsStream("/image/FightingGargoylesSpell3.jpg");
        FightingGargoylesSpell3 = new Image(input3);

        InputStream input4 = getClass().getResourceAsStream("/image/FightingGargoylesSpell4.jpg");
        FightingGargoylesSpell4 = new Image(input4);

        InputStream input5 = getClass().getResourceAsStream("/image/FightingGargoylesSpell5.jpg");
        FightingGargoylesSpell5 = new Image(input5);

        InputStream input6 = getClass().getResourceAsStream("/image/FightingGargoylesSpell6.jpg");
        FightingGargoylesSpell6 = new Image(input6);

        InputStream input7 = getClass().getResourceAsStream("/image/FightingGargoylesSpell7.jpg");
        FightingGargoylesSpell7 = new Image(input7);

        InputStream input8 = getClass().getResourceAsStream("/image/FightingGargoylesSpell8.jpg");
        FightingGargoylesSpell8 = new Image(input8);

        InputStream input9 = getClass().getResourceAsStream("/image/FightingGargoylesSpell9.jpg");
        FightingGargoylesSpell9 = new Image(input9);

        InputStream input10 = getClass().getResourceAsStream("/image/FightingGargoylesSpell10.jpg");
        FightingGargoylesSpell10 = new Image(input10);

        InputStream input11 = getClass().getResourceAsStream("/image/FightingGargoylesSpell11.jpg");
        FightingGargoylesSpell11 = new Image(input11);

        InputStream input12 = getClass().getResourceAsStream("/image/FightingGargoylesSpell12.jpg");
        FightingGargoylesSpell12 = new Image(input12);

        InputStream input13 = getClass().getResourceAsStream("/image/FightingGargoylesSpell13.jpg");
        FightingGargoylesSpell13 = new Image(input13);

        InputStream input14 = getClass().getResourceAsStream("/image/FightingGargoylesSpell14.jpg");
        FightingGargoylesSpell14 = new Image(input14);

        InputStream input15 = getClass().getResourceAsStream("/image/FightingGargoylesSpell15.jpg");
        FightingGargoylesSpell15 = new Image(input15);

        InputStream input16 = getClass().getResourceAsStream("/image/FightingGargoylesSpell16.jpg");
        FightingGargoylesSpell16 = new Image(input16);

        InputStream input17 = getClass().getResourceAsStream("/image/FightingGargoylesSpell17.jpg");
        FightingGargoylesSpell17 = new Image(input17);

        InputStream input18 = getClass().getResourceAsStream("/image/FightingGargoylesSpell18.jpg");
        FightingGargoylesSpell18 = new Image(input18);

        InputStream input19 = getClass().getResourceAsStream("/image/FightingGargoylesSpell19.jpg");
        FightingGargoylesSpell19 = new Image(input19);

        InputStream input20 = getClass().getResourceAsStream("/image/FightingGargoylesSpell20.jpg");
        FightingGargoylesSpell20 = new Image(input20);

        InputStream input21 = getClass().getResourceAsStream("/image/FightingGargoylesSpell21.jpg");
        FightingGargoylesSpell21 = new Image(input21);

        InputStream input22 = getClass().getResourceAsStream("/image/FightingGargoylesSpell22.jpg");
        FightingGargoylesSpell22 = new Image(input22);

        InputStream input23 = getClass().getResourceAsStream("/image/FightingGargoylesSpell23.jpg");
        FightingGargoylesSpell23 = new Image(input23);

        InputStream input24 = getClass().getResourceAsStream("/image/FightingGargoylesSpell24.jpg");
        FightingGargoylesSpell24 = new Image(input24);

        InputStream input25 = getClass().getResourceAsStream("/image/FightingGargoylesSpell25.jpg");
        FightingGargoylesSpell25 = new Image(input25);

        InputStream input26 = getClass().getResourceAsStream("/image/FightingGargoylesSpell26.jpg");
        FightingGargoylesSpell26 = new Image(input26);

        InputStream input27 = getClass().getResourceAsStream("/image/FightingGargoylesSpell27.jpg");
        FightingGargoylesSpell27 = new Image(input27);

        InputStream input28 = getClass().getResourceAsStream("/image/FightingGargoylesSpell28.jpg");
        FightingGargoylesSpell28 = new Image(input28);

        InputStream input29 = getClass().getResourceAsStream("/image/FightingGargoylesSpell29.jpg");
        FightingGargoylesSpell29 = new Image(input29);

        InputStream input30 = getClass().getResourceAsStream("/image/FightingGargoylesSpell30.jpg");
        FightingGargoylesSpell30 = new Image(input30);

        InputStream input31 = getClass().getResourceAsStream("/image/FightingGargoylesSpell31.jpg");
        FightingGargoylesSpell31 = new Image(input31);

        InputStream input32 = getClass().getResourceAsStream("/image/FightingGargoylesSpell32.jpg");
        FightingGargoylesSpell32 = new Image(input32);

        InputStream input33 = getClass().getResourceAsStream("/image/FightingGargoylesSpell33.jpg");
        FightingGargoylesSpell33 = new Image(input33);

        InputStream input34 = getClass().getResourceAsStream("/image/FightingGargoylesSpell34.jpg");
        FightingGargoylesSpell34 = new Image(input34);

        InputStream input35 = getClass().getResourceAsStream("/image/FightingGargoylesSpell35.jpg");
        FightingGargoylesSpell35 = new Image(input35);

        InputStream input36 = getClass().getResourceAsStream("/image/FightingGargoylesSpell36.jpg");
        FightingGargoylesSpell36 = new Image(input36);




        // 创建 Button 控件
        Button buttonCreate1 = new Button("");
        buttonCreate1.setPrefSize(215, 60);
        buttonCreate1.setTranslateY(-195);
        buttonCreate1.setTranslateX(0);
        buttonCreate1.setOpacity(0);

        Button buttonCreate2 = new Button("");
        buttonCreate2.setPrefSize(215, 60);
        buttonCreate2.setTranslateY(-120);
        buttonCreate2.setTranslateX(0);
        buttonCreate2.setOpacity(0);

        Button buttonCreate3 = new Button("");
        buttonCreate3.setPrefSize(215, 60);
        buttonCreate3.setTranslateY(-45);
        buttonCreate3.setTranslateX(0);
        buttonCreate3.setOpacity(0);

        Button buttonCreate4 = new Button("");
        buttonCreate4.setPrefSize(215, 60);
        buttonCreate4.setTranslateY(30);
        buttonCreate4.setTranslateX(0);
        buttonCreate4.setOpacity(0);

        Button buttonCreate5 = new Button("");
        buttonCreate5.setPrefSize(215, 60);
        buttonCreate5.setTranslateY(105);
        buttonCreate5.setTranslateX(0);
        buttonCreate5.setOpacity(0);

        Button buttonCreate6 = new Button("");
        buttonCreate6.setPrefSize(215, 60);
        buttonCreate6.setTranslateY(185);
        buttonCreate6.setTranslateX(0);
        buttonCreate6.setOpacity(0);

        Button buttonCreate7 = new Button("");
        buttonCreate7.setPrefSize(215, 60);
        buttonCreate7.setTranslateY(260);
        buttonCreate7.setTranslateX(0);
        buttonCreate7.setOpacity(0);

        switch (n){
            case 0:
                NoSpell noSpell = new NoSpell();
                // 调用 ArrivalHouse3 实例的 start() 方法显示新的场景
                try {
                    noSpell.start(new Stage());
                } catch (Exception e) {
                    e.printStackTrace();
                }
                // 关闭当前场景
                stage.close();
                break;
            case 1:
                imageView = new ImageView(FightingGargoylesSpell2);

                // 添加鼠标移入事件监听器
                buttonCreate1.setOnMouseEntered(event -> {
                    imageView.setImage(FightingGargoylesSpell3);
                });

                // 添加鼠标移出事件监听器
                buttonCreate1.setOnMouseExited(event -> {
                    imageView.setImage(FightingGargoylesSpell2);
                });

                break;
            case 2:
                imageView = new ImageView(FightingGargoylesSpell4);

                // 添加鼠标移入事件监听器
                buttonCreate1.setOnMouseEntered(event -> {
                    imageView.setImage(FightingGargoylesSpell5);
                });

                // 添加鼠标移出事件监听器
                buttonCreate1.setOnMouseExited(event -> {
                    imageView.setImage(FightingGargoylesSpell4);
                });

                // 添加鼠标移入事件监听器
                buttonCreate2.setOnMouseEntered(event -> {
                    imageView.setImage(FightingGargoylesSpell6);
                });

                // 添加鼠标移出事件监听器
                buttonCreate2.setOnMouseExited(event -> {
                    imageView.setImage(FightingGargoylesSpell4);
                });

                break;
            case 3:
                imageView = new ImageView(FightingGargoylesSpell7);

                // 添加鼠标移入事件监听器
                buttonCreate1.setOnMouseEntered(event -> {
                    imageView.setImage(FightingGargoylesSpell8);
                });

                // 添加鼠标移出事件监听器
                buttonCreate1.setOnMouseExited(event -> {
                    imageView.setImage(FightingGargoylesSpell7);
                });

                // 添加鼠标移入事件监听器
                buttonCreate2.setOnMouseEntered(event -> {
                    imageView.setImage(FightingGargoylesSpell9);
                });

                // 添加鼠标移出事件监听器
                buttonCreate2.setOnMouseExited(event -> {
                    imageView.setImage(FightingGargoylesSpell7);
                });

                // 添加鼠标移入事件监听器
                buttonCreate3.setOnMouseEntered(event -> {
                    imageView.setImage(FightingGargoylesSpell10);
                });

                // 添加鼠标移出事件监听器
                buttonCreate3.setOnMouseExited(event -> {
                    imageView.setImage(FightingGargoylesSpell7);
                });

                break;
            case 4:
                imageView = new ImageView(FightingGargoylesSpell11);

                // 添加鼠标移入事件监听器
                buttonCreate1.setOnMouseEntered(event -> {
                    imageView.setImage(FightingGargoylesSpell12);
                });

                // 添加鼠标移出事件监听器
                buttonCreate1.setOnMouseExited(event -> {
                    imageView.setImage(FightingGargoylesSpell11);
                });

                // 添加鼠标移入事件监听器
                buttonCreate2.setOnMouseEntered(event -> {
                    imageView.setImage(FightingGargoylesSpell13);
                });

                // 添加鼠标移出事件监听器
                buttonCreate2.setOnMouseExited(event -> {
                    imageView.setImage(FightingGargoylesSpell11);
                });

                // 添加鼠标移入事件监听器
                buttonCreate3.setOnMouseEntered(event -> {
                    imageView.setImage(FightingGargoylesSpell14);
                });

                // 添加鼠标移出事件监听器
                buttonCreate3.setOnMouseExited(event -> {
                    imageView.setImage(FightingGargoylesSpell11);
                });

                // 添加鼠标移入事件监听器
                buttonCreate4.setOnMouseEntered(event -> {
                    imageView.setImage(FightingGargoylesSpell15);
                });

                // 添加鼠标移出事件监听器
                buttonCreate4.setOnMouseExited(event -> {
                    imageView.setImage(FightingGargoylesSpell11);
                });

                break;
            case 5:
                imageView = new ImageView(FightingGargoylesSpell16);

                // 添加鼠标移入事件监听器
                buttonCreate1.setOnMouseEntered(event -> {
                    imageView.setImage(FightingGargoylesSpell17);
                });

                // 添加鼠标移出事件监听器
                buttonCreate1.setOnMouseExited(event -> {
                    imageView.setImage(FightingGargoylesSpell16);
                });

                // 添加鼠标移入事件监听器
                buttonCreate2.setOnMouseEntered(event -> {
                    imageView.setImage(FightingGargoylesSpell18);
                });

                // 添加鼠标移出事件监听器
                buttonCreate2.setOnMouseExited(event -> {
                    imageView.setImage(FightingGargoylesSpell16);
                });

                // 添加鼠标移入事件监听器
                buttonCreate3.setOnMouseEntered(event -> {
                    imageView.setImage(FightingGargoylesSpell19);
                });

                // 添加鼠标移出事件监听器
                buttonCreate3.setOnMouseExited(event -> {
                    imageView.setImage(FightingGargoylesSpell16);
                });

                // 添加鼠标移入事件监听器
                buttonCreate4.setOnMouseEntered(event -> {
                    imageView.setImage(FightingGargoylesSpell20);
                });

                // 添加鼠标移出事件监听器
                buttonCreate4.setOnMouseExited(event -> {
                    imageView.setImage(FightingGargoylesSpell16);
                });

                // 添加鼠标移入事件监听器
                buttonCreate5.setOnMouseEntered(event -> {
                    imageView.setImage(FightingGargoylesSpell21);
                });

                // 添加鼠标移出事件监听器
                buttonCreate5.setOnMouseExited(event -> {
                    imageView.setImage(FightingGargoylesSpell16);
                });

                break;
            case 6:
                imageView = new ImageView(FightingGargoylesSpell22);

                // 添加鼠标移入事件监听器
                buttonCreate1.setOnMouseEntered(event -> {
                    imageView.setImage(FightingGargoylesSpell23);
                });

                // 添加鼠标移出事件监听器
                buttonCreate1.setOnMouseExited(event -> {
                    imageView.setImage(FightingGargoylesSpell22);
                });

                // 添加鼠标移入事件监听器
                buttonCreate2.setOnMouseEntered(event -> {
                    imageView.setImage(FightingGargoylesSpell24);
                });

                // 添加鼠标移出事件监听器
                buttonCreate2.setOnMouseExited(event -> {
                    imageView.setImage(FightingGargoylesSpell22);
                });

                // 添加鼠标移入事件监听器
                buttonCreate3.setOnMouseEntered(event -> {
                    imageView.setImage(FightingGargoylesSpell25);
                });

                // 添加鼠标移出事件监听器
                buttonCreate3.setOnMouseExited(event -> {
                    imageView.setImage(FightingGargoylesSpell22);
                });

                // 添加鼠标移入事件监听器
                buttonCreate4.setOnMouseEntered(event -> {
                    imageView.setImage(FightingGargoylesSpell26);
                });

                // 添加鼠标移出事件监听器
                buttonCreate4.setOnMouseExited(event -> {
                    imageView.setImage(FightingGargoylesSpell22);
                });

                // 添加鼠标移入事件监听器
                buttonCreate5.setOnMouseEntered(event -> {
                    imageView.setImage(FightingGargoylesSpell27);
                });

                // 添加鼠标移出事件监听器
                buttonCreate5.setOnMouseExited(event -> {
                    imageView.setImage(FightingGargoylesSpell22);
                });

                // 添加鼠标移入事件监听器
                buttonCreate6.setOnMouseEntered(event -> {
                    imageView.setImage(FightingGargoylesSpell28);
                });

                // 添加鼠标移出事件监听器
                buttonCreate6.setOnMouseExited(event -> {
                    imageView.setImage(FightingGargoylesSpell22);
                });

                break;
            case 7:

                imageView = new ImageView(FightingGargoylesSpell29);

                // 添加鼠标移入事件监听器
                buttonCreate1.setOnMouseEntered(event -> {
                    imageView.setImage(FightingGargoylesSpell30);
                });

                // 添加鼠标移出事件监听器
                buttonCreate1.setOnMouseExited(event -> {
                    imageView.setImage(FightingGargoylesSpell29);
                });

                // 添加鼠标移入事件监听器
                buttonCreate2.setOnMouseEntered(event -> {
                    imageView.setImage(FightingGargoylesSpell31);
                });

                // 添加鼠标移出事件监听器
                buttonCreate2.setOnMouseExited(event -> {
                    imageView.setImage(FightingGargoylesSpell29);
                });

                // 添加鼠标移入事件监听器
                buttonCreate3.setOnMouseEntered(event -> {
                    imageView.setImage(FightingGargoylesSpell32);
                });

                // 添加鼠标移出事件监听器
                buttonCreate3.setOnMouseExited(event -> {
                    imageView.setImage(FightingGargoylesSpell29);
                });

                // 添加鼠标移入事件监听器
                buttonCreate4.setOnMouseEntered(event -> {
                    imageView.setImage(FightingGargoylesSpell33);
                });

                // 添加鼠标移出事件监听器
                buttonCreate4.setOnMouseExited(event -> {
                    imageView.setImage(FightingGargoylesSpell29);
                });

                // 添加鼠标移入事件监听器
                buttonCreate5.setOnMouseEntered(event -> {
                    imageView.setImage(FightingGargoylesSpell34);
                });

                // 添加鼠标移出事件监听器
                buttonCreate5.setOnMouseExited(event -> {
                    imageView.setImage(FightingGargoylesSpell29);
                });

                // 添加鼠标移入事件监听器
                buttonCreate6.setOnMouseEntered(event -> {
                    imageView.setImage(FightingGargoylesSpell35);
                });

                // 添加鼠标移出事件监听器
                buttonCreate6.setOnMouseExited(event -> {
                    imageView.setImage(FightingGargoylesSpell29);
                });

                buttonCreate7.setOnMouseEntered(event -> {
                    imageView.setImage(FightingGargoylesSpell36);
                });

                // 添加鼠标移出事件监听器
                buttonCreate7.setOnMouseExited(event -> {
                    imageView.setImage(FightingGargoylesSpell29);
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


        StackPane stackPane = new StackPane(imageView, buttonCreate1, buttonCreate2, buttonCreate3, buttonCreate4, buttonCreate5, buttonCreate6, buttonCreate7,textField0,textField1,textField2,textField3);


        buttonCreate1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                // 创建 ArrivalHouse3 实例
                FightingGargoylesSpell01 fightingGargoylesSpell01 = new FightingGargoylesSpell01();
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
                FightingGargoylesSpell02 fightingGargoylesSpell02 = new FightingGargoylesSpell02();
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
                FightingGargoylesSpell03 fightingGargoylesSpell03 = new FightingGargoylesSpell03();
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

        buttonCreate4.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                // 创建 ArrivalHouse3 实例
                FightingGargoylesSpell04 fightingGargoylesSpell04 = new FightingGargoylesSpell04();
                // 调用 ArrivalHouse3 实例的 start() 方法显示新的场景
                try {
                    fightingGargoylesSpell04.start(new Stage());
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
                FightingGargoylesSpell05 fightingGargoylesSpell05 = new FightingGargoylesSpell05();
                // 调用 ArrivalHouse3 实例的 start() 方法显示新的场景
                try {
                    fightingGargoylesSpell05.start(new Stage());
                } catch (Exception e) {
                    e.printStackTrace();
                }
                // 关闭当前场景
                stage.close();
            }
        });

        buttonCreate6.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                // 创建 ArrivalHouse3 实例
                FightingGargoylesSpell06 fightingGargoylesSpell06 = new FightingGargoylesSpell06();
                // 调用 ArrivalHouse3 实例的 start() 方法显示新的场景
                try {
                    fightingGargoylesSpell06.start(new Stage());
                } catch (Exception e) {
                    e.printStackTrace();
                }
                // 关闭当前场景
                stage.close();
            }
        });

        buttonCreate7.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                // 创建 ArrivalHouse3 实例
                FightingGargoylesSpell07 fightingGargoylesSpell07 = new FightingGargoylesSpell07();
                // 调用 ArrivalHouse3 实例的 start() 方法显示新的场景
                try {
                    fightingGargoylesSpell07.start(new Stage());
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
