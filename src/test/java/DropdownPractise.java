import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropdownPractise {
    public static void selectByText(WebElement element, String text) {
        Select select = new Select(element);
        select.selectByVisibleText(text);
    }
    public static void selectByValue(WebElement element, String value1){
        Select value = new Select(element);
        value.selectByValue(value1);
    }
}
