package com.bridgebaz.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class FileUploadTest {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.ilovepdf.com/excel_to_pdf");

        driver.findElement(By.xpath("//span[contains(text(),'Select EXCEL files')]")).click();
        Thread.sleep(2000);

        try {
            Runtime.getRuntime().exec("C:\\Users\\motew\\OneDrive\\Documents\\fileUpload.exe");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
