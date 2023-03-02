package Class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.List;

public class TagName {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");//for Windows "driver/chromedriver.exe"

        //Create instance of WebDriver
        WebDriver driver = new ChromeDriver();
        //Open the website
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");

        List<WebElement> tags =driver.findElements(By.tagName("a"));  
        for (WebElement tag:tags
             ) {
            System.out.println(tag.getAttribute("href"));
        }
        driver.quit();


    }
}
