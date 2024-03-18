package org.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestLogin extends BaseClass {

    @Test
    public void display() throws InterruptedException {
        System.out.println("First test to display");
        driver.get("https://www.google.com/");
        System.out.println("login page open successfully");
        Thread.sleep(60);
        driver.findElement(By.xpath("//*[@id='APjFqb']")).sendKeys("pawan");
        if (driver.findElement(By.name("btnK")).isDisplayed()){
            driver.findElement(By.name("btnK")).click();
            Thread.sleep(60);
        }
    }

    @Test
    public void show(){
        System.out.println("2nd test show");
    }

    @Test
    public void print(){
        System.out.println("3rd test print");
    }

    @AfterSuite
    public void closeBrowser() throws InterruptedException {
        Thread.sleep(60);
        driver.quit();
        System.out.println("Browser closed");
    }
}
