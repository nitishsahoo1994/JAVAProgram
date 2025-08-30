import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class AutoSuggestDrop {

    @Test
    public static void autoSuggestDrop(){
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://www.bing.com/");
        WebElement searchBar=driver.findElement(By.xpath("//textarea[@type='search']"));

        searchBar.sendKeys("Selenium");

        List<WebElement> list=driver.findElements(By.xpath("//ul[@role='listbox']/li"));
        System.out.println(list.size());

        for(WebElement ele:list){
            if(ele.getAttribute("aria-label").equals("selenium ide")){
                ele.click();
                break;
            }
        }


    driver.close();
    }
}
