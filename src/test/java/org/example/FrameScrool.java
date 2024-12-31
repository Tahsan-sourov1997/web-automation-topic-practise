package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import javax.swing.*;

public class FrameScrool extends driverSetup{
    By mouseHover = By.xpath("//button[@id='mousehover']");
    By top = By.xpath("//a[normalize-space()='Top']");
    By registerButton = By.xpath("//a[normalize-space()='Register']");
    By textCopy = By.xpath("//input[@id='autocomplete']");
    By textPaste = By.xpath("//input[@id='name']");
    By suggestionText = By.xpath("//legend[normalize-space()='Suggession Class Example']");
    @Test
    public void testIframe() throws InterruptedException {
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        Actions actions = new Actions(driver);
        actions.scrollByAmount(0,1000).build().perform();
        Thread.sleep(3000);
        actions.moveToElement(getElement(mouseHover)).build().perform();
        Thread.sleep(3000);
        getElement(top).click();
        Thread.sleep(3000);
        getElement(textCopy).sendKeys("Hello Bangladesh");
        Thread.sleep(3000);
        actions.keyDown(Keys.CONTROL).sendKeys("a").build().perform();
        Thread.sleep(3000);
        actions.keyDown(Keys.CONTROL).sendKeys("x").build().perform();
        Thread.sleep(3000);
        actions.moveToElement(getElement(textPaste)).click().keyDown(Keys.CONTROL).sendKeys("v").build().perform();
        Thread.sleep(3000);
//        String getSuggesstionText = getElement(suggestionText).getText();
//        actions.click(getElement(suggestionText)).click().keyDown(Keys.CONTROL).sendKeys("c").build().perform();
//        Thread.sleep(5000);
        actions.scrollByAmount(0,1000).build().perform();
        Thread.sleep(3000);
        System.out.println(driver.findElement(mouseHover).getText());
        driver.switchTo().frame("courses-iframe");
        System.out.println(driver.findElement(registerButton).getText());
        driver.switchTo().defaultContent();
        System.out.println(driver.findElement(mouseHover).getText());
        actions.scrollByAmount(1000,2000).build().perform();
        Thread.sleep(5000);





    }
}
