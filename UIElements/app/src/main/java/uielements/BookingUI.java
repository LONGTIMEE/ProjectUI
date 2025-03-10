package uielements;

// import javafx.animation.TranslateTransition;
// import javafx.application.Application;
// import javafx.geometry.Rectangle2D;
// import javafx.scene.Scene;
// import javafx.scene.control.*;
// import javafx.scene.layout.*;
// import javafx.stage.Screen;
// import javafx.stage.Stage;
// import javafx.util.Duration;

// public class BookingUI{

//     public BookingUI(Stage primaryStage){
//         VBox root = new VBox(10);
//         root.setStyle("-fx-padding: 20; -fx-background-color:rgb(216, 135, 135);");

//         Label label = new Label("ประเภทรถที่ต้องการจะจอง");
//         label.setStyle("-fx-font-size: 25px; -fx-text-fill: #333;");
//         Button fourTirebutton = new Button("4 ล้อ");
//         fourTirebutton.setStyle("-fx-background-color: #4CAF50; -fx-text-fill: white; -fx-font-weight: bold;");
//         Button twoTirebutton = new Button("2 ล้อ:coming soon");
//         twoTirebutton.setStyle("-fx-background-color: #4CAF50; -fx-text-fill: white; -fx-font-weight: bold;");
//         Button depositButton = new Button ("ฝากเงินในบัญชี");
//         depositButton.setStyle("-fx-background-color: #4CAF50; -fx-text-fill: white; -fx-font-weight: bold;");

//         fourTirebutton.setId("fourTirebutton");
//         twoTirebutton.setId("twoTirebutton");
//         depositButton.setId("depositbButton");

       
//         fourTirebutton.setOnAction(e -> new TypeofCar(primaryStage));
//         twoTirebutton.setOnAction(e -> new TypeofCar(primaryStage));
//       //  depositButton.setOnAction(e -> new Deposit(primaryStage));

        

//         root.getChildren().addAll(label, fourTirebutton, twoTirebutton, depositButton);

        
        
//         Scene scene = new Scene(root, 400, 600);
//         primaryStage.setTitle("ระบบเช่ารถ");
//         primaryStage.setX(primaryStage.getX() + 100);
//         primaryStage.setY(primaryStage.getY() + 50);
//         primaryStage.setScene(scene);
//         primaryStage.show();
//     }

// }
