package uielements;

import static org.assertj.core.api.Assertions.assertThat;
import static org.testfx.assertions.api.Assertions.assertThat;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import org.junit.jupiter.api.Test;
import org.testfx.framework.junit5.ApplicationTest;

public class TypeofCarUITest extends ApplicationTest {

    private TextField usernameField;
    private TextField passwordField;
    private Button loginButton;

    @Override
    public void start(Stage stage) {
        new LoginUI(stage);
    }
    @Test
    public void testBookingUI() {
        usernameField = lookup("#usernameField").query();
        passwordField = lookup("#passwordField").query();
        loginButton = lookup("#loginButton").query();
    }
    @Test
    public void testTypeofcarUI() {
        clickOn("#creatAccountsButton");
        clickOn("#usernamecreatField").write("2");
        clickOn("#passwordcreatField").write("2");
        clickOn("#creatAccountsButton");

        clickOn("#usernameField").write("2");
        clickOn("#passwordField").write("2");
        clickOn("#loginButton");


        clickOn("Nissan Note 2018");

        
        
        
    }
}