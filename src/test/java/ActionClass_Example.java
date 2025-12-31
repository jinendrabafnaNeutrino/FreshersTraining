import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass_Example {
    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //mouse hover - moveToElement and click
//        driver.get("https://demo.nopcommerce.com");
//
//        WebElement computers = driver.findElement(By.xpath("//a[text()='Computers']"));
//        WebElement desktops = driver.findElement(By.xpath("//a[text()='Desktops']"));
//
//        Actions act = new Actions(driver);
//        act.moveToElement(computers).moveToElement(desktops).click().perform();


        // right click - contextClick
        driver.get("https://demo.guru99.com/test/simple_context_menu.html");
        WebElement button = driver.findElement(By.xpath("//span[text()='right click me']"));
        Actions act = new Actions(driver);
        act.contextClick(button).perform();

        //Double click - dblClickBtn
        WebElement dblClickBtn = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
        Actions act1 = new Actions(driver);
        act1.doubleClick(dblClickBtn).perform();

        //sendKey
    }
}
