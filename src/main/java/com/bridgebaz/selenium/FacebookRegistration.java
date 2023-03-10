package com.bridgebaz.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookRegistration {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");

        driver.findElement(By.partialLinkText("Create new")).click();
        Thread.sleep(5000);

//        driver.findElement(By.linkText("Create new account")).click();
//        Thread.sleep(4000);

        driver.findElement(By.name("firstname")).sendKeys("Aditya");
        Thread.sleep(4000);

        driver.findElement(By.name("lastname")).sendKeys("Motewar");
        Thread.sleep(4000);

        driver.findElement(By.name("reg_email__")).sendKeys("motewar@gmail.com");
        Thread.sleep(4000);

        driver.findElement(By.name("reg_passwd__")).sendKeys("motewar@999");
        Thread.sleep(4000);

        driver.findElement(By.xpath("//select[@id='day']")).sendKeys("10");
        Thread.sleep(4000);

        driver.findElement(By.xpath("//select[@id='month']")).sendKeys("Jan");
        Thread.sleep(4000);

        driver.findElement(By.xpath("//select[@id='year']")).sendKeys("1999");
        Thread.sleep(4000);

        driver.findElement(By.xpath("//label[contains(text(),'Male')]")).click();
        Thread.sleep(4000);
        System.out.println("Title of the page: " + driver.getTitle());
        Thread.sleep(4000);

        driver.close();
    }
}
