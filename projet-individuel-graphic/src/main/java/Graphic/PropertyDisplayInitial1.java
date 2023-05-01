package Graphic;

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

public class PropertyDisplayInitial1 extends Application{

    private ImageView imageView;
    private Image AssigningProperties1;
    private Image AssigningProperties2;


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Harry Potter at home V1.0");

        // 加载默认图像

        InputStream input1 = getClass().getResourceAsStream("/image/PropertyDisplayInitial1.jpg");
        AssigningProperties1 = new Image(input1);

        InputStream input2 = getClass().getResourceAsStream("/image/PropertyDisplayInitial2.jpg");
        AssigningProperties2 = new Image(input2);


        // 创建 ImageView 控件并设置默认图像
        imageView = new ImageView(AssigningProperties1);


        // 创建 Button 控件
        Button buttonCreate = new Button("");
        buttonCreate.setPrefSize(240, 80);
        buttonCreate.setTranslateY(230);
        buttonCreate.setTranslateX(0);
        buttonCreate.setOpacity(0);




        // 添加鼠标移入事件监听器
        buttonCreate.setOnMouseEntered(event -> {
            imageView.setImage(AssigningProperties2);
        });

        // 添加鼠标移出事件监听器
        buttonCreate.setOnMouseExited(event -> {
            imageView.setImage(AssigningProperties1);
        });

        buttonCreate.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                // 创建 ArrivalHouse3 实例
                PropertyDisplayInitial2 propertyDisplayInitial2 = new PropertyDisplayInitial2();
                // 调用 ArrivalHouse3 实例的 start() 方法显示新的场景
                try {
                    propertyDisplayInitial2.start(new Stage());
                } catch (Exception e) {
                    e.printStackTrace();
                }
                // 关闭当前场景
                stage.close();
            }
        });

        int[] properties = Game.property;
        Game.wizard.getHouse().toString();
        Game.wizard.getWand().toString();
        Game.wizard.getPet().toString();
        Game.wizard.getLevel();
        Game.wizard.getPharmacy();
        Game.wizard.getAttack();
        Game.wizard.getDefense();
        Game.wizard.getPrecise();
        Game.wizard.getGold();

        //int[] properties = new int[] {1, 2, 3,4,5,6};

        TextField textField0 = new TextField();
        textField0.setPrefWidth(50);
        textField0.setText(String.valueOf(properties[0]));
        textField0.setStyle(" -fx-translate-x: 250; -fx-translate-y:-112;-fx-font-size: 30px; -fx-text-fill: #e7c254; -fx-font-family:Courier New;-fx-background-color: transparent; -fx-border-color: transparent;");

        TextField textField1 = new TextField();
        textField1.setPrefWidth(50);
        textField1.setText(String.valueOf(properties[1]));
        textField1.setStyle(" -fx-translate-x: 250; -fx-translate-y:-76;-fx-font-size: 30px; -fx-text-fill: #e7c254; -fx-font-family:Courier New;-fx-background-color: transparent; -fx-border-color: transparent;");

        TextField textField2 = new TextField();
        textField2.setPrefWidth(50);
        textField2.setText(String.valueOf(properties[2]));
        textField2.setStyle(" -fx-translate-x: 320; -fx-translate-y:-36;-fx-font-size: 30px; -fx-text-fill: #e7c254; -fx-font-family:Courier New;-fx-background-color: transparent; -fx-border-color: transparent;");

        TextField textField3 = new TextField();
        textField3.setPrefWidth(50);
        textField3.setText(String.valueOf(properties[3]));
        textField3.setStyle(" -fx-translate-x: 320; -fx-translate-y:0;-fx-font-size: 30px; -fx-text-fill: #e7c254; -fx-font-family:Courier New;-fx-background-color: transparent; -fx-border-color: transparent;");

        TextField textField4 = new TextField();
        textField4.setPrefWidth(50);
        textField4.setText(String.valueOf(properties[4]));
        textField4.setStyle(" -fx-translate-x: 320; -fx-translate-y:38;-fx-font-size: 30px; -fx-text-fill: #e7c254; -fx-font-family:Courier New;-fx-background-color: transparent; -fx-border-color: transparent;");

        TextField textField5 = new TextField();
        textField5.setPrefWidth(50);
        textField5.setText(String.valueOf(properties[5]));
        textField5.setStyle(" -fx-translate-x: 320; -fx-translate-y:76;-fx-font-size: 30px; -fx-text-fill: #e7c254; -fx-font-family:Courier New;-fx-background-color: transparent; -fx-border-color: transparent;");

        TextField textField6 = new TextField();
        textField6.setPrefWidth(50);
        textField6.setText(String.valueOf(Game.wizard.getHouse().toString()));
        textField6.setStyle(" -fx-translate-x: 680; -fx-translate-y:-112;-fx-font-size: 30px; -fx-text-fill: #e7c254; -fx-font-family:Courier New;-fx-background-color: transparent; -fx-border-color: transparent;");

        TextField textField7 = new TextField();
        textField7.setPrefWidth(50);
        textField7.setText(String.valueOf("Holly Phoenix 11'"));
        textField7.setStyle(" -fx-translate-x: 680; -fx-translate-y:-76;-fx-font-size: 30px; -fx-text-fill: #e7c254; -fx-font-family:Courier New;-fx-background-color: transparent; -fx-border-color: transparent;");

        TextField textField8 = new TextField();
        textField8.setPrefWidth(50);
        textField8.setText(String.valueOf(Game.wizard.getPet()));
        textField8.setStyle(" -fx-translate-x: 680; -fx-translate-y:-36;-fx-font-size: 30px; -fx-text-fill: #e7c254; -fx-font-family:Courier New;-fx-background-color: transparent; -fx-border-color: transparent;");

        TextField textField9 = new TextField();
        textField9.setPrefWidth(50);
        textField9.setText(String.valueOf(Game.wizard.getGold()));
        textField9.setStyle(" -fx-translate-x: 680; -fx-translate-y:0;-fx-font-size: 30px; -fx-text-fill: #e7c254; -fx-font-family:Courier New;-fx-background-color: transparent; -fx-border-color: transparent;");


        // 创建 StackPane 布局容器，并将图像和按钮添加到其中
        StackPane stackPane = new StackPane(imageView, buttonCreate,textField0,textField1,textField2,textField3,textField4,textField5,textField6,textField7,textField8,textField9);

        // 创建场景并显示
        Scene scene = new Scene(stackPane, 1120, 700);
        stage.setScene(scene);
        stage.show();
    }



}
