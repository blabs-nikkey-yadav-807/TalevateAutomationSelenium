package Pages.Student;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
    private WebDriver driver;
    public LandingPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this); // initialize all @FindBy elements
    }

    public String title = "TalEvate";

    @FindBy(xpath = "//button[text()='Sign Up']")
    public WebElement signUpButton;

    @FindBy(xpath = "//p[text()='Login']")
    public WebElement loginButton;

    @FindBy(xpath = "//input[@placeholder='Enter Email']")
    public WebElement invalidButton;

    @FindBy(xpath = "//h1[text()='Welcome to TalEvate']")
    public WebElement welcomeText;

    @FindBy(xpath = "//p[text()= 'Please register to join TalEvate' ] ")
    public WebElement getWelcomeText;

    public void navigateToLandingPage() {
        driver.get("https://dev-blabs.talevate.in/en");
    }


    public void clickOnLoginButton() {
    loginButton.click();
    }

    public void clickOnSignUpButton() {
        signUpButton.click();
    }
public boolean validateLoginButton() throws InterruptedException {
 clickOnLoginButton();
 Thread.sleep(2000);
 return welcomeText.isDisplayed();
}
    public boolean validateSignupButton() throws InterruptedException {
        clickOnSignUpButton();
        Thread.sleep(2000);
        return getWelcomeText.isDisplayed();
    }


}
