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

public class paymentUI{

/**
 * label เป็นการเเสดงข้อความเขียนว่า  กรุณาชำระเงิน
 * label1 เป็นการเเสดงข้อความเขียนว่า จำนวนเงินที่ต้องชำระ
 * priceField เป็นการใส่ข้อความเขียนว่า 1600
 * paybutton เป็นปุ่มสำหรับใช้งาน ชำระเงิน
 * 
 */
    public paymentUI(Stage primaryStage){
        VBox root = new VBox(10);
        root.setStyle("-fx-padding: 20; -fx-background-color:rgb(216, 135, 135);");

        Label label = new Label("กรุณาชำระเงิน");
        label.setStyle("-fx-font-size: 30px; -fx-text-fill: #333;");
        Label label1 = new Label("จำนวนเงินที่ต้องชำระ");
        label.setStyle("-fx-font-size: 25px; -fx-text-fill: #333;");
        final  TextField priceField = new TextField("1600");
        priceField.setStyle("-fx-border-color: #ccc; -fx-padding: 5px;");
        Button paybutton = new Button("ชำระเงิน");
        paybutton.setStyle("-fx-background-color: #4CAF50; -fx-text-fill: white; -fx-font-weight: bold;");
        
        
        priceField.setId("priceField");
        paybutton.setId("paybutton");

        
       
        root.getChildren().addAll(label, label1, priceField, paybutton);

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