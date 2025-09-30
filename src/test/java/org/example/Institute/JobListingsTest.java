package org.example.Institute;

import Pages.Institute.JobListingsPage;

import Pages.Institute.LandingPage;
import Pages.Institute.LoginPage;
import org.example.BaseTest;
import org.testng.annotations.Test;

public class JobListingsTest extends BaseTest {

    LoginPage loginPage = new LoginPage(driver);
    LandingPage landingPage = new LandingPage(driver);
    JobListingsPage jobListingsPage = new JobListingsPage(driver);

    @Test
    public void testJobApproval() throws InterruptedException {
        landingPage.navigateToLandingPage();
        landingPage.validateLoginButton();
        loginPage.login();
        jobListingsPage.clickOnJobListings();
        jobListingsPage.clickOnUnderReviewTab();
        jobListingsPage.clickOnApproveButton();

        // Add assertions here to verify job approval
    }

}






