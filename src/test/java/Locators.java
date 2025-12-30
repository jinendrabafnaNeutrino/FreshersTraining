import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
    public static void main(String [] args){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.youtube.com/watch?v=VuO7gUmYllY&list=PLUDwpEzHYYLtQzEEEldbjPAR-gnStv4sR&index=35");

        driver.manage().window().maximize();
        boolean logoisdisplayed = driver.findElement(By.id("logo")).isDisplayed();
        System.out.println(logoisdisplayed);

         boolean link= driver.findElements(By.linkText("Sign in")).isEmpty();
        System.out.println(link);
//        driver.findElements(By.id(""))

    }
}
