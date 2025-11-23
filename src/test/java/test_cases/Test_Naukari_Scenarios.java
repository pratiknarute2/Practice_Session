package test_cases;

import driverSetup.InitiateDriver;
import org.testng.annotations.*;
import pom.SignUpPage;

public class Test_Naukari_Scenarios extends hooks.Hooks{

    @Test
    public void Verify_Sign_Up_Flow_With_Valid_Input(){
        new SignUpPage().openSignUpPage();
        new SignUpPage().signUpWithValidCredentials();
    }

}
