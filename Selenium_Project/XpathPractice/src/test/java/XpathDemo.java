package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {

    public static void main(String args[])
    {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.youtube.com/");
        driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("PythonTutorial");
        driver.findElement(By.xpath("//*[text()='Shorts']")).click();

    }
}
