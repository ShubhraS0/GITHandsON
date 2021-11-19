package org.Vapasi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {

    public void addToCart(WebDriver driver, String productName, String quantity) {
        // click on Spree product, give quantity & add to cart
        driver.findElement(By.cssSelector("span[title='Spree Jr. Spaghetti']")).click();
        driver.findElement(By.name("quantity")).clear();
        driver.findElement(By.name("quantity")).sendKeys(quantity);
        driver.findElement(By.id("add-to-cart-button")).click();

        System.out.println("Add to Cart Successful");
    }
}
