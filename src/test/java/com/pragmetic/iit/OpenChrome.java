package com.pragmetic.iit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OpenChrome {

    @Test
    public void oprnChromeBrowser(){

//        //opening a web browser
//        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
//        WebDriver driver;
//        driver = new ChromeDriver();
//
//        //navigate to website
//        driver.get("http://opensource.demo.orangehrmlive.com/");
//        String title = driver.getTitle();
//
//        //interact with the web page
//        Assert.assertEquals(title,"OrangeHRM");
        //verify content (Assertion)
        LoginTest lgnTest = new LoginTest();

        lgnTest.beforeClass();

        lgnTest.beforeMethod();

        lgnTest.testValidUserLogin();
//        lgnTest.testInvalidPassword();

        lgnTest.afterClass();



       // driver.close();//closing the browser after execution

    }

//    public String selectBrowser(String name){
//
//        if(name.equals("chrome")){
//
//        }else if(name.equals("IE"))
//
//        return "webdriver.chrome.driver","drivers/chromedriver.exe"
//    }
}

