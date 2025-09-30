package org.example.Institute;

import Pages.Institute.LandingPage;
import Pages.Institute.LoginPage;
import Pages.Institute.UploadStudent;
import org.example.BaseTest;
import org.testng.annotations.Test;

public class UploadStudentTest extends BaseTest {

    @Test
    public void quickAddStudent() throws InterruptedException {

        LoginPage loginPage = new LoginPage(driver);
        LandingPage landingPage=new LandingPage(driver);
        landingPage.navigateToLandingPage();
        landingPage.validateLoginButton();
        loginPage.login();


        UploadStudent uploadStudent = new UploadStudent(driver);
        uploadStudent.addStudent(
                "STU12008",         // studentId
                "Kat",        // firstName
                "Student",             // middleName
                "QA",           // lastName
                "Female",         // gender
                "General",        // category
                "15-05-1999",     // dob (dd-MM-yyyy)
                "qanikkey@gmail.com", // email
                "9517179795",     // mobile
                "Graduate",  // academicLevel
                "North Campus",    // campus
                "Computer Science", // dept
                "Software",       // branch
                "8.5",            // cgpa
                "2024",           // yearOfGrad
                "90",
                "2015",
                "90",
                "2017"


        );
        // Optionally, add assertions or submission steps here
    }

}





