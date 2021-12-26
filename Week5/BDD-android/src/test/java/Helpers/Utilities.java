package Helpers;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;

public class Utilities {

    public static void manuelswipe(int x1, int y1, int x2, int y2, AndroidDriver driver) {
        new TouchAction(driver).press(PointOption.point(x1, y1))
                .moveTo(PointOption.point(x2, y2)).release().perform();
    }

}