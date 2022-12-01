package com.saucedemo.swaglabs.testCases;
import com.saucedemo.swaglabs.configuretion.BaseClass;
import com.saucedemo.swaglabs.pages.LogInSignUp;
import com.saucedemo.swaglabs.utilities.Data;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UserAbleToClickOnCreateNewAccount extends BaseClass {

    @Test
    public  void  userAbleToClickOnCreateNewAccount ()  {

        LogInSignUp lisp = new LogInSignUp(driver);
        if ( lisp.getCreateNewAccount().isDisplayed()){
            String createNewAccountText =lisp.getCreateNewAccount().getText();
            Assert.assertEquals(Data.CREATE_NEW_ACCOUNT,createNewAccountText);
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        lisp.getCreateNewAccount().click();
        sleepTest(2000);

    }
}
