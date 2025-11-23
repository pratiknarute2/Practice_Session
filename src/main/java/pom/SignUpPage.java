package pom;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class SignUpPage extends utility.ReusableCode {


     //Variable, Web element
    // Constructor
    // Methods


    @FindBy(xpath = "//input[@id='name']") private WebElement fullName;
    @FindBy(xpath = "//input[@id='email']") private WebElement emailID;
    @FindBy(xpath = "//input[@id='password']") private WebElement pass;
    @FindBy(xpath = "//input[@id='mobile']") private WebElement mobileNo;
    @FindBy(xpath = "//h2[contains(text(), 'fresher')]/parent::div/parent::div") private WebElement workStatus;
    @FindBy(xpath = "//button[text()='Register now']") private WebElement registerNow;

    public SignUpPage(){
        PageFactory.initElements(webDriver, this);
    }
    public void signUpWithValidCredentials(){
        sendAction(fullName, "dsf dfdfd","Full Name");
        sendAction(emailID, "dsfdfdfd22@gmail.com","Email ID");
        sendAction(pass, "112mnbm223","Password");
        sendAction(mobileNo, "8625812215","Mobile No");
        clickAction(workStatus, "Work status");
        boolean status = isEnabled(registerNow, "Register Now");
        Assert.assertTrue(status, "Register button Not enabled");
    }
    public void openSignUpPage(){
        navigateOnPage("https://www.naukri.com/registration/createAccount", "Sign Up Page");
    }


}
