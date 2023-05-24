package com.saucedemo.swaglabs.configuretion;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class BaseClass {
    public WebDriver driver;

    @BeforeClass
    public void beforeClass(){
      /*  String baseDir = System.getProperty("user.dir");
        String chromeDir= baseDir + "/browser/chromedriver.exe ";

        System.setProperty("webDriver.chrome.driver", chromeDir);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);*/


        //String firefoxDir = baseDir + "/browser/geckodriver";
        //System.setProperty("webdriver.gecko.driver", firefoxDir);

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

//        WebDriverManager.firefoxdriver().setup();
//        driver = new FirefoxDriver();
//
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }


    @BeforeMethod
        public void beforeMethod() {
        driver.navigate().to("http://the-internet.herokuapp.com/");
        //driver.navigate().to("https://www.facebook.com/");
         sleepTest(2000);
        }
    @AfterMethod
    public void afterTest(){
        System.out.println(" ");
    }

    @AfterClass
    public void afterClass(){
        driver.quit();

    }

    public static void sleepTest(long sleeptime){
        try{Thread.sleep(sleeptime);
        } catch (Exception e){

        }
    }

    // Only text
    public static void validateElementTexts(WebDriver driver, By locator, String[] expectedTexts) {
        List<WebElement> elements = driver.findElements(locator);

        Assert.assertEquals(elements.size(), expectedTexts.length, "Number of elements does not match the expected count");

        for (int i = 0; i < elements.size(); i++) {
            String actualText = elements.get(i).getText().trim();
            System.out.println(actualText);
            Assert.assertEquals(actualText, expectedTexts[i], "Validation failed for element index: " + i);
        }
    }


    //text and visible

    public static void validateElementTextAndVisibility(WebDriver driver, By locator, String[] expectedTexts) {
        List<WebElement> elements = driver.findElements(locator);

        Assert.assertEquals(elements.size(), expectedTexts.length, "Number of elements does not match the expected count");

        for (int i = 0; i < elements.size(); i++) {
            WebElement element = elements.get(i);
            String actualText = element.getText();
            boolean isVisible = element.isDisplayed();

            // Validate text
            System.out.println(actualText);
            Assert.assertEquals(actualText, expectedTexts[i], "Validation failed for element index: " + i);

            // Validate visibility
            Assert.assertTrue(isVisible, "Element is not visible for index: " + i);
        }
    }


    public static void validateElementTextAndVisibilityV2(WebDriver driver, By locator, String expectedText) {
        List<WebElement> elements = driver.findElements(locator);

        for (int i = 0; i < elements.size(); i++) {
            WebElement element = elements.get(i);
            String actualText = element.getText();
            boolean isVisible = element.isDisplayed();

            // Validate text
            System.out.println(actualText);
            Assert.assertEquals(actualText, expectedText, "Validation failed for element index: " + i);

            // Validate visibility
            Assert.assertTrue(isVisible, "Element is not visible for index: " + i);
        }
    }

}