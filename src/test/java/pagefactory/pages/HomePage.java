package pagefactory.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(xpath = "//input[@id='input_search']")
    private WebElement searchInput;

    @FindBy(xpath = "//span[@class='sidebar-item']")
    private WebElement productCatalogButton;

    @FindBy(xpath = "//ul[contains(@class,'sidebar-list')]//a[contains(@href, 'apple-store')]")
    private WebElement appleSoreButton;

    @FindBy(xpath = "//div[contains(@class,'header-bottom__cart')]//div[contains(@class,'cart_count')]")
    private WebElement amountOfProductsInCart;

    @FindBy(xpath = "//a[@class='sidebar-item'][text()='Электротранспорт']")
    private WebElement sidebarElement;

    @FindBy(xpath = "//a[@class='sidebar-item'][text()='Гироборды']")
    private WebElement sidebarItemElement;


    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void searchByKeyword(final String keyword) {
        waitVisibilityOfAddToCartPopup(10, searchInput);
        searchInput.sendKeys(keyword, Keys.ENTER);
    }

    public void clickOnProductCatalogButton() {
        productCatalogButton.click();
    }

    public void clickOnAppleStoreButton() {
        appleSoreButton.click();
    }

    public String getTextOfAmountProductsInCart() {
        return amountOfProductsInCart.getText();
    }

    public void moveToElementInSidebar() {
        actionMoveToElement(sidebarElement);
    }

    public void clickInElementInSidebar() {
        sidebarItemElement.click();
    }


}
