// src/main/java/Pages/Organization/ShortlistsPage.java
package Pages.Organization;

import Utilts.Waits;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShortlistsPage {
    private WebDriver driver;
    private Waits waits;

    public ShortlistsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        waits = new Waits(driver);
    }

    @FindBy(xpath = "//span[text()='Shortlists']")
    private WebElement shortlistsSection;

    @FindBy(xpath = "//button[text()='Create a Shortlist']")
    private WebElement createNewShortlistButton;

    @FindBy(xpath = "//input[@placeholder='Search Institute']")
    private WebElement searchInstituteInput;

    @FindBy(xpath = "//div[text()='KERALA ACADEMY OF PHARMACY']")
    private WebElement firstInstituteInDropdown;

    @FindBy(xpath = "//input[@aria-label='Select student Test Testt']")
    private WebElement studentCheckbox;

    @FindBy(xpath = "//button[text()='Create Shortlist']")
    private WebElement createShortlistButton;


    @FindBy(xpath = "//button[@type='submit' and text()='Create Shortlist']")
    private WebElement createShortlistSubmitButton;

    @FindBy(xpath = "//input[@placeholder='Enter shortlist name']")
    private WebElement shortlistNameInputField;

    String universityName = "KERALA ACADEMY OF PHARMACY";

    public void clickOnShortlistsSection() throws InterruptedException {
        waits.waitForElementTobeClickable(driver, shortlistsSection);
        shortlistsSection.click();
        Thread.sleep(2000);
    }

    public void clickOnCreateNewShortlistButton() throws InterruptedException {
        waits.waitForElementTobeClickable(driver, createNewShortlistButton);
        createNewShortlistButton.click();
        Thread.sleep(2000);
    }

    public void searchInstitute(String instituteName) throws InterruptedException {
        waits.waitForElementTobeVisible(driver, searchInstituteInput);
        searchInstituteInput.sendKeys(instituteName);
        Thread.sleep(2000);
    }

    public void selectFirstInstituteFromDropdown() throws InterruptedException {
        waits.waitForElementTobeClickable(driver, firstInstituteInDropdown);
        firstInstituteInDropdown.click();
        Thread.sleep(2000);
    }

    public void selectStudentCheckbox() throws InterruptedException {
        waits.waitForElementTobeClickable(driver, studentCheckbox);
        studentCheckbox.click();
        Thread.sleep(2000);
    }

    public void enterShortlistName(String shortlistName) throws InterruptedException {
        waits.waitForElementTobeVisible(driver, shortlistNameInputField);
        shortlistNameInputField.sendKeys(shortlistName);
        Thread.sleep(2000);
    }

    public void clickOnCreateShortlistButton() throws InterruptedException {
        waits.waitForElementTobeClickable(driver, createShortlistButton);
        createShortlistButton.click();
        Thread.sleep(2000);
    }

    public void clickOnCreateShortlistSubmitButton() throws InterruptedException {
        waits.waitForElementTobeClickable(driver, createShortlistSubmitButton);
        createShortlistSubmitButton.click();
        Thread.sleep(2000);
    }
}
