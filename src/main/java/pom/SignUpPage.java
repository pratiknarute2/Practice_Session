package pom;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.io.FileNotFoundException;
import java.time.Duration;

public class SignUpPage extends utility.ReusableCode {

    String FullName = getDataFromJson("Full Name", "1");
    String Email = getDataFromJson("Email", "2");
    String Pass = getDataFromJson("Pass", "2");
    String MobileNo = getDataFromJson("Mobile No", "2");
    String url = getDataFromJson("SingupPage url", "2");


    @FindBy(xpath = "//input[@id='name']") private WebElement fullName;
    @FindBy(xpath = "//input[@id='email']") private WebElement emailID;
    @FindBy(xpath = "//input[@id='password']") private WebElement pass;
    @FindBy(xpath = "//input[@id='mobile']") private WebElement mobileNo;
    @FindBy(xpath = "//h2[contains(text(), 'fresher')]/parent::div/parent::div") private WebElement workStatus;
    @FindBy(xpath = "//button[text()='Register now']") private WebElement registerNow;

    public SignUpPage() throws FileNotFoundException {
        PageFactory.initElements(webDriver, this);
    }

    public void signUpWithValidCredentials(){
        sendAction(fullName, FullName,"Full Name");
        sendAction(emailID, Email,"Email ID");
        sendAction(pass, Pass,"Password");
        sendAction(mobileNo, MobileNo,"Mobile No");
        clickAction(workStatus, "Work status");
        boolean status = isEnabled(registerNow, "Register Now");
        Assert.assertTrue(status, "Register button Not enabled");
    }
    public void openSignUpPage(){
        navigateOnPage(url, "Sign Up Page");
    }


}
