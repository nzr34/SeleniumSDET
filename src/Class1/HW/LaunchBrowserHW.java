package Class1.HW;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowserHW {
    /**
     * 1. launch the browser
     * 2. navigate to amazon web site
     * 3. print out the title and the url in the console
     * 4. close the browser
     */
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.com");
        String url = driver.getCurrentUrl();
        System.out.println (url);
        String title=driver .getTitle();
        System.out .println("The title of the page is: "+title+" and URL is: "+url);
        driver. quit();

    }
}