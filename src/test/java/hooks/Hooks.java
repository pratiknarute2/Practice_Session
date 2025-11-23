package hooks;

import org.testng.annotations.*;

public class Hooks extends  driverSetup.InitiateDriver{
    @BeforeSuite
    public void predifinedSuiteAction(){

    }
    @BeforeTest
    public void predefinedTestAction(){

    }
    @BeforeClass
    public void predefinedClassAction(){

    }
    @BeforeMethod
    public void predefinedMethodAction(){
        lunchDriver("chrome");
    }

    @AfterMethod
    public void postSuiteAction(){
        closeDriver();
    }
    @AfterTest
    public void postTestAction(){

    }
    @AfterClass
    public void postClassAction(){

    }
    @AfterSuite
    public void postMethodAction(){

    }
}
