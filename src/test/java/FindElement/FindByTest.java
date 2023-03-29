package FindElement;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class FindByTest {
    protected static ChromeDriver driver;
    @BeforeClass

    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver =  new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
        driver.get("C:\\Users\\HazmSerdah\\Desktop\\New folder (3)\\TestQACart\\src\\test\\java\\Resources\\index.html");
//        Dimension iphoneXR=new Dimension(414,896);
//        driver.manage().window().setSize(iphoneXR);

    }
//    @Test
//    public void TestOne(){
//        System.out.println("Test");
//    }
//    @Test
//    public void GetTextById(){
//        String TextElement= driver.findElement(By.id("welcome")).getText();
//        System.out.println(TextElement);
//
//    }
//    @Test
//    public void GetTextByName(){
//        String TextElement= driver.findElement(By.name("description")).getText();
//        System.out.println(TextElement);
//
//    }

//    @Test
//    public void GetTextByClassName(){
//        String TextElement= driver.findElement(By.className("about")).getText();
//        System.out.println(TextElement);
//
//    }
//    @Test(priority = 3)
//    public void checkTheCheckBoxIsWorkable() {
//        driver.findElement(By.id("Tester")).click();
//    }
//
//    @Test
//    public void DropdownList(){
//
//        Select drop=new Select(driver.findElement(By.id("courses")));
//        drop.selectByValue("selenium");
//    }
    @Test(priority = 5)
        public void checkTheEmailFiledIsEnable(){

          boolean  emailField= driver.findElement(By.id("inputEmail")).isEnabled();
          System.out.println(emailField);

    }
    @Test(priority = 7)
    public void checkTheEmailFiledIsSelected(){

        boolean  selectedField= driver.findElement(By.xpath("/html/body/div[7]/form/div/label/input")).isSelected();
        System.out.println(selectedField);

        Point locationItem= driver.findElement(By.xpath("/html/body/div[7]/form/div/label/input")).getLocation();
        System.out.println(locationItem.x);
        System.out.println(locationItem.y);

        Dimension sizeTheItem=driver.findElement(By.xpath("/html/body/div[7]/form/div/label/input")).getSize();
        System.out.println(sizeTheItem.height);
        System.out.println(sizeTheItem.width);

    }



    @AfterClass
    public void tearDown(){
        driver.quit();
    }

}


