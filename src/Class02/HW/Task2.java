package Class02.HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Create new account")).click();
        Thread. sleep(3000);
        driver.findElement(By.name("firstname")).sendKeys("John");
        driver.findElement(By.name("lastname")).sendKeys("Wick");
        driver.findElement(By.name("reg_email__")).sendKeys("Wick@wick.com");
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("Wick@wick.com");
        driver.findElement(By.name("reg_passwd__")).sendKeys("M-4242d87");
        driver.findElement(By.name("birthday_month")).click();
        driver.findElement(By.name("birthday_month")).click();
        driver.findElement(By.name("birthday_day")).click();
        driver.findElement(By.name("birthday_year")).click();
        driver.findElement(By.name("birthday_year")).click();
        driver.findElement(By.id("u_2_9_gF")).click();







      /*  Thread. sleep(3000);

        driver. quit();*/

    }
    }

