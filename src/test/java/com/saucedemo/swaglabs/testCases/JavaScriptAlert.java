package com.saucedemo.swaglabs.testCases;

import com.saucedemo.swaglabs.pages.JavaScriptAlertsPage;
import com.saucedemo.swaglabs.pages.TheInternet;
import com.saucedemo.swaglabs.utilities.Data;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class JavaScriptAlert extends BaseClass{
    @Test

    public void javaScriptAlert(){

        TheInternet ti =new TheInternet(driver);
        JavaScriptAlertsPage jsap =new JavaScriptAlertsPage(driver);

        //TC-1 HOME URL Validation
        //TC-2 Header Validation
        //TC-3 Corresponding Page URL Validation
        //TC-4 Paragraph Validation
        //TC-2 BasicAuth Text validation in Base page
        ti.getJavaScriptAlerts().click();
        sleepTest(3000);




        //TC-2 Alert Text Validation
        jsap.getClickForJSAlertButton().click();
        sleepTest(2000);
        //Accept Alert
        System.out.println(driver.switchTo().alert().getText());
        sleepTest(2000);
        //Accept Alert
        driver.switchTo().alert().accept();
        sleepTest(2000);
        // System.out.println("Click For JS Alert Button Alert Accepted");
        System.out.println("JSAlert Result Text : "+ jsap.getResultText().getText());


        //TC-3 JS Alert text Validation
        jsap.getClickForJSConfirm().click();
        sleepTest(2000);
        //Accept Alert
        System.out.println(driver.switchTo().alert().getText());
        sleepTest(2000);
        //Accept Alert
        driver.switchTo().alert().accept();
        sleepTest(2000);
        //System.out.println("Click For JS Confirm Button Alert Accepted");
        System.out.println("JS Confirm Result Text :" + jsap.getResultText().getText());



        //TC-4 JS prompt text Validation

        //Click For JS Prompt And the alert text validation
        jsap.getClickForJSPrompt().click();
        sleepTest(2000);
        //Accept Alert
        System.out.println(driver.switchTo().alert().getText());
        sleepTest(2000);
        //Accept Alert
        driver.switchTo().alert().sendKeys("Hello There, Whats UP!!!");
        sleepTest(2000);
        driver.switchTo().alert().accept();
        sleepTest(2000);
        System.out.println("JS Prompt Result Text :"+ jsap.getResultText().getText());
        sleepTest(2000);

        driver.navigate().to(Data.BASE_URL);
        sleepTest(2000);


    }
}
