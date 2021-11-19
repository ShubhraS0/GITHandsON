package org.Vapasi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
    public String getCartValue(WebDriver driver) {
        return driver.findElement(By.cssSelector("td[class='lead']")).getText();
    }
}
