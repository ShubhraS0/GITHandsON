package org.Vapasi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    WebDriver driver; //declaring

    @BeforeMethod
    public void Launch() {
        System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver");
        driver = new ChromeDriver();  //driver initialization
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
        System.out.println("Spree Launched ");
    }

    @AfterMethod
    public void Close() {
        driver.quit();
        System.out.println("Close Successful");
    }
}
