package pagefactory.tests;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class ProductPageTests extends BaseTest {

    @Test
    public void checkAllElementsOnThePageCanBuy() {
        getHomePage().moveToElementInSidebar();
        getHomePage().clickInElementInSidebar();
        getGyroBoardPage().filterElementsOnlyInStock();
        for (WebElement webElement : getGyroBoardPage().findAllElementInStock()) {
            assertTrue(webElement.getText().contains("Купить"));

        }
    }
}
