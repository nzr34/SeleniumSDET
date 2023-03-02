package Class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com");
        driver.manage().window().maximize();
        WebElement createNewAccountButton=driver.findElement(By.cssSelector("a[data-testid='open-registration-form-button']"));
        createNewAccountButton.click();
        Thread.sleep(3000);
        WebElement firstName=driver.findElement(By.cssSelector("input[name='firstname']"));
        firstName.sendKeys("John");
        WebElement lastName=driver.findElement(By.cssSelector("input[name='lastname']"));
        lastName.sendKeys("Wick");








        //button[contains(@data-testid,'royal_login_button')]




      /*  Thread. sleep(3000);

        driver. quit();*/

    }
    }

