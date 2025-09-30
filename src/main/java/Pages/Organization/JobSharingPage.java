package Pages.Organization;

import Utilts.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JobSharingPage {
    private WebDriver driver;
    Waits waits;

    public JobSharingPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);// initialize all @FindBy elements
        waits = new Waits(driver);
    }

    @FindBy(xpath = "//span[text()='Repository']")
    WebElement repository;

    @FindBy(xpath = "(//span[text()='Invite'])[2]")
    WebElement inviteButton;

    @FindBy(xpath = "//h3[text()='Use Shortlist']")
    WebElement useShortlistOption;

    @FindBy(xpath = "//span[text()='Select Shortlist']")
    WebElement selectShortlistDropdown;

    @FindBy(xpath = "//button[text()='Test Shortlist']")
    WebElement testShortlistButton;

    @FindBy(xpath = "//input[@name='interviewTimeline.goLiveDate']")
    WebElement goLiveDateField;

    @FindBy(xpath = "//input[@name='interviewTimeline.applicationDeadline']")
    WebElement applicationDeadlineField;

    @FindBy(xpath = "//input[@placeholder='Enter CtC']")
    WebElement enterCTCField;

    @FindBy(xpath = "//span[text()='Next']")
    WebElement nextButton;

    @FindBy(xpath = "//span[text()='Pre Placement Talk']")
    WebElement DragItem;

    @FindBy(xpath = "//h3[contains(text(),'Recruitment Process')]/parent::div/following-sibling::div/div/div/div")
    WebElement dropLocation;

    @FindBy(xpath = "/span[text()='Share Job']]")
    WebElement sendInviteButton;

    public void setApplicationDeadlineField(WebElement applicationDeadlineField) {
        this.applicationDeadlineField = applicationDeadlineField;
    }

    public WebElement getSelectShortlistOption(String optionText) {
        return driver.findElement(By.xpath("//button[text()='" + optionText + "']"));
    }

    public void dragAndDrop() throws InterruptedException {
        Actions actions = new Actions(driver);
        waits.waitForElementTobeClickable(driver, DragItem);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].style.border='3px solid red'", DragItem);
        js.executeScript("arguments[0].style.border='3px solid red'", dropLocation);

        actions.dragAndDrop(DragItem, dropLocation).build().perform();
        Thread.sleep(2000);
    }

    public void clickOnRepository() throws InterruptedException {
        waits.waitForElementTobeClickable(driver, repository);
        repository.click();
        Thread.sleep(2000);
    }

    public void clickOnInviteButton() throws InterruptedException {
        waits.waitForElementTobeClickable(driver, inviteButton);
        inviteButton.click();
        Thread.sleep(2000);
    }

    public void clickOnUseShortlistOption() throws InterruptedException {
        waits.waitForElementTobeClickable(driver, useShortlistOption);
        useShortlistOption.click();
        Thread.sleep(2000);
    }


    public void selectTestShortlistButton() throws InterruptedException {
        waits.waitForElementTobeClickable(driver, testShortlistButton);
        testShortlistButton.click();
        Thread.sleep(2000);
    }

    public void clickOnSelectShortlistDropdown() throws InterruptedException {
        waits.waitForElementTobeClickable(driver, selectShortlistDropdown);
        selectShortlistDropdown.click();
        Thread.sleep(2000);
    }

    public void setGoLiveDateField(String goLiveDate) throws InterruptedException {
        waits.waitForElementTobeClickable(driver, goLiveDateField);
        goLiveDateField.sendKeys(goLiveDate);
        Thread.sleep(2000);
    }

    public void setApplicationDeadlineField(String applicationDeadline) throws InterruptedException {
        waits.waitForElementTobeClickable(driver, applicationDeadlineField);
        applicationDeadlineField.sendKeys(applicationDeadline);
        Thread.sleep(2000);
    }

    public void setEnterCTCField(String enterCTC) throws InterruptedException {
        waits.waitForElementTobeClickable(driver, enterCTCField);
        enterCTCField.sendKeys(enterCTC);
        Thread.sleep(2000);
    }

    public void clickOnNextButton() throws InterruptedException {
        waits.waitForElementTobeClickable(driver, nextButton);
        nextButton.click();
        Thread.sleep(2000);
    }

    public void clickOnSendInviteButton() throws InterruptedException {
        waits.waitForElementTobeClickable(driver, sendInviteButton);
        sendInviteButton.click();
        Thread.sleep(2000);
    }


}