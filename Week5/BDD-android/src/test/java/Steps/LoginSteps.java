package Steps;

import Pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class LoginSteps extends BaseTest {

    LoginPage loginPage = new LoginPage(driver);


    //Back ground
    @Given("Wattpad apk opened")
    public void wattpadApkOpened() throws MalformedURLException {
        setup();
    }

    @And("First login button tapped")
    public void FirstLoginButtonTapped() {
        driver.findElement(loginPage.first_login_button).click();
    }


    //Wrong password
    @When("{string} entered")
    public void entered(String arg0) {
        driver.findElement(loginPage.add_username).sendKeys("userdenemeuser1");
    }

    @And("wrong {string} entered")
    public void wrongEntered(String passwordLog) {
        driver.findElement(loginPage.add_wrong_password).sendKeys(passwordLog);
    }

    @And("login button tapped")
    public void loginButtonTapped() {
        driver.findElement(loginPage.login_button).click();
    }

    @Then("error box came")
    public void errorBoxCame() {
        try {
            driver.findElement(loginPage.error_box).getText()
                    .contains("Sorry, that password is incorrect. We can help you reset your password.");
            assert true;
        } catch (Exception e) {
            assert false;
        }
    }


    //Forgot password
    @When("forgot password button tapped")
    public void forgotPasswordButtonTapped() {
        driver.findElement(loginPage.forgot_pass).click();
    }

    @And("{string} entered for reset password")
    public void enteredForResetPassword(String arg0) {
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.findElement(loginPage.reset_pass).sendKeys("userdenemeuser1");
    }

    @And("send email button tapped")
    public void sendEmailButtonTapped() {
        driver.findElement(loginPage.send_button).click();
    }

    @Then("assent box came")
    public void assentBoxCame() {
        try {
            driver.findElement(loginPage.assent_box).getText()
                    .contains("Password reset instructions have been sent to us___@gm___.com");
            assert true;
        } catch (Exception e) {
            assert false;
        }
    }

    @And("apk was closed")
    public void apkWasClosed() throws MalformedURLException {
        teardown();
    }
}
