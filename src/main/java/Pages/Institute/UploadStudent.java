package Pages.Institute;

import Utilts.Waits;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class UploadStudent {

    private WebDriver driver;
    Waits waits;

    public UploadStudent(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);// initialize all @FindBy elements
        waits=new Waits(driver);
    }


    @FindBy(xpath = "//span[text()='Students']")
    WebElement studentSection;

    @FindBy(xpath = "//button[text()='Quick Add']")
    WebElement quickAdd;

    @FindBy(xpath = "//input[@placeholder='Enter student ID']")
    WebElement enterStudentId;

    @FindBy(xpath = "//input[@placeholder='Enter first name']")
    WebElement enterFirstName;

    @FindBy(xpath = "//input[@placeholder='Enter middle name']")
    WebElement enterMiddleName;

    @FindBy(xpath = "//input[@placeholder='Enter last name']")
    WebElement enterLastName;

    @FindBy(xpath = "//label[text()='Gender']/following-sibling::div/select")
    WebElement gender;

    @FindBy(xpath = "//label[text()='Category']/following-sibling::div/select")
    WebElement category;

    @FindBy(xpath = "//input[@type='date']")
    WebElement dateOfBirth;

    @FindBy(xpath = "//input[@placeholder='Enter Email ID']")
    WebElement enterEmailID;

    @FindBy(xpath = "//input[@placeholder='Enter mobile number']")
    WebElement enterMobileNumber;

    @FindBy(xpath = "//label[text()='Academic Level']/following-sibling::div/select")
    WebElement academicLevel;

    @FindBy(xpath = "//label[text()='Campus Name']/following-sibling::div/select")
    WebElement campusName;

    @FindBy(xpath = "//label[text()='Department']/following-sibling::div/select")
    WebElement department;

    @FindBy(xpath = "//label[text()='Branch']/following-sibling::div/select")
    WebElement branch;

    @FindBy(xpath = "//input[@placeholder='Enter CGPA']")
    WebElement enterCGPA;

    @FindBy(xpath = "//label[text()='Year of Graduation']/following-sibling::input")
    WebElement yearOfGraduation;

    @FindBy(xpath = "//button[text()='Next']")
    WebElement nextButton;


    @FindBy(xpath = "//input[@placeholder='Enter 10th Percentage/CGPA']")
    WebElement enter10thPercentage;

    @FindBy(xpath = "//label[text()='Year of Completion']/following-sibling::div/select")
    WebElement yearOfCompletion10;

    @FindBy(xpath = "//input[@placeholder='Enter 12th Percentage/CGPA']")
    WebElement enter12thPercentage;

    @FindBy(xpath = "(//label[text()='Year of Completion']/following-sibling::div/select)[2]")
    WebElement yearOfCompletion12;

    @FindBy(xpath = "//button[text()='Next']")
    WebElement nextButton2;

    @FindBy(xpath = "//button[text()='Submit']")
    WebElement submitButton;









    // ------------------- Methods -------------------

    public void clickStudentSection() {
        studentSection.click();
    }

    public void clickQuickAdd() throws InterruptedException {
        Thread.sleep(2000);
        waits.waitForElementTobeClickable(driver,quickAdd);
        quickAdd.click();
    }

    public void enterStudentId(String studentId) {
        waits.waitForElementTobeClickable(driver,enterStudentId);
        enterStudentId.sendKeys(studentId);
    }

    public void enterFirstName(String firstName) {
        enterFirstName.sendKeys(firstName);
    }

    public void enterMiddleName(String middleName) {
        enterMiddleName.sendKeys(middleName);
    }

    public void enterLastName(String lastName) {
        enterLastName.sendKeys(lastName);
    }

    public void selectGender(String gen) {
        Select select = new Select(gender);
        select.selectByVisibleText(gen);
    }

    public void selectCategory(String cat) {
        Select select = new Select(category);
        select.selectByVisibleText(cat);
    }

    public void enterDateOfBirth(String dob) {
        dateOfBirth.sendKeys(dob);
    }

    public void enterEmail(String email) {
        enterEmailID.sendKeys(email);
    }

    public void enterMobileNumber(String mobile) {
        enterMobileNumber.sendKeys(mobile);
    }

    public void selectAcademicLevel(String level) {
        Select select = new Select(academicLevel);
        select.selectByVisibleText(level);
    }

    public void selectCampusName(String campus) throws InterruptedException {
        Thread.sleep(3000);
        Select select = new Select(campusName);
        select.selectByVisibleText(campus);
    }

    public void selectDepartment(String dept) throws InterruptedException {
        waits.waitForElementTobeEnabled(driver,department);
        Thread.sleep(3000);
        Select select = new Select(department);
        select.selectByVisibleText(dept);
    }

    public void selectBranch(String br) throws InterruptedException {
        waits.waitForElementTobeEnabled(driver,branch);
        Thread.sleep(3000);
        Select select = new Select(branch);
        select.selectByVisibleText(br);
    }

    public void enterCGPA(String cgpa) {
        enterCGPA.sendKeys(cgpa);
    }

    public void enterYearOfGraduation(String year) {
        yearOfGraduation.sendKeys(year);
    }

    public void enter10thPercentage(String percentage) {
        enter10thPercentage.sendKeys(percentage);
    }

    public void selectYearOfCompletion10(String year) {
        Select select = new Select(yearOfCompletion10);
        select.selectByVisibleText(year);
    }

    public void enter12thPercentage(String percentage) {
        enter12thPercentage.sendKeys(percentage);
    }

    public void selectYearOfCompletion12(String year) {
        Select select = new Select(yearOfCompletion12);
        select.selectByVisibleText(year);
    }

    public void clickNextButton() {
        waits.waitForElementTobeClickable(driver, nextButton);
        nextButton.click();
    }

    public void clickSubmitButton() {
        waits.waitForElementTobeClickable(driver, submitButton);
        submitButton.click();
    }

    public void addStudent(String studentId, String firstName, String middleName, String lastName,
                           String gender, String category, String dob, String email, String mobile,
                           String academicLevel, String campus, String dept, String branch,
                           String cgpa, String yearOfGrad,
                           String tenthPercentage, String tenthYear,
                           String twelfthPercentage, String twelfthYear) throws InterruptedException {


        clickStudentSection();
        clickQuickAdd();
        enterStudentId(studentId);
        enterFirstName(firstName);
        enterMiddleName(middleName);
        enterLastName(lastName);
        selectGender(gender);
        selectCategory(category);
        enterDateOfBirth(dob);
        enterEmail(email);
        enterMobileNumber(mobile);
        selectAcademicLevel(academicLevel);
        selectCampusName(campus);
        selectDepartment(dept);
        selectBranch(branch);
        enterCGPA(cgpa);
        enterYearOfGraduation(yearOfGrad);
        clickNextButton();
        enter10thPercentage(tenthPercentage);
        selectYearOfCompletion10(tenthYear);
        enter12thPercentage(twelfthPercentage);
        selectYearOfCompletion12(twelfthYear);
        clickNextButton();
        clickSubmitButton();



    }
}








































































































































































































































