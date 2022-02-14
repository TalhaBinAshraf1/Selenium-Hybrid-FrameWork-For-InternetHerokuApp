package com.saucedemo.swaglabs.basicJava;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ResponsiveWebTest {


    public WebDriver driver;
    public List<Dimension> screenDimensionsList;


    @Before
    public void beforeTestMethod(){

        // create list of dimensions for various screen sizes
        screenDimensionsList = new ArrayList<Dimension>();
        screenDimensionsList.add(new Dimension(1600,800));
        screenDimensionsList.add(new Dimension(1200,800));
        screenDimensionsList.add(new Dimension(992,800));
        screenDimensionsList.add(new Dimension(768,800));
        screenDimensionsList.add(new Dimension(480,800));
        screenDimensionsList.add(new Dimension(360,800));

        // initialize the driver for browser
        String baseDir = System.getProperty("user.dir");
        String chromeDir = baseDir + "/browser/chromedriver2.exe";
        System.setProperty("webdriver.chrome.driver", chromeDir);
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");

    }

    @Test
    public void testVariousScreenSizes(){

        for(Dimension d: screenDimensionsList){
            driver.manage().window().setSize(d);
            // run some test cases for this screen size
            // some test case steps

            try{
                Thread.sleep(2000);
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }


}