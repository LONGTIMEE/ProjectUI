package uielements;

import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Screen;
import javafx.stage.Stage;


public class TypeofCar{

    public TypeofCar(Stage primaryStage){
        VBox root = new VBox(10);
        root.setStyle("-fx-padding: 20; -fx-background-color:rgb(248, 248, 248);");

        Label label1 = new Label("รถที่พร้อมให้จอง");
        
        Button car1 = new Button("Nissan Note 2018");
        car1.setStyle("-fx-background-color: #4CAF50; -fx-text-fill: white; -fx-font-weight: bold;");
        Button car2 = new Button("Toyota Yaris ATIV 2023");
        car2.setStyle("-fx-background-color: #4CAF50; -fx-text-fill: white; -fx-font-weight: bold;");
        Button car3 = new Button("Nissan Almera 2022");
        car3.setStyle("-fx-background-color: #4CAF50; -fx-text-fill: white; -fx-font-weight: bold;");
        
        car1.setId("car1");
        car2.setId("car2");
        car3.setId("car3");

        car1.setOnAction(e -> new roundUI(primaryStage));
        car2.setOnAction(e -> new roundUI(primaryStage));
        car3.setOnAction(e -> new roundUI(primaryStage));


        root.getChildren().addAll(label1, car1 , car2, car3 );

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