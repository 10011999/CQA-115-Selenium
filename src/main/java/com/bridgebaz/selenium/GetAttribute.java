package com.bridgebaz.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttribute {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");

        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("8109555221");
        Thread.sleep(3000);

        driver.findElement(By.name("pass")).sendKeys("Test12345");
        Thread.sleep(3000);

//        driver.findElement(By.name("login")).click();
//        Thread.sleep(4000);

        System.out.println("name Attribute of username: " + driver.findElement(By.id("email")).getAttribute("name"));
        System.out.println("type Attribute of usernae: " + driver.findElement(By.id("email")).getAttribute("type"));
        System.out.println("placeholder of username: " + driver.findElement(By.id("email")).getAttribute("placeholder"));

        driver.close();
    }
}