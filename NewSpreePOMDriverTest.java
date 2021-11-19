package org.Vapasi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class NewSpreePOMDriverTest extends BaseTest {

        @Test
        public void validateCartAmount() {
            LoginPage lp = new LoginPage();
            lp.login(driver, "Shubh@12.com", "Pass@123");
            HomePage hp = new HomePage();
            hp.Search(driver, "taxon", "Spree");
            ProductPage pp = new ProductPage();
            pp.addToCart(driver, "span[title='Spree Jr. Spaghetti']", "4");
            CartPage cartPage = new CartPage();
            Assert.assertEquals(cartPage.getCartValue(driver), "$1,471.26");
        }

    }



