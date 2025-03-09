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




/**
 * label เป็นการเเสดงข้อความเขียนว่า  จุดรับ-คืนรถ
 * nameLabel เป็นการเเสดงข้อความเขียนว่า วัน-เวลารับรถ
 * takecarField เป็นการกรอกข้อความ วันที่ต้องการเเละเวลารับรถ
 * password เป็นการเเสดงข้อความเขียนว่า วัน-เวลาคืนรถ
 * sentcarField เป็นการกรอกข้อความ วันที่ต้องการเเละเวลาคืนรถ
 * button เป็นปุ่มสำหรับใช้งาน ในการเช่า เพื่อที่จะไปจ่ายเงิน
 * 
 */
    public roundUI(Stage primaryStage){
        VBox root = new VBox(10);
        root.setStyle("-fx-padding: 20; -fx-background-color:rgb(216, 135, 135);");

        Label label = new Label("จุดรับ-คืนรถ");
        TextField planetakecarField = new TextField("");
        Label nameLabel = new Label("วัน-เวลารับรถ");
        TextField takecarField = new TextField("19/02/2025 10:00น");
        Label password = new Label("วัน-เวลาคืนรถ");
        TextField sentcarField = new TextField("20/02/2025 10:00น");
        Button button = new Button("เช่า");

        takecarField.setId("takecarField");
        sentcarField.setId("sentcarField");



        /**
         * เป็นปุ่มเช่ารถ ที่จะไปหน้าการจ่ายเงิน
         */
        button.setOnAction(e -> new paymentUI(primaryStage));
       

        /**
         * เพิ่มทุกอยุ่างลง VBox Container เพื่อจัดวางลง
         */

        root.getChildren().addAll(label, comboBox, nameLabel, takecarField, password, sentcarField, button);


        /**
         * ตั้งขนาดหน้าจอและ Show VBox
         */
        Stage secondStage = new Stage();
        Scene scene = new Scene(root, 400, 600);
        secondStage.setTitle("UI บวก CSS");
        secondStage.setX(primaryStage.getX() + 100);
        secondStage.setY(primaryStage.getY() + 50);
        secondStage.setScene(scene);
        secondStage.show();
    }

}
