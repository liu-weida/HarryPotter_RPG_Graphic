package Graphic;

import Game.Game;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.InputStream;

public class BattleVictory1 extends Application{

    private ImageView imageView;
    private Image BattleVictory1;
    private Image BattleVictory2;
    private Image BattleVictory3;
    private Image BattleVictory4;
    private Image BattleVictory5;
    private Image BattleVictory6;




    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Harry Potter at home V1.0");

        // 加载默认图像

        InputStream input1 = getClass().getResourceAsStream("/image/BattleVictory1.jpg");
        BattleVictory1 = new Image(input1);

        InputStream input2 = getClass().getResourceAsStream("/image/BattleVictory2.jpg");
        BattleVictory2 = new Image(input2);

        InputStream input3 = getClass().getResourceAsStream("/image/BattleVictory3.jpg");
        BattleVictory3 = new Image(input3);

        InputStream input4 = getClass().getResourceAsStream("/image/BattleVictory4.jpg");
        BattleVictory4 = new Image(input4);

        InputStream input5 = getClass().getResourceAsStream("/image/BattleVictory5.jpg");
        BattleVictory5 = new Image(input5);

        InputStream input6 = getClass().getResourceAsStream("/image/BattleVictory6.jpg");
        BattleVictory6 = new Image(input6);



        // 创建 ImageView 控件并设置默认图像
        imageView = new ImageView(BattleVictory1);


        // 创建 Button 控件
        Button buttonCreate1 = new Button("");
        buttonCreate1.setPrefSize(235, 80);
        buttonCreate1.setTranslateY(-79);
        buttonCreate1.setTranslateX(-25);
        buttonCreate1.setOpacity(0);

        Button buttonCreate2 = new Button("");
        buttonCreate2.setPrefSize(235, 80);
        buttonCreate2.setTranslateY(25);
        buttonCreate2.setTranslateX(-230);
        buttonCreate2.setOpacity(0);

        Button buttonCreate3 = new Button("");
        buttonCreate3.setPrefSize(235, 80);
        buttonCreate3.setTranslateY(25);
        buttonCreate3.setTranslateX(176);
        buttonCreate3.setOpacity(0);

        Button buttonCreate4 = new Button("");
        buttonCreate4.setPrefSize(235, 80);
        buttonCreate4.setTranslateY(150);
        buttonCreate4.setTranslateX(-230);
        buttonCreate4.setOpacity(0);

        Button buttonCreate5 = new Button("");
        buttonCreate5.setPrefSize(235, 80);
        buttonCreate5.setTranslateY(150);
        buttonCreate5.setTranslateX(176);
        buttonCreate5.setOpacity(0);



        // 创建 StackPane 布局容器，并将图像和按钮添加到其中
        StackPane stackPane = new StackPane(imageView, buttonCreate1, buttonCreate2, buttonCreate3, buttonCreate4, buttonCreate5);

        // 添加鼠标移入事件监听器
        buttonCreate1.setOnMouseEntered(event -> {
            imageView.setImage(BattleVictory2);
        });

        // 添加鼠标移出事件监听器
        buttonCreate1.setOnMouseExited(event -> {
            imageView.setImage(BattleVictory1);
        });

        // 添加鼠标移入事件监听器
        buttonCreate2.setOnMouseEntered(event -> {
            imageView.setImage(BattleVictory3);
        });

        // 添加鼠标移出事件监听器
        buttonCreate2.setOnMouseExited(event -> {
            imageView.setImage(BattleVictory1);
        });

        // 添加鼠标移入事件监听器
        buttonCreate3.setOnMouseEntered(event -> {
            imageView.setImage(BattleVictory4);
        });

        // 添加鼠标移出事件监听器
        buttonCreate3.setOnMouseExited(event -> {
            imageView.setImage(BattleVictory1);
        });

        // 添加鼠标移入事件监听器
        buttonCreate4.setOnMouseEntered(event -> {
            imageView.setImage(BattleVictory5);
        });

        // 添加鼠标移出事件监听器
        buttonCreate4.setOnMouseExited(event -> {
            imageView.setImage(BattleVictory1);
        });

        // 添加鼠标移入事件监听器
        buttonCreate5.setOnMouseEntered(event -> {
            imageView.setImage(BattleVictory6);
        });

        // 添加鼠标移出事件监听器
        buttonCreate5.setOnMouseExited(event -> {
            imageView.setImage(BattleVictory1);
        });




        buttonCreate1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Game.property[1] = Game.property[1]+100;
                // 创建 ArrivalHouse3 实例
                Chapter15 chapter15 = new Chapter15();
                // 调用 ArrivalHouse3 实例的 start() 方法显示新的场景
                try {
                    chapter15.start(new Stage());
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
                Game.wizard.setPharmacy(Game.wizard.getPharmacy()+2);
                // 创建 ArrivalHouse3 实例
                Chapter15 chapter15 = new Chapter15();
                // 调用 ArrivalHouse3 实例的 start() 方法显示新的场景
                try {
                    chapter15.start(new Stage());
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
                Game.wizard.setAttack(Game.wizard.getAttack()+2);
                // 创建 ArrivalHouse3 实例
                Chapter15 chapter15 = new Chapter15();
                // 调用 ArrivalHouse3 实例的 start() 方法显示新的场景
                try {
                    chapter15.start(new Stage());
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
                Game.wizard.setDefense(Game.wizard.getDefense()+2);
                // 创建 ArrivalHouse3 实例
                Chapter15 chapter15 = new Chapter15();
                // 调用 ArrivalHouse3 实例的 start() 方法显示新的场景
                try {
                    chapter15.start(new Stage());
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
                Game.wizard.setPrecise(Game.wizard.getPrecise()+2);
                // 创建 ArrivalHouse3 实例
                Chapter15 chapter15 = new Chapter15();
                // 调用 ArrivalHouse3 实例的 start() 方法显示新的场景
                try {
                    chapter15.start(new Stage());
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
