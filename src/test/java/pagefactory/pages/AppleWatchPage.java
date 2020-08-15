package pagefactory.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AppleWatchPage extends BasePage {
    @FindBy(xpath = "//a[@class='main-btn main-btn--green main-btn--large']")
    private WebElement buyButton;
    
    @FindBy(xpath = "//div[@class='total-h']/span[@class='prise']")
    private WebElement sumTheSelectedProductInTheCArt;

    @FindBy(xpath = "//div[@class='item-total']/span[@class='prise']")
    private WebElement cartTotal;

    public AppleWatchPage(WebDriver driver) {
        super(driver);
    }

    public void clickBuyButton() {
        waitVisibilityOfAddToCartPopup(30, buyButton);
        buyButton.click();
    }

    public String getTextSumTheSelectedProductInTheCArt() {
        waitVisibilityOfAddToCartPopup(30, sumTheSelectedProductInTheCArt);
        return sumTheSelectedProductInTheCArt.getText();
    }

    public String getTextCartTotal() {
        return cartTotal.getText();
    }
}
