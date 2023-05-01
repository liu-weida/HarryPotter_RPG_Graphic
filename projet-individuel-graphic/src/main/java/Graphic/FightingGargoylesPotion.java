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

public class FightingGargoylesPotion extends Application{

    private ImageView imageView;
    private Image FightingGargoylesPotion1;
    private Image FightingGargoylesPotion2;
    private Image FightingGargoylesPotion3;
    private Image FightingGargoylesPotion4;
    private Image FightingGargoylesPotion5;
    private Image FightingGargoylesPotion6;
    private Image FightingGargoylesPotion7;
    private Image FightingGargoylesPotion8;
    private Image FightingGargoylesPotion9;
    private Image FightingGargoylesPotion10;
    private Image FightingGargoylesPotion11;
    private Image FightingGargoylesPotion12;
    private Image FightingGargoylesPotion13;
    private Image FightingGargoylesPotion14;


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Harry Potter at home V1.0");

        //Game.combat(Enemy.gargoyle);


        //int n = Game.uniquePotions.size();

        int n = Game.potions.size();

        // 加载默认图像

        InputStream input1 = getClass().getResourceAsStream("/image/FightingGargoylesPotion1.jpg");
        FightingGargoylesPotion1 = new Image(input1);

        InputStream input2 = getClass().getResourceAsStream("/image/FightingGargoylesPotion2.jpg");
        FightingGargoylesPotion2 = new Image(input2);

        InputStream input3 = getClass().getResourceAsStream("/image/FightingGargoylesPotion3.jpg");
        FightingGargoylesPotion3 = new Image(input3);

        InputStream input4 = getClass().getResourceAsStream("/image/FightingGargoylesPotion4.jpg");
        FightingGargoylesPotion4 = new Image(input4);

        InputStream input5 = getClass().getResourceAsStream("/image/FightingGargoylesPotion5.jpg");
        FightingGargoylesPotion5 = new Image(input5);

        InputStream input6 = getClass().getResourceAsStream("/image/FightingGargoylesPotion6.jpg");
        FightingGargoylesPotion6 = new Image(input6);

        InputStream input7 = getClass().getResourceAsStream("/image/FightingGargoylesPotion7.jpg");
        FightingGargoylesPotion7 = new Image(input7);

        InputStream input8 = getClass().getResourceAsStream("/image/FightingGargoylesPotion8.jpg");
        FightingGargoylesPotion8 = new Image(input8);

        InputStream input9 = getClass().getResourceAsStream("/image/FightingGargoylesPotion9.jpg");
        FightingGargoylesPotion9 = new Image(input9);

        InputStream input10 = getClass().getResourceAsStream("/image/FightingGargoylesPotion10.jpg");
        FightingGargoylesPotion10 = new Image(input10);

        InputStream input11 = getClass().getResourceAsStream("/image/FightingGargoylesPotion11.jpg");
        FightingGargoylesPotion11 = new Image(input11);

        InputStream input12 = getClass().getResourceAsStream("/image/FightingGargoylesPotion12.jpg");
        FightingGargoylesPotion12 = new Image(input12);

        InputStream input13 = getClass().getResourceAsStream("/image/FightingGargoylesPotion13.jpg");
        FightingGargoylesPotion13 = new Image(input13);

        InputStream input14 = getClass().getResourceAsStream("/image/FightingGargoylesPotion14.jpg");
        FightingGargoylesPotion14 = new Image(input14);




        // 创建 Button 控件
        Button buttonCreate1 = new Button("");
        buttonCreate1.setPrefSize(215, 60);
        buttonCreate1.setTranslateY(-86);
        buttonCreate1.setTranslateX(-10);
        buttonCreate1.setOpacity(0);

        Button buttonCreate2 = new Button("");
        buttonCreate2.setPrefSize(215, 60);
        buttonCreate2.setTranslateY(-10);
        buttonCreate2.setTranslateX(-10);
        buttonCreate2.setOpacity(0);

        Button buttonCreate3 = new Button("");
        buttonCreate3.setPrefSize(215, 60);
        buttonCreate3.setTranslateY(66);
        buttonCreate3.setTranslateX(-10);
        buttonCreate3.setOpacity(0);

        Button buttonCreate4 = new Button("");
        buttonCreate4.setPrefSize(215, 60);
        buttonCreate4.setTranslateY(144);
        buttonCreate4.setTranslateX(-10);
        buttonCreate4.setOpacity(0);



        switch (n){
            case 0:
                NoPotion noPotion = new NoPotion();
                // 调用 ArrivalHouse3 实例的 start() 方法显示新的场景
                try {
                   noPotion.start(new Stage());
                } catch (Exception e) {
                    e.printStackTrace();
                }
                // 关闭当前场景
                stage.close();
                break;
            case 1:
                imageView = new ImageView(FightingGargoylesPotion1);

                // 添加鼠标移入事件监听器
                buttonCreate1.setOnMouseEntered(event -> {
                    imageView.setImage(FightingGargoylesPotion2);
                });

                // 添加鼠标移出事件监听器
                buttonCreate1.setOnMouseExited(event -> {
                    imageView.setImage(FightingGargoylesPotion1);
                });

                break;
            case 2:
                imageView = new ImageView(FightingGargoylesPotion3);

                // 添加鼠标移入事件监听器
                buttonCreate1.setOnMouseEntered(event -> {
                    imageView.setImage(FightingGargoylesPotion4);
                });

                // 添加鼠标移出事件监听器
                buttonCreate1.setOnMouseExited(event -> {
                    imageView.setImage(FightingGargoylesPotion3);
                });

                // 添加鼠标移入事件监听器
                buttonCreate2.setOnMouseEntered(event -> {
                    imageView.setImage(FightingGargoylesPotion5);
                });

                // 添加鼠标移出事件监听器
                buttonCreate2.setOnMouseExited(event -> {
                    imageView.setImage(FightingGargoylesPotion3);
                });

                break;
            case 3:
                imageView = new ImageView(FightingGargoylesPotion6);

                // 添加鼠标移入事件监听器
                buttonCreate1.setOnMouseEntered(event -> {
                    imageView.setImage(FightingGargoylesPotion7);
                });

                // 添加鼠标移出事件监听器
                buttonCreate1.setOnMouseExited(event -> {
                    imageView.setImage(FightingGargoylesPotion6);
                });

                // 添加鼠标移入事件监听器
                buttonCreate2.setOnMouseEntered(event -> {
                    imageView.setImage(FightingGargoylesPotion8);
                });

                // 添加鼠标移出事件监听器
                buttonCreate2.setOnMouseExited(event -> {
                    imageView.setImage(FightingGargoylesPotion6);
                });

                // 添加鼠标移入事件监听器
                buttonCreate3.setOnMouseEntered(event -> {
                    imageView.setImage(FightingGargoylesPotion9);
                });

                // 添加鼠标移出事件监听器
                buttonCreate3.setOnMouseExited(event -> {
                    imageView.setImage(FightingGargoylesPotion6);
                });

                break;
            case 4:
                imageView = new ImageView(FightingGargoylesPotion10);

                // 添加鼠标移入事件监听器
                buttonCreate1.setOnMouseEntered(event -> {
                    imageView.setImage(FightingGargoylesPotion11);
                });

                // 添加鼠标移出事件监听器
                buttonCreate1.setOnMouseExited(event -> {
                    imageView.setImage(FightingGargoylesPotion10);
                });

                // 添加鼠标移入事件监听器
                buttonCreate2.setOnMouseEntered(event -> {
                    imageView.setImage(FightingGargoylesPotion12);
                });

                // 添加鼠标移出事件监听器
                buttonCreate2.setOnMouseExited(event -> {
                    imageView.setImage(FightingGargoylesPotion10);
                });

                // 添加鼠标移入事件监听器
                buttonCreate3.setOnMouseEntered(event -> {
                    imageView.setImage(FightingGargoylesPotion13);
                });

                // 添加鼠标移出事件监听器
                buttonCreate3.setOnMouseExited(event -> {
                    imageView.setImage(FightingGargoylesPotion10);
                });

                // 添加鼠标移入事件监听器
                buttonCreate4.setOnMouseEntered(event -> {
                    imageView.setImage(FightingGargoylesPotion14);
                });

                // 添加鼠标移出事件监听器
                buttonCreate4.setOnMouseExited(event -> {
                    imageView.setImage(FightingGargoylesPotion10);
                });

                break;

            default:
                imageView = new ImageView(FightingGargoylesPotion10);

                // 添加鼠标移入事件监听器
                buttonCreate1.setOnMouseEntered(event -> {
                    imageView.setImage(FightingGargoylesPotion11);
                });

                // 添加鼠标移出事件监听器
                buttonCreate1.setOnMouseExited(event -> {
                    imageView.setImage(FightingGargoylesPotion10);
                });

                // 添加鼠标移入事件监听器
                buttonCreate2.setOnMouseEntered(event -> {
                    imageView.setImage(FightingGargoylesPotion12);
                });

                // 添加鼠标移出事件监听器
                buttonCreate2.setOnMouseExited(event -> {
                    imageView.setImage(FightingGargoylesPotion10);
                });

                // 添加鼠标移入事件监听器
                buttonCreate3.setOnMouseEntered(event -> {
                    imageView.setImage(FightingGargoylesPotion13);
                });

                // 添加鼠标移出事件监听器
                buttonCreate3.setOnMouseExited(event -> {
                    imageView.setImage(FightingGargoylesPotion10);
                });

                // 添加鼠标移入事件监听器
                buttonCreate4.setOnMouseEntered(event -> {
                    imageView.setImage(FightingGargoylesPotion14);
                });

                // 添加鼠标移出事件监听器
                buttonCreate4.setOnMouseExited(event -> {
                    imageView.setImage(FightingGargoylesPotion10);
                });
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


        StackPane stackPane = new StackPane(imageView, buttonCreate1, buttonCreate2, buttonCreate3, buttonCreate4,textField0,textField1,textField2,textField3);


        buttonCreate1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Game.property[1] = Game.property[1]+20;
                FightingGargoylesUsePotion fightingGargoylesUsePotion = new FightingGargoylesUsePotion();
                // 调用 ArrivalHouse3 实例的 start() 方法显示新的场景
                try {
                    fightingGargoylesUsePotion.start(new Stage());
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
                Game.property[1] = Game.property[1]+40;
                FightingGargoylesUsePotion fightingGargoylesUsePotion = new FightingGargoylesUsePotion();
                // 调用 ArrivalHouse3 实例的 start() 方法显示新的场景
                try {
                    fightingGargoylesUsePotion.start(new Stage());
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
                Game.property[1] = Game.property[1]+60;
                FightingGargoylesUsePotion fightingGargoylesUsePotion = new FightingGargoylesUsePotion();
                // 调用 ArrivalHouse3 实例的 start() 方法显示新的场景
                try {
                    fightingGargoylesUsePotion.start(new Stage());
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
                Game.property[1] = Game.property[1]+100;
                FightingGargoylesUsePotion fightingGargoylesUsePotion = new FightingGargoylesUsePotion();
                // 调用 ArrivalHouse3 实例的 start() 方法显示新的场景
                try {
                    fightingGargoylesUsePotion.start(new Stage());
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
