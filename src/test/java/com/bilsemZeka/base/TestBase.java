package com.bilsemZeka.base;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;
import java.util.concurrent.TimeUnit;

public class TestBase {
  public  AppiumDriver<MobileElement> driver;
    public void setupMethodCapabilities() throws Exception{
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
    }
}
