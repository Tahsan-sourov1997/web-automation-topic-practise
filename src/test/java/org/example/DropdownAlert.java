package org.example;

import com.google.common.util.concurrent.ClosingFuture;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropdownAlert extends driverSetup{
    @Test
    public void interactDropAlert() throws InterruptedException {
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        WebElement el = driver.findElement(By.id("dropdown-class-example"));
        el.click();
        Select select = new Select(el);
        select.selectByIndex(1);
        Thread.sleep(3000);
        select.selectByIndex(2);
        Thread.sleep(3000);
        el.click();
        select.selectByValue("option3");
//        Thread.sleep(3000);
//        el.click();
//        select.deselectAll();
//        select.deselectByIndex(2);
//        Thread.sleep(3000);
//        el.click();
//        select.deselectByValue("option3");
        Thread.sleep(3000);

    }
    @Test
    public void alert() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        By jsPrompt = By.xpath("//button[normalize-space()='Click for JS Alert']");
        driver.findElement(jsPrompt).click();
        Thread.sleep(3000);
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.accept();
        Thread.sleep(3000);

    }

}
