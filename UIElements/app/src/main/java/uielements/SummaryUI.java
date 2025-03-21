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
     * คอนสตรักเตอร์สำหรับสร้างหน้า สรุปรายการจอง
     * 
     * @param primaryStage  หน้าหลัก
     * @param bookingData   ออบเจ็กต์ที่เก็บข้อมูลการจองรถ
     */
    public SummaryUI(Stage primaryStage, BookingData bookingData) {
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
         * เพิ่มองค์ประกอบลงใน vbox
         */
        root.getChildren().addAll(label, carLabel, locationLabel, pickupLabel, returnLabel, paymentLabel);

        /**
         * กำหนดขนาดฉาก
         */
        Scene scene = new Scene(root, 400, 600);
        primaryStage.setTitle("สรุปรายการ");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}