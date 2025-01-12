package com.batch.webelementcommands;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class ClearMethod {
    WebDriver driver;
    @BeforeSuite
    public void startchromebrowser(){

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();


    }
    @Test
    public void openurl() throws InterruptedException{
        driver.get("https://www.automationexercise.com/");
        Thread.sleep(5000);

        WebElement element = driver.findElement(By.xpath("//a[contains(text(),'Signup / Login')]"));
        element.click();
        //element.sendKeys("test@example.com");
        Thread.sleep(5000);
        element.clear();

    }
    @AfterSuite

    public void closechromebrowser(){
        driver.quit();

    }
}
