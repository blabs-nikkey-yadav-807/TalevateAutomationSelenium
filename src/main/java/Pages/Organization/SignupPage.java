package Pages.Organization;

import Utilts.Waits;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignupPage {

    private WebDriver driver;
    private final Waits wait;
    public SignupPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this); // initialize all @FindBy elements
        wait = new Waits(this.driver);
    }

    String firstName="Test";
    String organizationName="Niiikkkeeyyyyaddaaav.Ldt";
    String email="nikkey.yadav+67700@benthonlabs.com";
    String lastName="Nikkeyy";
    String mobileNumber="9517179795";
    String emailOtp="123456";
    String mobleOtp="345679";
    String password="Nikkey@33";
    String confirmPassword="Nikkey@33";

//
//    @FindBy(xpath = "//span[text()='Institute' ]")
//    public WebElement organizationab;

    @FindBy(xpath = "//span[text()='Organization' ]")
    public WebElement organizationTab;

    @FindBy(id = "corporateName")
    public WebElement corporateName;

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

    @FindBy (id = "mobileNumber")
    public WebElement enterMobileNumber;

    @FindBy (id = "emailOtp")
    public WebElement enterOtpForEmail;

    @FindBy (id = "mobileOtp")
    public WebElement enterOtpForMobile;

    @FindBy (xpath = "//button[text()='Verify Account']")
    public WebElement verifyAccountButton;

    @FindBy (xpath = "//button[text()='Verify']")
    public WebElement verifyButton;

    @FindBy (id = "password")
    public WebElement passwordLoc;

    @FindBy (id = "confirmPassword")
    public WebElement confirmPasswordLoc;

    @FindBy (xpath= "//button[text()= 'Set Password']")
    public WebElement setPassword;


    public void clickOn(WebElement element){
    element.click();
}

    public void write(WebElement element, String text){
    element.sendKeys(text);
}

public void fillOrganizationDetails() throws InterruptedException {
    clickOn(organizationTab);
    write(corporateName,organizationName);
    write(firstNameLoc,firstName);
    write(lastNameLoc,lastName);
    write(workEmail,email);
    write(enterMobileNumber,mobileNumber);
    clickOn(termsAgreed);
    clickOn(submitButton);


}

 public void verifyYourAccount(){
        wait .waitForElementTobeVisible(driver,verifyAccountButton);
        clickOn(verifyAccountButton);
        write(enterOtpForEmail,emailOtp);
        write(enterOtpForMobile,mobleOtp);
        clickOn(verifyButton);
    }

    public void setPassword(){
        wait.waitForElementTobeVisible(driver,setPassword);
        write(passwordLoc,password);
        write(confirmPasswordLoc,confirmPassword);
        clickOn(setPassword);

    }


    }

