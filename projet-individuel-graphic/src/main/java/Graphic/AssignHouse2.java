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

public class AssignHouse2 extends Application{

    private ImageView imageView;
    private ImageView houseImageView;
    private Image AssignHouse1;
    private Image AssignHouse2;
    private Image HouseG;
    private Image HouseS;
    private Image HouseR;
    private Image HouseH;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Harry Potter at home V1.0");

        // 加载默认图像

        InputStream input1 = getClass().getResourceAsStream("/image/AssignHouse1.jpg");
        AssignHouse1 = new Image(input1);

        InputStream input2 = getClass().getResourceAsStream("/image/AssignHouse2.jpg");
        AssignHouse2 = new Image(input2);

        InputStream input3 = getClass().getResourceAsStream("/image/HouseG.png");
        HouseG = new Image(input3);

        InputStream input4 = getClass().getResourceAsStream("/image/HouseS.png");
        HouseS = new Image(input4);

        InputStream input5 = getClass().getResourceAsStream("/image/HouseR.png");
        HouseR = new Image(input5);

        InputStream input6 = getClass().getResourceAsStream("/image/HouseH.png");
        HouseH = new Image(input6);

        // 创建 ImageView 控件并设置默认图像
        imageView = new ImageView(AssignHouse1);


        // 创建 Button 控件
        Button buttonCreate = new Button("");
        buttonCreate.setPrefSize(400, 90);
        buttonCreate.setTranslateY(240);
        buttonCreate.setTranslateX(0);
        buttonCreate.setOpacity(0);




        // 添加鼠标移入事件监听器
        buttonCreate.setOnMouseEntered(event -> {
            imageView.setImage(AssignHouse2);
        });

        // 添加鼠标移出事件监听器
        buttonCreate.setOnMouseExited(event -> {
            imageView.setImage(AssignHouse1);
        });

        buttonCreate.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                // 创建 ArrivalHouse3 实例
                AssignWand1 assignWand1 = new AssignWand1();
                // 调用 ArrivalHouse3 实例的 start() 方法显示新的场景
                try {
                    assignWand1.start(new Stage());
                } catch (Exception e) {
                    e.printStackTrace();
                }
                // 关闭当前场景
                stage.close();
            }
        });

        String wizardHouse = Game.wizard.getHouse().toString();

        //String wizardHouse = "Gryffindor";

        houseImageView = new ImageView(); // 初始化houseImageView

        TextField textField1 = new TextField();
        TextField textField2 = new TextField();

        textField1.setStyle(" -fx-translate-x: 630; -fx-translate-y:-60;-fx-font-size: 30px; -fx-text-fill: #e7c254; -fx-font-family:Courier New;-fx-background-color: transparent; -fx-border-color: transparent;");
        textField2.setStyle(" -fx-translate-x: 690; -fx-translate-y:0;-fx-font-size: 30px; -fx-text-fill: #e7c254; -fx-font-family:Courier New;-fx-background-color: transparent; -fx-border-color: transparent;");
        double houseImageWidth = 210;
        double houseImageHeight = 280;
        double houseImageX = -210;
        double houseImageY = -10;

        houseImageView.setFitWidth(houseImageWidth);
        houseImageView.setFitHeight(houseImageHeight);
        houseImageView.setTranslateX(houseImageX);
        houseImageView.setTranslateY(houseImageY);

        switch (wizardHouse) {
            case "Gryffindor":
                houseImageView.setImage(HouseG);
                textField1.setText("Gryffindor's Blessing:");
                textField2.setText("defense +10");
                break;
            case "Slytherin":
                houseImageView.setImage(HouseS);
                textField1.setText("Slytherin's Blessing:");
                textField2.setText("attack +10");
                break;
            case "Hufflepuff":
                houseImageView.setImage(HouseH);
                textField1.setText("Hufflepuff's Blessing:");
                textField2.setText("pharmacy +20");
                break;
            default:
                houseImageView.setImage(HouseR);
                textField1.setText("Ravenclaw's Blessing:");
                textField2.setText("precise +10");
                break;
        }

        // 创建 StackPane 布局容器，并将图像和按钮添加到其中
        StackPane stackPane = new StackPane(imageView, buttonCreate,houseImageView,textField1,textField2);

        // 创建场景并显示
        Scene scene = new Scene(stackPane, 1120, 700);
        stage.setScene(scene);
        stage.show();
    }




}
