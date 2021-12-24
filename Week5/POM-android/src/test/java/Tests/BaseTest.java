package Tests;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseTest {

    public AndroidDriver<MobileElement> driver;
    String auth = "wp.wattpad:id/authentication_view_";

    @BeforeClass
    public void setup() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "Android");
        caps.setCapability("appium:app", "C:\\Users\\irem6.DESKTOP-8MQ14NE\\OneDrive\\Masaüstü\\Wattpad Read Write Stories_v9.43.0_apkpure.com.apk");
        caps.setCapability("appium:deviceName", "emulator-5554");
        caps.setCapability("fullReset", "true");
        caps.setCapability("noReset", "false");
        caps.setCapability("autoGrantPermissions", "true");

        driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), caps);
    }

    @AfterClass
    public void teardown() {
        driver.quit();
    }
}
