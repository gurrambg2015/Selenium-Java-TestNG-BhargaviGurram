package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import common.Constants;

public class CartPage extends AbstractPage {
	
	Constants constant = new Constants();

    @FindBy(xpath = "//div[@id='product_listing']/div[last()]//input[@value='Add to Cart']")
    private WebElement addToCart;

    @FindBy(xpath = "//select[@title='Countertop Edge']")
    private WebElement countertopEdge;
    
    @FindBy(xpath = "//select[@title='Finish Upgrade']")
    private WebElement finishUpgrade;
    
    @FindBy(xpath = "//select[@title='Sink Bowl']")
    private WebElement sinkBowl;
    
    @FindBy(xpath = "//button[text()='Add To Cart']")
    private WebElement addToCartAgain;
    
    @FindBy(xpath = "//a[text()='View Cart']")
    private WebElement viewCart;
    
    @FindBy(xpath = "//a[text()='Empty Cart']")
    private WebElement emptyCart;
    
    @FindBy(xpath = "//button[text()='Empty Cart']")
    private WebElement emptyCartAgain;
    
    @FindBy(xpath = "//p[@class='header-1']")
    private WebElement emptyCartText;

    public CartPage(WebDriver driver) {
        super(driver);
    }

    public void addproducttoCartAndEmpty() throws InterruptedException {
    	addToCart.click();
		
    	if(finishUpgrade.isDisplayed()) {
    		Select sel1 =new Select(finishUpgrade);
    		sel1.selectByVisibleText(constant.finishUpgradeOption);	
    	}
    	
    	if(sinkBowl.isDisplayed()) {
    		Select sel2 =new Select(sinkBowl);
    		sel2.selectByVisibleText(constant.sinkBowlOption);		
    	}
    	
    		addToCartAgain.click();
       		Thread.sleep(3000);
       		viewCart.click();
       		emptyCart.click();
       		Thread.sleep(3000);
       		emptyCartAgain.click();
       		Thread.sleep(3000);
        	Assert.assertEquals(emptyCartText.getText(), "Your cart is empty.");
       
    
}
}
