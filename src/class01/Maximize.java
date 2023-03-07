package class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Maximize {
    public static void main(String[] args) throws InterruptedException {

        //connect to web driver
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        // initiate the instance of WebDriver
        WebDriver driver=new ChromeDriver();
        //open google.com
        driver.get("https://google.com");
        //maximize the page
        driver.manage().window().maximize();
        //full screen
        driver.manage().window().fullscreen();
        //close
        driver.close();
    }
}
