import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.List;
import java.util.Set;

public class DriverMethod {
    public static void main(String[] args){
//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//
//        driver.get("https://demo.nopcommerce.com");
//
//        System.out.println(driver.getTitle());
//
//        System.out.println(driver.getCurrentUrl());
//
//        System.out.println(driver.getPageSource());
//
//        System.out.println(driver.getWindowHandle());
//
//        driver.findElement(By.linkText("Build your own computer")).click();
//
//        Set<String> WindowId=driver.getWindowHandles();
//        System.out.println(WindowId);
//
//        String text="Euro";
//        List<WebElement> list = driver.findElement(By.xpath("//select[@name='customerCurrency']"));
//
//
//        for (int i = 0; i < list.size(); i++) {
//            String value=list.get(i).getText();
//            if(value.equals(text)){
//                list.get(i).click();
//                break;
//            }
//        }


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demo.nopcommerce.com");

        String text = "Euro";

        WebElement dropdown = driver.findElement(By.xpath("//select[@name='customerCurrency']"));

        Select select = new Select(dropdown);

        List<WebElement> list = select.getOptions();

        for (WebElement option : list) {
            if (option.getText().equals(text)) {
                option.click();
                break;
            }
        }

    }
}
