import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

public class IframeExample {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_button_test");

        driver.switchTo().frame("iframeResult");

        driver.findElement(
                By.xpath("//button[@onclick=\"alert('Hello world!')\"]")
        ).click();
    }
}
