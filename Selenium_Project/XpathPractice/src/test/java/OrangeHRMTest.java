package org.example;

import org.apache.hc.core5.util.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;

public class OrangeHRMTest {

    public static void main(String args[]) throws InterruptedException {
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();

       // driver.get("https://demo.opencart.com/");
        //
        driver.get("https://demo.nopcommerce.com/");



       driver.findElement(By.xpath("//a[@href='/apple-macbook-pro']")).click();
        Thread.sleep(10000);

       boolean flag=driver.findElement(
                By.xpath("//div[@class='product-price']/span")
        ).isDisplayed();
       System.out.println(flag);
        Thread.sleep(10000);
       driver.navigate().back();
       // driver.get("https://demo.nopcommerce.com/");



       String basePath="//a[@href='/apple-macbook-pro']"+"/ancestor::div[@class='item-box']";
       boolean flag1=driver.findElement(By.xpath(basePath)).isDisplayed();
       System.out.println(flag1);

       driver.findElement(By.xpath(basePath+"/following-sibling::div[1]//button[text()='Add to cart']")).click();

        Thread.sleep(10000);




//        driver.findElement(
//                By.xpath("//a[text()='Computers']/following-sibling::ul//a[text()='Desktops']")
//        ).click();
       //System.out.println("New Price: " + newPrice.getText());

        //driver.quit();
    }
}
