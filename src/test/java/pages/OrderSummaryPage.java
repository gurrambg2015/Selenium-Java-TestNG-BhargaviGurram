package pages;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderSummaryPage extends AbstractPage {

    @FindBy(xpath = "//div[@id='details']/a[@data-testid='itemDescription']")
    List<WebElement> webElements;

    @FindBy(xpath = "//li[contains(@class,'rc-pagination-next')]/a[contains(@aria-label,'Go to page')]")
    WebElement nextButton;

    public OrderSummaryPage(WebDriver driver) {
    	
    	super(driver);
    }


    public void searchTitle() {
    	
    	int count1=0;
    	int count2=0;
    	
    	do {
    		
    		for(WebElement rec:webElements) {
        		if(rec.getText().contains("Table")) {
        			count1++;
        		}
        		else {
        			count2++;
        		}
        	}
        	if(!nextButton.getAttribute("class").contains("disabled")) {
        		nextButton.click();
        		
        	}	
    	}while(nextButtonIsDisplayed());	
    	System.out.println(count1);
    	System.out.println(count2);
    	
    }

    public boolean nextButtonIsDisplayed() {
        try {
            return nextButton.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }
    
}

