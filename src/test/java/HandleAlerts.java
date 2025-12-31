import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlerts {
    public static void main(String [] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.hackerearth.com/javascript_alerts");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
        Thread.sleep(5000);
//        driver.switchTo().alert().accept();
        Alert myalert =driver.switchTo().alert();
        System.out.println(myalert.getText());
        myalert.accept();
    }
}
