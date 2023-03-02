package Class03.HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.syntaxtechs.net/basic-first-form-demo.php");
        driver.findElement(By.xpath("//input[@id='user-message']")).sendKeys("Welcome to Syntax");
        driver.findElement(By.xpath("//button[contains( text(),'Show Message')]")).click();
        driver.findElement(By.xpath("//input[@id='sum1']")).sendKeys("10");
        driver.findElement(By.xpath("//input[@id='sum2']")).sendKeys("20");
        driver.findElement(By.xpath("//button[contains( text(),'Get Total')]")).click();
        WebElement printUsername= driver.findElement(By.xpath("//button[text()='Get Total']"));
        System.out.println(printUsername.getText());






    }
}
