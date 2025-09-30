package org.example.Institute;

import Pages.Institute.ConnectPage;
import Pages.Institute.LandingPage;
import Pages.Institute.LoginPage;
import org.example.BaseTest;
import org.testng.annotations.Test;

public class ConnectTest extends BaseTest {

    LoginPage loginPage =new LoginPage(driver);
    LandingPage landingPage=new LandingPage(driver);
    Pages.Institute.ConnectPage connectPage=new ConnectPage(driver);


    @Test
    public void testAcceptConnectionRequest() throws InterruptedException {
        landingPage.navigateToLandingPage();
        landingPage.clickOnLoginButton();
        Thread.sleep(5000);
        loginPage.login();
        connectPage.clickOnOrganizationsSection();
        connectPage.searchAndSelectOrganization("Niiikkkeeyyyyadaaav.Ldt");
        connectPage.acceptConnectionRequest();
        // Add assertions here to verify the request was accepted

    }

}


