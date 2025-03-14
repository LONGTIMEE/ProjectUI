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
import javafx.scene.layout.VBox;


/**
 * 
 * คลาส PaymentUI เเสดงการชำระเงิน
 * 
 */
public class PaymentUI{
    
/**
 * คอนสตรักเตอร์สำหรับสร้างหน้า จ่ายเงิน
 * 
 * @param primaryStage  หน้าหลัก เเอป
 * @param bookingData   อ็อบเจ็กต์ที่เก็บข้อมูลการจอง
 */
    public PaymentUI(Stage primaryStage, BookingData bookingData){
        
        /**
         * สร้าง กล่อง
         */
        VBox root = new VBox(10);
        root.setStyle("-fx-padding: 20; -fx-background-color:rgb(216, 135, 135);");


        /**
         * ข้อความ กรุณาชำระเงิน
         */
        Label label = new Label("กรุณาชำระเงิน");
        label.setStyle("-fx-font-size: 30px; -fx-text-fill: #333;");

        /**
         * ข้อความ จำนวนเงินที่ต้องชำระ
         */
        Label label1 = new Label("จำนวนเงินที่ต้องชำระ");
        label.setStyle("-fx-font-size: 25px; -fx-text-fill: #333;");

        /**
         * ช่องใส่ข้อความ ถูกตั้งไว้ที่ 1600 เเก้ไขไม่ได้
         */
        TextField priceField = new TextField("1600");
        priceField.setEditable(false);
        priceField.setStyle("-fx-border-color: #ccc; -fx-padding: 5px;");


        /**
         * ปุ่ม ชำระเงิน
         */
        Button paybutton = new Button("ชำระเงิน");
        paybutton.setStyle("-fx-background-color: #4CAF50; -fx-text-fill: white; -fx-font-weight: bold;");
        
        /**
         * ตั้งไอดีสำหรับการทดสอบ
         */
        priceField.setId("priceField");
        paybutton.setId("paybutton");


        /**
         * ทำ Action กดปุ่มชำระเงิน บันทึกจำนวนเงินไปยัง bookingData เพื่อสรุปในหน้าการจอง
         */
        paybutton.setOnAction(e -> {
            bookingData.setPaymentAmount(priceField.getText());
            new SummaryUI(primaryStage, bookingData);
        });
        
        
        
        /**
         * เพิ่มองค์ประกอบ
         */
        root.getChildren().addAll(label, label1, priceField, paybutton);

        
        /**
         * สร้างฉาก 
         */
        Scene scene = new Scene(root, 400, 600);
        primaryStage.setTitle("ชำระเงิน");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}