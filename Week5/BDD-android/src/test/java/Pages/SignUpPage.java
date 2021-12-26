package Pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class SignUpPage extends BasePage {

    public SignUpPage(AndroidDriver driver) {
        super(driver);
    }


    //Back ground
    public static final By join_button = By.xpath("//*[@text='Join for free']");


    // Multiple use
    public static final By add_email = By.id("wp.wattpad:id/authentication_view_" + "email_field");
    public static final By add_username = By.id("wp.wattpad:id/authentication_view_" + "username_field");
    public static final By add_password = By.id("wp.wattpad:id/authentication_view_" + "password_field");


    //Use of username containing inappropriate characters
    public static final By username_error = By.xpath("//android.widget.LinearLayout[2]/android.widget.ImageView");
    public static final By error_message = By.xpath("//android.widget.ScrollView/android.widget.LinearLayout/android.view.View[1]");


    //Successfully sign up
    public static final By enter_birthday = By.id("wp.wattpad:id/authentication_view_dob_field");
    public static final By birthday_set = By.id("android:id/button1");
    public static final By enter_start = By.id("wp.wattpad:id/authentication_view_native_auth_button");
    public static final By welcome_title = By.id("wp.wattpad:id/greeting");

}
