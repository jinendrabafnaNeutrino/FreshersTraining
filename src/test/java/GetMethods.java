import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethods {
    public static void main(String [] args){
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.getTitle();
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());

        System.out.println(driver.getPageSource());
         String windowid = driver.getWindowHandle();
        System.out.println("Window Id: "+windowid);
    }
}
