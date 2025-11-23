package driverSetup;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

public class InitiateDriver {

    public static WebDriver webDriver;

    public static void lunchDriver(String browserName){
        if(browserName.equalsIgnoreCase("chrome")){
            webDriver = WebDriverManager.chromedriver().create();
        }else if(browserName.equalsIgnoreCase("edge")){
            webDriver = WebDriverManager.edgedriver().create();
        }else if (browserName.equalsIgnoreCase("firebox")){
            webDriver = WebDriverManager.firefoxdriver().create();
        }
        webDriver.manage().window().maximize();
    }

    public static  void closeDriver(){
        webDriver.close();
    }
}
