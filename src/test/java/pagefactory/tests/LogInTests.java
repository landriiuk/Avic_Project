package pagefactory.tests;

import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class LogInTests extends BaseTest {

    private static final String AVIC_SIGN_IN_URL = "https://avic.ua/sign-in";
    private static final String LOGIN = "login@gmail.com";
    private static final String PASSWORD = "myPassword";

    @Test
    public void checkErrorAlertWithIncorrectData() {
        getDriver().get(AVIC_SIGN_IN_URL);
        getLoginPage().enterUserLogIn(LOGIN);
        getLoginPage().enterUserPassword(PASSWORD);
        getLoginPage().clickButtonToComeIn();
        assertTrue(getLoginPage().checkElementIsDisplayed());
    }
}
