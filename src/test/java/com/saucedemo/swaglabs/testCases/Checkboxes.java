package com.saucedemo.swaglabs.testCases;
import com.saucedemo.swaglabs.configuretion.BaseClass;
import com.saucedemo.swaglabs.pages.CheckBoxesPage;
import com.saucedemo.swaglabs.pages.TheInternet;
import com.saucedemo.swaglabs.utilities.Data;
import org.testng.Assert;
import org.testng.annotations.Test;
public class Checkboxes extends BaseClass {

    @Test
    public void checkboxes (){

        TheInternet ti = new TheInternet(driver);
        CheckBoxesPage cbp =new CheckBoxesPage(driver);

        //TC-1 HOME URL Validation
        String baseLink = driver.getCurrentUrl();
        System.out.println("Given "+baseLink);
        Assert.assertEquals(baseLink, Data.BASE_URL);
        System.out.println("Home URL is valid");
        sleepTest(2000);

        //TC-2 Header Validation
        if(ti.getCheckboxs().isDisplayed()){
            String checkBoxText= ti.getCheckboxs().getText();
            Assert.assertTrue(true,checkBoxText);
        }
        ti.getCheckboxs().click();


        //TC-3 Checkbox 2 selection and Checkbox text validation
        if(cbp.getCheckbox2().isSelected())
        {
            System.out.println(Data.POSETIVE_MASSAGE+ Data.CHECK_BOX2_SELECTED);
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTest( 1000);
        cbp.getCheckbox1().click();

        //TC-4 Checkbox 1 selection and Checkbox text validation
        if(cbp.getCheckbox1().isSelected())
        {
            System.out.println(Data.POSETIVE_MASSAGE+ Data.CHECK_BOX1_SELECTED);
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }

        //TC-5 URL Validation
        String link = driver.getCurrentUrl();
        System.out.println("Given "+link);
        Assert.assertEquals(link, Data.BASE_URL+Data.CHECK_BOX_LINK);
        System.out.println("Link is valid");
        sleepTest(2000);


        sleepTest(1000);
        cbp.getCheckbox2().click();
        sleepTest(1000);
        cbp.getCheckbox1().click();
        sleepTest(1000);
        driver.navigate().back();
        sleepTest(1000);
    }
}
