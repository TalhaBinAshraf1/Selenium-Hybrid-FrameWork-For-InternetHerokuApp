package com.saucedemo.swaglabs.pages;

import com.saucedemo.swaglabs.configuretion.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EntryAdPage extends BasePage {

    public EntryAdPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath="a#restart-ad")
    public WebElement entryAdClick;
    public WebElement getEntryAdClick(){
        return entryAdClick;
    }
}
