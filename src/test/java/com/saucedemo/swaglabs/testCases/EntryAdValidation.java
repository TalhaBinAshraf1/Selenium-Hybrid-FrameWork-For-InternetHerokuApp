package com.saucedemo.swaglabs.testCases;

import com.saucedemo.swaglabs.configuretion.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class EntryAdValidation extends BaseClass {

    @Test
    public void entryAdValidation(){

        WebElement ed = driver.findElement(By.cssSelector("ul > li:nth-of-type(15)"));
        ed.click();
        sleepTest(2000);
//        WebElement clickButton = driver.findElement(By.cssSelector("a#restart-ad"));
//        clickButton.click();
//        WebElement closeButton = driver.findElement(By.cssSelector(".modal-footer"));
//
//        closeButton.click();
//





    }
}
