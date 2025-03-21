package uielements;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.util.Duration;

public class RoundUI{
   
    /**
     * คอนสตรักเตอร์สำหรับสร้างหน้า รอบเวลา
     * 
     * @param primaryStage   หน้าหลักแอป
     * @param bookingData    อ็อบเจ็กต์ที่เก็บข้อมูลการจอง
     */
    public RoundUI(Stage primaryStage, BookingData bookingData){
        
        
        VBox root = new VBox(10);
        root.setStyle("-fx-padding: 20; -fx-background-color:rgb(216, 135, 135);");

        /**
         * ComboBox สถานที่รับรถ
         */
        ComboBox<String> comboBox = new ComboBox<>();
        comboBox.getItems().addAll("สนามบินสุวรรณภูมิ", "สนามบินดอนเมือง", "เซ็นทรัล พระราม 3");
        
        /**
         * ข้อความ วันรับรถ
         */
        Label takecarLabel = new Label("วันรับรถ");
        /**
         * ช่องใส่ข้อความ วันรับรถ
         */
        TextField takecarDateField = new TextField();
        takecarDateField.setPromptText("กรอกวันรับรถ เช่น 20/02/2025");

        /**
         * ข้อความ เวลารับรถ
         */
        Label takecarTimeLabel = new Label("เวลารับรถ");
        /**
         * ตัวเลือก เวลารับรถ
         */
        ComboBox<String> takecarTimeBox = new ComboBox<>();
        takecarTimeBox.getItems().addAll("08:00", "10:00", "12:00", "14:00", "16:00", "18:00");

        /**
         * ข้อความ วันคืนรถ
         */
        Label sentcarLabel = new Label("วันคืนรถ");

        /**
         * ช่องใส่ข้อความ วันคืนรถ
         */
        TextField sentcarDateField = new TextField();
        sentcarDateField.setPromptText("กรอกวันคืนรถ เช่น 20/02/2025");

        /**
         * ข้อความ เวลาคืนรถ
         */
        Label sentcarTimeLabel = new Label("เวลาคืนรถ");

        /**
         * ตัวเลือก เวลาคืนรถ
         */
        ComboBox<String> sentcarTimeBox = new ComboBox<>();
        sentcarTimeBox.getItems().addAll("08:00", "10:00", "12:00", "14:00", "16:00", "18:00");

        /**
         * ปุ่มเช่ารถ
         */
        Button rentButton = new Button("เช่า");


        /**
         * ตั้ง ID ที่มี Action ต่อผู้ใช้
         */
        comboBox.setId("pickupLocationBox");
        takecarDateField.setId("pickupDateField");
        takecarTimeBox.setId("pickupTimeBox");
        sentcarDateField.setId("returnDateField");
        sentcarTimeBox.setId("returnTimeBox");
        rentButton.setId("rentButton");


        
        /**
         * ดึงค่าจากสิ่งที่เลือกหรือพิมพ์ ถ้ายังไม่ได้เลือกจะเป็น null
         */
        rentButton.setOnAction(e -> {
            String pickupLocation = comboBox.getValue();
            String pickupDate = takecarDateField.getText();
            String pickupTime = takecarTimeBox.getValue();
            String returnDate = sentcarDateField.getText();
            String returnTime = sentcarTimeBox.getValue();

            /**
             * ตรวจสอบข้อมูลครบถ้วนหรือไม่ ถ้าไม่ ส่งคำเตือน
             */
            if (pickupLocation == null || pickupDate.isEmpty() || pickupTime == null || returnDate.isEmpty() || returnTime == null) {
                Alert alert = new Alert(Alert.AlertType.WARNING);
                alert.setTitle("ข้อมูลไม่ครบถ้วน");
                alert.setHeaderText(null);
                alert.setContentText("กรุณากรอกข้อมูลให้ครบทุกช่องก่อนทำการเช่ารถ");
                alert.showAndWait();
            } else {
                try {
                    
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                LocalDate pickupDateParsed = LocalDate.parse(pickupDate, formatter);
                LocalDate returnDateParsed = LocalDate.parse(returnDate, formatter);
                /**
                 * บันทึกข้อมูล ลงbookingData
                 */
                bookingData.setPickupLocation(pickupLocation);
                bookingData.setPickupDate(pickupDateParsed); 
                bookingData.setPickupTime(pickupTime);
                bookingData.setReturnDate(returnDateParsed);
                bookingData.setReturnTime(returnTime);

                /**
                 * ไปหน้าชำระเงิน
                 */
                new PaymentUI(primaryStage, bookingData);
            } catch (Exception ex) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("รูปแบบวันที่ไม่ถูกต้อง");
                alert.setHeaderText(null);
                alert.setContentText("กรุณากรอกวันที่ให้ถูกต้อง (ตัวอย่าง: 20/02/2025)");
                alert.showAndWait();
                }
            }
        });
            
    





        root.getChildren().addAll(comboBox ,takecarLabel, takecarDateField, takecarTimeLabel, takecarTimeBox, sentcarLabel, sentcarDateField, sentcarTimeLabel, sentcarTimeBox, rentButton);

        //สร้างหน้า (stage) ใหม่ โดยห่างจากหน้าแรก (+100,+50) ตาม x,y
        
        Scene scene = new Scene(root, 400, 600);
        primaryStage.setTitle("สถานที่-วันที่-เวลา");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}


