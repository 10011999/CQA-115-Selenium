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
        driver.get("https://www.linkedin.com/");

        Thread.sleep(3000);

        WebElement signinBtn = driver.findElement(By.xpath("//button[contains(text(),'Sign in')]"));
        if (signinBtn.isDisplayed()) {
            System.out.println("Home page is displayed");
        } else {
            System.out.println("Home page is NOT displayed");
        }

        Thread.sleep(3000);
        driver.close();

    }
}
