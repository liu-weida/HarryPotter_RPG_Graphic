package Graphic;

import Game.Game;
import Potion.Potion;
import Spell.Spell;
import Spell.ForbiddenSpell;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.event.ActionEvent;

import javafx.event.EventHandler;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import javafx.scene.layout.GridPane;
import javafx.geometry.HPos;
import javafx.geometry.VPos;

public class PropertyDisplay extends Application{

    private ImageView imageView;
    private Image PropertyDisplay1;
    private Image PropertyDisplay2;

//    public static List<Spell> spells = new ArrayList<>();
//    public static List<ForbiddenSpell> forbiddenSpells = new ArrayList<>();
//    public static List<Potion> potions = new ArrayList<>();


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Harry Potter at home V1.0");

        // 加载默认图像

        InputStream input1 = getClass().getResourceAsStream("/image/PropertyDisplay1.jpg");
        PropertyDisplay1 = new Image(input1);

        InputStream input2 = getClass().getResourceAsStream("/image/PropertyDisplay2.jpg");
        PropertyDisplay2 = new Image(input2);


        // 创建 ImageView 控件并设置默认图像
        imageView = new ImageView(PropertyDisplay1);


        // 创建 Button 控件
        Button buttonCreate = new Button("    ");
        buttonCreate.setPrefSize(175, 80);
        buttonCreate.setTranslateY(290);
        buttonCreate.setTranslateX(360);
        buttonCreate.setOpacity(0);



        //int[] properties = new int[]{0, 1, 2, 3, 4, 5};

        TextField textField0 = new TextField();
        textField0.setText(String.valueOf(Game.wizard.getLevel()));
        textField0.setStyle(" -fx-translate-x: 275; -fx-translate-y:-218;-fx-font-size: 25px; -fx-text-fill: #e7c254; -fx-font-family:Courier New;-fx-background-color: transparent; -fx-border-color: transparent;");

        TextField textField1 = new TextField();
        textField1.setText(String.valueOf(Game.wizard.getPharmacy()));
        textField1.setStyle(" -fx-translate-x: 275; -fx-translate-y:-185;-fx-font-size: 25px; -fx-text-fill: #e7c254; -fx-font-family:Courier New;-fx-background-color: transparent; -fx-border-color: transparent;");

        TextField textField2 = new TextField();
        textField2.setText(String.valueOf(Game.wizard.getDefense()));
        textField2.setStyle(" -fx-translate-x: 275; -fx-translate-y:-152;-fx-font-size: 25px; -fx-text-fill: #e7c254; -fx-font-family:Courier New;-fx-background-color: transparent; -fx-border-color: transparent;");

        TextField textField3 = new TextField();
        textField3.setText(String.valueOf(Game.wizard.getGold()));
        textField3.setStyle(" -fx-translate-x: 275; -fx-translate-y:-119;-fx-font-size: 25px; -fx-text-fill: #e7c254; -fx-font-family:Courier New;-fx-background-color: transparent; -fx-border-color: transparent;");

        TextField textField4 = new TextField();
        textField4.setText("OWL");
        textField4.setStyle(" -fx-translate-x: 255; -fx-translate-y:-86;-fx-font-size: 25px; -fx-text-fill: #e7c254; -fx-font-family:Courier New;-fx-background-color: transparent; -fx-border-color: transparent;");

        TextField textField5 = new TextField();
        textField5.setText(String.valueOf(Game.property[1]));
        textField5.setStyle(" -fx-translate-x: 520; -fx-translate-y:-218;-fx-font-size: 25px; -fx-text-fill: #e7c254; -fx-font-family:Courier New;-fx-background-color: transparent; -fx-border-color: transparent;");

        TextField textField6 = new TextField();
        textField6.setText(String.valueOf(Game.wizard.getAttack()));
        textField6.setStyle(" -fx-translate-x: 520; -fx-translate-y:-185;-fx-font-size: 25px; -fx-text-fill: #e7c254; -fx-font-family:Courier New;-fx-background-color: transparent; -fx-border-color: transparent;");

        TextField textField7 = new TextField();
        textField7.setText(String.valueOf(Game.wizard.getPrecise()));
        textField7.setStyle(" -fx-translate-x: 520; -fx-translate-y:-152;-fx-font-size: 25px; -fx-text-fill: #e7c254; -fx-font-family:Courier New;-fx-background-color: transparent; -fx-border-color: transparent;");

        TextField textField8 = new TextField();
        textField8.setText(String.valueOf(Game.wizard.getHouse()));
        textField8.setStyle(" -fx-translate-x:510; -fx-translate-y:-119;-fx-font-size: 25px; -fx-text-fill: #e7c254; -fx-font-family:Courier New;-fx-background-color: transparent; -fx-border-color: transparent;");

        TextField textField9 = new TextField();
        textField9.setText("Holly-Phoenix");
        textField9.setStyle(" -fx-translate-x: 460; -fx-translate-y:-86;-fx-font-size: 25px; -fx-text-fill: #e7c254; -fx-font-family:Courier New;-fx-background-color: transparent; -fx-border-color: transparent;");


        // 创建 StackPane 布局容器，并将图像和按钮添加到其中

//        spells.add(Spell.confringo);
//        spells.add(Spell.deprimo);
//        spells.add(Spell.expulso);
//
//        forbiddenSpells.add(ForbiddenSpell.crucio);
//        forbiddenSpells.add(ForbiddenSpell.crucio);
//        forbiddenSpells.add(ForbiddenSpell.crucio);
//
//        potions.add(Potion.invigorationDraught);
//        potions.add(Potion.invigorationDraught);
//        potions.add(Potion.invigorationDraught);

        VBox vBox1 = new VBox(10);
        vBox1.setStyle("-fx-translate-x: -200; -fx-translate-y:335;");
        Font font = Font.font("Courier", 20);
        String textColor = "#e7c254";
        String backgroundColor = "transparent";

        int i = 1;
        if (Game.spells.isEmpty()) {
            TextField textField = new TextField("No spell");
            textField.setEditable(false);
            Font font1 = Font.font("Courier", 25);
            textField.setFont(font1);
            textField.setStyle("-fx-text-fill: " + textColor + "; -fx-background-color: " + backgroundColor + ";");
            vBox1.setStyle("-fx-translate-x: -170; -fx-translate-y:335;");
            vBox1.getChildren().add(textField);
        } else {
            for (Spell spell : Game.spells) {
                TextField textField = new TextField(i + ". " + spell);
                textField.setEditable(false);
                textField.setFont(font);
                textField.setStyle("-fx-text-fill: " + textColor + "; -fx-background-color: " + backgroundColor + ";");
                vBox1.getChildren().add(textField);
                i++;
            }
        }


        i = 0;

        VBox vBox2 = new VBox(10);
        vBox2.setStyle("-fx-translate-x: -380; -fx-translate-y:370;");

        int j = 1;
        if (Game.forbiddenSpells.isEmpty()) {
            TextField textField = new TextField("No spell");
            textField.setEditable(false);
            Font font1 = Font.font("Courier", 25);
            textField.setFont(font1);
            textField.setStyle("-fx-text-fill: " + textColor + "; -fx-background-color: " + backgroundColor + ";");
            vBox2.setStyle("-fx-translate-x: -355; -fx-translate-y:370;");
            vBox2.getChildren().add(textField);
        } else {
            for (ForbiddenSpell forbiddenSpell : Game.forbiddenSpells) {
                TextField textField = new TextField(j + ". " + forbiddenSpell);
                textField.setEditable(false);
                textField.setFont(font);
                textField.setStyle("-fx-text-fill: " + textColor + "; -fx-background-color: " + backgroundColor + ";");
                vBox2.getChildren().add(textField);
                j++;
            }
        }

        j = 0;

        VBox vBox3 = new VBox(10);
        vBox3.setStyle("-fx-translate-x: 8; -fx-translate-y:335;");
        Font font1 = Font.font("Courier", 17);
        int p = 1;
        if (Game.potions.isEmpty()) {
            TextField textField = new TextField("No potion");
            textField.setEditable(false);
            font1 = Font.font("Courier", 25);
            textField.setFont(font1);
            textField.setStyle("-fx-text-fill: " + textColor + "; -fx-background-color: " + backgroundColor + ";");
            vBox3.getChildren().add(textField);
            vBox3.setStyle("-fx-translate-x: 35; -fx-translate-y:335;");
        } else {
            for (Potion potion : Game.potions) {
                TextField textField = new TextField(p + ". " + potion);
                textField.setEditable(false);
                textField.setFont(font1);
                textField.setStyle("-fx-text-fill: " + textColor + "; -fx-background-color: " + backgroundColor + ";");
                vBox3.getChildren().add(textField);
                p++;
            }
        }

        p = 0;
// 设置vBox1的宽度和高度限制
        vBox1.setMinWidth(220);
        vBox1.setMaxWidth(220);


// 设置vBox2的宽度和高度限制
        vBox2.setMinWidth(220);
        vBox2.setMaxWidth(220);


// 设置vBox3的宽度和高度限制
        vBox3.setMinWidth(250);
        vBox3.setMaxWidth(250);

        StackPane stackPane = new StackPane(imageView, buttonCreate, vBox1,vBox2,vBox3,textField0, textField1, textField2, textField3, textField4, textField5, textField6, textField7, textField8, textField9);
        // 添加鼠标移入事件监听器

        buttonCreate.setOnMouseEntered(event -> {
            imageView.setImage(PropertyDisplay2);
        });

        // 添加鼠标移出事件监听器
        buttonCreate.setOnMouseExited(event -> {
            imageView.setImage(PropertyDisplay1);
        });



        buttonCreate.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                // 创建 ArrivalHouse3 实例
                Menu menu = new Menu();
                try {
                    menu.start(new Stage());
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
