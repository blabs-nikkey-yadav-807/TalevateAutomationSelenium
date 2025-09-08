package Utilts;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {
    public static WebDriver inttDriver(){
        return new ChromeDriver();
    }
}
