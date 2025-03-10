package uielements;

import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Screen;
import javafx.stage.Stage;

public class CreatAcountsUI {

        public CreatAcountsUI(Stage primaryStage) {
                VBox root = new VBox(10);
                root.setStyle("-fx-padding: 20; -fx-background-color:rgb(248, 248, 248);");

                Label label1 = new Label("กรุณาสร้างรหัส");
                Label label2 = new Label("UserName");
                TextField usernamecreatField = new TextField("");
                Label label3 = new Label("PassWord");
                TextField passwordcreatField = new TextField("");
                Button creatAccountsButton = new Button("ปุ่ม (Button): สร้างรหัส");
                Label messagecreatLabel = new Label();

                usernamecreatField.setId("usernamecreatField");
                passwordcreatField.setId("passwordcreatField");
                creatAccountsButton.setId("creatAccountsButton");
                messagecreatLabel.setId("messagecreatLabel");


               // creatAccountsButton.setOnAction(e -> new LoginUI(primaryStage));
                // creatAccountsButton.setOnAction(e -> new LoginUI.start(primaryStage));

                creatAccountsButton.setOnAction(e -> {
                        if (Database.registerUser(usernamecreatField.getText(), passwordcreatField.getText()))
                            new LoginUI(primaryStage);
                        else messagecreatLabel.setText("Username already taken.");
                    });

                root.getChildren().addAll(label1, label2, usernamecreatField, label3, passwordcreatField, creatAccountsButton, messagecreatLabel);


                Scene scene = new Scene(root, 400, 600);
                primaryStage.setTitle("UI บวก CSS");
                primaryStage.setX(primaryStage.getX() + 100);
                primaryStage.setY(primaryStage.getY() + 50);
                primaryStage.setScene(scene);
                primaryStage.show();

        }

}