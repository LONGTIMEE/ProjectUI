package uielements;

import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.util.Duration;

public class roundUI{

    public roundUI(Stage primaryStage){
        VBox root = new VBox(10);
        root.setStyle("-fx-padding: 20; -fx-background-color:rgb(216, 135, 135);");

        Label label = new Label("จุดรับ-คืนรถ");
        label.setStyle("-fx-font-size: 25px; -fx-text-fill: #333;");
        ComboBox<String> comboBox = new ComboBox<>();
        comboBox.getItems().addAll("สนามบินสุวรรณภูมิ", "สนามบินดอนเมือง", "เซ็นทรัล พระราม3");
        comboBox.setPromptText("เมนูเลือกแบบดรอปดาวน์ (ComboBox)");
        Label nameLabel = new Label("วัน-เวลารับรถ");
        TextField takecarField = new TextField("19/02/2025 10:00น");
        Label password = new Label("วัน-เวลาคืนรถ");
        TextField sentcarField = new TextField("20/02/2025 10:00น");
        Button button = new Button("เช่า");

        takecarField.setId("takecarField");
        sentcarField.setId("sentcarField");




        button.setOnAction(e -> new paymentUI(primaryStage));
       
        root.getChildren().addAll(label, comboBox, nameLabel, takecarField, password, sentcarField, button);

        //สร้างหน้า (stage) ใหม่ โดยห่างจากหน้าแรก (+100,+50) ตาม x,y
        Stage secondStage = new Stage();
        Scene scene = new Scene(root, 400, 600);
        secondStage.setTitle("UI บวก CSS");
        secondStage.setX(primaryStage.getX() + 100);
        secondStage.setY(primaryStage.getY() + 50);
        secondStage.setScene(scene);
        secondStage.show();
    }

}
