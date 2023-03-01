package com.bridgebaz.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplay {
    public static void main(String[] args) throws InterruptedException {
//
        System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");

        Thread.sleep(3000);
        
        boolean d = driver.findElement(By.id("passContainer")).isDisplayed();
        System.out.println("isDisplay: "+d);

        Thread.sleep(3000);
        driver.close();

    }
}
