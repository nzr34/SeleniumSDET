package Class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook1 {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Create new account")).click();
        Thread. sleep(3000);




        //button[contains(@data-testid,'royal_login_button')]




      /*  Thread. sleep(3000);

        driver. quit();*/

    }
    }

