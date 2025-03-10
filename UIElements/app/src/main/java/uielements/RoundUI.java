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
    //private BookingData bookingData;

    public RoundUI(Stage primaryStage, BookingData bookingData){
        //this.bookingData = bookingData;
        
        VBox root = new VBox(10);
        root.setStyle("-fx-padding: 20; -fx-background-color:rgb(216, 135, 135);");

        ComboBox<String> comboBox = new ComboBox<>();
        comboBox.getItems().addAll("สนามบินสุวรรณภูมิ", "สนามบินดอนเมือง", "เซ็นทรัล พระราม 3");
        Label nameLabel = new Label("วัน-เวลารับรถ");
        TextField takecarField = new TextField("19/02/2025 10:00น");
        Label password = new Label("วัน-เวลาคืนรถ");
        TextField sentcarField = new TextField("20/02/2025 10:00น");
        Button button = new Button("เช่า");

        takecarField.setId("takecarField");
        sentcarField.setId("sentcarField");
        
        button.setId("button");

    
        button.setOnAction(e -> {
            bookingData.setPickupLocation(comboBox.getValue());
            bookingData.setPickupDate(takecarField.getText());
            bookingData.setReturnDate(sentcarField.getText());
            new PaymentUI(primaryStage, bookingData);
        });
       
        root.getChildren().addAll(comboBox ,nameLabel, takecarField, password, sentcarField, button);

        //สร้างหน้า (stage) ใหม่ โดยห่างจากหน้าแรก (+100,+50) ตาม x,y
        
        Scene scene = new Scene(root, 400, 600);
        primaryStage.setTitle("UI บวก CSS");
        primaryStage.setX(primaryStage.getX() + 100);
        primaryStage.setY(primaryStage.getY() + 50);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}


