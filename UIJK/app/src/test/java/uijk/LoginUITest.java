package uijk;

import static org.testfx.assertions.api.Assertions.assertThat;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import org.junit.jupiter.api.Test;
import org.testfx.framework.junit5.ApplicationTest;



public class LoginUITest extends ApplicationTest {
   
    private TextField usernameField;
    private TextField passwordField;
    private Button loginButton;

    @Override
    public void start(Stage stage) {
        new LoginUI(stage);
    }
    @Test
    public void testLoginUIElementsExist() {
        usernameField = lookup("#usernameField").query();
        passwordField = lookup("#passwordField").query();
        loginButton = lookup("#loginButton").query();

        assertThat(usernameField).isNotNull();
        assertThat(passwordField).isNotNull();
        assertThat(loginButton).isNotNull();
    }

    @Test
    public void testLoginWithInvalidCredentials() {
        clickOn("#usernameField").write("wronguser");
        clickOn("#passwordField").write("wrongpass");
        clickOn("#loginButton");

        assertThat(lookup("#messageLabel").queryLabeled().getText()).isEqualTo("Invalid credentials.");
}
}
