package pages;

import common.Constants;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class HomePage extends AbstractPage {

    @FindBy(id = "searchval")
    private WebElement searchField;

    @FindBy(xpath = "//button[@value='Search']")
    private WebElement searchButton;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void launchBrowser() {
        driver.get(Constants.URL);
        Assert.assertEquals(driver.getCurrentUrl(), Constants.URL, "URL Mismatch");
    }

    public void searvh() {
        waitForElementToAppear(searchField);
        searchField.click();
    }

    public void searchCriteria(String searchText) {
        waitForElementToAppear(searchField);
        searchField.clear();
        searchField.sendKeys(searchText);
    }

    public void clickSearch() {
        waitForElementToAppear(searchButton);
        searchButton.click();
    }
}
