package com.batch.locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class LocateByClassName {
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

        WebElement element = driver.findElement(By.className("fa f"));
        element.click();
        Thread.sleep(5000);

    }
    @AfterSuite

    public void closechromebrowser(){
        driver.quit();

    }
}
