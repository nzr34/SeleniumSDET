package Class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatingElements {
    public static void main(String[] args) {


        //  tell your project where the web-driver is located.
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");//for Windows "driver/chromedriver.exe"

        //Create instance of WebDriver
        WebDriver driver = new ChromeDriver();

        //Open the website
        driver.get("https://www.facebook.com");

        //sent  in the username

        driver.findElement(By.id("email")).sendKeys("nezir");
        driver.findElement(By.name("pass")).sendKeys("nzrgkchgf");
       // driver.findElement(By.linkText("Create new account")).click();

        driver.findElement(By.partialLinkText("password?")).click();

        driver.quit();

    }
}
