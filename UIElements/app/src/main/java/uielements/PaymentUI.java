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



public class PaymentUI{
    private BookingData bookingData;

    public PaymentUI(Stage primaryStage, BookingData bookingData){
        this.bookingData = bookingData;

        VBox root = new VBox(10);
        root.setStyle("-fx-padding: 20; -fx-background-color:rgb(216, 135, 135);");

        Label label = new Label("กรุณาชำระเงิน");
        label.setStyle("-fx-font-size: 30px; -fx-text-fill: #333;");
        Label label1 = new Label("จำนวนเงินที่ต้องชำระ");
        label.setStyle("-fx-font-size: 25px; -fx-text-fill: #333;");
        TextField priceField = new TextField("1600");
        priceField.setEditable(false);

        priceField.setStyle("-fx-border-color: #ccc; -fx-padding: 5px;");
        Button paybutton = new Button("ชำระเงิน");
        paybutton.setStyle("-fx-background-color: #4CAF50; -fx-text-fill: white; -fx-font-weight: bold;");
        
        
        priceField.setId("priceField");
        paybutton.setId("paybutton");



        paybutton.setOnAction(e -> {
            bookingData.setPaymentAmount(priceField.getText());
            new SummaryUI(primaryStage, bookingData);
        });
        

        Button backButton = new Button("ย้อนกลับ");
        backButton.setOnAction(e -> primaryStage.setScene(previousScene));
        

        root.getChildren().addAll(label, label1, priceField, paybutton, backButton);

        
        
        Scene scene = new Scene(root, 400, 600);
        primaryStage.setTitle("UI บวก CSS");
        primaryStage.setX(primaryStage.getX() + 100);
        primaryStage.setY(primaryStage.getY() + 50);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}