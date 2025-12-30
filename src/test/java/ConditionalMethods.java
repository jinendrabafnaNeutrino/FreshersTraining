import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethods {
    public static void main(String [] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        WebElement logo =driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));

        System.out.println(logo.isDisplayed());
        driver.findElement(By.linkText("Register")).click();
        WebElement male_radio = driver.findElement(By.xpath("//input[@id='gender-male']"));
        WebElement female_radio = driver.findElement(By.xpath("//input[@id ='gender-female']"));

        System.out.println(male_radio.isSelected());
        System.out.println(female_radio.isSelected());
    }
}
