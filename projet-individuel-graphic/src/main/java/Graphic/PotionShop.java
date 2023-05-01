package Graphic;

import Game.Game;

import Potion.Potion;
import Spell.Spell;
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

public class PotionShop extends Application{

    private ImageView imageView;
    private Image Potion0;
    private Image Potion1;
    private Image Potion2;
    private Image Potion3;
    private Image Potion4;




    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Harry Potter at home V1.0");

        // 加载默认图像

        InputStream input = getClass().getResourceAsStream("/image/PotionShop1.jpg");
        Potion0 = new Image(input);

        InputStream input1 = getClass().getResourceAsStream("/image/PotionShop2.jpg");
        Potion1 = new Image(input1);

        InputStream input2 = getClass().getResourceAsStream("/image/PotionShop3.jpg");
        Potion2 = new Image(input2);

        InputStream input3 = getClass().getResourceAsStream("/image/PotionShop4.jpg");
        Potion3 = new Image(input3);

        InputStream input4 = getClass().getResourceAsStream("/image/PotionShop5.jpg");
        Potion4 = new Image(input4);




        // 创建 ImageView 控件并设置默认图像
        imageView = new ImageView(Potion0);


        // 创建 Button 控件
        Button buttonCreate1 = new Button("");
        buttonCreate1.setPrefSize(390, 90);
        buttonCreate1.setTranslateY(-29);
        buttonCreate1.setTranslateX(-260);
        buttonCreate1.setOpacity(0);

        Button buttonCreate2 = new Button("");
        buttonCreate2.setPrefSize(390, 90);
        buttonCreate2.setTranslateY(-29);
        buttonCreate2.setTranslateX(230);
        buttonCreate2.setOpacity(0);

        Button buttonCreate3 = new Button("");
        buttonCreate3.setPrefSize(390, 90);
        buttonCreate3.setTranslateY(175);
        buttonCreate3.setTranslateX(-260);
        buttonCreate3.setOpacity(0);

        Button buttonCreate4 = new Button("");
        buttonCreate4.setPrefSize(390, 90);
        buttonCreate4.setTranslateY(175);
        buttonCreate4.setTranslateX(230);
        buttonCreate4.setOpacity(0);


        // 创建 StackPane 布局容器，并将图像和按钮添加到其中
        StackPane stackPane = new StackPane(imageView, buttonCreate1, buttonCreate2, buttonCreate3, buttonCreate4);

        // 添加鼠标移入事件监听器
        buttonCreate1.setOnMouseEntered(event -> {
            imageView.setImage(Potion1);
        });

        // 添加鼠标移出事件监听器
        buttonCreate1.setOnMouseExited(event -> {
            imageView.setImage(Potion0);
        });

        // 添加鼠标移入事件监听器
        buttonCreate2.setOnMouseEntered(event -> {
            imageView.setImage(Potion2);
        });

        // 添加鼠标移出事件监听器
        buttonCreate2.setOnMouseExited(event -> {
            imageView.setImage(Potion0);
        });

        // 添加鼠标移入事件监听器
        buttonCreate3.setOnMouseEntered(event -> {
            imageView.setImage(Potion3);
        });

        // 添加鼠标移出事件监听器
        buttonCreate3.setOnMouseExited(event -> {
            imageView.setImage(Potion0);
        });

        // 添加鼠标移入事件监听器
        buttonCreate4.setOnMouseEntered(event -> {
            imageView.setImage(Potion4);
        });

        // 添加鼠标移出事件监听器
        buttonCreate4.setOnMouseExited(event -> {
            imageView.setImage(Potion0);
        });


        buttonCreate1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                int choose = 1; // 按钮1对应的选择
                Potion potion = Potion.choosePotion(choose);

                if (Game.wizard.getGold() < 10) {

                   InsufficientGold insufficientGold = new InsufficientGold();
                    try {
                        insufficientGold.start(new Stage());
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    // 关闭当前场景
                    stage.close();
                } else {

                    Game.potions.add(potion);
                    //wizard.setPotions(potions);
                    int gold =  Game.wizard.getGold();
                    gold = gold - 10;
                    Game.wizard.setGold(gold);
                    PurchaseSuccess purchaseSuccess = new PurchaseSuccess();
                    try {
                        purchaseSuccess.start(new Stage());
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    // 关闭当前场景
                    stage.close();
                }
            }
        });

        buttonCreate2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                int choose = 2; // 按钮1对应的选择
                Potion potion = Potion.choosePotion(choose);

                if (Game.wizard.getGold() < 20) {

                    InsufficientGold insufficientGold = new InsufficientGold();
                    try {
                        insufficientGold.start(new Stage());
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    // 关闭当前场景
                    stage.close();
                } else {

                    Game.potions.add(potion);
                    //wizard.setPotions(potions);
                    int gold =  Game.wizard.getGold();
                    gold = gold - 20;
                    Game.wizard.setGold(gold);
                    PurchaseSuccess purchaseSuccess = new PurchaseSuccess();
                    try {
                        purchaseSuccess.start(new Stage());
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    // 关闭当前场景
                    stage.close();
                }
            }
        });

        buttonCreate3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                int choose = 3; // 按钮1对应的选择
                Potion potion = Potion.choosePotion(choose);

                if (Game.wizard.getGold() < 40) {

                    InsufficientGold insufficientGold = new InsufficientGold();
                    try {
                        insufficientGold.start(new Stage());
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    // 关闭当前场景
                    stage.close();
                } else {

                    Game.potions.add(potion);
                    //wizard.setPotions(potions);
                    int gold =  Game.wizard.getGold();
                    gold = gold - 40;
                    Game.wizard.setGold(gold);
                    PurchaseSuccess purchaseSuccess = new PurchaseSuccess();
                    try {
                        purchaseSuccess.start(new Stage());
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    // 关闭当前场景
                    stage.close();
                }
            }
        });

        buttonCreate4.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                int choose = 4; // 按钮1对应的选择
                Potion potion = Potion.choosePotion(choose);

                if (Game.wizard.getGold() < 80) {

                    InsufficientGold insufficientGold = new InsufficientGold();
                    try {
                        insufficientGold.start(new Stage());
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    // 关闭当前场景
                    stage.close();
                } else {

                    Game.potions.add(potion);
                    //wizard.setPotions(potions);
                    int gold =  Game.wizard.getGold();
                    gold = gold - 80;
                    Game.wizard.setGold(gold);
                    PurchaseSuccess purchaseSuccess = new PurchaseSuccess();
                    try {
                        purchaseSuccess.start(new Stage());
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    // 关闭当前场景
                    stage.close();
                }
            }
        });


        // 创建场景并显示
        Scene scene = new Scene(stackPane, 1120, 700);
        stage.setScene(scene);
        stage.show();
    }




}