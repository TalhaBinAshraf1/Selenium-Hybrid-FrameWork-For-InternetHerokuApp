package com.saucedemo.swaglabs.pages;

import com.saucedemo.swaglabs.configuretion.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Drag_and_drop extends BasePage {
    public Drag_and_drop(WebDriver driver) {
        super(driver);
    }
    //HeaderText
    @FindBy(xpath = "//div[@id='content']//h3[.='Drag and Drop']")
    public WebElement dragAndDropHeaderText;
    public WebElement getDragAndDropHeaderText(){
        return dragAndDropHeaderText;
    }
}
