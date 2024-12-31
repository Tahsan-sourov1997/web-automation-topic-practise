package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class interActWithBrowse extends driverSetup {
    @Test
    public void interactBrowser() throws InterruptedException {
        driver.get("https://www.google.com/");
        String title = driver.getTitle();
        System.out.println(title);
        String url = driver.getCurrentUrl();
        System.out.println(url);
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.manage().window().minimize();
        Thread.sleep(2000);
        driver.switchTo().newWindow(WindowType.TAB);
        Thread.sleep(2000);
        driver.switchTo().newWindow(WindowType.WINDOW);
        Thread.sleep(2000);
        String windowId = driver.getWindowHandle();
        System.out.println(windowId);
        List<String> windowHandles = new ArrayList<>(driver.getWindowHandles());
        for(String uniqueWindowId : windowHandles){
            System.out.println(uniqueWindowId);
        }
        driver.switchTo().window(windowHandles.get(0));
        driver.close();
    }
    @Test
    public void radioButton() throws InterruptedException {
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        WebElement radioButton2 = driver.findElement(By.xpath("//input[@value='radio2']"));
        System.out.println(radioButton2.isSelected());
        radioButton2.click();
        System.out.println(radioButton2.isSelected());
        Thread.sleep(3000);
        WebElement displayText = driver.findElement(By.id("displayed-text"));
        System.out.println(displayText.isDisplayed());
        driver.findElement(By.id("hide-textbox")).click();
        System.out.println(displayText.isDisplayed());
        WebElement cssElement = driver.findElement(By.xpath("//legend[text()='Dropdown Example']"));
        System.out.println(cssElement.getCssValue("background-color"));

    }
}
