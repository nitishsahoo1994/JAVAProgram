import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Test {

    @org.testng.annotations.Test
    public static void test(){
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--disable-notifications");
        WebDriver driver=new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://www.selenium.dev/documentation/webdriver/drivers/options/");
        WebElement ele=
                 driver.findElement(By.xpath("//span[text()='Downloads']//parent::a"));
        String str=ele.getAttribute("class");
        System.out.println("Attribute name is"+str);

        WebElement dropDown=driver.findElement(By.xpath("drop"));
        Select dropdown=new Select(dropDown);
        List<WebElement> options1=dropdown.getOptions();

        driver.close();



    }
}
