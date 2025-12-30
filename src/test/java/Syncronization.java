import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Syncronization {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demo.nopcommerce.com");

        driver.findElement(By.className("ico-register")).click();

        //implicitly Wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        boolean enableStatus = driver.findElement(By.id("FirstName")).isEnabled();
        System.out.println("isEnabled : " + enableStatus);

        boolean displayStatus = driver.findElement(By.id("FirstName")).isDisplayed();
        System.out.println("isDisplayed : " + displayStatus);

        boolean selectStatus = driver.findElement(By.id("gender-male")).isSelected();
        System.out.println("isSelected : " + selectStatus);

        driver.quit();
    }
}

