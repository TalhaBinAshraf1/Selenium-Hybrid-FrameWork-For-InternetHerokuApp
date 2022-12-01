package com.saucedemo.swaglabs.testCases;

import com.saucedemo.swaglabs.configuretion.BaseClass;
import com.saucedemo.swaglabs.pages.Digest_auth;
import com.saucedemo.swaglabs.pages.TheInternet;
import com.saucedemo.swaglabs.utilities.Data;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DigestAuthentication extends BaseClass {
    @Test
    public void digestAuthentication(){

        TheInternet ti = new TheInternet(driver);
        Digest_auth da = new Digest_auth(driver);

        //TC-1 HOME URL Validation
        String baseLink = driver.getCurrentUrl();
        System.out.println("Given "+baseLink);
        Assert.assertEquals(baseLink, Data.BASE_URL);
        System.out.println("Home URL is valid");
        sleepTest(2000);

        //TC-2 DigestAuthentication Text validation in Base page
        if(ti.getDigestAuthentication().isDisplayed()){
            String digestAuthText= ti.getDigestAuthentication().getText();
            Assert.assertTrue(true,digestAuthText);
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        ti.getDigestAuthentication().click();

        //TC-3 Value Pass On input Field
        driver.get("http://admin:admin@the-internet.herokuapp.com/digest_auth");
        sleepTest(2000);

        //TC-4 Header Validation
        if(da.getHeader().isDisplayed()){
            String headerText= da.getHeader().getText();
            Assert.assertTrue(true,headerText);
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTest(2000);

        //TC-5 Paragraph Validation
        if(da.getParagraph().isDisplayed()){
            String paragraphText= da.getParagraph().getText();
            Assert.assertTrue(true,paragraphText);
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTest(2000);
        driver.navigate().back();
        driver.navigate().back();

    }
}
