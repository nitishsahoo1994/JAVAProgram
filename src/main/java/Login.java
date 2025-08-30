import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;


public class Login {

    @Test
    public static void login(){
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://getbootstrap.com/docs/4.6/components/dropdowns/");
        System.out.println(driver.getCurrentUrl());
        List<WebElement> allOptions=
        driver.findElements
                (By.xpath("//div[@class='dropdown show']/child::a/following-sibling::div/child::a"));
        System.out.println("Total "+allOptions.size());
        for (WebElement option:allOptions){
            System.out.println(option.getText());
            }
        driver.close();
        }
    }
