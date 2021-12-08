package tests;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class basket {
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
    public void withCalendar() throws InterruptedException {

        // cicek top bar acilis
        Actions action = new Actions(driver);
        WebElement we = driver.findElement(By.xpath("//html/body/div[3]/div[4]/div[1]/div[2]/nav/ul/li[2]/span/a"));
        action.moveToElement(we).build().perform();


        //bonsai cicegi secilir
        driver.findElement(By.xpath("//a[contains(text(),\'Bonsai\')]")).click();


        //urun secilir
        driver.findElement(By.xpath("//img[@alt='Zelkova Bonsai 25cm']")).click();


        //adres secilir
        driver.findElement(By.xpath("//input[@placeholder='Göndereceğiniz mahalleyi, Okul, Hastane vb. seçin']")).sendKeys("Eskişehir, Türkiye");

        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@data-secondary-address='Türkiye']")).click();
        Thread.sleep(2000);


        //tarih icin takvim acilir
        driver.findElement(By.xpath("//*[text()='Takvim']")).click();


        //tarih secilir
        driver.findElement(By.xpath("(//*[@class='new day'])[1]")).click();


        //siparis saati secilir
        Select drpCountry = new Select(driver.findElement(By.xpath("//select[@name='AddToCartModel.DeliveryHour']")));
        drpCountry.selectByValue("2000488");


        //butona basilarak onaylanir
        driver.findElement(By.cssSelector(".product__action-button-text")).click();


        //login ekranindan cikilir
        driver.findElement(By.linkText("Geri")).click();


        //urun sepetimde gorunur
        WebDriverWait wait = new WebDriverWait(driver, 8);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".cart")));

    }


    @Test
    public void withoutCalendar() throws InterruptedException {

        //market top bar acilis
        Actions actionmar = new Actions(driver);
        WebElement wemar = driver.findElement(By.xpath("//html/body/div[3]/div[4]/div[1]/div[2]/nav/ul/li[12]/span/a/span[2]"));
        actionmar.moveToElement(wemar).build().perform();


        //gıda secilimi
        driver.findElement(By.xpath("//html/body/div[3]/div[4]/div[1]/div[2]/nav/ul/li[12]/nav/div/div[1]/ul/li[1]/a")).click();


        //kuruyemis secilimi

        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[@alt='Kuruyemiş, Cips']")).click();
        Thread.sleep(2000);


        //urun secimi
        driver.findElement(By.xpath("//html/body/main/div/div[4]/div[7]/div/div/a/div[1]/img")).click();


        //butona basilarak onaylanir
        driver.findElement(By.cssSelector(".product__action-button-text")).click();


        //urun sepetimde gorunur
        WebDriverWait wait = new WebDriverWait(driver, 8);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".cart")));

    }

    @After
    public void tearDown() {
        driver.quit();
    }

}


