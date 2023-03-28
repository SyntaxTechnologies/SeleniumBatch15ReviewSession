package Day6_Revision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HandlingExpliciteWait {

    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("http://janbaskdemo.com/");
        driver.findElement(By.xpath("//i[@class='fa fa-user']")).click();
        WebElement loginLink = driver.findElement(By.xpath("//a[text()='Login']"));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(2000));
        wait.until(ExpectedConditions.elementToBeClickable(loginLink));
        loginLink.click();

    }

}
