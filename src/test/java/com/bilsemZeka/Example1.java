package com.bilsemZeka;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Example1 {
    AppiumDriver<MobileElement> driver;
    @Test
    public void firstAppium() throws Exception {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("automationName", "UiAutomator2");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "11");
        capabilities.setCapability("udid", "1463f69e");
       // capabilities.setCapability("app", "C:\\Users\\123\\Downloads\\app-release (1).apk");
        capabilities.setCapability("appPackage", "com.example.bilsemzeka");
        capabilities.setCapability("appActivity", "com.example.bilsemzeka.MainActivity");

        URL url = new URL("http://localhost:4723/wd/hub");
        driver= new AndroidDriver<MobileElement>(url, capabilities);

driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
       WebElement gecBtn= driver.findElementByAccessibilityId("Geç");
            gecBtn.click();
        WebElement telefonNoInputBox= driver.findElementByXPath("//android.widget.EditText[@text='Telefon Numaran']");
            telefonNoInputBox.click();
            telefonNoInputBox.sendKeys("5321111111");
       WebElement passwordInputBox= driver.findElementByXPath("//android.widget.EditText[@text='Şifren']");
       passwordInputBox.click();
      passwordInputBox.sendKeys("123456");
      WebElement loginBtn= driver.findElementByAccessibilityId("Giriş Yap");
            loginBtn.click();
/*
automationName:Appium
platformName:Android
platformVersion:11
deviceName:Redmi Note 8
app:C:\Users\123\Downloads\app-release.apk
 */

    }
}
