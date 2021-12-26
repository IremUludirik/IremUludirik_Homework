package Steps;

import Pages.SignUpPage;
import Helpers.Utilities;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

public class SignUpSteps extends BaseTest {

    SignUpPage signUpPage = new SignUpPage(driver);


    //Back ground
    @Given("Wattpad opened")
    public void wattpadOpened() throws MalformedURLException {
        setup();
    }

    @And("Join for free button tapped")
    public void joinForFreeButtonTapped() {
        driver.findElement(signUpPage.join_button).click();
    }


    //Use of username containing inappropriate characters
    @When("{string} email entered")
    public void emailEntered(String emailNeg) {
        driver.findElement(signUpPage.add_email).sendKeys(emailNeg);
    }

    @And("{string} containing inappropriate characters entered")
    public void containingInappropriateCharactersEntered(String usernameNeg) {
        driver.findElement(signUpPage.add_username).sendKeys(usernameNeg);
    }

    @And("{string} password entered")
    public void passwordEntered(String passwordNeg) {
        driver.findElement(signUpPage.add_password).sendKeys(passwordNeg);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

    @And("error image came")
    public void errorImageCame() {
        driver.findElement(signUpPage.username_error).click();
    }


    @Then("error message came")
    public void errorMessageCame() {
        try {
            driver.findElement(signUpPage.error_message).isDisplayed();
            assert true;
        } catch (Exception e) {
            assert false;
        }
    }


    //Successfully sign up
    @When("{string} entered for successfully sign up with email")
    public void enteredForSuccessfullySignUpWithEmail(String emailPos) {
        driver.findElement(signUpPage.add_email).sendKeys(emailPos);
    }

    @And("{string} entered for successfully sign up with username")
    public void enteredForSuccessfullySignUpWithUsername(String usernamePos) {
        driver.findElement(signUpPage.add_username).sendKeys(usernamePos);
    }

    @And("{string} entered for successfully sign up with password")
    public void enteredForSuccessfullySignUpWithPassword(String passwordPos) {
        driver.findElement(signUpPage.add_password).sendKeys(passwordPos);
    }

    @And("birthday entered")
    public void birthdayEntered() {
        driver.findElement(signUpPage.enter_birthday).click();
    }

    @And("birthday fixed")
    public void birthdayFixed() {
        //day
        IntStream.range(0, 2).forEach(i -> Utilities.manuelswipe(359, 1251, 338, 909, driver));
        //month
        IntStream.range(0, 2).forEach(i -> Utilities.manuelswipe(540, 937, 539, 1237, driver));
        //year
        IntStream.range(0, 5).forEach(i -> Utilities.manuelswipe(728, 916, 718, 1248, driver));
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

    @And("birthday setted")
    public void birthdaySetted() {
        driver.findElement(signUpPage.birthday_set).click();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

    @And("start button tapped")
    public void StartButtonTapped() {
        driver.findElement(signUpPage.enter_start).click();
    }

    @Then("welcome title came")
    public void welcomeTitleCame() {
        try {
            driver.findElement(signUpPage.welcome_title).getText().contains("Hi");
            assert true;
        } catch (Exception e) {
            assert false;
        }
    }

    @And("apk closed")
        public void apkClosed() throws MalformedURLException {
            teardown();
    }
}
