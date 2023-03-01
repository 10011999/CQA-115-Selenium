package com.bridgebaz.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");

        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("775793");
        Thread.sleep(3000);

//        driver.findElement(By.id("email")).sendKeys("775793");
//
//        Thread.sleep(3000);

        driver.findElement(By.id("email")).clear();

        Thread.sleep(3000);

        driver.findElement(By.id("email")).sendKeys("8109555221");

        Thread.sleep(2000);

        driver.findElement(By.name("pass")).sendKeys("Test12345");
        Thread.sleep(2000);

        driver.findElement(By.name("login")).click();

    }
}
