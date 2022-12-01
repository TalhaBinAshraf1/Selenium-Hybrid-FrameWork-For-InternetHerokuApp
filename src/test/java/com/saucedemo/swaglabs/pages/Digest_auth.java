package com.saucedemo.swaglabs.pages;

import com.saucedemo.swaglabs.configuretion.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Digest_auth extends BasePage {
    public Digest_auth(WebDriver driver) {
        super(driver);
    }
    //header
    @FindBy(xpath = "//div[@id='content']//h3[.='Digest Auth']")
    public WebElement header;
    public WebElement getHeader() {
        return header;
    }


    //peragraph
    @FindBy(xpath = "//div[@id='content']//h3[.='Digest Auth']")
    public WebElement paragraph;
    public WebElement getParagraph(){
        return paragraph;
    }
}
