package FindElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomePOM {
    static public WebElement ClickOnChickBox(){
        return FindByTest.driver.findElement(By.name("Banana"));
    }
}
