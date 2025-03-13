package uielements;


import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * คลาส SummaryUI สรุปรายการที่เลือก หรือ จอง
 */
public class SummaryUI {
    /**
     * สร้าง UI สำหรับแสดงสรุปรายการจอง
     * 
     * @param primaryStage  หน้าหลัก
     * @param previousScene  หน้าก่อนเข้ามา
     * @param bookingData   ออบเจ็กต์ที่เก็บข้อมูลการจองรถ
     */
    public SummaryUI(Stage primaryStage, Scene previousScene, BookingData bookingData) {
        VBox root = new VBox(10);

        /**
         * ข้อความ สรุปรายการจอง
         */
        Label label = new Label("สรุปรายการจอง");

        /**
         * ข้อความ เเสดงรถที่จอง
         */
        Label carLabel = new Label("รถที่จอง: " + bookingData.getSelectedCar());

        /**
         * ข้อความ เเสดงสถานที่รับรถ
         */
        Label locationLabel = new Label("สถานที่รับรถ: " + bookingData.getPickupLocation());

        /**
         * ข้อความ เเสดงวันรับรถ
         */
        Label pickupLabel = new Label("วันรับรถ: " + bookingData.getPickupDate());

        /**
         * ข้อความ เเสดงวันคืนรถ
         */
        Label returnLabel = new Label("วันคืนรถ: " + bookingData.getReturnDate());

        /**
         * ข้อความ เเสดงจำนวนเงินที่ต้องชำระ
         */
        Label paymentLabel = new Label("จำนวนเงินที่ต้องชำระ: " + bookingData.getPaymentAmount() + " บาท");

        /**
         * ปุ่มย้อนกลับ
         */
        Button backButton = new Button("ย้อนกลับ");
        backButton.setOnAction(e -> primaryStage.setScene(previousScene));

        /**
         * สร้างฉาก
         */
        root.getChildren().addAll(label, carLabel, locationLabel, pickupLabel, returnLabel, paymentLabel, backButton);
        Scene scene = new Scene(root, 400, 600);
        primaryStage.setTitle("สรุปรายการ");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}