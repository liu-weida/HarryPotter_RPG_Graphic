package Graphic;

import Enemy.Enemy;
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

public class FightingGargoylesForbiddenSpell02 extends Application {

    private TextArea textArea;

    private TextField textField;
    private ImageView imageView;
    private Image TrainingGround;
    private Stage mainStage; // 添加成员变量


    private String[] dialogues = {};
    private int currentDialogue = 0;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        Game.wizard.forbiddenAttack(Game.wizard, Enemy.gargoyle, ForbiddenSpell.crucio);


        dialogues = new String[]{
                "You have dealt " + Wizard.injuryF + " points of damage to Gargoyle!",
        };

        if (Enemy.gargoyle.getHP() > 0) {
            Enemy.gargoyle.attack(Game.wizard, Enemy.gargoyle, Game.spells.get(0));
            String newString = "Enemy has dealt " + Enemy.injury + " points of damage to you!";
            dialogues = Arrays.copyOf(dialogues, dialogues.length + 1); // 扩展数组长度
            dialogues[dialogues.length - 1] = newString; // 添加新字符串到数组

        }else {
            String newString = "Battle won, level +1,gold+ "+Enemy.gargoyle.getGold();
            Game.wizard.setGold(Game.wizard.getGold()+Enemy.gargoyle.getGold());
            dialogues = Arrays.copyOf(dialogues, dialogues.length + 1); // 扩展数组长度
            dialogues[dialogues.length - 1] = newString; // 添加新字符串到数组
        }


        mainStage = stage; // 初始化成员变量
        stage.setTitle("Harry Potter at home V1.0");

        // 加载默认图像
        InputStream input1 = getClass().getResourceAsStream("/image/BackgroundGargoyle.jpg");
        TrainingGround = new Image(input1);


        // 创建 ImageView 控件并设置默认图像
        imageView = new ImageView(TrainingGround);

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
        StackPane stackPane = new StackPane(imageView, textField);
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
            if (Enemy.gargoyle.getHP() <= 0) {
                PageTransition.smoothTransition(mainStage, mainStage.getScene().getRoot(), () -> showBattleVictory(mainStage));
            } else {

                if (Game.property[1]<=0){
                    PageTransition.smoothTransition(mainStage, mainStage.getScene().getRoot(), () -> showGameOver(mainStage));
                }else {
                    PageTransition.smoothTransition(mainStage, mainStage.getScene().getRoot(), () -> showTrainingGround2(mainStage));
                }

            }
        }
    }

    private void showBattleVictory(Stage previousStage) {
        BattleVictory BattleVictory = new BattleVictory();
        try {
            BattleVictory.start(new Stage());
            previousStage.close(); // 关闭原有舞台
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void showTrainingGround2(Stage previousStage) {
        TrainingGround2 trainingGround2 = new TrainingGround2();
        try {
            trainingGround2.start(new Stage());
            previousStage.close(); // 关闭原有舞台
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private void showGameOver(Stage previousStage) {
        GameOver gameOver = new GameOver();
        try {
            gameOver.start(new Stage());
            previousStage.close(); // 关闭原有舞台
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}