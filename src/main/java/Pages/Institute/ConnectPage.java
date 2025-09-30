package Pages.Institute;

import Utilts.Waits;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ConnectPage {
    private WebDriver driver;
    Waits waits;

    public ConnectPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);// initialize all @FindBy elements
        waits = new Waits(driver);
    }

    @FindBy(xpath = "//span[text()='Organizations']")
    WebElement organizationsSection;


    @FindBy(xpath = "//input[@placeholder='Search Organizations']")
    WebElement searchOrganization;

    @FindBy(xpath = "//div[text()='Niiikkkeeyyyyadaaav.Ldt']")
    WebElement searchResult;

    @FindBy(xpath = "//button[text()='Pending Received Request']")
    WebElement pendingReceivedRequestButton;

    @FindBy(xpath = "//button[text()='Accept']")
    WebElement acceptButton;

    public void clickOnOrganizationsSection() throws InterruptedException {
        organizationsSection.click();
        Thread.sleep(2000);
    }

    public void searchAndSelectOrganization(String organizationName) throws InterruptedException {
        waits.waitForElementTobeVisible(driver, searchOrganization);
        searchOrganization.clear();
        searchOrganization.sendKeys(organizationName);
        waits.waitForElementTobeVisible(driver, searchResult);
        Assert.assertTrue(searchResult.isDisplayed());
        pendingReceivedRequestButton.click();
    }

    public boolean validateSearchResult(String organizationName) throws InterruptedException {
        clickOnOrganizationsSection();
        searchAndSelectOrganization(organizationName);
        return searchResult.isDisplayed();
    }

    public void acceptConnectionRequest() throws InterruptedException {
        waits.waitForElementTobeClickable(driver, acceptButton);
        acceptButton.click();
        Thread.sleep(2000);
    }
}


