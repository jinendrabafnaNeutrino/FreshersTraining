import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;
import java.util.function.Function;

public class FluentWaitdemo {
    public static void main(String [] args) throws InterruptedException{
        WebDriver driver = new ChromeDriver();

        Wait<WebDriver> mywait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(5))
                .ignoring(NoSuchElementException.class);

        driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
        driver.manage().window().maximize();

        WebElement firstname = mywait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(By.id("FirstName"));
            }
        });
        firstname.sendKeys("Nitish");

    }
}
