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
 * คลาส สร้างบัญชี
 */
public class CreatAcountsUI {

        /**
         * คอนสตรักเตอร์สำหรับสร้างหน้าสมัครบัญชีใหม่
         * 
         * @param primaryStage หน้าหลักเเอป
         */
        public CreatAcountsUI(Stage primaryStage) {

                /**
                 * สร้างระยะห่าง ของ Layout ต่างๆ
                 */
                VBox root = new VBox(10);
                root.setStyle("-fx-padding: 20; -fx-background-color:rgb(248, 248, 248);");

                /**
                 * ข้อความ กรุณาสร้างรหัส
                 */
                Label label1 = new Label("กรุณาสร้างรหัส");

                /**
                 * ข้อความ UserName
                 */
                Label label2 = new Label("UserName");

                /**
                 * ใส่ข้อความ ชื่อบัญชีที่ต้องการสร้าง
                 */
                TextField usernamecreatField = new TextField("");

                /**
                 * ข้อความ PassWord
                 */
                Label label3 = new Label("PassWord");

                /**
                 * ใส่ข้อความ รหัสที่ต้องการสร้างบัญชี
                 */
                TextField passwordcreatField = new TextField("");

                /**
                 * ปุ่ม สร้างรหัส
                 */
                Button creatAccountsButton = new Button("ปุ่ม (Button): สร้างรหัส");
                
                /**
                 * ตั้งไอดีเอาไว้ทดสอบ
                 */
                usernamecreatField.setId("usernamecreatField");
                passwordcreatField.setId("passwordcreatField");
                creatAccountsButton.setId("creatAccountsButton");
                messagecreatLabel.setId("messagecreatLabel");


               
                /**
                 * กำหนดการกระทำ เมื่อกดปุ่มสร้างรหัส กรอกข้อมูลเข้ามาเเล้วเก็บใน Database 
                 * สมัครเสร็จไปหน้า Login ชื่อผู้ใช้ซ้ำเเจ้งเตือนออกมา
                 */
                creatAccountsButton.setOnAction(e -> {
                        if (Database.registerUser(usernamecreatField.getText(), passwordcreatField.getText()))
                            new LoginUI(primaryStage);
                        else messagecreatLabel.setText("Username already taken.");
                    });

                /**
                 * เพิ่มองค์ประกอบลง Vbox
                 */
                root.getChildren().addAll(label1, label2, usernamecreatField, label3, passwordcreatField, creatAccountsButton, messagecreatLabel);

                /**
                 * สร้างฉาก กว้าง,สูง หัวข้อหน้านั้นๆ
                 */
                Scene scene = new Scene(root, 400, 600);
                primaryStage.setTitle("สร้างรหัส");
                primaryStage.setScene(scene);
                primaryStage.show();

        }

}