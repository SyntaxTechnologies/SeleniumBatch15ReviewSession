package Day6_Revision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Set;

public class HandlingWindows {

    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://www.salesforce.com/au/");
        WebElement freeTrialBtn = driver.findElement(By.xpath("(//a[contains(@aria-label, 'Start my free')])[1]"));
        freeTrialBtn.click();

        Set<String> windowIds = driver.getWindowHandles();
        for (String id : windowIds) {
            driver.switchTo().window(id);
            if (driver.getTitle().contains("Free CRM")) {
                driver.findElement(By.name("UserFirstName")).sendKeys("Ashish");
                driver.findElement(By.name("UserLastName")).sendKeys("Mishra");
            }
        }


        driver.quit();
    }
}
