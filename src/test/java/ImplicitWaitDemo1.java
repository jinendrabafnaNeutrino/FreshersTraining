import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ImplicitWaitDemo1 {
    public static void main(String[] args) throws InterruptedException{
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Nitish");
        driver.close();

    }
}
