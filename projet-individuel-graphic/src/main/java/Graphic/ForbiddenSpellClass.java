package Graphic;

import Game.Game;
import Spell.Spell;
import Spell.ForbiddenSpell;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.event.ActionEvent;

import javafx.event.EventHandler;

import java.io.InputStream;

public class ForbiddenSpellClass extends Application{

    private ImageView imageView;
    private Image Spell;
    private Image Spell1;
    private Image Spell2;
    private Image Spell3;



    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Harry Potter at home V1.0");

        // 加载默认图像

        InputStream input = getClass().getResourceAsStream("/image/ForbiddenSpellsClass1.jpg");
        Spell = new Image(input);

        InputStream input1 = getClass().getResourceAsStream("/image/ForbiddenSpellsClass2.jpg");
        Spell1 = new Image(input1);

        InputStream input2 = getClass().getResourceAsStream("/image/ForbiddenSpellsClass3.jpg");
        Spell2 = new Image(input2);

        InputStream input3 = getClass().getResourceAsStream("/image/ForbiddenSpellsClass4.jpg");
        Spell3 = new Image(input3);



        // 创建 ImageView 控件并设置默认图像
        imageView = new ImageView(Spell);


        // 创建 Button 控件
        Button buttonCreate1 = new Button("");
        buttonCreate1.setPrefSize(390, 90);
        buttonCreate1.setTranslateY(-26);
        buttonCreate1.setTranslateX(-258);
        buttonCreate1.setOpacity(0);

        Button buttonCreate2 = new Button("");
        buttonCreate2.setPrefSize(390, 90);
        buttonCreate2.setTranslateY(-26);
        buttonCreate2.setTranslateX(230);
        buttonCreate2.setOpacity(0);

        Button buttonCreate3 = new Button("");
        buttonCreate3.setPrefSize(390, 90);
        buttonCreate3.setTranslateY(130);
        buttonCreate3.setTranslateX(4);
        buttonCreate3.setOpacity(0);


        // 创建 StackPane 布局容器，并将图像和按钮添加到其中
        StackPane stackPane = new StackPane(imageView, buttonCreate1, buttonCreate2, buttonCreate3);

        // 添加鼠标移入事件监听器
        buttonCreate1.setOnMouseEntered(event -> {
            imageView.setImage(Spell1);
        });

        // 添加鼠标移出事件监听器
        buttonCreate1.setOnMouseExited(event -> {
            imageView.setImage(Spell);
        });

        // 添加鼠标移入事件监听器
        buttonCreate2.setOnMouseEntered(event -> {
            imageView.setImage(Spell2);
        });

        // 添加鼠标移出事件监听器
        buttonCreate2.setOnMouseExited(event -> {
            imageView.setImage(Spell);
        });

        // 添加鼠标移入事件监听器
        buttonCreate3.setOnMouseEntered(event -> {
            imageView.setImage(Spell3);
        });

        // 添加鼠标移出事件监听器
        buttonCreate3.setOnMouseExited(event -> {
            imageView.setImage(Spell);
        });



        buttonCreate1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                int choose = 1;
                ForbiddenSpell forbiddenSpell = ForbiddenSpell.chooseForbiddenSpell(choose);
                if (Game.forbiddenSpells.contains(forbiddenSpell)) {
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
                        Game.forbiddenSpells.add(forbiddenSpell);
                        //wizard.setKnownForbiddenSpells(forbiddenSpells);
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
                int choose = 2;
                ForbiddenSpell forbiddenSpell = ForbiddenSpell.chooseForbiddenSpell(choose);
                if (Game.forbiddenSpells.contains(forbiddenSpell)) {
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
                        Game.forbiddenSpells.add(forbiddenSpell);
                        //wizard.setKnownForbiddenSpells(forbiddenSpells);
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
                int choose = 3;
                ForbiddenSpell forbiddenSpell = ForbiddenSpell.chooseForbiddenSpell(choose);
                if (Game.forbiddenSpells.contains(forbiddenSpell)) {
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
                        Game.forbiddenSpells.add(forbiddenSpell);
                        //wizard.setKnownForbiddenSpells(forbiddenSpells);
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