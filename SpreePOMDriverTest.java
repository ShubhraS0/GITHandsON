package org.Vapasi;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SpreePOMDriverTest extends BaseTest{

//        @BeforeMethod
//        public void setup(){
//            LoginPage lp = new LoginPage();
//            lp.login(driver, "Shubh@12.com", "Pass@123");
//        }

        @Test
        public void validateCartAmount() {

            HomePage hp = new HomePage();
            hp.Search(driver, "taxon", "Spree");
            ProductPage pp = new ProductPage();
            pp.addToCart(driver, "span[title='Spree Jr. Spaghetti']", "4");
            CartPage cartPage = new CartPage();
            Assert.assertEquals(cartPage.getCartValue(driver), "$1,471.26");
        }


    }



