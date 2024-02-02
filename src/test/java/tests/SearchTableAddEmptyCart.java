package tests;

import org.testng.annotations.Test;
import pages.*;

import static common.Constants.*;


public class SearchTableAddEmptyCart extends BaseTest {

    @Test
    public void paymentFlowShouldBeSuccessful() throws Exception {

        HomePage homr = new HomePage(driver);
        homr.launchBrowser();
        homr.searvh();
        homr.searchCriteria(searchCriteria);
        homr.clickSearch();

        OrderSummaryPage orderSummarySteps = new OrderSummaryPage(driver);
        orderSummarySteps.searchTitle();

        CartPage cartPage = new CartPage(driver);
        cartPage.addproducttoCartAndEmpty();
    }
}
