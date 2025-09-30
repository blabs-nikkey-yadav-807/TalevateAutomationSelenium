package org.example.Organization;

import Pages.Organization.JobSharingPage;
import Pages.Organization.LandingPage;
import Pages.Organization.LoginPage;
import org.example.BaseTest;
import org.testng.annotations.Test;

public class JobSharingTest extends BaseTest {

    LoginPage loginPage=new LoginPage(driver);
    LandingPage landingPage=new LandingPage(driver);
    JobSharingPage jobSharingPage=new JobSharingPage(driver);


    @Test
    public void testJobSharing() throws InterruptedException {
        landingPage.navigateToLandingPage();
        landingPage.clickOnLoginButton();
        loginPage.login();
        jobSharingPage.clickOnRepository();
        jobSharingPage.clickOnInviteButton();
        jobSharingPage.clickOnUseShortlistOption();
        jobSharingPage.clickOnSelectShortlistDropdown();
        jobSharingPage.selectTestShortlistButton();
        jobSharingPage.setGoLiveDateField("30-09-2025");
        jobSharingPage.setApplicationDeadlineField("01-10-2025");
        jobSharingPage.setEnterCTCField("60000");
        jobSharingPage.clickOnNextButton();
        jobSharingPage.dragAndDrop();

        // Add assertions here to verify job sharing
    }



}
