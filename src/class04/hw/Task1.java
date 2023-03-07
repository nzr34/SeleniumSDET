package class04.hw;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.syntaxtechs.net/basic-checkbox-demo.php");
        WebElement checkBox1=driver.findElement(By.cssSelector("input[id='isAgeSelected']"));
        boolean isSelected=checkBox1.isSelected();
        System.out.println("is check box selected:"+isSelected);
        if (!isSelected) {
            checkBox1.click();
            isSelected=checkBox1.isSelected();
        }
        System.out.println("is check box selected:"+isSelected);
        driver.close();


     }
    }



