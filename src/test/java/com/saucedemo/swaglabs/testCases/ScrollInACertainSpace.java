package com.saucedemo.swaglabs.testCases;

import com.saucedemo.swaglabs.configuretion.BaseClass;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class ScrollInACertainSpace extends BaseClass {

    @Test
    public void scrollInACertainSpace (){


        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,300)");

    }
}
