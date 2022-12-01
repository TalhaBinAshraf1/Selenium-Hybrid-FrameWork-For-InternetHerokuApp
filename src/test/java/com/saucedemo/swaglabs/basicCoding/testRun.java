package com.saucedemo.swaglabs.basicCoding;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testRun {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();

        driver.navigate().to("http://the-internet.herokuapp.com/");
        WebElement abtesting = driver.findElement(By.cssSelector("li:nth-of-type(1) > a"));
        String abtestingText= abtesting.getText();
        System.out.println(abtestingText);
        abtesting.click();
        Thread.sleep(2000);

        driver.quit();
    }
}
