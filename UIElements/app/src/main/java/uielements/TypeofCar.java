package uielements;

import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Screen;
import javafx.stage.Stage;

/**
 * คลาส TypeofCar ใช้แสดงรายการรถยนต์ที่พร้อมให้จอง
 */
public class TypeofCar {


    /**
     * คอนสตรักเตอร์ของ TypeofCar 
     *
     * @param primaryStage    หน้าหลัก
     * @param previousScene   Scene ก่อนหน้าที่ใช้สำหรับปุ่มย้อนกลับ
     */
    public  TypeofCar(Stage primaryStage , Scene previousScene){
        BookingData bookingData = new BookingData();

        VBox root = new VBox(10);
        root.setStyle("-fx-padding: 20; -fx-background-color:rgb(248, 248, 248);");

        /**
         * ข้อความ รถที่พร้อมให้จอง
         */
        Label label1 = new Label("รถที่พร้อมให้จอง");
        
        /**
         * ปุ่มจองรถ Nissan Note 2018
         */
        Button car1 = new Button("Nissan Note 2018");
        
        /**
         * ปุ่มจองรถ Toyota Yaris ATIV 2023
         */
        Button car2 = new Button("Toyota Yaris ATIV 2023");
        
        /**
         * ปุ่มจองรถ Nissan Almera 2022
         */
        Button car3 = new Button("Nissan Almera 2022");
        
        /**
         * ตั้งไอดีสำหรับการทดสอบ
         */
        car1.setId("Nissan Note 2018");
        car2.setId("Toyota Yaris ATIV 2023");
        car3.setId("Nissan Almera 2022");

        /**
         * ปุ่มย้อนกลับ
         */
        Button backButton = new Button("ย้อนกลับ");
        backButton.setOnAction(e -> primaryStage.setScene(previousScene)); // กลับไปหน้าก่อนหน้า

        /**
         * เมื่อกดปุ่มเลือกรถ จะถูกบันทึกไปที่ bookingData
         */
        car1.setOnAction(e -> {
            bookingData.setSelectedCar("Nissan Note 2018");
            new RoundUI(primaryStage, bookingData);
        });
        car2.setOnAction(e -> {
            bookingData.setSelectedCar("Toyota Yaris ATIV 2023");
            new RoundUI(primaryStage, bookingData);
        });
        car3.setOnAction(e -> {
            bookingData.setSelectedCar("Nissan Almera 2022");
            new RoundUI(primaryStage, bookingData);
        });

        /**
         * เพิ่มองค์ประกอบลงใน vbox 
         */
        root.getChildren().addAll(label1, car1 , car2, car3 )
        
        /**
         * สร้างฉาก
         */
        Scene scene = new Scene(root, 400, 600);
        primaryStage.setTitle("เลือกรถ สำหรับการจอง");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}