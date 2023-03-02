package Class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
    public static void main(String[] args) throws InterruptedException {
    //  tell your project where the web-driver is located.
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");//for Windows "driver/chromedriver.exe"

    //Create instance of WebDriver
        WebDriver driver=new ChromeDriver();

    //Open the website
        driver.get("https://www.facebook.com");
        //get the current ur that is there in the browser
        String URL = driver.getCurrentUrl();
        //print out the ur
        System.out.println (URL);
      //  get the title of the webpage
        String title=driver .getTitle();
        // print the title of the page
        System.out .println("the title of the page is "+title);
        //Islow down for 3 seconds
        Thread. sleep(3000);
        //close the browser
        driver. quit();

    }
}