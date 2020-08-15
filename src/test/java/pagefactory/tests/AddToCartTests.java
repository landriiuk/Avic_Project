package pagefactory.tests;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AddToCartTests extends BaseTest {

    private String EXPECTED_AMOUNT_OF_PRODUCTS_IN_CART = "1";
    private String SEARCH_KEYWORD = "Apple Watch";

    @Test
    public void checkAddToCart() {
        getHomePage().clickOnProductCatalogButton();
        getHomePage().clickOnAppleStoreButton();
        getAppleStorePage().clickOnIphoneButton();
        getBasePage().waitForPageLoadComplete(30);
        getIphonePage().clickOnAddToCartButton();
        getBasePage().waitVisibilityOfAddToCartPopup(30, getIphonePage().getAddToCartPopup());
        getIphonePage().clickOnContinueShoppingButton();
        assertEquals(getHomePage().getTextOfAmountProductsInCart(), EXPECTED_AMOUNT_OF_PRODUCTS_IN_CART);
    }


//    }
//    @Test(priority = 6)
//    public void checkErrorAlertWithIncorrectData() {
//        driver.get("https://avic.ua/sign-in");
//        driver.findElement(xpath("//div[@class='sign-holder clearfix']//input[@name='login']")).sendKeys("login@gmail.com");
//        driver.findElement(xpath("//input[@type='password']")).sendKeys("myPassword");
//        driver.findElement(xpath("//button[@class='button-reset main-btn submit main-btn--green']")).click();
//        assertTrue(driver.findElement(By.xpath("//div[@id='modalAlert']")).isDisplayed());
//    }

    @Test
    public void checkBasketTotal() {
        getHomePage().searchByKeyword(SEARCH_KEYWORD);
        getSearchResultsPage().getSearchResultsProductsAppleWatch();
        getProduct_appleWatchPage().clickBuyButton();
        assertEquals(getProduct_appleWatchPage().getTextSumTheSelectedProductInTheCArt(), getProduct_appleWatchPage().getTextCartTotal());
    }
}
