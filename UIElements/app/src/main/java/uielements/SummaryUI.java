package uielements;


import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SummaryUI {
    public SummaryUI(Stage primaryStage, BookingData bookingData) {
        VBox root = new VBox(10);
        Label label = new Label("สรุปรายการจอง");

        Label carLabel = new Label("รถที่จอง: " + bookingData.getSelectedCar());
        Label locationLabel = new Label("สถานที่รับรถ: " + bookingData.getPickupLocation());
        Label pickupLabel = new Label("วันรับรถ: " + bookingData.getPickupDate());
        Label returnLabel = new Label("วันคืนรถ: " + bookingData.getReturnDate());
        Label paymentLabel = new Label("จำนวนเงินที่ต้องชำระ: " + bookingData.getPaymentAmount() + " บาท");

        root.getChildren().addAll(label, carLabel, locationLabel, pickupLabel, returnLabel, paymentLabel);
        Scene scene = new Scene(root, 400, 600);
        primaryStage.setTitle("สรุปรายการ");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}