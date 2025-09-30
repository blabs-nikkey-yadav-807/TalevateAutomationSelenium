package org.example.Organization;

import Pages.Institute.UploadStudent;
import Pages.Organization.LandingPage;
import Pages.Organization.SignupPage;
import org.example.BaseTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SignupPageTest extends BaseTest {
    static SoftAssert softAssert = new SoftAssert();

    @Test
    public static void verifyNavigationToSignupPage()  {
       LandingPage landingPage = new LandingPage(driver);
       landingPage.navigateToLandingPage();
       landingPage.clickOnSignUpButton();
       softAssert.assertTrue(landingPage.getWelcomeText.isDisplayed());}




    @Test
    public static void verifyValidDetailsSignUp() throws InterruptedException {
        SignupPage signupPage=new SignupPage(driver);
        signupPage.fillOrganizationDetails();
        Thread.sleep(1000);
        signupPage.verifyYourAccount();
        signupPage.setPassword();


    }


}

