import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitWaitDemo {
    public static void main(String [] args) throws InterruptedException{
        WebDriver driver = new ChromeDriver();
        WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
        driver.manage().window().maximize();
        WebElement firstname = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='FirstName']")));
        firstname.sendKeys("Nitish");
        WebElement lastname = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='LastName']")));
        lastname.sendKeys("Bijamwar");
        WebElement email = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='Email']")));
        email.sendKeys("nitishbijamwar@gmail.com");
        WebElement companyname = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='Company']")));
        companyname.sendKeys("XYZpvt.ltd");




    }
}
