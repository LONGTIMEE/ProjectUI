/*
 * This source file was generated by the Gradle 'init' task
 */
package uijk;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
//import javafx.scene.layout.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class LoginUI extends Application {
    public LoginUI(Stage stage) {
        //TODO Auto-generated constructor stub
    }

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
        Button testloginButton = new Button("ปุ่ม (Button): testล็อคอิน");
        Button creatAccountsButton = new Button("ปุ่ม (Button): สร้างรหัส");
        
        
       
        usernameField.setId("textField");
        passwordField.setId("textField");
        loginButton.setId("bookingButton");
        creatAccountsButton.setId("creatAccountsButton");
        messageLabel.setId("messageLable");


       //  ตั้ง Action เมื่อผู้ใช้ทำ...กับ UI เช่นคลิกปุ่ม
       loginButton.setOnAction(e -> new BookingUI(primaryStage));
       creatAccountsButton.setOnAction(e -> new CreatAcountsUI(primaryStage));

       loginButton.setOnAction(e -> {
        User user = Database.authenticate(usernameField.getText(), passwordField.getText());
        if (user != null) new DashboardUI(primaryStage, user);
        else messageLabel.setText("Invalid credentials.");
    });
        

        //เพิ่มทุกอยุ่างลง VBox Container
        root.getChildren().addAll( loginLabel,nameLabel,usernameField,passwordLabel,passwordField,loginButton,creatAccountsButton, testloginButton, messageLabel );
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

