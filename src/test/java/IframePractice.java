import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class IframePractice {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/iframe");
        driver.manage().window().maximize();


        WebElement iframe = driver.findElement(By.id("mce_0_ifr"));
        driver.switchTo().frame(iframe);
        WebElement textBox = driver.findElement(By.id("tinymce"));




        textBox.sendKeys(Keys.CONTROL + "a");
        textBox.sendKeys(Keys.DELETE);
        textBox.sendKeys("iFrame practice using Selenium 🚀");


        driver.switchTo().defaultContent();

        driver.quit();
    }
}
