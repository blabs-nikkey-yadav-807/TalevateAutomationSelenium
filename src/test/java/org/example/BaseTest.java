package org.example;

import Utilts.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class BaseTest {

    public static WebDriver driver= DriverFactory.inttDriver();

    @BeforeClass
    public static void setup(){
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

//    @AfterTest
//    public static void teardown(){
//        driver.quit();
//    }

}
