package com.bridgebaz.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameTest {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("C:\\Users\\motew\\IdeaProjects\\CQA115Selenium\\src\\main\\resources\\page3.html");

        Thread.sleep(1000);

        driver.findElement(By.id("t3")).sendKeys("t3 text field");

        driver.switchTo().frame("f2");
        driver.findElement(By.id("t2")).sendKeys("t2 text field");

        driver.switchTo().frame("f1");
        driver.findElement(By.id("t1")).sendKeys("t1 text field");

        driver.switchTo().parentFrame();//t2
        //driver.switchTo().defaultContent();//t3

        driver.findElement(By.id("t2")).clear();
        Thread.sleep(1000);
        driver.findElement(By.id("t2")).sendKeys("after executing parentFrame()...");

        driver.switchTo().defaultContent();
        driver.findElement(By.id("t3")).clear();
        driver.findElement(By.id("t3")).sendKeys("after executing parentFrame()...");

//        Thread.sleep(2000);
//
//        driver.quit();
    }
}
