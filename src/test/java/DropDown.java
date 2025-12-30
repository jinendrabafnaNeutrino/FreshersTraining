//import java.time.Duration;
//import java.util.List;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.openqa.selenium.support.ui.Select;
//
//public class DropDown {
//
//    public static void main(String[] args) {
//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//
//
//        driver.get("https://demo.nopcommerce.com");
//
////        driver.findElement(By.xpath(
////                "//select[@id='customerCurrency']/option[text()='Euro']")
////        ).click();
//
//
//        WebElement selectProduct = driver.findElement(By.xpath("//select[@id='customerCurrency']"));
//
//
//        DropDown.selectByText(selectProduct,"Euro");
//
//    }
//    public static void selectByText(WebElement element, String text) {
//        Select select = new Select(element);
//        select.selectByVisibleText(text);
//    }
//}


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {


    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com");

        WebElement selectProduct =
                driver.findElement(By.id("customerCurrency"));

        HelperClass.selectByText(selectProduct, "Euro");
    }


}


