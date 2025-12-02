import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class DropDownDemo {

    @Test
    public static void dropDownCheck(){
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--disable-notifications");
        WebDriver driver=new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://www.sugarcrm.com/au/request-demo/");
        WebElement dropDown =
        driver.findElement(By.xpath("//option[contains(text(),'Country')]//parent::select"));
        boolean flag=false;
        Select sel=new Select(dropDown);
        List<WebElement> lst=sel.getOptions();
        int size=lst.size();
        String expectedValue="Honduras";
        for (int i=0;i<size;i++){
            String actualValue=lst.get(i).getText();
            if (actualValue.equals(expectedValue)){
                flag=true;
                sel.selectByVisibleText(actualValue);
                break;
            }
        }

        driver.close();
        }
    }

