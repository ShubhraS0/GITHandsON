package org.Vapasi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    public void login(WebDriver driver, String username, String password) {
        driver.get("https://spree-vapasi-prod.herokuapp.com/login");
        driver.findElement(By.id("spree_user_email")).sendKeys(username);
        driver.findElement(By.name("spree_user[password]")).sendKeys(password);
        driver.findElement(By.cssSelector("input[value='Login']")).click();

        System.out.println("Login Successful ");
    }
}
