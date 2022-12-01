package com.saucedemo.swaglabs.testCases;
import com.saucedemo.swaglabs.configuretion.BaseClass;
import com.saucedemo.swaglabs.pages.AbTesting;
import com.saucedemo.swaglabs.pages.TheInternet;
import com.saucedemo.swaglabs.utilities.Data;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ABTesting extends BaseClass {

    @Test
    public  void  aBTesting()  {
        TheInternet ti = new TheInternet(driver); // to use this class in java we have to create new instance
        AbTesting at  = new AbTesting(driver);

        //TC-1 HOME URL Validation
        String baseLink = driver.getCurrentUrl();
        System.out.println("Given "+baseLink);
        Assert.assertEquals(baseLink, Data.BASE_URL);
        System.out.println("Home URL is validate");
        sleepTest(2000);

        //TC-2 Header Validation
        if (ti.getAbTesting().isDisplayed())
        {
            String abTesting= ti.getAbTesting().getText();
            Assert.assertEquals(Data.AB_TESTING,abTesting);
        }

        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        ti.abTesting.click();
        sleepTest(2000);

        //TC-3 Corresponding Page URL Validation
        String link = driver.getCurrentUrl();
        System.out.println("Given "+link);
        Assert.assertEquals(link, Data.BASE_URL+Data.AB_Test_LINK);
        System.out.println("Link is validate");
        sleepTest(2000);

        //TC-4 Paragraph Validation
        if (at.getabTestingVariation1().isDisplayed())
        {
            String header1= at.getabTestingVariation1().getText();
            Assert.assertEquals(Data.AB_TEST_VARIATION1,header1);
        } else if (at.getAbTestControl().isDisplayed()){
            String header2= at.abTestControl.getText();
            Assert.assertEquals(Data.AB_TEST_Control,header2);
        } else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }

        sleepTest(2000);
        driver.navigate().back();
        sleepTest(5000);

    }
}
