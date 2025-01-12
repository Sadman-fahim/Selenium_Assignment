package com.batch.webelementcommands;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class GetAttributeMethod {
    WebDriver driver;
    @BeforeSuite
    public void startchromebrowser(){

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();


    }
    @Test
    public void openurl() throws InterruptedException{
        driver.get("https://practicetestautomation.com/practice-test-login/");
        Thread.sleep(5000);

        WebElement element = driver.findElement(By.xpath("//input[@id='password']"));
        //WebElement element = driver.findElement(By.name("password"));
        //element.click();
        //element.sendKeys("test@example.com");
        Thread.sleep(5000);
        //element.clear();
        System.out.println(element.getDomAttribute("type"));

    }
    @AfterSuite

    public void closechromebrowser(){
        driver.quit();

    }
}
