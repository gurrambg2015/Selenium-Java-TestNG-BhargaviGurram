package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.io.File;


public class BaseTest {

    public WebDriver driver;

    @BeforeTest
    public void beforeTest() {
    	driver = new ChromeDriver();
    }

    @AfterTest
    public void afterTest() {
        driver.quit();
    }


}