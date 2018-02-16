package com.pragmetic.iit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LoginTest {
    private WebDriver webDriver;

    @BeforeClass
    public void beforeClass(){
        //opening a web browser
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        webDriver=new ChromeDriver();
        webDriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }

    @AfterClass
    public void afterClass(){
        //closing browser
        webDriver.close();

    }

    @BeforeMethod
    public void beforeMethod(){
        webDriver.navigate().to("http://opensource.demo.orangehrmlive.com/");
    }


    @Test
    public void testValidUserLogin(){
        webDriver.findElement(By.id("txtUsername")).sendKeys("Admin");
        webDriver.findElement(By.id("txtPassword")).sendKeys("admin");
        webDriver.findElement(By.id("btnLogin")).click();

        String welcomeMsg = webDriver.findElement(By.id("welcome")).getText();
        Assert.assertEquals(welcomeMsg,"Welcome Admin");


    }

    @Test
    public void testInvalidPassword(){
        webDriver.findElement(By.id("txtUsername")).sendKeys("Admin");
        webDriver.findElement(By.id("txtPassword")).sendKeys("gemba");
        webDriver.findElement(By.id("txtPassword")).submit();

    }

    @Test
    public void testBlankUserName(){

    }

    @Test
    public void testBlankPassword(){

    }

}
