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

public class Menu extends Application{

    private ImageView imageView;
    private Image Menu1;
    private Image Menu2;
    private Image Menu3;
    private Image Menu4;
    private Image Menu5;
    private Image Menu6;
    private Image Menu7;



    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Harry Potter at home V1.0");

        // 加载默认图像

        InputStream input1 = getClass().getResourceAsStream("/image/Menu1.jpg");
        Menu1 = new Image(input1);

        InputStream input2 = getClass().getResourceAsStream("/image/Menu2.jpg");
        Menu2 = new Image(input2);

        InputStream input3 = getClass().getResourceAsStream("/image/Menu3.jpg");
        Menu3 = new Image(input3);

        InputStream input4 = getClass().getResourceAsStream("/image/Menu4.jpg");
        Menu4 = new Image(input4);

        InputStream input5 = getClass().getResourceAsStream("/image/Menu5.jpg");
        Menu5 = new Image(input5);

        InputStream input6 = getClass().getResourceAsStream("/image/Menu6.jpg");
        Menu6 = new Image(input6);

        InputStream input7 = getClass().getResourceAsStream("/image/Menu7.jpg");
        Menu7 = new Image(input7);



        // 创建 ImageView 控件并设置默认图像
        imageView = new ImageView(Menu1);


        // 创建 Button 控件
        Button buttonCreate1 = new Button("");
        buttonCreate1.setPrefSize(330, 90);
        buttonCreate1.setTranslateY(-78);
        buttonCreate1.setTranslateX(-217);
        buttonCreate1.setOpacity(0);

        Button buttonCreate2 = new Button("");
        buttonCreate2.setPrefSize(330, 90);
        buttonCreate2.setTranslateY(-78);
        buttonCreate2.setTranslateX(256);
        buttonCreate2.setOpacity(0);

        Button buttonCreate3 = new Button("");
        buttonCreate3.setPrefSize(330, 90);
        buttonCreate3.setTranslateY(85);
        buttonCreate3.setTranslateX(-217);
        buttonCreate3.setOpacity(0);

        Button buttonCreate4 = new Button("");
        buttonCreate4.setPrefSize(330, 90);
        buttonCreate4.setTranslateY(85);
        buttonCreate4.setTranslateX(256);
        buttonCreate4.setOpacity(0);

        Button buttonCreate5 = new Button("");
        buttonCreate5.setPrefSize(330, 90);
        buttonCreate5.setTranslateY(245);
        buttonCreate5.setTranslateX(-217);
        buttonCreate5.setOpacity(0);

        Button buttonCreate6 = new Button("");
        buttonCreate6.setPrefSize(330, 90);
        buttonCreate6.setTranslateY(245);
        buttonCreate6.setTranslateX(256);
        buttonCreate6.setOpacity(0);


        // 创建 StackPane 布局容器，并将图像和按钮添加到其中
        StackPane stackPane = new StackPane(imageView, buttonCreate1, buttonCreate2, buttonCreate3, buttonCreate4, buttonCreate5, buttonCreate6);

        // 添加鼠标移入事件监听器
        buttonCreate1.setOnMouseEntered(event -> {
            imageView.setImage(Menu2);
        });

        // 添加鼠标移出事件监听器
        buttonCreate1.setOnMouseExited(event -> {
            imageView.setImage(Menu1);
        });

        // 添加鼠标移入事件监听器
        buttonCreate2.setOnMouseEntered(event -> {
            imageView.setImage(Menu3);
        });

        // 添加鼠标移出事件监听器
        buttonCreate2.setOnMouseExited(event -> {
            imageView.setImage(Menu1);
        });

        // 添加鼠标移入事件监听器
        buttonCreate3.setOnMouseEntered(event -> {
            imageView.setImage(Menu4);
        });

        // 添加鼠标移出事件监听器
        buttonCreate3.setOnMouseExited(event -> {
            imageView.setImage(Menu1);
        });

        // 添加鼠标移入事件监听器
        buttonCreate4.setOnMouseEntered(event -> {
            imageView.setImage(Menu5);
        });

        // 添加鼠标移出事件监听器
        buttonCreate4.setOnMouseExited(event -> {
            imageView.setImage(Menu1);
        });

        // 添加鼠标移入事件监听器
        buttonCreate5.setOnMouseEntered(event -> {
            imageView.setImage(Menu6);
        });

        // 添加鼠标移出事件监听器
        buttonCreate5.setOnMouseExited(event -> {
            imageView.setImage(Menu1);
        });

        // 添加鼠标移入事件监听器
        buttonCreate6.setOnMouseEntered(event -> {
            imageView.setImage(Menu7);
        });

        // 添加鼠标移出事件监听器
        buttonCreate6.setOnMouseExited(event -> {
            imageView.setImage(Menu1);
        });



        buttonCreate1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                // 创建 ArrivalHouse3 实例
                SpellClass spellClas = new SpellClass();
                // 调用 ArrivalHouse3 实例的 start() 方法显示新的场景
                try {
                    spellClas.start(new Stage());
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
               ForbiddenSpellClass forbiddenSpellClass = new ForbiddenSpellClass();
                // 调用 ArrivalHouse3 实例的 start() 方法显示新的场景
                try {
                    forbiddenSpellClass.start(new Stage());
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
                PotionShop potionShop = new PotionShop();
                // 调用 ArrivalHouse3 实例的 start() 方法显示新的场景
                try {
                    potionShop.start(new Stage());
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
                TrainingGround trainingGround = new TrainingGround();
                // 调用 ArrivalHouse3 实例的 start() 方法显示新的场景
                try {
                    trainingGround.start(new Stage());
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
                int n = Game.adventurelevel;

                switch (n) {
                    case 1:
                        Chapter1 chapter1 = new Chapter1();
                        // 调用 ArrivalHouse3 实例的 start() 方法显示新的场景
                        try {
                           chapter1.start(new Stage());
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        // 关闭当前场景
                        stage.close();
                        break;
                    case 2:
                        Chapter2 chapter2 = new Chapter2();
                        // 调用 ArrivalHouse3 实例的 start() 方法显示新的场景
                        try {
                            chapter2.start(new Stage());
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        // 关闭当前场景
                        stage.close();
                        break;
                    case 3:
                        Chapter3 chapter3 = new Chapter3();
                        // 调用 ArrivalHouse3 实例的 start() 方法显示新的场景
                        try {
                            chapter3.start(new Stage());
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        // 关闭当前场景
                        stage.close();
                        break;
                    case 4:
                        Chapter4 chapter4 = new Chapter4();
                        // 调用 ArrivalHouse3 实例的 start() 方法显示新的场景
                        try {
                            chapter4.start(new Stage());
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        // 关闭当前场景
                        stage.close();
                        break;
                    case 5:
                        Chapter5 chapter5 = new Chapter5();
                        // 调用 ArrivalHouse3 实例的 start() 方法显示新的场景
                        try {
                            chapter5.start(new Stage());
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        // 关闭当前场景
                        stage.close();
                        break;
                    case 6:
                        Chapter6 chapter6 = new Chapter6();
                        // 调用 ArrivalHouse3 实例的 start() 方法显示新的场景
                        try {
                            chapter6.start(new Stage());
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        // 关闭当前场景
                        stage.close();
                        break;
                    case 7:
                        Chapter7 chapter7 = new Chapter7();
                        // 调用 ArrivalHouse3 实例的 start() 方法显示新的场景
                        try {
                            chapter7.start(new Stage());
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        // 关闭当前场景
                        stage.close();
                        break;
                    case 8:
                        Chapter8 chapter8 = new Chapter8();
                        // 调用 ArrivalHouse3 实例的 start() 方法显示新的场景
                        try {
                            chapter8.start(new Stage());
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        // 关闭当前场景
                        stage.close();
                        break;
                }

            }});

        buttonCreate6.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                // 创建 ArrivalHouse3 实例
                PropertyDisplay propertyDisplay = new PropertyDisplay();
                // 调用 ArrivalHouse3 实例的 start() 方法显示新的场景
                try {
                    propertyDisplay.start(new Stage());
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
