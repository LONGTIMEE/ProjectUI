/*
 * This source file was generated by the Gradle 'init' task
 */
package uielements;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;


public class LoginUI extends Application {
    @Override
    public void start(Stage primaryStage) {

        // สร้าง Container ไว้ใส่ UI 
        VBox root = new VBox(10);
        root.setStyle("-fx-padding: 20;");

        // สร้าง องค์ประกอบใน UI
        // ถ้าสำคัญให้ .setid("ตั้งชื่อ") เพื่อไว้ทำ Testcase ด้วย 
        Label loginLabel = new Label("กรุณาล็อคอิน");
        Label nameLabel = new Label("UserName");
        TextField usernameField = new TextField("");
        Label passwordLabel = new Label("PassWord");
        TextField passwordField = new TextField("");
        Label messageLabel = new Label();
       
        Button loginButton = new Button("ปุ่ม (Button): ล็อคอิน");
        
        Button creatAccountsButton = new Button("ปุ่ม (Button): สร้างรหัส");


        // ตั้ง Action เมื่อผู้ใช้ทำ...กับ UI เช่นคลิกปุ่ม
        loginButton.setOnAction(e -> new BookingUI(primaryStage));
       creatAccountsButton.setOnAction(e -> new CreatAcountsUI(primaryStage));


   
        

       

        //เพิ่มทุกอยุ่างลง VBox Container
        root.getChildren().addAll(loginLabel,nameLabel,usernameField,passwordLabel,passwordField,loginButton,creatAccountsButton,  messageLabel);
        //ตั้งขนาดหน้าจอและ Show VBox
        Scene scene = new Scene(root, 400, 600);
        primaryStage.setTitle("JavaFX UI Components");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

