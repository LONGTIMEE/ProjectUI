package uielements;

import static org.assertj.core.api.Assertions.assertThat;
import static org.testfx.assertions.api.Assertions.assertThat;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import org.junit.jupiter.api.Test;
import org.testfx.framework.junit5.ApplicationTest;

public class roundUITest extends ApplicationTest {

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
    public void testCreartAccount() {
        clickOn("#creatAccountsButton");
        clickOn("#usernamecreatField").write("2");
        clickOn("#passwordcreatField").write("2");
        clickOn("#creatAccountsButton");

        clickOn("#usernameField").write("2");
        clickOn("#passwordField").write("2");
        clickOn("#loginButton");

        

        clickOn("Nissan Note 2018");

        clickOn("#pickupLocationBox").write("สนามบินดอนเมือง");
        clickOn("#pickupDateField").write("19/02/2025");
        clickOn("#pickupTimeBox").clickOn("10:00");
        clickOn("#returnDateField").write("20/02/2025");
        clickOn("#returnTimeBox").clickOn("12:00");
        clickOn("#rentButton");

    
        verifyThat("#pickupDateField", (TextField t) -> t.getText().equals("19/02/2025"));
        verifyThat("#returnDateField", (TextField t) -> t.getText().equals("20/02/2025"));
    } 
}
