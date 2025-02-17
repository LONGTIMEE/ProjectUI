package uijk;

import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.util.Duration;

public class BookingUI{

    public BookingUI(Stage primaryStage){
        VBox root = new VBox(10);
        root.setStyle("-fx-padding: 20; -fx-background-color:rgb(216, 135, 135);");

        Label label = new Label("ประเภทรถที่ต้องการจะจอง");
        label.setStyle("-fx-font-size: 25px; -fx-text-fill: #333;");
        Button fourTirebutton = new Button("4 ล้อ");
        fourTirebutton.setStyle("-fx-background-color: #4CAF50; -fx-text-fill: white; -fx-font-weight: bold;");
        Button twoTirebutton = new Button("2 ล้อ:coming soon");
        twoTirebutton.setStyle("-fx-background-color: #4CAF50; -fx-text-fill: white; -fx-font-weight: bold;");
        
        fourTirebutton.setId("fourTirebutton");
        twoTirebutton.setId("twoTirebutton");

        fourTirebutton.setOnAction(e -> new TypeofCar(primaryStage));
        twoTirebutton.setOnAction(e -> new TypeofCar(primaryStage));
        
        // Animation
        // button.setOnAction(e -> {
        //     TranslateTransition transition = new TranslateTransition(Duration.seconds(2), label);
        //     transition.setFromX(0);
        //     transition.setToX(200);
        //     transition.setCycleCount(TranslateTransition.INDEFINITE);
        //     transition.setAutoReverse(true);
        //     transition.play();
        // });

        root.getChildren().addAll(label, fourTirebutton, twoTirebutton);

        //สร้างหน้า (stage) ใหม่ โดยห่างจากหน้าแรก (+100,+50) ตาม x,y
        Stage secondStage = new Stage();
        Scene scene = new Scene(root, 400, 600);
        secondStage.setTitle("ระบบเช่ารถ");
        secondStage.setX(primaryStage.getX() + 100);
        secondStage.setY(primaryStage.getY() + 50);
        secondStage.setScene(scene);
        secondStage.show();
    }

}
