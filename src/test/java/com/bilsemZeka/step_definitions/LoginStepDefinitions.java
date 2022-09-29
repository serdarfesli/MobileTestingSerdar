package com.bilsemZeka.step_definitions;

import com.bilsemZeka.base.TestBase;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;
import java.util.concurrent.TimeUnit;

public class LoginStepDefinitions extends TestBase {


    @When("user is on the login page")
    public void user_is_on_the_login_page() throws Exception {

        WebElement gecBtn = driver.findElementByAccessibilityId("Geç");
        gecBtn.click();
    }

    @When("user enters correct phoneNumber")
    public void user_enters_correct_phoneNumber() {
        WebElement  telefonNoInputBox = driver.findElementByXPath("//android.widget.EditText[@text='Telefon Numaran']");
         telefonNoInputBox.click();
         telefonNoInputBox.sendKeys("5321111111");
    }

    @When("user enters correct password")
    public void user_enters_correct_password() {
        WebElement passwordInputBox = driver.findElementByXPath("//android.widget.EditText[@text='Şifren']");
        passwordInputBox.click();
        passwordInputBox.sendKeys("123456");
    }

    @When("user clicks login button")
    public void user_clicks_login_button() {
        WebElement  loginBtn = driver.findElementByAccessibilityId("Giriş Yap");
        loginBtn.click();
    }

    @Then("user successfully logins and lands on home page")
    public void user_successfully_logins_and_lands_on_home_page() {
        WebElement  günlükTestlerHeader = driver.findElementByAccessibilityId("Günlük Testler");
        Assert.assertTrue(günlükTestlerHeader.isDisplayed());
    }

    @Then("user see {string} warning message")
    public void userSeeWarningMessage() {
        WebElement GecerliBirTelefonNumarasıVeSifreGirinWarningMessage = driver.findElementByAccessibilityId("Geçerli bir telefon numarası ve şifre girin");
        Assert.assertTrue(GecerliBirTelefonNumarasıVeSifreGirinWarningMessage.isDisplayed());
    }

    @And("user enters wrong password")
    public void userEntersWrongPassword() {
        WebElement passwordInputBox.click();
        passwordInputBox.sendKeys("wrong password");
    }

    @And("user enters wrong phoneNumber")
    public void userEntersWrongUsername() {
        telefonNoInputBox.click();
        telefonNoInputBox.sendKeys("wrong Number");
    }
}
