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

public class Combat4Spell extends Application{

    private ImageView imageView;
    private Image CombatSpell1;
    private Image CombatSpell2;
    private Image CombatSpell3;
    private Image CombatSpell4;
    private Image CombatSpell5;
    private Image CombatSpell6;
    private Image CombatSpell7;
    private Image CombatSpell8;
    private Image CombatSpell9;
    private Image CombatSpell10;
    private Image CombatSpell11;
    private Image CombatSpell12;
    private Image CombatSpell13;
    private Image CombatSpell14;
    private Image CombatSpell15;
    private Image CombatSpell16;
    private Image CombatSpell17;
    private Image CombatSpell18;
    private Image CombatSpell19;
    private Image CombatSpell20;
    private Image CombatSpell21;
    private Image CombatSpell22;
    private Image CombatSpell23;
    private Image CombatSpell24;
    private Image CombatSpell25;
    private Image CombatSpell26;
    private Image CombatSpell27;
    private Image CombatSpell28;
    private Image CombatSpell29;
    private Image CombatSpell30;
    private Image CombatSpell31;
    private Image CombatSpell32;
    private Image CombatSpell33;
    private Image CombatSpell34;
    private Image CombatSpell35;



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

        InputStream input1 = getClass().getResourceAsStream("/image/CombatSpell1.jpg");
        CombatSpell1 = new Image(input1);

        InputStream input2 = getClass().getResourceAsStream("/image/CombatSpell2.jpg");
        CombatSpell2 = new Image(input2);

        InputStream input3 = getClass().getResourceAsStream("/image/CombatSpell3.jpg");
        CombatSpell3 = new Image(input3);

        InputStream input4 = getClass().getResourceAsStream("/image/CombatSpell4.jpg");
        CombatSpell4 = new Image(input4);

        InputStream input5 = getClass().getResourceAsStream("/image/CombatSpell5.jpg");
        CombatSpell5 = new Image(input5);

        InputStream input6 = getClass().getResourceAsStream("/image/CombatSpell6.jpg");
        CombatSpell6 = new Image(input6);

        InputStream input7 = getClass().getResourceAsStream("/image/CombatSpell7.jpg");
        CombatSpell7 = new Image(input7);

        InputStream input8 = getClass().getResourceAsStream("/image/CombatSpell8.jpg");
        CombatSpell8 = new Image(input8);

        InputStream input9 = getClass().getResourceAsStream("/image/CombatSpell9.jpg");
        CombatSpell9 = new Image(input9);

        InputStream input10 = getClass().getResourceAsStream("/image/CombatSpell10.jpg");
        CombatSpell10 = new Image(input10);

        InputStream input11 = getClass().getResourceAsStream("/image/CombatSpell11.jpg");
        CombatSpell11 = new Image(input11);

        InputStream input12 = getClass().getResourceAsStream("/image/CombatSpell12.jpg");
        CombatSpell12 = new Image(input12);

        InputStream input13 = getClass().getResourceAsStream("/image/CombatSpell13.jpg");
        CombatSpell13 = new Image(input13);

        InputStream input14 = getClass().getResourceAsStream("/image/CombatSpell14.jpg");
        CombatSpell14 = new Image(input14);

        InputStream input15 = getClass().getResourceAsStream("/image/CombatSpell15.jpg");
        CombatSpell15 = new Image(input15);

        InputStream input16 = getClass().getResourceAsStream("/image/CombatSpell16.jpg");
        CombatSpell16 = new Image(input16);

        InputStream input17 = getClass().getResourceAsStream("/image/CombatSpell17.jpg");
        CombatSpell17 = new Image(input17);

        InputStream input18 = getClass().getResourceAsStream("/image/CombatSpell18.jpg");
        CombatSpell18 = new Image(input18);

        InputStream input19 = getClass().getResourceAsStream("/image/CombatSpell19.jpg");
        CombatSpell19 = new Image(input19);

        InputStream input20 = getClass().getResourceAsStream("/image/CombatSpell20.jpg");
        CombatSpell20 = new Image(input20);

        InputStream input21 = getClass().getResourceAsStream("/image/CombatSpell21.jpg");
        CombatSpell21 = new Image(input21);

        InputStream input22 = getClass().getResourceAsStream("/image/CombatSpell22.jpg");
        CombatSpell22 = new Image(input22);

        InputStream input23 = getClass().getResourceAsStream("/image/CombatSpell23.jpg");
        CombatSpell23 = new Image(input23);

        InputStream input24 = getClass().getResourceAsStream("/image/CombatSpell24.jpg");
        CombatSpell24 = new Image(input24);

        InputStream input25 = getClass().getResourceAsStream("/image/CombatSpell25.jpg");
        CombatSpell25 = new Image(input25);

        InputStream input26 = getClass().getResourceAsStream("/image/CombatSpell26.jpg");
        CombatSpell26 = new Image(input26);

        InputStream input27 = getClass().getResourceAsStream("/image/CombatSpell27.jpg");
        CombatSpell27 = new Image(input27);

        InputStream input28 = getClass().getResourceAsStream("/image/CombatSpell28.jpg");
        CombatSpell28 = new Image(input28);

        InputStream input29 = getClass().getResourceAsStream("/image/CombatSpell29.jpg");
        CombatSpell29 = new Image(input29);

        InputStream input30 = getClass().getResourceAsStream("/image/CombatSpell30.jpg");
        CombatSpell30 = new Image(input30);

        InputStream input31 = getClass().getResourceAsStream("/image/CombatSpell31.jpg");
        CombatSpell31 = new Image(input31);

        InputStream input32 = getClass().getResourceAsStream("/image/CombatSpell32.jpg");
        CombatSpell32 = new Image(input32);

        InputStream input33 = getClass().getResourceAsStream("/image/CombatSpell33.jpg");
        CombatSpell33 = new Image(input33);

        InputStream input34 = getClass().getResourceAsStream("/image/CombatSpell34.jpg");
        CombatSpell34 = new Image(input34);

        InputStream input35 = getClass().getResourceAsStream("/image/CombatSpell35.jpg");
        CombatSpell35 = new Image(input35);





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
                imageView = new ImageView(CombatSpell1);

                // 添加鼠标移入事件监听器
                buttonCreate1.setOnMouseEntered(event -> {
                    imageView.setImage(CombatSpell2);
                });

                // 添加鼠标移出事件监听器
                buttonCreate1.setOnMouseExited(event -> {
                    imageView.setImage(CombatSpell1);
                });

                break;
            case 2:
                imageView = new ImageView(CombatSpell3);

                // 添加鼠标移入事件监听器
                buttonCreate1.setOnMouseEntered(event -> {
                    imageView.setImage(CombatSpell4);
                });

                // 添加鼠标移出事件监听器
                buttonCreate1.setOnMouseExited(event -> {
                    imageView.setImage(CombatSpell3);
                });

                // 添加鼠标移入事件监听器
                buttonCreate2.setOnMouseEntered(event -> {
                    imageView.setImage(CombatSpell5);
                });

                // 添加鼠标移出事件监听器
                buttonCreate2.setOnMouseExited(event -> {
                    imageView.setImage(CombatSpell3);
                });

                break;
            case 3:
                imageView = new ImageView(CombatSpell6);

                // 添加鼠标移入事件监听器
                buttonCreate1.setOnMouseEntered(event -> {
                    imageView.setImage(CombatSpell7);
                });

                // 添加鼠标移出事件监听器
                buttonCreate1.setOnMouseExited(event -> {
                    imageView.setImage(CombatSpell6);
                });

                // 添加鼠标移入事件监听器
                buttonCreate2.setOnMouseEntered(event -> {
                    imageView.setImage(CombatSpell8);
                });

                // 添加鼠标移出事件监听器
                buttonCreate2.setOnMouseExited(event -> {
                    imageView.setImage(CombatSpell6);
                });

                // 添加鼠标移入事件监听器
                buttonCreate3.setOnMouseEntered(event -> {
                    imageView.setImage(CombatSpell9);
                });

                // 添加鼠标移出事件监听器
                buttonCreate3.setOnMouseExited(event -> {
                    imageView.setImage(CombatSpell6);
                });

                break;
            case 4:
                imageView = new ImageView(CombatSpell10);

                // 添加鼠标移入事件监听器
                buttonCreate1.setOnMouseEntered(event -> {
                    imageView.setImage(CombatSpell11);
                });

                // 添加鼠标移出事件监听器
                buttonCreate1.setOnMouseExited(event -> {
                    imageView.setImage(CombatSpell10);
                });

                // 添加鼠标移入事件监听器
                buttonCreate2.setOnMouseEntered(event -> {
                    imageView.setImage(CombatSpell12);
                });

                // 添加鼠标移出事件监听器
                buttonCreate2.setOnMouseExited(event -> {
                    imageView.setImage(CombatSpell10);
                });

                // 添加鼠标移入事件监听器
                buttonCreate3.setOnMouseEntered(event -> {
                    imageView.setImage(CombatSpell13);
                });

                // 添加鼠标移出事件监听器
                buttonCreate3.setOnMouseExited(event -> {
                    imageView.setImage(CombatSpell10);
                });

                // 添加鼠标移入事件监听器
                buttonCreate4.setOnMouseEntered(event -> {
                    imageView.setImage(CombatSpell14);
                });

                // 添加鼠标移出事件监听器
                buttonCreate4.setOnMouseExited(event -> {
                    imageView.setImage(CombatSpell10);
                });

                break;
            case 5:
                imageView = new ImageView(CombatSpell15);

                // 添加鼠标移入事件监听器
                buttonCreate1.setOnMouseEntered(event -> {
                    imageView.setImage(CombatSpell16);
                });

                // 添加鼠标移出事件监听器
                buttonCreate1.setOnMouseExited(event -> {
                    imageView.setImage(CombatSpell15);
                });

                // 添加鼠标移入事件监听器
                buttonCreate2.setOnMouseEntered(event -> {
                    imageView.setImage(CombatSpell17);
                });

                // 添加鼠标移出事件监听器
                buttonCreate2.setOnMouseExited(event -> {
                    imageView.setImage(CombatSpell15);
                });

                // 添加鼠标移入事件监听器
                buttonCreate3.setOnMouseEntered(event -> {
                    imageView.setImage(CombatSpell18);
                });

                // 添加鼠标移出事件监听器
                buttonCreate3.setOnMouseExited(event -> {
                    imageView.setImage(CombatSpell15);
                });

                // 添加鼠标移入事件监听器
                buttonCreate4.setOnMouseEntered(event -> {
                    imageView.setImage(CombatSpell19);
                });

                // 添加鼠标移出事件监听器
                buttonCreate4.setOnMouseExited(event -> {
                    imageView.setImage(CombatSpell15);
                });

                // 添加鼠标移入事件监听器
                buttonCreate5.setOnMouseEntered(event -> {
                    imageView.setImage(CombatSpell20);
                });

                // 添加鼠标移出事件监听器
                buttonCreate5.setOnMouseExited(event -> {
                    imageView.setImage(CombatSpell15);
                });

                break;
            case 6:
                imageView = new ImageView(CombatSpell21);

                // 添加鼠标移入事件监听器
                buttonCreate1.setOnMouseEntered(event -> {
                    imageView.setImage(CombatSpell22);
                });

                // 添加鼠标移出事件监听器
                buttonCreate1.setOnMouseExited(event -> {
                    imageView.setImage(CombatSpell21);
                });

                // 添加鼠标移入事件监听器
                buttonCreate2.setOnMouseEntered(event -> {
                    imageView.setImage(CombatSpell23);
                });

                // 添加鼠标移出事件监听器
                buttonCreate2.setOnMouseExited(event -> {
                    imageView.setImage(CombatSpell21);
                });

                // 添加鼠标移入事件监听器
                buttonCreate3.setOnMouseEntered(event -> {
                    imageView.setImage(CombatSpell24);
                });

                // 添加鼠标移出事件监听器
                buttonCreate3.setOnMouseExited(event -> {
                    imageView.setImage(CombatSpell21);
                });

                // 添加鼠标移入事件监听器
                buttonCreate4.setOnMouseEntered(event -> {
                    imageView.setImage(CombatSpell25);
                });

                // 添加鼠标移出事件监听器
                buttonCreate4.setOnMouseExited(event -> {
                    imageView.setImage(CombatSpell21);
                });

                // 添加鼠标移入事件监听器
                buttonCreate5.setOnMouseEntered(event -> {
                    imageView.setImage(CombatSpell26);
                });

                // 添加鼠标移出事件监听器
                buttonCreate5.setOnMouseExited(event -> {
                    imageView.setImage(CombatSpell21);
                });

                // 添加鼠标移入事件监听器
                buttonCreate6.setOnMouseEntered(event -> {
                    imageView.setImage(CombatSpell27);
                });

                // 添加鼠标移出事件监听器
                buttonCreate6.setOnMouseExited(event -> {
                    imageView.setImage(CombatSpell21);
                });

                break;
            case 7:

                imageView = new ImageView(CombatSpell28);

                // 添加鼠标移入事件监听器
                buttonCreate1.setOnMouseEntered(event -> {
                    imageView.setImage(CombatSpell29);
                });

                // 添加鼠标移出事件监听器
                buttonCreate1.setOnMouseExited(event -> {
                    imageView.setImage(CombatSpell28);
                });

                // 添加鼠标移入事件监听器
                buttonCreate2.setOnMouseEntered(event -> {
                    imageView.setImage(CombatSpell30);
                });

                // 添加鼠标移出事件监听器
                buttonCreate2.setOnMouseExited(event -> {
                    imageView.setImage(CombatSpell28);
                });

                // 添加鼠标移入事件监听器
                buttonCreate3.setOnMouseEntered(event -> {
                    imageView.setImage(CombatSpell31);
                });

                // 添加鼠标移出事件监听器
                buttonCreate3.setOnMouseExited(event -> {
                    imageView.setImage(CombatSpell28);
                });

                // 添加鼠标移入事件监听器
                buttonCreate4.setOnMouseEntered(event -> {
                    imageView.setImage(CombatSpell32);
                });

                // 添加鼠标移出事件监听器
                buttonCreate4.setOnMouseExited(event -> {
                    imageView.setImage(CombatSpell28);
                });

                // 添加鼠标移入事件监听器
                buttonCreate5.setOnMouseEntered(event -> {
                    imageView.setImage(CombatSpell33);
                });

                // 添加鼠标移出事件监听器
                buttonCreate5.setOnMouseExited(event -> {
                    imageView.setImage(CombatSpell28);
                });

                // 添加鼠标移入事件监听器
                buttonCreate6.setOnMouseEntered(event -> {
                    imageView.setImage(CombatSpell34);
                });

                // 添加鼠标移出事件监听器
                buttonCreate6.setOnMouseExited(event -> {
                    imageView.setImage(CombatSpell28);
                });

                buttonCreate7.setOnMouseEntered(event -> {
                    imageView.setImage(CombatSpell35);
                });

                // 添加鼠标移出事件监听器
                buttonCreate7.setOnMouseExited(event -> {
                    imageView.setImage(CombatSpell28);
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
        textField2.setText(String.valueOf(Boss.peterPettigrew.getHP()));
        textField2.setMaxWidth(120);
        textField2.setStyle(" -fx-translate-x: 515; -fx-translate-y:-130;-fx-font-size: 25px; -fx-text-fill: #e7c254; -fx-font-family:Courier New;-fx-background-color: transparent; -fx-border-color: transparent;");

        TextField textField3 = new TextField();
        textField3.setText("500");
        textField3.setMaxWidth(120);
        textField3.setStyle(" -fx-translate-x: 515; -fx-translate-y:-10;-fx-font-size: 25px; -fx-text-fill: #e7c254; -fx-font-family:Courier New;-fx-background-color: transparent; -fx-border-color: transparent;");


        StackPane stackPane = new StackPane(imageView, buttonCreate1, buttonCreate2, buttonCreate3, buttonCreate4, buttonCreate5, buttonCreate6, buttonCreate7,textField0,textField1,textField2,textField3);


        buttonCreate1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                // 创建 ArrivalHouse3 实例
                    Combat4Spell1 CombatSpell1 = new Combat4Spell1();
                // 调用 ArrivalHouse3 实例的 start() 方法显示新的场景
                try {
                    CombatSpell1.start(new Stage());
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
                Combat4Spell2 CombatSpell2 = new Combat4Spell2();
                // 调用 ArrivalHouse3 实例的 start() 方法显示新的场景
                try {
                    CombatSpell2.start(new Stage());
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
                Combat4Spell3 CombatSpell3 = new Combat4Spell3();
                // 调用 ArrivalHouse3 实例的 start() 方法显示新的场景
                try {
                    CombatSpell3.start(new Stage());
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
                Combat4Spell4 CombatSpell4 = new Combat4Spell4();
                // 调用 ArrivalHouse3 实例的 start() 方法显示新的场景
                try {
                    CombatSpell4.start(new Stage());
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
                Combat4Spell5 CombatSpell5 = new Combat4Spell5();
                // 调用 ArrivalHouse3 实例的 start() 方法显示新的场景
                try {
                    CombatSpell5.start(new Stage());
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
                Combat4Spell6 CombatSpell6 = new Combat4Spell6();
                // 调用 ArrivalHouse3 实例的 start() 方法显示新的场景
                try {
                    CombatSpell6.start(new Stage());
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
                Combat4Spell7 CombatSpell7 = new Combat4Spell7();
                // 调用 ArrivalHouse3 实例的 start() 方法显示新的场景
                try {
                    CombatSpell7.start(new Stage());
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
