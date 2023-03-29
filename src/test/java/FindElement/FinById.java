package FindElement;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class FinById {
    protected static ChromeDriver driver;

            @BeforeClass
            public void setUp(){
                WebDriverManager.chromedriver().setup();
                        driver =  new ChromeDriver();
                     driver.manage().window().maximize();
        //           driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
                    driver.get("C:\\Users\\HazmSerdah\\Desktop\\New folder (3)\\TestQACart\\src\\test\\java\\Resources\\index.html");
        //        Dimension iphoneXR=new Dimension(414,896);
        //        driver.manage().window().setSize(iphoneXR);

            }
    @Test
    public void TestOne(){
        System.out.println("Test");
    }
    @Test
    public void GetTextById(){
       String TextElement= driver.findElement(By.id("welcome")).getText();
        System.out.println(TextElement);

    }
    @Test
    public void GetTextByName(){
        String TextElement= driver.findElement(By.name("description")).getText();
        System.out.println(TextElement);

    }

    @Test
    public void GetTextByClassName(){
        String TextElement= driver.findElement(By.className("about")).getText();
        System.out.println(TextElement);

    }
    @Test(priority = 1)
    public void checkTheCheckBoxIsWorkable() {
        WebElement CheckBox=HomePOM.ClickOnChickBox();
        CheckBox.click();
    }
    @Test(priority = 3)
    public void DropdownList(){
        WebElement dropDown=driver.findElement(By.id("courses"));
        Select drop=new Select(dropDown);
        drop.deselectByIndex(1);
    }
    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
