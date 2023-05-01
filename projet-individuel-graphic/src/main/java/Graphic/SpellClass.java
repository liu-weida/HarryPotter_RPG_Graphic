package Graphic;

import Game.Game;

import Player.Wizard;
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
import org.w3c.dom.ls.LSOutput;

import java.io.InputStream;

public class SpellClass extends Application{


    private ImageView imageView;
    private Image Spell0;
    private Image Spell1;
    private Image Spell2;
    private Image Spell3;
    private Image Spell4;
    private Image Spell5;
    private Image Spell6;
    private Image Spell7;



    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Harry Potter at home V1.0");

        // 加载默认图像

        InputStream input = getClass().getResourceAsStream("/image/SpellClass1.jpg");
        Spell0 = new Image(input);

        InputStream input1 = getClass().getResourceAsStream("/image/SpellClass2.jpg");
        Spell1 = new Image(input1);

        InputStream input2 = getClass().getResourceAsStream("/image/SpellClass3.jpg");
        Spell2 = new Image(input2);

        InputStream input3 = getClass().getResourceAsStream("/image/SpellClass4.jpg");
        Spell3 = new Image(input3);

        InputStream input4 = getClass().getResourceAsStream("/image/SpellClass5.jpg");
        Spell4 = new Image(input4);

        InputStream input5 = getClass().getResourceAsStream("/image/SpellClass6.jpg");
        Spell5 = new Image(input5);

        InputStream input6 = getClass().getResourceAsStream("/image/SpellClass7.jpg");
        Spell6 = new Image(input6);

        InputStream input7 = getClass().getResourceAsStream("/image/SpellClass8.jpg");
        Spell7 = new Image(input7);



        // 创建 ImageView 控件并设置默认图像
        imageView = new ImageView(Spell0);


        // 创建 Button 控件
        Button buttonCreate1 = new Button("");
        buttonCreate1.setPrefSize(200, 70);
        buttonCreate1.setTranslateY(-66);
        buttonCreate1.setTranslateX(-322);
        buttonCreate1.setOpacity(0);

        Button buttonCreate2 = new Button("");
        buttonCreate2.setPrefSize(200, 70);
        buttonCreate2.setTranslateY(-66);
        buttonCreate2.setTranslateX(12);
        buttonCreate2.setOpacity(0);

        Button buttonCreate3 = new Button("");
        buttonCreate3.setPrefSize(200, 70);
        buttonCreate3.setTranslateY(-66);
        buttonCreate3.setTranslateX(332);
        buttonCreate3.setOpacity(0);

        Button buttonCreate4 = new Button("");
        buttonCreate4.setPrefSize(200, 70);
        buttonCreate4.setTranslateY(80);
        buttonCreate4.setTranslateX(-322);
        buttonCreate4.setOpacity(0);

        Button buttonCreate5 = new Button("");
        buttonCreate5.setPrefSize(200, 70);
        buttonCreate5.setTranslateY(80);
        buttonCreate5.setTranslateX(12);
        buttonCreate5.setOpacity(0);

        Button buttonCreate6 = new Button("");
        buttonCreate6.setPrefSize(200, 70);
        buttonCreate6.setTranslateY(80);
        buttonCreate6.setTranslateX(332);
        buttonCreate6.setOpacity(0);

        Button buttonCreate7 = new Button("");
        buttonCreate7.setPrefSize(200, 70);
        buttonCreate7.setTranslateY(226);
        buttonCreate7.setTranslateX(12);
        buttonCreate7.setOpacity(0);

        // 创建 StackPane 布局容器，并将图像和按钮添加到其中
        StackPane stackPane = new StackPane(imageView, buttonCreate1, buttonCreate2, buttonCreate3, buttonCreate4, buttonCreate5, buttonCreate6,buttonCreate7);

        // 添加鼠标移入事件监听器
        buttonCreate1.setOnMouseEntered(event -> {
            imageView.setImage(Spell1);
        });

        // 添加鼠标移出事件监听器
        buttonCreate1.setOnMouseExited(event -> {
            imageView.setImage(Spell0);
        });

        // 添加鼠标移入事件监听器
        buttonCreate2.setOnMouseEntered(event -> {
            imageView.setImage(Spell2);
        });

        // 添加鼠标移出事件监听器
        buttonCreate2.setOnMouseExited(event -> {
            imageView.setImage(Spell0);
        });

        // 添加鼠标移入事件监听器
        buttonCreate3.setOnMouseEntered(event -> {
            imageView.setImage(Spell3);
        });

        // 添加鼠标移出事件监听器
        buttonCreate3.setOnMouseExited(event -> {
            imageView.setImage(Spell0);
        });

        // 添加鼠标移入事件监听器
        buttonCreate4.setOnMouseEntered(event -> {
            imageView.setImage(Spell4);
        });

        // 添加鼠标移出事件监听器
        buttonCreate4.setOnMouseExited(event -> {
            imageView.setImage(Spell0);
        });

        // 添加鼠标移入事件监听器
        buttonCreate5.setOnMouseEntered(event -> {
            imageView.setImage(Spell5);
        });

        // 添加鼠标移出事件监听器
        buttonCreate5.setOnMouseExited(event -> {
            imageView.setImage(Spell0);
        });

        // 添加鼠标移入事件监听器
        buttonCreate6.setOnMouseEntered(event -> {
            imageView.setImage(Spell6);
        });

        // 添加鼠标移出事件监听器
        buttonCreate6.setOnMouseExited(event -> {
            imageView.setImage(Spell0);
        });

        // 添加鼠标移入事件监听器
        buttonCreate7.setOnMouseEntered(event -> {
            imageView.setImage(Spell7);
        });

        // 添加鼠标移出事件监听器
        buttonCreate7.setOnMouseExited(event -> {
            imageView.setImage(Spell0);
        });


        buttonCreate1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                int choose = 1; // 按钮1对应的选择
                Spell spell = Spell.chooseSpell(choose);

                if (Game.spells.contains(spell)) {
                    SpellLearned spellLearned = new SpellLearned();
                    try {
                        spellLearned.start(new Stage());
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    // 关闭当前场景
                    stage.close();
                } else {
                    if (Game.wizard.getLevel() < 1){

                        SpellLvInsufficient spellLvInsufficient = new  SpellLvInsufficient();
                        try {
                            spellLvInsufficient.start(new Stage());
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        // 关闭当前场景
                        stage.close();
                    }else {
                        Game.spells.add(spell);
                        //Game.wizard.setKnownSpells(spells);
                        SpellLearnedSuccessfully spellLearnedSuccessfully = new  SpellLearnedSuccessfully();
                        try {
                            spellLearnedSuccessfully.start(new Stage());
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        // 关闭当前场景
                        stage.close();
                    }
                }
            }
        });

        buttonCreate2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                int choose = 2; // 按钮1对应的选择
                Spell spell = Spell.chooseSpell(choose);

                if (Game.spells.contains(spell)) {
                    SpellLearned spellLearned = new SpellLearned();
                    try {
                        spellLearned.start(new Stage());
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    // 关闭当前场景
                    stage.close();
                } else {
                    if (Game.wizard.getLevel() < 3){

                        SpellLvInsufficient spellLvInsufficient = new  SpellLvInsufficient();
                        try {
                            spellLvInsufficient.start(new Stage());
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        // 关闭当前场景
                        stage.close();
                    }else {
                        Game.spells.add(spell);
                        //Game.wizard.setKnownSpells(spells);
                        SpellLearnedSuccessfully spellLearnedSuccessfully = new  SpellLearnedSuccessfully();
                        try {
                            spellLearnedSuccessfully.start(new Stage());
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        // 关闭当前场景
                        stage.close();
                    }
                }
            }
        });

        buttonCreate3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                int choose = 3; // 按钮1对应的选择
                Spell spell = Spell.chooseSpell(choose);

                if (Game.spells.contains(spell)) {
                    SpellLearned spellLearned = new SpellLearned();
                    try {
                        spellLearned.start(new Stage());
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    // 关闭当前场景
                    stage.close();
                } else {
                    if (Game.wizard.getLevel() < 5){

                        SpellLvInsufficient spellLvInsufficient = new  SpellLvInsufficient();
                        try {
                            spellLvInsufficient.start(new Stage());
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        // 关闭当前场景
                        stage.close();
                    }else {
                        Game.spells.add(spell);
                        //Game.wizard.setKnownSpells(spells);
                        SpellLearnedSuccessfully spellLearnedSuccessfully = new  SpellLearnedSuccessfully();
                        try {
                            spellLearnedSuccessfully.start(new Stage());
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        // 关闭当前场景
                        stage.close();
                    }
                }
            }
        });

        buttonCreate4.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                int choose = 4; // 按钮1对应的选择
                Spell spell = Spell.chooseSpell(choose);

                if (Game.spells.contains(spell)) {
                    SpellLearned spellLearned = new SpellLearned();
                    try {
                        spellLearned.start(new Stage());
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    // 关闭当前场景
                    stage.close();
                } else {
                    if (Game.wizard.getLevel() < 7){

                        SpellLvInsufficient spellLvInsufficient = new  SpellLvInsufficient();
                        try {
                            spellLvInsufficient.start(new Stage());
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        // 关闭当前场景
                        stage.close();
                    }else {
                        Game.spells.add(spell);
                        //Game.wizard.setKnownSpells(spells);
                        SpellLearnedSuccessfully spellLearnedSuccessfully = new  SpellLearnedSuccessfully();
                        try {
                            spellLearnedSuccessfully.start(new Stage());
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        // 关闭当前场景
                        stage.close();
                    }
                }
            }
        });

        buttonCreate5.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                int choose = 5; // 按钮1对应的选择
                Spell spell = Spell.chooseSpell(choose);

                if (Game.spells.contains(spell)) {
                    SpellLearned spellLearned = new SpellLearned();
                    try {
                        spellLearned.start(new Stage());
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    // 关闭当前场景
                    stage.close();
                } else {
                    if (Game.wizard.getLevel() < 9){

                        SpellLvInsufficient spellLvInsufficient = new  SpellLvInsufficient();
                        try {
                            spellLvInsufficient.start(new Stage());
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        // 关闭当前场景
                        stage.close();
                    }else {
                        Game.spells.add(spell);
                        //Game.wizard.setKnownSpells(spells);
                        SpellLearnedSuccessfully spellLearnedSuccessfully = new  SpellLearnedSuccessfully();
                        try {
                            spellLearnedSuccessfully.start(new Stage());
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        // 关闭当前场景
                        stage.close();
                    }
                }
            }
        });

        buttonCreate6.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                int choose = 6; // 按钮1对应的选择
                Spell spell = Spell.chooseSpell(choose);

                if (Game.spells.contains(spell)) {
                    SpellLearned spellLearned = new SpellLearned();
                    try {
                        spellLearned.start(new Stage());
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    // 关闭当前场景
                    stage.close();
                } else {
                    if (Game.wizard.getLevel() < 11){

                        SpellLvInsufficient spellLvInsufficient = new  SpellLvInsufficient();
                        try {
                            spellLvInsufficient.start(new Stage());
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        // 关闭当前场景
                        stage.close();
                    }else {
                        Game.spells.add(spell);
                        //Game.wizard.setKnownSpells(spells);
                        SpellLearnedSuccessfully spellLearnedSuccessfully = new  SpellLearnedSuccessfully();
                        try {
                            spellLearnedSuccessfully.start(new Stage());
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        // 关闭当前场景
                        stage.close();
                    }
                }
            }
        });

        buttonCreate7.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                int choose = 7; // 按钮1对应的选择
                Spell spell = Spell.chooseSpell(choose);

                if (Game.spells.contains(spell)) {
                    SpellLearned spellLearned = new SpellLearned();
                    try {
                        spellLearned.start(new Stage());
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    // 关闭当前场景
                    stage.close();
                } else {
                    if (Game.wizard.getLevel() < 13){

                        SpellLvInsufficient spellLvInsufficient = new  SpellLvInsufficient();
                        try {
                            spellLvInsufficient.start(new Stage());
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        // 关闭当前场景
                        stage.close();
                    }else {
                        Game.spells.add(spell);
                        //Game.wizard.setKnownSpells(spells);
                        SpellLearnedSuccessfully spellLearnedSuccessfully = new  SpellLearnedSuccessfully();
                        try {
                            spellLearnedSuccessfully.start(new Stage());
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        // 关闭当前场景
                        stage.close();
                    }
                }
            }
        });




        // 创建场景并显示
        Scene scene = new Scene(stackPane, 1120, 700);
        stage.setScene(scene);
        stage.show();
    }




}