package com.practice.cucumber.test.calculator;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.nio.file.Paths;

/**
 * Created by jaine03 on 16/01/17.
 */
public class FacebookLoginTest {
    WebDriver driver = null;

    @Given("^user navigate to Facebook via chrome$")
    public void user_navigate_to_Facebook_via_chrome() throws Throwable {
        System.setProperty("webdriver.chrome.driver",Paths.get(".").toAbsolutePath().normalize().toString()+"/lib/chromedriver");
        driver = new ChromeDriver();
        driver.navigate().to("https://www.facebook.com/");
    }

    @When("^user enter UserName as \"([^\"]*)\" and password as \"([^\"]*)\"$")
    public void user_enter_UserName_as_and_password_as(String userName, String password) throws Throwable {
        driver.findElement(By.id("email")).sendKeys(userName);
        driver.findElement(By.id("pass")).sendKeys(password);
        driver.findElement(By.id("loginbutton")).click();
    }

    @Then("^login should be unsuccessful$")
    public void login_should_be_unsuccessful() throws Throwable {
        if(driver.getCurrentUrl().equalsIgnoreCase(
                "https://www.facebook.com/login.php?login_attempt=1&lwv=110")){
            System.out.println("Test Pass");
        } else {
            System.out.println("Test Failed");
        }
        driver.close();
    }

    @Then("^the user should be redirected to login retry$")
    public void login_retry() throws Throwable {
        if(driver.getCurrentUrl().equalsIgnoreCase(
                "https://www.facebook.com/login.php?login_attempt=1&lwv=110")){
            System.out.println("Test Pass Redirected to Login Page");
        } else {
            System.out.println("Test Failed for Redirection to Login Page");
        }
        driver.close();
    }

}
