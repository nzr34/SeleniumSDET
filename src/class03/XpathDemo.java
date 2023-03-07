package class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");//for Windows "driver/chromedriver.exe"

        //Create instance of WebDriver
        WebDriver driver = new ChromeDriver();

        //Open the website
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        //driver.manage().window().maximize();
        WebElement username=driver.findElement(By.xpath("//input[contains(@name,'username')]"));
        username.sendKeys("MyUserName");
        WebElement password=driver.findElement(By.xpath("//input[@type='password']"));
        password.sendKeys("N987-hghgh");
        username.clear();
        WebElement printUsername= driver.findElement(By.xpath("//label[text()='Username:']"));
        System.out.println(printUsername.getText());
        WebElement passwordText = driver.findElement(By.xpath("//label[text()='Password:']"));
        String pasText = passwordText.getText();
        System.out.println(pasText);

        driver.quit();



    }
}
