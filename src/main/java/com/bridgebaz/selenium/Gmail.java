package com.bridgebaz.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://accounts.google.com/v3/signin/identifier?dsh=S1409878844%3A1677206148138923&elo=1&flowEntry=AddSession&flowName=GlifWebSignIn");

        driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("7757934629");

        Thread.sleep(3000);

        driver.close();

    }
}
