using System;
using System.Collections;
using System.Collections.Generic;
using System.Linq;
using System.Threading;
using OpenQA.Selenium;
using OpenQA.Selenium.Chrome;
using OpenQA.Selenium.Firefox;
using OpenQA.Selenium.Remote;
using OpenQA.Selenium.Support.UI;
using OpenQA.Selenium.Interactions;
using NUnit.Framework;
using SeleniumExtras.PageObjects;

namespace dotNET_Test {
public class YeniCikanlar  : BasePage {

public YeniCikanlar (IWebDriver driver) {
      YeniCikanlar.driver = driver;
      PageFactory.InitElements(driver,this);
     
  }

    public String GetKitap() {
    driver.FindElement(By.LinkText("YENİ ÇIKANLAR")).Click();
    Thread.Sleep(8000);
    driver.FindElement(By.XPath("//a[.='Edebiyat']")).Click();
    Thread.Sleep(8000);
    driver.FindElement(By.CssSelector("[alt='Dar Kapı']")).Click();
    Thread.Sleep(8000);
    IWebElement verification = driver.FindElement(By.XPath("//h1[@class='fs-7 mb-0']"));
    WebDriverWait wait = new WebDriverWait(driver, TimeSpan.FromSeconds(8));
    wait.Until(driver => verification.Displayed);
    Assert.That(verification.Text, Is.EqualTo("Dar Kapı"));
    string assertText = verification.Text;
    Console.WriteLine("My String:" + assertText);
    if (assertText != "Dar Kapı") {
      Assert.Fail();
    }
    return assertText;
  }
}
}
