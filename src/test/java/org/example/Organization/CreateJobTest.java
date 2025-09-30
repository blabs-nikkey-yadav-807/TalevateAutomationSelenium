// File: src/test/java/org/example/Organization/CreateJobTest.java

package org.example.Organization;


import Pages.Organization.CreateJob;
import Pages.Organization.LandingPage;
import Pages.Organization.LoginPage;
import org.example.BaseTest;
import org.testng.annotations.Test;

public class CreateJobTest extends BaseTest {

    LoginPage loginPage=new LoginPage(driver);
    LandingPage landingPage=new LandingPage(driver);
    CreateJob createJob=new CreateJob(driver);

    @Test
    public  void testCreateJob() throws InterruptedException {
        landingPage.navigateToLandingPage();
        landingPage.clickOnLoginButton();
        loginPage.login();
        createJob.clickCreateJobButton();
        createJob.enterJobTitle("Senior Software Engineer");
        createJob.clickSelectLocation();
        createJob.enterSearchLocation("New Delhi");
        createJob.selectNewDelhiLocation();
//        createJob.clickCategoryDropdown();
//        createJob.selectTechnologyCategory();
        createJob.enterSkillsRequired("Java");
        createJob.clickfirstSkill();
        createJob.clickNextButton();
        createJob.clickToUpload();
        createJob.clickSubmitButton();
        // Add assertions here to verify job creation
    }
}



