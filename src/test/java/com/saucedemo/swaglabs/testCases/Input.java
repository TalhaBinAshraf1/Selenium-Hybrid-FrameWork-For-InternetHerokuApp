package com.saucedemo.swaglabs.testCases;

import com.saucedemo.swaglabs.configuretion.BaseClass;
import com.saucedemo.swaglabs.pages.InputsPages;
import com.saucedemo.swaglabs.pages.TheInternet;
import com.saucedemo.swaglabs.utilities.Data;
import org.testng.Assert;
import org.testng.annotations.Test;
public class Input extends BaseClass {
    @Test

    public void input(){

        TheInternet ti =new TheInternet(driver);
        InputsPages ip =new InputsPages(driver);

        ti.getInput().click();
        sleepTest(2000);

        //TC-1 Corresponding Page URL Validation
        String link = driver.getCurrentUrl();
        System.out.println("Given "+link);
        Assert.assertEquals(link, Data.BASE_URL+Data.INPUT_LINK);
        System.out.println("Link is valid");
        sleepTest(2000);

        //TC-2 Entering values
        ip.getInputField().sendKeys("15552588158");
        sleepTest(2000);
        ip.getInputField().clear();
        sleepTest(2000);

        driver.navigate().to(Data.BASE_URL);
        sleepTest(2000);







    }
}
