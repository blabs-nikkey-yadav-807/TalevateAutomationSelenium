package org.example;

import Pages.LandingPage;
import Pages.SignupPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SignupPageTest extends BaseTest {
    static SoftAssert softAssert = new SoftAssert();

    @Test
    public static void verifyNavigationToSignupPage() throws InterruptedException {
        SignupPage signupPage=new SignupPage(driver);
       LandingPage landingPage = new LandingPage(driver);
       landingPage.navigateToLandingPage();
       landingPage.clickOnSignUpButton();
       softAssert.assertTrue(landingPage.getWelcomeText.isDisplayed());
       signupPage.fillInstituteDetails();

    }

}

