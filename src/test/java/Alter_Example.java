import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Alter_Example {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");

//        //simple alert
//        driver.findElement(By.xpath("//button[@id='alertBox']")).click();
//        Thread.sleep(2000);
//        Alert simplealert=driver.switchTo().alert();
//        simplealert.accept();


        //confirmation alert
//        driver.findElement(By.xpath("//button[@id='confirmBox']")).click();
//        Thread.sleep(2000);
//        Alert confirmationalert=driver.switchTo().alert();
//        confirmationalert.accept();
//        System.out.println(driver.findElement(By.xpath("//div[@id='output']")).getText());

        //prompt alter
        driver.findElement(By.xpath("//button[@id='promptBox']")).click();
        Thread.sleep(2000);
        Alert promptalert=driver.switchTo().alert();
        System.out.println(promptalert.getText());
        promptalert.sendKeys("I am groot");
        promptalert.accept();
        System.out.println(driver.findElement(By.xpath("//div[@id='output']")).getText());

    }
}

