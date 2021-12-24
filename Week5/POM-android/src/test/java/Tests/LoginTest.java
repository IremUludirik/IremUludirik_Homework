package Tests;

import Pages.LoginPage;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test(priority = 0)
    public void wrongPassword() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.wrongPasswordWithCredentials("userdenemeuser1", "1")
                .checkErrorMsg("Sorry, that password is incorrect. We can help you reset your password.");
    }

    @Test(priority = 1)
    public void forgotPassword() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.forgotPasswordWithCredentials("userdenemeuser1")
                .checkAssentMsg("Password reset instructions have been sent to us___@gm___.com");
    }
}

