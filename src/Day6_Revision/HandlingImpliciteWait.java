package Day6_Revision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class HandlingImpliciteWait {

    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("http://janbaskdemo.com/");

        driver.findElement(By.xpath("//i[@class='fa fa-user']")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
        driver.findElement(By.xpath("//a[text()='Login']")).click();
    }

}
