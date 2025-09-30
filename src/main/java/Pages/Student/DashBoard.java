package Pages.Student;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoard {

    private WebDriver driver;
    public DashBoard(WebDriver driver){
        driver=this.driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//h1[text()='Dashboard Overview']")
    WebElement dashBoardHeading;

}
