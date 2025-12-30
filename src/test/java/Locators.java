//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class Locators {
//    public static void main(String[] args){
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://demo.nopcommerce.com/desktops");
//        driver.manage().window().maximize();
//
////        driver.findElement(
////                By.xpath("//input[@name='q']/parent::form")
////        ).sendKeys("I am groot");
//
////        boolean visible = driver.findElement(
////                By.xpath("//input[@name='q']/parent::form")
////        ).isDisplayed();
////
////        System.out.println(visible);
//
//        driver.findElement(
//                By.xpath("//input[@id='menu-1']/::nav")
//        ).click();
//    }
//}






import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import java.util.List;

public class Locators {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://demo.nopcommerce.com");

        // parent
        WebElement searchForm = driver.findElement(By.xpath("//input[@id='small-searchterms']/parent::form"));
        System.out.println("Parent tag: " + searchForm.getTagName());

        // child
        List<WebElement> topMenuItems = driver.findElements(
                By.xpath("//ul[@class='top-menu']/child::li")
        );


//        // ancestor
//        WebElement productBox = driver.findElement(
//                By.xpath("//a[text()='Build your own computer']/ancestor::div[@class='item-box']")
//        );
//        System.out.println("Ancestor class: " + productBox.getAttribute("class"));
//
//        // descendant
//        List<WebElement> productTitles = driver.findElements(
//                By.xpath("//div[@class='product-grid']/descendant::a[@class='product-title']")
//        );
//        System.out.println("Total products displayed: " + productTitles.size());

//        // preceding
//        WebElement registerLink = driver.findElement(
//                By.xpath("//a[text()='Log in']/preceding::a[text()='Register']")
//        );
//        System.out.println("Preceding text: " + registerLink.getText());
//
//        driver.quit();
    }
}
