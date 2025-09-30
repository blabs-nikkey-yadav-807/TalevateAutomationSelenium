package Pages.Institute;

import Utilts.Waits;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    private WebDriver driver;
    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this); // initialize all @FindBy elements
    }
    Waits waits=new Waits(driver);

    String email="nikkey.yadav+5000@benthonlabs.com";
    String password="Nikkey@33";

    @FindBy(xpath = "//button[text()='Institute' ]")
    public WebElement instituteButton;

    @FindBy(id = "email")
    public WebElement enterEmail;

    @FindBy(id = "password")
    public WebElement enterPassword;

    @FindBy (xpath = "//button[text()= 'Login']")
    public WebElement loginButton;

    public void login() throws InterruptedException {
        waits.waitForElementTobeClickable(driver,instituteButton);
        instituteButton.click();
        enterEmail.sendKeys(email);
        enterPassword.sendKeys(password);
        loginButton.click();
        Thread.sleep(5000);
        driver.navigate().refresh();

    }


    public void verifyDashboard() throws InterruptedException {
        DashBoard dashBoard=new DashBoard(driver);
        waits.waitForElementTobeVisible(driver,dashBoard.dashBoardHeading);
        Thread.sleep(5000);
    }
}
