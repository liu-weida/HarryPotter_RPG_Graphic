package Graphic;

import Enemy.Boss;
import javafx.application.Application;
import javafx.event.EventHandler;
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
import javafx.stage.Stage;

import java.io.InputStream;

public class Chapter73 extends Application {

    private TextArea textArea;

    private TextField textField;
    private ImageView imageView;
    private Image Chapter0;
    private Stage mainStage; // 添加成员变量

    private String[] dialogues = {
            "You've just defeated Bellatrix Lestrange and watched Voldemort fly towards you.",
            "In the blink of an eye, an eerie black light struck, and it was Avada Kedavra.",
            "You can't avoid it, this is your best friend Jim rushed to your front and blocked the blow for you.",
            "\"Jim!!!\" You wail, while using a spell to hit Voldemort.",
            "Your wand lights up, and the wand in Voldemort's hand lights up as well.",
            "You know it's a resonance between the same kind of staff wick, which can lead to unpredictable things happening.",
            "Just see the wand in Voldemort's hand flew out a light and the light of the wand in your hand merged into one, and all of a sudden, you feel a warm power filled your whole body.",
            "[Your attack +20]",
            "You continue to recite the incantation and attack Voldemort.",
            "In that moment, you decided that even if you put everything you had into it, you would take revenge on Voldemort and bring it all to an end.",

    };
    private int currentDialogue = 0;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        mainStage = stage; // 初始化成员变量
        stage.setTitle("Harry Potter at home V1.0");

        // 加载默认图像
        InputStream input1 = getClass().getResourceAsStream("/image/Chapter73.jpg");
        Chapter0 = new Image(input1);


        // 创建 ImageView 控件并设置默认图像
        imageView = new ImageView(Chapter0);

        textField = new TextField();
        Font font = Font.font("Courier New", 20);
        textField.setFont(font);
        textField.setMaxWidth(1000);
        textField.setMaxHeight(50);
        textField.setTranslateY(230);
        textField.setTranslateX(0);
        textField.setEditable(false);
        textField.setText(""
    );
        textField.setStyle("-fx-background-color: transparent; -fx-text-fill: #ffffff; -fx-border-color: transparent;");

        // 创建 StackPane 布局容器，并将图像和按钮添加到其中
        StackPane stackPane = new StackPane(imageView, textField);
        // 创建场景并显示
        Scene scene = new Scene(stackPane, 1120, 700);

//        // 设置自定义鼠标指针
//        InputStream cursorInput = new InputStream("C:\\Users\\DELL\\Desktop\\projet-individuel\\src\\main\\java\\Graphic\\image\\Rocks.png");
//        Image cursorImage = new Image(cursorInput);
//        scene.setCursor(new ImageCursor(cursorImage));

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
            PageTransition.smoothTransition(mainStage, mainStage.getScene().getRoot(), this::showNextScene);
        }
    }

    private void showNextScene() {
        Boss.voldemort.setHP(1000);
        Combat8StartPage chapter71 = new Combat8StartPage();
        try {
            chapter71.start(mainStage);
        } catch (Exception e) {
            e.printStackTrace();
            // 如果需要，您可以在此处添加其他异常处理逻辑
        }
    }



}
