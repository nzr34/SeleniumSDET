package class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.syntaxtechs.net/basic-radiobutton-demo.php");
        WebElement maleBtn =driver.findElement(By.cssSelector("input[value='Male']"));

        boolean isEnabledMale = maleBtn.isEnabled();
        System.out.println("the radio button male is enabled "+isEnabledMale);

//        check if the radio button is Displayed
        boolean isDisplayedMale = maleBtn.isDisplayed();
        System.out.println("the radio button male is displayed"+isDisplayedMale);

//        check if the radio button is Selected
        boolean isSelectedmale = maleBtn.isSelected();
        System.out.println("the male button is selected "+isSelectedmale);
// if the radio button is not selected click on it
        if(!isSelectedmale) {
            maleBtn.click();
        }
//        check if the radio button is selected after the click
        isSelectedmale=maleBtn.isSelected();
        System.out.println("the status of selection is "+ isSelectedmale);
    }
}
