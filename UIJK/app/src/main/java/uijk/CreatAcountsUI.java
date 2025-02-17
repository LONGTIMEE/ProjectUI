package uijk;

import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Screen;
import javafx.stage.Stage;


public class CreatAcountsUI{

    public CreatAcountsUI(Stage primaryStage){
        VBox root = new VBox(10);
        root.setStyle("-fx-padding: 20; -fx-background-color:rgb(248, 248, 248);");

        Label label1 = new Label("กรุณาสร้างรหัส");
        Label label2 = new Label("UserName");
        TextField usernameField = new TextField("");
        Label label3 = new Label("PassWord");
        TextField passwordField = new TextField("");
        Button creatAccountsButton = new Button("ปุ่ม (Button): สร้างรหัส");


        
        usernameField.setId("textField");
        passwordField.setId("textField");
        creatAccountsButton.setId("creatAccountsButton");




        creatAccountsButton.setOnAction(e -> new BookingUI(primaryStage));

        root.getChildren().addAll(label1,label2 , usernameField, label3, passwordField,creatAccountsButton);

        //สร้างหน้า (stage) ใหม่ โดยห่างจากหน้าแรก (+100,+50) ตาม x,y
        Stage secondStage = new Stage();
        Scene scene = new Scene(root, 400, 600);
        secondStage.setTitle("UI บวก CSS");
        secondStage.setX(primaryStage.getX() + 100);
        secondStage.setY(primaryStage.getY() + 50);
        secondStage.setScene(scene);
        secondStage.show();
    }

}

