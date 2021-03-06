// Generated by Selenium IDE
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

namespace dotNET_Test {

[TestFixture]
public class DandRTest  : BasePage {
  Kampanyalar kamp;
  YeniCikanlar yeni;

  [OneTimeSetUp]
  public void SetUp() {
   Initialize();
  }

  [Test,Order(1)]
public void dandR1() {
   kamp = new Kampanyalar(driver); 
   String assertText = kamp.GetHarryPotter();
  }

  [Test,Order(2)]
public void dandR2() { 
    yeni = new YeniCikanlar(driver);
   String assertText2 = yeni.GetKitap();
  }

[OneTimeTearDown]
  protected void Close() {
  TearDown();
}
}
}
