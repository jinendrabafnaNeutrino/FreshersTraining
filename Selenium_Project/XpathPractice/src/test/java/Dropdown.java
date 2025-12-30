import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class Dropdown {

        public void selectDropdown(WebDriver driver , String lable, String value)
        {
            WebElement id =driver.findElement(By.id(lable));
            Select country= new Select(id);
            country.selectByValue(value);
        }
    }


