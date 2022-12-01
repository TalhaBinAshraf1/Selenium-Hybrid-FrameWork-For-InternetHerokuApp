package com.saucedemo.swaglabs.testCases;
import com.saucedemo.swaglabs.configuretion.BaseClass;
import com.saucedemo.swaglabs.pages.ForgotPasswordPage;
import com.saucedemo.swaglabs.pages.LogInSignUp;
import org.testng.annotations.Test;
public class UserAbleToClickOnForgetPassword extends BaseClass {
    @Test (enabled = true)
    public  void userAbleToClickOnForgetPassword ()  {

        LogInSignUp Lisp =new LogInSignUp(driver);
        ForgotPasswordPage fp=new ForgotPasswordPage(driver);

        sleepTest(1000);
        Lisp.forgetPassword.click();
        sleepTest(1000);
      /*  if(fp.getPhoneNumber().isEnabled()){
            fp.getPhoneNumber().sendKeys(Data.PHONE_NUMBER);
        }
        else{
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTest(2000); */
    }
}
