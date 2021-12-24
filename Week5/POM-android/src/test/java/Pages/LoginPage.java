package Pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class LoginPage extends BasePage {

    String auth = "wp.wattpad:id/authentication_view_";

    public LoginPage(AndroidDriver driver) {
        super(driver);
    }

    public LoginPage wrongPasswordWithCredentials(String username, String password) {

        MobileElement el_login = driver.findElementById("wp.wattpad:id/log_in_button");
        el_login.click();

        MobileElement el_enter_email = driver.findElementById(auth + "username_field");
        el_enter_email.sendKeys(username);

        MobileElement el_enter_password = driver.findElementById(auth + "password_field");
        el_enter_password.sendKeys(password);

        MobileElement el_enter_login = driver.findElementById(auth + "native_auth_button");
        el_enter_login.click();
        return this;
    }

    public void checkErrorMsg(String text) {
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        MobileElement el_error_box = driver.findElementById("wp.wattpad:id/snackbar_text");
        Assert.assertTrue(el_error_box.getText().contains(text));
    }


    public LoginPage forgotPasswordWithCredentials(String username) {
        MobileElement el_forgot_pass = driver.findElementById(auth + "password_forgot");
        el_forgot_pass.click();

        MobileElement el_reset_pass = driver.findElementById("wp.wattpad:id/reset_password_text");
        el_reset_pass.sendKeys(username);

        MobileElement el_send = driver.findElementById("android:id/button1");
        el_send.click();
        return this;
    }

    public void checkAssentMsg(String text) {
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        MobileElement el_assent_box = driver.findElementById("android:id/message");
        Assert.assertTrue(el_assent_box.getText().contains(text));
    }

}
