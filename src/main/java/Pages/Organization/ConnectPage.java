package Pages.Organization;

import Utilts.Waits;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConnectPage {
    private WebDriver driver;
    Waits waits;

    public ConnectPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);// initialize all @FindBy elements
        waits = new Waits(driver);
    }

        @FindBy(xpath= "//span[text()='Institutes']")
        WebElement institutesSection;

        @FindBy(xpath = "//input[@placeholder='Search institutes']")
        WebElement searchInstitute;

        @FindBy (xpath = "//div[text()='KERALA ACADEMY OF PHARMACY'] ")
        WebElement searchResult;

        @FindBy (xpath = "//button[text()='Not Connected'] ")
        WebElement notConnectedButton;

    @FindBy (xpath = "//span[text()='Add POC'] ")
    WebElement addPocButton;

    @FindBy (xpath = "//input[@type='radio' and @name='selectedUser']")
    WebElement selectRadioButton;

    @FindBy (xpath = "//button[text()='Select User']")
    WebElement selectUserButton;


    @FindBy (xpath = "//textarea[@placeholder='Add a note or anything else you want to share']")
    WebElement addNoteField;


    @FindBy (xpath = "//input[@type='file']")
    WebElement uploadFileButton;

    @FindBy(xpath = "//button[text()='Send Connection Request']")
    WebElement sendconnectionRequestButton;




    String universityName= "KERALA ACADEMY OF PHARMACY";

        public void clickOnInstitutesSection() throws InterruptedException {
            waits.waitForElementTobeClickable(driver, institutesSection);
            institutesSection.click();
            Thread.sleep(2000);
        }

        public void searchInstituteByName() throws InterruptedException {
            waits.waitForElementTobeVisible(driver, searchInstitute);
            searchInstitute.sendKeys(universityName);
            Thread.sleep(2000);
        }

        public boolean validateSearchResult() throws InterruptedException {
            clickOnInstitutesSection();
            searchInstituteByName();
            return searchInstitute.isDisplayed();
        }

        public void clickOnSearchResult() throws InterruptedException {
            waits.waitForElementTobeClickable(driver, searchResult);
            searchResult.click();
            Thread.sleep(2000);
        }

        public void clickOnNotConnectedButton() throws InterruptedException {
            waits.waitForElementTobeClickable(driver, notConnectedButton);
            notConnectedButton.click();
            Thread.sleep(2000);
        }

    public void clickOnAddPocButton() throws InterruptedException {
        waits.waitForElementTobeClickable(driver, addPocButton);
        addPocButton.click();
        Thread.sleep(2000);
    }

    public void selectRadioButton() throws InterruptedException {
        selectRadioButton.click();
        Thread.sleep(2000);
    }

    public void clickOnSelectUserButton() throws InterruptedException {
        waits.waitForElementTobeClickable(driver, selectUserButton);
        selectUserButton.click();
        Thread.sleep(2000);
    }

    public void enterNote(String note) throws InterruptedException {
        waits.waitForElementTobeVisible(driver, addNoteField);
        addNoteField.sendKeys(note);
        Thread.sleep(2000);
    }

    public void uploadFile(String filePath) throws InterruptedException {
        uploadFileButton.sendKeys(filePath);
        Thread.sleep(2000);
    }

    public void clickOnSendConnectionRequestButton() throws InterruptedException {
        waits.waitForElementTobeClickable(driver, sendconnectionRequestButton);
        sendconnectionRequestButton.click();
        Thread.sleep(2000);
    }








}
