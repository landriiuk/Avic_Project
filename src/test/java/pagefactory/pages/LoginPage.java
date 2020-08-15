package pagefactory.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
    @FindBy(xpath = "//div[@class='sign-holder clearfix']//input[@name='login']")
    private WebElement inputLogin;

    @FindBy(xpath = "//input[@type='password']")
    private WebElement inputPassword;

    @FindBy(xpath = "//button[@class='button-reset main-btn submit main-btn--green']")
    private WebElement buttonToComeIn;

    @FindBy(xpath = "//div[@id='modalAlert']")
    private WebElement messageAboutWrongData;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void enterUserLogIn(final String login) {
        inputLogin.sendKeys(login);
    }

    public void enterUserPassword(final String password) {
        inputPassword.sendKeys(password);
    }

    public void clickButtonToComeIn() {
        buttonToComeIn.click();
    }

    public boolean checkElementIsDisplayed() {
        waitVisibilityOfAddToCartPopup(10, messageAboutWrongData);
        return messageAboutWrongData.isDisplayed();
    }
}
