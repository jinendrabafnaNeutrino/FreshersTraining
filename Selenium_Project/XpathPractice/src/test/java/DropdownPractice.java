
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropdownPractice {

    public static void main(String args[]) throws InterruptedException {
        WebDriver driver= new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");

        Dropdown d1= new Dropdown();

        d1.selectDropdown(driver,"country","india");
        Thread.sleep(3000);
        d1.selectDropdown(driver,"colors","red");


    }

}
