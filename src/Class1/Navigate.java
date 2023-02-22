package Class1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {
    public static void main(String[] args) throws InterruptedException {

        //connect to web driver
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        // initiate the instance of WebDriver
        WebDriver driver=new ChromeDriver();
        //open google.com
        driver.get("https://google.com");
        //Slow down
        Thread.sleep(2000);
        //now navigate
        driver.navigate().to("https://www.facebook.com");
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().forward();
        Thread.sleep(2000);
        driver.navigate().refresh();
        driver.close();

    }
}
