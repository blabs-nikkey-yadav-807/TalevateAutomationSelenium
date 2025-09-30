package Utilts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Waits {

    private WebDriver driver;

    public Waits(WebDriver driver){
        driver=this.driver;
        PageFactory.initElements(driver,this);
    }


    public void waitForElementTobeVisible(WebDriver driver,WebElement element){
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(6));
        wait.until(ExpectedConditions.visibilityOf(element));
    }
    public void waitForElementTobeClickable(WebDriver driver,WebElement element){
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(6));
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void waitForElementTobeEnabled(WebDriver driver,WebElement element){
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(6));
        wait.until(ExpectedConditions.elementSelectionStateToBe(element,element.isEnabled()));
    }


}





