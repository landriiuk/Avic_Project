package pagefactory.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class GyroBoardPage extends BasePage {
    @FindBy(xpath = "//label[text()='Только товар в наличии']")
    private WebElement checkboxOnlyInStock;

    @FindBy(xpath = "//div[@class='filter__items filter__items--top checkbox']//a[@class='filter-tooltip js_filters_accept']")
    private WebElement buttonFilterOnlyInStock;

    @FindBy(xpath = "//div[@class='prod-cart height']")
    private List<WebElement> allElementsInStock;

    public GyroBoardPage(WebDriver driver) {
        super(driver);
    }

    public void filterElementsOnlyInStock() {
        checkboxOnlyInStock.click();
        waitVisibilityOfAddToCartPopup(30, buttonFilterOnlyInStock);
        buttonFilterOnlyInStock.click();
    }

    public List<WebElement> findAllElementInStock() {
        return allElementsInStock;
    }
}
