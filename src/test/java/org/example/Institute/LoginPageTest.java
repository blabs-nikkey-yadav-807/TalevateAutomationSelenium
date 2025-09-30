package org.example.Institute;

import Pages.Institute.LandingPage;
import Pages.Institute.LoginPage;
import Pages.Institute.UploadStudent;
import org.example.BaseTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LoginPageTest extends BaseTest {

        static SoftAssert softAssert = new SoftAssert();

        @Test(priority = 0)
        public static void verifyNavigationToLoginPage() {
            LandingPage landingPage = new LandingPage(driver);
            landingPage.navigateToLandingPage();
            landingPage.clickOnLoginButton();
            softAssert.assertTrue(landingPage.welcomeText.isDisplayed());
        }

        @Test(priority = 1)
        public static void verifyValidLogin() throws InterruptedException {
            LoginPage loginPage = new LoginPage(driver);
            loginPage.login();
            loginPage.verifyDashboard();
        }


    }






