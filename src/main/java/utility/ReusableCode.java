package utility;

import io.qameta.allure.Step;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class ReusableCode extends driverSetup.InitiateDriver{

    public void  clickAction(WebElement el, String step){
        try{
            WebDriverWait webDriverWait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
            webDriverWait.until(ExpectedConditions.visibilityOf(el));
            webDriverWait.until(ExpectedConditions.elementToBeClickable(el));
            el.click();
            System.out.println("Click on: "+step);

        }catch (TimeoutException timeoutException){
            Assert.fail("Fail to click on: "+step+" | "+timeoutException.getMessage());
        }

    }
    public void sendAction(WebElement el, String value, String step) {
        try {
            WebDriverWait webDriverWait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
            webDriverWait.until(ExpectedConditions.visibilityOf(el));
            el.sendKeys(value);
            System.out.println("Fill in: " + step+" | Value: "+value);
        } catch (TimeoutException timeoutException) {
            Assert.fail("Fail to Fill in: " + step + " | " + timeoutException.getMessage());
        }
    }
    public boolean isEnabled(WebElement el, String step){
        boolean status = false;
        try {
            WebDriverWait webDriverWait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
            webDriverWait.until(ExpectedConditions.visibilityOf(el));
            webDriverWait.until(ExpectedConditions.elementToBeClickable(el));
            status = el.isEnabled();
            System.out.println("Enabled: "+step);
        }catch (TimeoutException timeoutException){
            System.out.println("Not Enable: "+step+" | "+timeoutException.getMessage());
        }
        return status;
    }
    public void navigateOnPage(String url, String step){
        try {
            webDriver.get(url);
            Thread.sleep(1000);
            System.out.println("Open URL: "+step);
            Assert.assertEquals(webDriver.getCurrentUrl(),url, "Fail To Navigate on url: "+url);
        }catch (Exception e){
            System.out.println("Not Enable: "+step+" | "+e.getMessage());
            Assert.assertEquals(webDriver.getCurrentUrl(),url, "Fail To Navigate on url: "+url);
        }
    }
    public void handleDropdown(){

    }
    public void handleWindows(){

    }
    public void handleCheckBox(){

    }
}
