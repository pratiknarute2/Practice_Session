package dataProvider;

import org.testng.annotations.DataProvider;

public class SignUpDataProvider {

    @DataProvider(name = "signupData")
    public static Object[][] signupData() {

        return new Object[][] {
                {
                        "Sam Wai",
                        "sam123ffdsf@gmail.com",
                        "sam@1233434",
                        "8625812215",
                        "https://www.naukri.com/registration/createAccount"
                },
                {
                        "gorge Wai",
                        "gorgey123@gmail.com",
                        "dfdf1233434",
                        "8625812215",
                        "https://www.naukri.com/registration/createAccount"
                }
        };
    }
}
