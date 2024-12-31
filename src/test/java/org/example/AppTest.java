package org.example;


import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AppTest extends driverSetup {
@Test
    public void testTitle() {
        driver.get("https://www.google.com/");
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, "Google");
        System.out.println(actualTitle);

    }
    @Test
    public void getUrl(){
        driver.get("https://www.w3schools.com/");
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, "https://www.w3schools.com/");
        System.out.println(actualUrl);

    }
}
