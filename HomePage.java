package org.Vapasi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HomePage {

    public void Search(WebDriver driver, String element, String keyword) {
        //Search after selecting a category
        WebElement dropDown = driver.findElement(By.id(element));
        Select value = new Select(dropDown);
        value.selectByValue("1");

        System.out.println("Category Selected ");

        // by passing the text value to be searched
        driver.findElement(By.cssSelector("[id='keywords']")).sendKeys(keyword);
        driver.findElement(By.cssSelector("input[value='Search']")).click();
        //driver.quit();

        System.out.println("Search Successful");
//        public void testAssertTrue() {
//            int actual = Sum();
//            int expected = 10;

    }
}
