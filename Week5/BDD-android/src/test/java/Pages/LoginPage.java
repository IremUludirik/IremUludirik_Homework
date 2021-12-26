package Pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class LoginPage extends BasePage {

    public LoginPage(AndroidDriver driver) {
        super(driver);
    }


    //Back ground
    public static final By first_login_button = By.id("wp.wattpad:id/log_in_button");


    //Wrong password
    public static final By add_username = By.id("wp.wattpad:id/authentication_view_" + "username_field");
    public static final By add_wrong_password = By.id("wp.wattpad:id/authentication_view_" + "password_field");
    public static final By login_button = By.id("wp.wattpad:id/authentication_view_" + "native_auth_button");
    public static final By error_box = By.id("wp.wattpad:id/snackbar_text");


    //Forgot password
    public static final By forgot_pass = By.id("wp.wattpad:id/authentication_view_" + "password_forgot");
    public static final By reset_pass = By.id("wp.wattpad:id/reset_password_text");
    public static final By send_button = By.id("android:id/button1");
    public static final By assent_box = By.id("android:id/message");

}
