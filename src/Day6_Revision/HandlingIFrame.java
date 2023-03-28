package Day6_Revision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandlingIFrame {

    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");

        //1. Switch to first frame
        driver.switchTo().frame("packageListFrame");

        //2. Click on element in the first frame
        driver.findElement(By.xpath("//a[text()='org.openqa.selenium.bidi' and @target='packageFrame']")).click();

        //3 . Move out of first frame
        driver.switchTo().defaultContent();

        //4. Switch to second frame
        driver.switchTo().frame("packageFrame");

        //5. Click on element in second frame
        driver.findElement(By.xpath("//span[text()='HasBiDi']")).click();

        //6.  Move out of second frame
        driver.switchTo().defaultContent();

        //7. Switch to third frame
        driver.switchTo().frame("classFrame");

        //8. Click on element in the third frame
        driver.findElement(By.xpath("//a[text()='FirefoxDriver']")).click();

    }
}
