package Class2.HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
        /**HW1:
        navigate to
       https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22
        fill out the form
        click on register
        close the browser*/
        public static void main(String[] args) {
            System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
            //Create instance of WebDriver
            WebDriver driver = new ChromeDriver();
            //Open the website
            driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
            driver.manage().window().maximize();
            driver.findElement(By.id("customer.firstName")).sendKeys("John");
            driver.findElement(By.id("customer.lastName")).sendKeys("Wick");
            driver.findElement(By.id("customer.address.street")).sendKeys("2334 sw 23rd street");
            driver.findElement(By.id("customer.address.city")).sendKeys("Oakland Park");
            driver.findElement(By.id("customer.address.state")).sendKeys("Florida");
            driver.findElement(By.id("customer.address.zipCode")).sendKeys("33333");
            driver.findElement(By.id("customer.phoneNumber")).sendKeys("5467890990");
            driver.findElement(By.id("customer.ssn")).sendKeys("455-034-7654");
            driver.findElement(By.id("customer.username")).sendKeys("JohnWick");
            driver.findElement(By.id("customer.password")).sendKeys("JohnWickPassword123");
            driver.findElement(By.name("repeatedPassword")).sendKeys("JohnWickPassword123");
            driver.findElement(By.className("button")).click();
            driver.quit();
        }
}
