package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Locators extends driverSetup{

    @Test
    public void testLocators() throws InterruptedException {
        driver.get("https://www.google.com/");
        WebElement searchBox;
        //searchBox = browser.findElement(By.id("APjFqb"));
        //searchBox.sendKeys("Hello google");
        //searchBox = browser.findElement(By.name("q"));
        //searchBox.sendKeys("1");
        //searchBox = browser.findElement(By.className("gLFyf"));
        //searchBox = browser.findElement(By.tagName("textarea"));
        searchBox = driver.findElement(By.linkText("Gmail"));
        searchBox.click();
        driver.navigate().back();
        WebElement inputBtn = driver.findElement(By.cssSelector("input[class='RNmpXc']"));
        String text = inputBtn.getAttribute("value");
        System.out.println(text);

        Thread.sleep(2000);
    }
}
