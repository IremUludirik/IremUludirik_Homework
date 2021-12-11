
const {Given, When, Then, AfterAll, BeforeAll} = require('@cucumber/cucumber');
const {expect}= require('chai');

const webdriver = require('selenium-webdriver');
const chrome = require('selenium-webdriver/chrome');
const chromedriver = require('chromedriver');

const {By} = require("selenium-webdriver");

let {setDefaultTimeout} = require('@cucumber/cucumber');
setDefaultTimeout(60 * 1000);


let driver;

    BeforeAll(function () {
        driver = new webdriver.Builder()
        .forBrowser('chrome')
        .build();
        
        driver.manage().window().maximize(); 
    });

    AfterAll(function () {
        driver.quit();
        });
    


//1---------------------------------------------------------------------------------------------------------------------
Given('Anasayfa icerisindeki, search box uzerine gelinir.', async () => {
    await driver.get('https://biletino.com/tr/');
});

When(/^Search Box icerisine ([^"]*) yazilir.$/, async (type) => {
    await driver.findElement(By.name('query')).sendKeys(type + '\n');
});

Then('Belirtilen bilet turune sahip olan etkinlikler siralanir.', async () => {
    await new Promise(r => setTimeout(r, 3000));
    let text = await driver.findElement(By.xpath("/html/body/div[4]/div[2]")).getText()
    console.log(text);
});



//2---------------------------------------------------------------------------------------------------------------------
    Given('Anasayfa acilir.', async () => {
        await new Promise(r => setTimeout(r, 2000));
        await driver.get('https://biletino.com/tr/');
    });

    Given('Rastgele bir etkinlige basilir.', async () => {
        await new Promise(r => setTimeout(r, 2000));
        await driver.findElement(By.css("[alt='Kristal Elma Ödül Töreni']")).click();
    });

    When('Biletleri Gor butonuna basilir.', async () => {
        await new Promise(r => setTimeout(r, 2000));
        await driver.findElement(By.xpath("//button[@id='eventdetail-layoutselection-show']")).click();
    });


    When('Bilet adedi yazan butonuna basilir.', async () => {
        await new Promise(r => setTimeout(r, 2000));
        await driver.findElement(By.xpath("//select[@class='currentLayoutSelect']")).click();

    });
    

    When(/^([^"]*) adet bilet secilir.$/, async (numOfTickets) => {
        await new Promise(r => setTimeout(r, 2000));
        await driver.findElement(By.xpath("//select[@class='currentLayoutSelect']")).sendKeys(numOfTickets + '\n');
    });

    When('Secili biletleri al yazan butonuna basilir.', async () => {
        await new Promise(r => setTimeout(r, 2000));
        await driver.findElement(By.className('btn btn-block btn-primary')).click()
        
    });

    Then('E-mail adresi istenir, bilet alinamaz.', async () => {
        await new Promise(r => setTimeout(r, 2000));
        let text = await driver.findElement(By.xpath('//*[@id="account-signinsimple"]/div/div/div[2]/h4')).getText()
        console.log(text);
    });



//3---------------------------------------------------------------------------------------------------------------------
    Given('Anasayfaya gidilir.', async () => {
        await new Promise(r => setTimeout(r, 2000));
        await driver.get('https://biletino.com/tr/');
    });

    Given('Bir etkinlige basilir.', async () => {
        await new Promise(r => setTimeout(r, 2000));
        await driver.findElement(By.css("[alt='Kristal Elma Ödül Töreni']")).click();
    });

    When('Bileti Gor butonuna basilir.', async () => {
        await new Promise(r => setTimeout(r, 2000));
        await driver.findElement(By.xpath("//button[@id='eventdetail-layoutselection-show']")).click();
    });


    When('Bilet adedi butonuna basilir.', async () => {
        await new Promise(r => setTimeout(r, 2000));
        await driver.findElement(By.xpath("//select[@class='currentLayoutSelect']")).click();

    });
    

    When(/^Bilet sayisi ([^"]*) olan secilir.$/, async (numOfTickets) => {
        await new Promise(r => setTimeout(r, 2000));
        await driver.findElement(By.xpath("//select[@class='currentLayoutSelect']")).sendKeys(numOfTickets + '\n');
    });

    When('Secili biletleri al butonuna basilir.', async () => {
        await new Promise(r => setTimeout(r, 2000));
        await driver.findElement(By.className('btn btn-block btn-primary')).click()
        
    });

    When('E-mail adresi istenir, onceki email silinir.', async () => {
        await new Promise(r => setTimeout(r, 2000));
        await driver.findElement(By.xpath("//input[@id='account-signinsimple-email']")).clear()
        
    });

    When(/^([^"]*) girilir.$/, async (email) => {
        await new Promise(r => setTimeout(r, 2000));
        await driver.findElement(By.xpath("//input[@id='account-signinsimple-email']")).sendKeys(email + '\n');
    });
    
    When('Uye olmadan devam et butonuna basilir.', async () => {
        await new Promise(r => setTimeout(r, 5000));
        await driver.findElement(By.css("#account-guestorsignup-guest > .label")).click()
    });

    Then('Bilet alimi icin girilecek bilgiler sayfası acilir.', async () => {
        await new Promise(r => setTimeout(r, 5000));
        let text = await driver.findElement(By.xpath('//*[@id="salesflow-questions-consolidated-form"]')).getText()
        console.log(text);
    });

    











