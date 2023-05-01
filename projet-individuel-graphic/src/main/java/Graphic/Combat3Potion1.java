package Graphic;

import Enemy.Enemy;
import Enemy.Boss;
import Game.Game;
import Player.Wizard;
import Character.Character;
import Spell.Spell;
import Spell.ForbiddenSpell;
import javafx.animation.FadeTransition;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Cursor;
import javafx.scene.ImageCursor;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.util.Duration;
import java.util.Arrays;


import java.io.InputStream;
import java.util.Random;

public class Combat3Potion1 extends Application {

    private TextArea textArea;

    private TextField textField;
    private ImageView imageView;
    private Image Combat3Potion;
    private Stage mainStage; // 添加成员变量

    private Image BOSS;

    private String[] dialogues = {};
    private int currentDialogue = 0;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {



        dialogues = new String[]{
                "Your HP has replied!",
        };



        mainStage = stage; // 初始化成员变量
        stage.setTitle("Harry Potter at home V1.0");

        // 加载默认图像
        InputStream input1 = getClass().getResourceAsStream("/image/CombatText.jpg");
        Combat3Potion = new Image(input1);

        InputStream input = getClass().getResourceAsStream("/image/Boss3.png");
        BOSS = new Image(input);
        ImageView imageView6 = new ImageView(BOSS);
        // 调整 imageView6 的位置
        imageView6.setTranslateX(320);
        imageView6.setTranslateY(-40);
        imageView6.setFitWidth(200);
        imageView6.setFitHeight(300);

        // 创建 ImageView 控件并设置默认图像
        imageView = new ImageView(Combat3Potion);

        textField = new TextField();
        Font font = Font.font("Courier New", 20);
        textField.setFont(font);
        textField.setMaxWidth(1000);
        textField.setMaxHeight(50);
        textField.setTranslateY(230);
        textField.setTranslateX(0);
        textField.setEditable(false);
        textField.setText("");
        textField.setStyle("-fx-background-color: transparent; -fx-text-fill: #ffffff; -fx-border-color: transparent;");

        // 创建 StackPane 布局容器，并将图像和按钮添加到其中
                TextField textField0 = new TextField();
        textField0.setText(String.valueOf(Game.property[1]));
        textField0.setMaxWidth(120);
        textField0.setStyle(" -fx-translate-x:-480; -fx-translate-y:-130;-fx-font-size: 25px; -fx-text-fill: #e7c254; -fx-font-family:Courier New;-fx-background-color: transparent; -fx-border-color: transparent;");

        TextField textField1 = new TextField();
        textField1.setText("1000");
        textField1.setMaxWidth(120);
        textField1.setStyle(" -fx-translate-x: -480; -fx-translate-y:-10;-fx-font-size: 25px; -fx-text-fill: #e7c254; -fx-font-family:Courier New;-fx-background-color:transparent; -fx-border-color: transparent;");

        TextField textField2 = new TextField();
        textField2.setText(String.valueOf(Boss.dementor.getHP()));
        textField2.setMaxWidth(120);
        textField2.setStyle(" -fx-translate-x: 515; -fx-translate-y:-130;-fx-font-size: 25px; -fx-text-fill: #e7c254; -fx-font-family:Courier New;-fx-background-color: transparent; -fx-border-color: transparent;");

        TextField textField3 = new TextField();
        textField3.setText("400");
        textField3.setMaxWidth(120);
        textField3.setStyle(" -fx-translate-x: 515; -fx-translate-y:-10;-fx-font-size: 25px; -fx-text-fill: #e7c254; -fx-font-family:Courier New;-fx-background-color: transparent; -fx-border-color: transparent;");


        // 创建 StackPane 布局容器，并将图像和按钮添加到其中
        StackPane stackPane = new StackPane(imageView, textField,textField0,textField1,textField2,textField3);
        // 创建场景并显示
        Scene scene = new Scene(stackPane, 1120, 700);


        EventHandler<KeyEvent> keyEventEventHandler = event -> {
            if (event.getCode() == KeyCode.ENTER) {
                nextDialogue();
            }
        };

        EventHandler<MouseEvent> mouseEventEventHandler = event -> {
            nextDialogue();
        };

        scene.addEventHandler(KeyEvent.KEY_PRESSED, keyEventEventHandler);
        scene.addEventHandler(MouseEvent.MOUSE_CLICKED, mouseEventEventHandler);

        stage.setScene(scene);
        stage.show();
    }

    private void nextDialogue() {
        if (currentDialogue < dialogues.length) {
            textField.setText(dialogues[currentDialogue]);
            currentDialogue++;
        } else {
            PageTransition.smoothTransition(mainStage, mainStage.getScene().getRoot(), () -> showCombatStartPage(mainStage));
        }
    }

    private void showCombatStartPage(Stage previousStage) {
        Combat3StartPage CombatStartPage = new Combat3StartPage();
        try {
            CombatStartPage.start(new Stage());
            previousStage.close(); // 关闭原有舞台
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}




