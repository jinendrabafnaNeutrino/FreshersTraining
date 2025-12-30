import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleTest {
    @Test
    public void openGoogleTest()
    {
        WebDriverManager.chromedriver().setup();

        WebDriver driver=new ChromeDriver();
         driver.get("https://www.google.com");

         String title= driver.getTitle();
         System.out.println("Page title is:"+title);

        Assert.assertEquals(title, "Google");

        driver.quit();
    }
}
