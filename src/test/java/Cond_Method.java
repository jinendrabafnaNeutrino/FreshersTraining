import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cond_Method {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demo.nopcommerce.com");

        boolean Enable_status=driver.findElement(By.xpath(
                "//input[@id='FirstName']")
        ).isEnabled();
        System.out.println("isDisplayed : "+Enable_status);

        boolean Display_status=driver.findElement(By.xpath(
                "//input[@id='FirstName']")
        ).isDisplayed();
        System.out.println("isDisplayed : "+Display_status);

        boolean select_status=driver.findElement(By.xpath(
                "//input[@id=\"gender-male\"']")
        ).isSelected();
        System.out.println("isDisplayed : "+select_status);

    }
}
