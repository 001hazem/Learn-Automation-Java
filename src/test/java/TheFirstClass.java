import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TheFirstClass {
    protected static ChromeDriver driver;
    @BeforeClass

    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver =  new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
        driver.get("https://www.calculator.net/");
        Dimension iphoneXR=new Dimension(414,896);
        driver.manage().window().setSize(iphoneXR);

    }
    @Test(priority = 1)
    public void TestOne(){
        String CurrentUrl= driver.getCurrentUrl();
        System.out.println("The Current Url"+ CurrentUrl);
    }


    @Test(priority = 3)
    public void TestTwo(){
       String title= driver.getTitle();
        System.out.println("The Title "+title);
    }

    @Test(priority = 5)
    public void TestThree(){
        String PageSource= driver.getPageSource();
        System.out.println(PageSource);
    }
    @Test(priority = 7)
    public void TestFour(){
        driver.navigate().to("https://qacart.com/");
    }


    @Test(priority = 9)
    public void TestFive(){
        String CurrentUrl= driver.getCurrentUrl();
        System.out.println("The Current Url"+ CurrentUrl);
    }


    @Test(priority = 11)
    public void TestSex(){
        String title= driver.getTitle();
        System.out.println("The Title "+title);
    }


}
