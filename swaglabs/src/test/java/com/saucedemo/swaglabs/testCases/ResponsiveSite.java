








































//package com.saucedemo.swaglabs.testCases;
//
//import com.saucedemo.swaglabs.pages.TheInternet;
//import org.testng.annotations.Test;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.concurrent.TimeUnit;
//
//import org.junit.Before;
//import org.junit.Test;
//import org.openqa.selenium.Dimension;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//
//
//public class ResponsiveSite extends BaseClass{
//    @Test
//    public void responsiveSite(){
//
//        TheInternet ti = new TheInternet(driver);
//
//
//        public List<Dimension> screenDimensionsList;
//
//
//        @Before
//        public void beforeTestMethod(){
//
//            // create list of dimensions for various screen sizes
//            screenDimensionsList = new ArrayList<Dimension>();
//            screenDimensionsList.add(new Dimension(1600,800));
//            screenDimensionsList.add(new Dimension(1200,800));
//            screenDimensionsList.add(new Dimension(992,800));
//            screenDimensionsList.add(new Dimension(768,800));
//            screenDimensionsList.add(new Dimension(480,800));
//            screenDimensionsList.add(new Dimension(360,800));
//
//            // initialize the driver for browser
//            driver = new ChromeDriver();
//            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//            driver.get("http://nandal.in");
//        }
//
//        public void testVariousScreenSizes(){
//
//            for(Dimension d: screenDimensionsList){
//                driver.manage().window().setSize(d);
//                // run some test cases for this screen size
//                // some test case steps
//
//                try{
//                    Thread.sleep(2000);
//                }catch(Exception e){
//                    e.printStackTrace();
//                }
//            }
//        }
//
//
//
//    }
//}
