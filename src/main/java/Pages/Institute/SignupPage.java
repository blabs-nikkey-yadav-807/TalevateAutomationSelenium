package Pages.Institute;

import Utilts.Waits;
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

    Waits waits=new Waits(driver);

    String firstName="Nikkey";
    String institueName="kerala federation of the blind training centre for the teachers of visually handicapped";
    String email="nikkey.yadav+512000@benthonlabs.com";
    String lastName="Yadavv";
    String mobileNumber="9517179795";
    String emailOtp="123456";
    String mobleOtp="345679";
    String password="Nikkey@33";
    String confirmPassword="Nikkey@33";


    @FindBy(xpath = "//span[text()='Institute' ]")
    public WebElement instituteTab;

    @FindBy(xpath = "//span[text()='Organization' ]")
    public WebElement OrganizationTab;

    @FindBy(xpath = "//span[text()='Enter Institute name' ]")
    public WebElement instituteName;

    @FindBy(id = "firstName")
    public WebElement firstNameLoc;

    @FindBy(id = "lastName")
    public WebElement lastNameLoc;

    @FindBy(id = "workEmail")
    public WebElement workEmail;

    @FindBy(id = "mobileNumber")
    public WebElement mobileNumberLoc;

    @FindBy (id = "termsAgreed")
    public WebElement termsAgreed ;

    @FindBy (xpath = "//button[text()='Create an account' ]")
    public WebElement submitButton;

    @FindBy (xpath = " //input[@placeholder='Search institutes...']")
    public WebElement inituteSearch;

    @FindBy (xpath = "(//*[normalize-space(text())='Kerala federation of the blind training centre for the teachers of visually handicapped'])[1]")
    public WebElement institutedropdown;

    @FindBy (id = "mobileNumber")
    public WebElement enterMobileNumber;

    @FindBy (id = "emailOtp")
    public WebElement enterOtpForEmail;

    @FindBy (id = "mobileOtp")
    public WebElement enterOtpForMobile;

    @FindBy (xpath = "//button[text()= 'Verify']")
    public WebElement verifyButton;

    @FindBy (xpath = "//button[text()='Verify Account']")
    public WebElement verifyAccountButton;


    @FindBy (id = "password")
    public WebElement passwordLoc;

    @FindBy (id = "confirmPassword")
    public WebElement confirmPasswordLoc;

    @FindBy (xpath = "//button[text()= 'Set Password']")
    public WebElement setPassword;


    public void clickOn(WebElement element){
    element.click();
}

    public void write(WebElement element, String text){
    element.sendKeys(text);
}

public void fillInstituteDetails() throws InterruptedException {
    clickOn(instituteTab);
    clickOn(instituteName);
    inituteSearch.sendKeys(institueName);
    Thread.sleep(2000);
    inituteSearch.sendKeys(Keys.TAB);
    institutedropdown.click();
    write(firstNameLoc,firstName);
    write(lastNameLoc,lastName);
    write(workEmail,email);
    write(enterMobileNumber,mobileNumber);
    clickOn(termsAgreed);
    clickOn(submitButton);


}

 public void verifyYourAccount(){
        if(verifyAccountButton.isDisplayed()){
            clickOn(verifyAccountButton);
        }
        write(enterOtpForEmail,emailOtp);
        write(enterOtpForMobile,mobleOtp);
        clickOn(verifyButton);
    }

    public void setPassword(){
        waits.waitForElementTobeVisible(driver,passwordLoc);
        write(passwordLoc,password);
        write(confirmPasswordLoc,confirmPassword);
        clickOn(setPassword);

    }






}











