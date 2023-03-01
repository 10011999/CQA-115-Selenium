package com.bridgebaz.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.bigbasket.com/");

        Thread.sleep(3000);
        driver.findElement(By.xpath("//body/div[1]/div[1]/nav[1]/div[1]/div[1]/ul[1]/li[1]/a[1]")).click();
        Thread.sleep(2000);
        System.out.println(driver.findElement(By.xpath("//body/div[1]/div[1]/nav[1]/div[1]/div[1]/ul[1]/li[1]/a[1]/i[1]")));

        driver.close();
    }
}
