import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropdownTest {
    public static void main(String [] args){
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/desktops");
        driver.manage().window().maximize();
//        WebElement selectProductSortOrder = driver.findElement(By.id("products-orderby"));
        WebElement selectProductSortOrder = driver.findElement(By.xpath("//select[@id='products-orderby']"));
//        DropdownPractise.selectByText(selectProductSortOrder, "Price: Low to High");

        DropdownPractise.selectByValue(selectProductSortOrder,"11");
    }
}
