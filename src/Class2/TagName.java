package Class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagName {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");//for Windows "driver/chromedriver.exe"

        //Create instance of WebDriver
        WebDriver driver = new ChromeDriver();
        //Open the website
        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();
        driver.findElement(By.tagName("a"));
        System.out.println();

}}
