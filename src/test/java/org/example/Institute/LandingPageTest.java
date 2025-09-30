package org.example.Institute;

import Pages.Institute.LandingPage;
import org.example.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LandingPageTest extends BaseTest {
static SoftAssert softAssert=new SoftAssert();

    @Test
    public static void verifyNavigationTolandingPage() {
        LandingPage landingPage = new LandingPage(driver);
        landingPage.navigateToLandingPage();
        Assert.assertTrue(landingPage.title.equalsIgnoreCase(driver.getTitle()));
    }

    @Test
    public static void verifylandingPageHavingSignUpAndLoginButton() {
        LandingPage landingPage = new LandingPage(driver);

        softAssert.assertTrue(landingPage.signUpButton.isDisplayed());
        softAssert.assertTrue(landingPage.loginButton.isDisplayed());
//        softAssert.assertTrue(landingPage.invalidButton.isDisplayed());

        softAssert.assertAll();
    }

    @Test(priority = 3)
        public static void validateloginButton() throws InterruptedException {
        LandingPage landingPage = new LandingPage(driver);
        softAssert.assertTrue(landingPage.loginButton.isDisplayed());
        softAssert.assertTrue(landingPage.validateLoginButton());
    }

 @Test(priority = 4)
   public static void validateSignupButton() throws InterruptedException {
     LandingPage landingPage = new LandingPage(driver);
     softAssert.assertTrue(landingPage.signUpButton.isDisplayed());
     softAssert.assertTrue(landingPage.validateSignupButton());

 }

}


