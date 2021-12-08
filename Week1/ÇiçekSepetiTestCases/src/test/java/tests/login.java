package tests;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.*;
import java.util.concurrent.TimeUnit;

public class login {
    private WebDriver driver;
    private Map<String, Object> vars;
    JavascriptExecutor js;

    @Before
    public void setUp() {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        options.addArguments("start-maximized");
        options.addArguments("incognito");
        options.addArguments("disable-popup-blocking");
        Map prefs = new HashMap();
        prefs.put("profile.default_content_settings.cookies", 2);
        options.setExperimentalOption("prefs", prefs);

        //options.addArguments("headless");
        driver = new ChromeDriver(options);
        js = (JavascriptExecutor) driver;
        vars = new HashMap<String, Object>();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        //sayfa acildi
        Actions act = new Actions(driver);
        driver.get("https://www.ciceksepeti.com/");


        //ekran buyudu
        driver.manage().window().maximize();


        // close popups
        driver.findElement(By.cssSelector(".js-subheader-close")).click();
        driver.findElement(By.className("js-policy-close")).click();

    }

    @Test
    public void falselogin() throws InterruptedException {

        //uyelik top bar acilis
        Actions action = new Actions(driver);
        WebElement we = driver.findElement(By.xpath("//*[@class=\" user-menu__icon user-menu__icon--account icon-user_2\"]"));
        action.moveToElement(we).build().perform();


        // uye girisi secilir
        driver.findElement(By.linkText("Üye Girişi")).click();


        // e-mail yazilir
        driver.findElement(By.id("EmailLogin")).click();
        driver.findElement(By.id("EmailLogin")).sendKeys("vfdcsxa@hotmail.com");


        // hatali sifre yazilir
        driver.findElement(By.id("Password")).click();
        driver.findElement(By.id("Password")).sendKeys("34343434343434");

        // giris butonuna basilir
        driver.findElement(By.cssSelector(".pull-right")).click();


        // uyari ekrani gelir
        driver.findElement(By.cssSelector(".modal-body")).click();

        WebDriverWait wait = new WebDriverWait(driver, 8);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".modal-body")));

        WebDriverWait waitt = new WebDriverWait(driver, 8);
        waitt.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".modal-footer > .btn")));


        // tamam butonuna basilir
        driver.findElement(By.cssSelector(".modal-footer > .btn")).click();

      }


    @Test
    public void truelogin() throws InterruptedException {

        //uyelik top bar acilis
        Actions action = new Actions(driver);
        WebElement we = driver.findElement(By.xpath("//*[@class=\" user-menu__icon user-menu__icon--account icon-user_2\"]"));
        action.moveToElement(we).build().perform();


        // uye girisi secilir
        driver.findElement(By.linkText("Üye Girişi")).click();


        // e-mail yazilir
        driver.findElement(By.id("EmailLogin")).click();
        driver.findElement(By.id("EmailLogin")).sendKeys("vfdcsxa@hotmail.com");

        // sifre girilir
        driver.findElement(By.id("Password")).click();
        driver.findElement(By.id("Password")).sendKeys("123");


        // giris butonuna basilir
        driver.findElement(By.cssSelector(".pull-right")).click();


        // uye girisi gerceklesir
        WebDriverWait waitlogin = new WebDriverWait(driver, 8);
        waitlogin.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".user-menu-container:nth-child(3) .user-menu__item--account .user-menu__title")));

    }

  @After
  public void tearDown() {
    driver.quit();
  }

}
