package uielements;

// import javafx.application.Application;
// import javafx.geometry.Rectangle2D;
// import javafx.scene.Scene;
// import javafx.scene.control.*;
// import javafx.scene.layout.*;
// import javafx.stage.Screen;
// import javafx.stage.Stage;

// public class Deposit {

//     public Deposit(Stage primaryStage) {
//         VBox root = new VBox(10);
//         root.setStyle("-fx-padding: 20; -fx-background-color:rgb(248, 248, 248);");
//         Label balanceLabel = new Label("Balance: $" + user.getBalance());

//         Label label1 = new Label("กรุณาฝากเงิน ก่อนทำการจอง");
//         Label label2 = new Label("จำนวนเงินขั้นต่ำ: 2000Bath");
//         TextField amountField = new TextField("");

//         Button depositButton = new Button("ปุ่ม (Button): ฝากเงิน");
//         Button backButton = new Button("ย้อนกลับ");

//         amountField.setId("usernamecreatField");
//         depositButton.setId("passwordcreatField");

//         balanceLabel.setId("balanceLabel");


//         depositButton.setOnAction(e -> {
//             double amount = Double.parseDouble(amountField.getText());
//             user.deposit(amount);
//             balanceLabel.setText("Balance: $" + user.getBalance());
//         });


//         backButton.setOnAction(e -> new BookingUI(primaryStage));
        

//         root.getChildren().addAll(balanceLabel, new Label("Amont:") ,label1, label2,amountField , depositButton,  backButton);

//         Scene scene = new Scene(root, 400, 600);
//         primaryStage.setTitle("UI บวก CSS");
//         primaryStage.setX(primaryStage.getX() + 100);
//         primaryStage.setY(primaryStage.getY() + 50);
//         primaryStage.setScene(scene);
//         primaryStage.show();

//     }

// }