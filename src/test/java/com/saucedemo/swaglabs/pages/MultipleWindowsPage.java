package com.saucedemo.swaglabs.pages;

import com.saucedemo.swaglabs.configuretion.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MultipleWindowsPage extends BasePage {
    public MultipleWindowsPage(WebDriver driver) {
        super(driver);
    }

    //Header
    @FindBy(xpath = "//div[@id='content']//h3[.='Opening a new window']")
    public WebElement header;
    public WebElement getHeader() {
        return header;
    }

    //Click Here
    @FindBy(linkText = "Click Here")
    public WebElement clickHere;
    public WebElement getClickHere() {
        return clickHere;
    }
}
