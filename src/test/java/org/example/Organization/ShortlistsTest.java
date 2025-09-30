package org.example.Organization;

import Pages.Organization.ShortlistsPage;
import Pages.Organization.LandingPage;
import Pages.Organization.LoginPage;
import org.example.BaseTest;
import org.testng.annotations.Test;

public class ShortlistsTest extends BaseTest {

    LoginPage loginPage;
    LandingPage landingPage;
    ShortlistsPage shortlistsPage;

    public ShortlistsTest() {
        loginPage = new LoginPage(driver);
        landingPage = new LandingPage(driver);
        shortlistsPage = new ShortlistsPage(driver);
    }

    @Test
    public void testShortlistCandidate() throws InterruptedException {
        landingPage.navigateToLandingPage();
        landingPage.clickOnLoginButton();
        loginPage.login();
        shortlistsPage.clickOnShortlistsSection();
        shortlistsPage.clickOnCreateNewShortlistButton();
        shortlistsPage.searchInstitute("KERALA ACADEMY OF PHARMACY");
        shortlistsPage.selectFirstInstituteFromDropdown();
        shortlistsPage.selectStudentCheckbox();
        shortlistsPage.clickOnCreateShortlistButton();
        shortlistsPage.enterShortlistName("Test Shortlist");
        shortlistsPage.clickOnCreateShortlistSubmitButton();
        // Add assertions here to verify candidate shortlisted
    }
}










