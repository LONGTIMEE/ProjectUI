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

public class RoundUI{
   

    public RoundUI(Stage primaryStage,  Scene previousScene,BookingData bookingData){
        
        
        VBox root = new VBox(10);
        root.setStyle("-fx-padding: 20; -fx-background-color:rgb(216, 135, 135);");

        ComboBox<String> comboBox = new ComboBox<>();
        comboBox.getItems().addAll("สนามบินสุวรรณภูมิ", "สนามบินดอนเมือง", "เซ็นทรัล พระราม 3");
        
        Label takecarLabel = new Label("วันรับรถ");
        TextField takecarDateField = new DatePicker();
        takecarDateField.setPromptText("กรอกวันคืนรถ เช่น 20/02/2025");

        // เวลารับรถ (TextField)
        Label takecarTimeLabel = new Label("เวลารับรถ");
        ComboBox<String> takecarTimeBox = new ComboBox<>();
        takecarTimeBox.getItems().addAll("08:00", "10:00", "12:00", "14:00", "16:00", "18:00");

        // วันคืนรถ (TextField)
        Label sentcarLabel = new Label("วันคืนรถ");
        TextField sentcarDateField = new TextField();
        sentcarDateField.setPromptText("กรอกวันคืนรถ เช่น 20/02/2025");

        // เวลาคืนรถ (ComboBox)
        Label sentcarTimeLabel = new Label("เวลาคืนรถ");
        ComboBox<String> sentcarTimeBox = new ComboBox<>();
        sentcarTimeBox.getItems().addAll("08:00", "10:00", "12:00", "14:00", "16:00", "18:00");


        Button rentButton = new Button("เช่า");


        comboBox.setId("pickupLocationBox");
        takecarDateField.setId("pickupDateField");
        takecarTimeBox.setId("pickupTimeBox");
        sentcarDateField.setId("returnDateField");
        sentcarTimeBox.setId("returnTimeBox");
        rentButton.setId("button");


        

        rentButton.setOnAction(e -> {
            String pickupLocation = comboBox.getValue();
            String pickupDate = takecarDateField.getText();
            String pickupTime = takecarTimeBox.getValue();
            String returnDate = sentcarDateField.getText();
            String returnTime = sentcarTimeBox.getValue();

            // ตรวจสอบว่ากรอกข้อมูลครบ
            if (pickupLocation == null || pickupDate.isEmpty() || pickupTime == null || returnDate.isEmpty() || returnTime == null) {
                Alert alert = new Alert(Alert.AlertType.WARNING);
                alert.setTitle("ข้อมูลไม่ครบถ้วน");
                alert.setHeaderText(null);
                alert.setContentText("กรุณากรอกข้อมูลให้ครบทุกช่องก่อนทำการเช่ารถ");
                alert.showAndWait();
            } else {
                // บันทึกข้อมูลลง BookingData
                bookingData.setPickupLocation(pickupLocation);
                bookingData.setPickupDate(pickupDate); // เก็บเป็น String
                bookingData.setPickupTime(pickupTime);
                bookingData.setReturnDate(returnDate);
                bookingData.setReturnTime(returnTime);

                // ไปยังหน้าชำระเงิน
                new PaymentUI(primaryStage, bookingData);
            }
        });
            
            Button backButton = new Button("ย้อนกลับ");
        backButton.setOnAction(e -> primaryStage.setScene(previousScene));




        root.getChildren().addAll(comboBox ,takecarLabel, takecarDateField, takecarTimeLabel, takecarTimeBox, sentcarLabel, sentcarDateField, sentcarTimeLabel, sentcarTimeBox, rentButton, backButton);

        //สร้างหน้า (stage) ใหม่ โดยห่างจากหน้าแรก (+100,+50) ตาม x,y
        
        Scene scene = new Scene(root, 400, 600);
        primaryStage.setTitle("UI บวก CSS");
        primaryStage.setX(primaryStage.getX() + 100);
        primaryStage.setY(primaryStage.getY() + 50);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}


