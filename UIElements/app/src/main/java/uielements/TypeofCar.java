package uielements;

import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Screen;
import javafx.stage.Stage;


public class TypeofCar {


    
    public  TypeofCar(Stage primaryStage){
        BookingData bookingData = new BookingData();

        VBox root = new VBox(10);
        root.setStyle("-fx-padding: 20; -fx-background-color:rgb(248, 248, 248);");

        Label label1 = new Label("รถที่พร้อมให้จอง");
        
        Button car1 = new Button("Nissan Note 2018");
        
        Button car2 = new Button("Toyota Yaris ATIV 2023");
        
        Button car3 = new Button("Nissan Almera 2022");
        
        
        car1.setId("Nissan Note 2018");
        car2.setId("Toyota Yaris ATIV 2023");
        car3.setId("Nissan Almera 2022");

        car1.setOnAction(e -> {
            bookingData.setSelectedCar("Nissan Note 2018");
            new RoundUI(primaryStage, bookingData);
        });
        car2.setOnAction(e -> {
            bookingData.setSelectedCar("Toyota Yaris ATIV 2023");
            new RoundUI(primaryStage, bookingData);
        });
        car3.setOnAction(e -> {
            bookingData.setSelectedCar("Nissan Almera 2022");
            new RoundUI(primaryStage, bookingData);
        });

        root.getChildren().addAll(label1, car1 , car2, car3 );

                    //สร้างหน้า (stage) ใหม่ โดยห่างจากหน้าแรก (+100,+50) ตาม x,y
        
        Scene scene = new Scene(root, 400, 600);
        primaryStage.setTitle("UI บวก CSS");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}