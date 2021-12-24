package Pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class SignUpPage extends BasePage {

    String auth = "wp.wattpad:id/authentication_view_";

    public SignUpPage(AndroidDriver driver) {
        super(driver);
    }

    public void wrongSignUpWithCredentials(String email, String username, String password) {

        MobileElement el_join = driver.findElementByXPath("//*[@text='Join for free']");
        el_join.click();

        MobileElement el_add_email = driver.findElementById(auth + "email_field");
        el_add_email.sendKeys(email);

        MobileElement el_add_username = driver.findElementById(auth + "username_field");
        el_add_username.sendKeys(username);

        MobileElement el_add_password = driver.findElementById(auth + "password_field");
        el_add_password.sendKeys(password);

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        MobileElement el_username_error = driver.findElementByXPath("//android.widget.LinearLayout[2]/android.widget.ImageView");
        el_username_error.click();

        MobileElement el_error_message = driver.findElementByXPath("//android.widget.ScrollView/android.widget.LinearLayout/android.view.View[1]");
        el_error_message.isDisplayed();
        Assert.assertTrue(el_error_message.isDisplayed(), "not displayed");
    }

    public SignUpPage successSignUpWithCredentials(String email, String username, String password) {

        MobileElement el_join = driver.findElementByXPath("//*[@text='Join for free']");
        el_join.click();

        MobileElement el_add_email = driver.findElementById(auth + "email_field");
        el_add_email.sendKeys(email);

        MobileElement el_add_username = driver.findElementById(auth + "username_field");
        el_add_username.sendKeys(username);

        MobileElement el_add_password = driver.findElementById(auth + "password_field");
        el_add_password.sendKeys(password);

        MobileElement el_birthday = driver.findElementById("wp.wattpad:id/authentication_view_dob_field");
        el_birthday.click();

        //day
        new TouchAction(driver).press(PointOption.point(359, 1251)).moveTo(PointOption.point(338, 909)).release().perform();
        new TouchAction(driver).press(PointOption.point(358, 1247)).moveTo(PointOption.point(341, 916)).release().perform();
        //month
        new TouchAction(driver).press(PointOption.point(540, 937)).moveTo(PointOption.point(539, 1237)).release().perform();
        new TouchAction(driver).press(PointOption.point(547, 1042)).moveTo(PointOption.point(543, 1118)).release().perform();
        //year
        new TouchAction(driver).press(PointOption.point(735, 909)).moveTo(PointOption.point(732, 1254)).release().perform();
        new TouchAction(driver).press(PointOption.point(721, 923)).moveTo(PointOption.point(720, 1250)).release().perform();
        new TouchAction(driver).press(PointOption.point(721, 909)).moveTo(PointOption.point(718, 1254)).release().perform();
        new TouchAction(driver).press(PointOption.point(728, 902)).moveTo(PointOption.point(725, 1240)).release().perform();
        new TouchAction(driver).press(PointOption.point(728, 916)).moveTo(PointOption.point(718, 1248)).release().perform();


        MobileElement el_birthday_set = driver.findElementById("android:id/button1");
        el_birthday_set.click();

        MobileElement el_start = driver.findElementById("wp.wattpad:id/authentication_view_native_auth_button");
        el_start.click();

        return this;
    }

    public void checkMsg(String text) {
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        MobileElement el_welcome_title = driver.findElementById("wp.wattpad:id/greeting");
        Assert.assertTrue(el_welcome_title.getText().contains(text));
    }
}
