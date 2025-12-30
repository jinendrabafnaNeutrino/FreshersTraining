import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAxisPractise {
    public static void main(String [] args){
        WebDriver driver =new ChromeDriver();

        driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//label[text()='First name:']/following-sibling::input")).sendKeys("Nitish");
        driver.findElement(By.xpath("//label[text()='Last name:']/parent :: div/input")).sendKeys("Bijamwar");
        driver.findElement(By.xpath("//label[text()='Email:']/ancestor :: div[contains(@class,'inputs')]")).sendKeys("nitishbijamwar@gmail.com");
    }
}
