package com.saucedemo.swaglabs.testCases;

import com.saucedemo.swaglabs.configuretion.BaseClass;
import com.saucedemo.swaglabs.pages.AbTesting;
import com.saucedemo.swaglabs.pages.TheInternet;
import com.saucedemo.swaglabs.utilities.Data;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class LandingPageValidation extends BaseClass {

    @Test
    public void landingPageValidation(){

        TheInternet ti = new TheInternet(driver); // to use this class in java we have to create new instance
        AbTesting at  = new AbTesting(driver);

        //TC-1 HOME URL Validation
        String baseLink = driver.getCurrentUrl();
        System.out.println("Given "+baseLink);
        Assert.assertEquals(baseLink, Data.BASE_URL);
        System.out.println("Home URL is validate");
        sleepTest(2000);

        WebElement el = driver.findElement(By.cssSelector("li:nth-of-type(14) > a"));
        el.click();

//        // Find the elements using a common locator
//        By locator = By.cssSelector("div#content > div > a");
//        // Define the expected texts
//        String[] expectedTexts1 = {"Example 1: Element on page that is hidden","Example 2: Element rendered after the fact"};
//        // Validate the text of each element
//        validateElementTexts(driver, locator, expectedTexts1);
//        sleepTest(3000);



     //  By commonLocator = By.cssSelector("div#content > div > a");
       By commonLocator= ti.commonLocator1;
        // Define the expected texts
        String[] expectedTexts = {"Example 1: Element on page that is hidden","Example 2: Element rendered after the fact"};
        // Validate the text and visibility of each element
        validateElementTextAndVisibility(driver, commonLocator, expectedTexts);
        sleepTest(2000);




    }
}
