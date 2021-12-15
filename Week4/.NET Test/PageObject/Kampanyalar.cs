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
public class Kampanyalar  : BasePage {

public Kampanyalar (IWebDriver driver) {
      Kampanyalar.driver = driver;
      PageFactory.InitElements(driver,this);
  }

    public String GetHarryPotter() {
    driver.FindElement(By.XPath("//span[contains(.,'Kampanyalar')]")).Click();
    Thread.Sleep(8000);
    driver.FindElement(By.CssSelector("[alt='Harry Potter 2022 Ajandaları']")).Click();
    Thread.Sleep(8000);
    driver.FindElement(By.CssSelector("[alt='Mabbels Harry Potter Slytherin Haftalık Ajanda ']")).Click();
    driver.FindElement(By.CssSelector(".col-md-7")).Click();
    WebDriverWait wait = new WebDriverWait(driver, TimeSpan.FromSeconds(8));
    IWebElement myVerification = driver.FindElement(By.CssSelector(".fs-7"));
    wait.Until(driver => myVerification.Displayed);
    Assert.That(myVerification.Text, Is.EqualTo("Mabbels Harry Potter Slytherin Haftalık Ajanda"));
    string assertText2 = myVerification.Text;
    Console.WriteLine("My String:" + assertText2);
    if (assertText2 != "Mabbels Harry Potter Slytherin Haftalık Ajanda") {
      Assert.Fail();
    }
    return assertText2;
  }
}
}