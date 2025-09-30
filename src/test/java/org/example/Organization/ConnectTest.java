// File: src/test/java/org/example/Organization/ConnectTest.java

package org.example.Organization;

import Pages.Organization.ConnectPage;
import Pages.Organization.LandingPage;
import Pages.Organization.LoginPage;
import org.example.BaseTest;
import org.testng.annotations.*;

public class ConnectTest extends BaseTest {

    LoginPage loginPage=new LoginPage(driver);
    LandingPage landingPage=new LandingPage(driver);
    ConnectPage connectPage=new ConnectPage(driver);



    @Test //name this method as test case

    public void testSendConnectionRequest() throws InterruptedException {
        landingPage.navigateToLandingPage();
        landingPage.clickOnLoginButton();
        loginPage.login();
        connectPage.clickOnInstitutesSection();
        connectPage.searchInstituteByName();
//        connectPage.clickOnSearchResult();
        connectPage.clickOnNotConnectedButton();
        connectPage.clickOnAddPocButton();
        connectPage.selectRadioButton();
        connectPage.clickOnSelectUserButton();
        connectPage.enterNote("Requesting connection for collaboration.");
        connectPage.uploadFile("/home/nikkey/Downloads/CategoryPageExample.pdf");
        connectPage.clickOnSendConnectionRequestButton();
        // Add assertions here to verify connection request sent
    }


}





