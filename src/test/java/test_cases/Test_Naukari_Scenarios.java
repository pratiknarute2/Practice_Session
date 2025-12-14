package test_cases;

import dataProvider.SignUpDataProvider;
import driverSetup.InitiateDriver;
import org.testng.annotations.*;
import pom.SignUpPage;

import java.io.FileNotFoundException;

public class Test_Naukari_Scenarios extends hooks.Hooks{

//    @Test(dataProvider = "signupData", dataProviderClass = SignUpDataProvider.class)
//    public void Verify_Sign_Up_Flow_With_Valid_Input(String fullName, String email, String pass, String mobileNo, String url) throws InterruptedException {
//        new SignUpPage().openSignUpPage(url);
//        new SignUpPage().signUpWithValidCredentials(fullName,email, pass, mobileNo);
//        Thread.sleep(10000);
//    }
    @Test()
    public void Verify_Sign_Up_Flow_With_Valid_Input() throws InterruptedException, FileNotFoundException {
        new SignUpPage().openSignUpPage();
        new SignUpPage().signUpWithValidCredentials();
        Thread.sleep(10000);
    }

}
