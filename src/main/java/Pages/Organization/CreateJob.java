package Pages.Organization;

import Utilts.Waits;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateJob {

    private WebDriver driver;
    Waits waits;

    public CreateJob(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);// initialize all @FindBy elements
        waits=new Waits(driver);
    }




    String filePath = "/home/nikkey/Downloads/CategoryPageExample.pdf";

    @FindBy (xpath= "//a[normalize-space(text())='Create a Job']")
    WebElement createJobButton;

    @FindBy (xpath = "//input[@placeholder='e.g. Senior Software Engineer']")
    WebElement jobTitle;

    @FindBy (xpath = "//div[@role='button' and @aria-haspopup='listbox'] ")
    WebElement selectLocation;

//    @FindBy (xpath = "//input[@placeholder='e.g. New York']")
//    WebElement jobLocation;

    @FindBy(xpath = "//input[@placeholder='Search options...']")
    WebElement searchLocationInput;

    @FindBy (xpath = "//span[text()='New Delhi']")
    WebElement newDelhiLocation;

    @FindBy (xpath = "//button[@aria-haspopup='listbox']")
    WebElement categoryDropdown;

    @FindBy (xpath = "//button[text()='Technology']")
    WebElement technologyCategory;

    @FindBy (xpath = "//input[@placeholder='Search skills or create new ones...']")
    WebElement skillsRequired;

    @FindBy (xpath = "//button[@data-testid='undefined-create-new']")
    WebElement createSkill;

    @FindBy (xpath = "//div[@role='listbox']/button[1]")
    WebElement firstSkill;


    @FindBy (xpath = "//button[text()='Next']")
    WebElement nextButton;

//    @FindBy (xpath = "//span[text()='Click to upload']//parent::label")
//    WebElement clickToUpload;

    @FindBy (id = "file-upload")
    WebElement clickToUpload;


    @FindBy (xpath = "//button[text()='Submit']")
    WebElement submitButton;


    // Click "Create a Job" button
    public void clickCreateJobButton() {
        waits.waitForElementTobeClickable(driver, createJobButton);
        createJobButton.click();
    }

    // Enter job title
    public void enterJobTitle(String title) {
        jobTitle.sendKeys(title);
    }

    // Click location dropdown
    public void clickSelectLocation() {
        waits.waitForElementTobeClickable(driver, selectLocation);
        selectLocation.click();
    }


//    // Enter job location
//    public void enterJobLocation(String location) {
//        jobLocation.sendKeys(location);
//    }


    // Enter location in search input
    public void enterSearchLocation(String location) {
        searchLocationInput.sendKeys(location);
    }

    // Select "New Delhi" location
    public void selectNewDelhiLocation() {
        waits.waitForElementTobeClickable(driver, newDelhiLocation);
        newDelhiLocation.click();
    }

    // Click category dropdown
    public void clickCategoryDropdown() {
//        waits.waitForElementTobeClickable(driver, categoryDropdown);
        categoryDropdown.click();
    }

    // Select "Technology" category
    public void selectTechnologyCategory() {
        waits.waitForElementTobeClickable(driver, technologyCategory);
        technologyCategory.click();
    }

    // Enter required skills
    public void enterSkillsRequired(String skills) {
        skillsRequired.sendKeys(skills);
    }

    // Click "Create Skill" button
    public void clickCreateSkill() {
        waits.waitForElementTobeClickable(driver, createSkill);
        createSkill.click();
    }

    public void clickfirstSkill() {
        waits.waitForElementTobeClickable(driver, firstSkill);
        firstSkill.click();
    }
    // Click "Next" button
    public void clickNextButton() {
        waits.waitForElementTobeClickable(driver, nextButton);
        nextButton.click();
    }

    // Click "Click to upload" button
    public void clickToUpload() throws InterruptedException {
        Thread.sleep(2000);
        clickToUpload.sendKeys(filePath);

    }

    // Click "Submit" button
    public void clickSubmitButton() {
        waits.waitForElementTobeClickable(driver, submitButton);
        submitButton.click();
    }












}