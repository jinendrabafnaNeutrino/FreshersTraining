import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PathX {
    public static void main(String [] args){
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/desktops");
        driver.manage().window().maximize();
//        driver.findElement(By.xpath("//input[@placeholder=\"Search store\"]")).sendKeys("Build your own computer");
//        driver.findElement(By.xpath("//input[@name='q'][@placeholder='Search store']")).sendKeys("Build your own computer");
//
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Build your own computer");

    }

}
