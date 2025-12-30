import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoTest {
    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/desktops");
        driver.manage().window().maximize();

//        driver.findElement(By.xpath("//input[@name='q'@id=\"small-searchterm\"]")).sendKeys("I am groot");
//      driver.findElement(By.xpath("//main[@class='MuiContainer-root MuiContainer-maxWidthLg css-pa7to5']")).sendKeys("Tshirt");

//        driver.findElement(By.xpath("//*[@title='Show details for Build your own computer']")).click();

//        driver.findElement(By.xpath("//input[contains(@placeholder,'Search store')]")).sendKeys("I am groot");
        driver.findElement(By.xpath("//div[@class='header-links']/ul/li/a")).click();
    }
}
