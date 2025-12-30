import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitWait {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        //ExplicitWait - Declartion
        WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10));

        driver.get("https://demo.nopcommerce.com");
        driver.manage().window().maximize();

        driver.findElement(By.className("ico-register")).click();

        // ExplicitWait - Use
        WebElement fName=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name=\"FirstName\"]")));

        fName.sendKeys("i am groot");

        boolean displayStatus = driver.findElement(By.id("FirstName")).isDisplayed();
        System.out.println("isDisplayed : " + displayStatus);

        boolean selectStatus = driver.findElement(By.id("gender-male")).isSelected();
        System.out.println("isSelected : " + selectStatus);
    }
}

