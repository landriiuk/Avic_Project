package pagefactory.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchResultsPage extends BasePage {

    @FindBy(xpath = "//div[@class='prod-cart__descr']")
    private List<WebElement> searchResultsProductsListText;

    @FindBy(xpath = "//span[@class='prod-cart__article'][contains(text(),'Код товара: 44 210703')]")
    private WebElement searchResultsProductsAppleWatch;

    public SearchResultsPage(WebDriver driver) {
        super(driver);
    }

    public int getSearchResultsCount() {
        return getSearchResultsList().size();
    }

    public List<WebElement> getSearchResultsList() {
        return searchResultsProductsListText;
    }

    public void getSearchResultsProductsAppleWatch() {
        waitVisibilityOfAddToCartPopup(30, searchResultsProductsAppleWatch);
        searchResultsProductsAppleWatch.click();
    }
}
