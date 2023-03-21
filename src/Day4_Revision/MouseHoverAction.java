package Day4_Revision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverAction {

    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://demo.opencart.com/");
        WebElement menuItem =driver.findElement(By.xpath("//a[text()='Components']"));

        Actions act = new Actions(driver);
        act.moveToElement(menuItem).perform();
        WebElement subMenuItem= driver.findElement(By.xpath("//a[contains(text(), 'Monitors')]"));
        act.moveToElement(subMenuItem).click().perform();


    }
}
