package Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignupPage {

    private WebDriver driver;
    public SignupPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this); // initialize all @FindBy elements
    }

    @FindBy(xpath = "//span[text()='Institute' ]")
    public WebElement instituteTab;

    @FindBy(xpath = "//span[text()='Organization' ]")
    public WebElement OrganizationTab;

    @FindBy(xpath = "//span[text()='Enter Institute name' ]")
    public WebElement instituteName;

    @FindBy(id = "firstName")
    public WebElement firstName;

    @FindBy(id = "lastName")
    public WebElement lastName;

    @FindBy(id = "workEmail")
    public WebElement workEmail;

    @FindBy(id = "mobileNumber")
    public WebElement mobileNumber;

    @FindBy (id = "termsAgreed")
    public WebElement termsAgreed ;

    @FindBy (xpath = "//button[text()='Create an account' ]")
    public WebElement submitButton;

    @FindBy (xpath = " //input[@placeholder='Search institutes...']")
    public WebElement inituteSearch;
    @FindBy (xpath = "//div[contains(text(),'Kerala academy of pharmacy')]")
    public WebElement institutedropdown;




    public void clickOn(WebElement element){
    element.click();
}

public void write(WebElement element, String text){
    element.sendKeys(text);
}

public void fillInstituteDetails() throws InterruptedException {
    clickOn(instituteTab);
    clickOn(instituteName);
    inituteSearch.sendKeys("Kerala academy of pharmacy");
    Thread.sleep(2000);
institutedropdown.click();
Thread.sleep(50000);
    write(instituteName,"name");
    write(firstName,"Nikkey");
    write(lastName,"Yadav");
    write(workEmail,"nikkey.yadav+5000@benthonlabs.com");
    clickOn(termsAgreed);
    clickOn(submitButton);


}


}
