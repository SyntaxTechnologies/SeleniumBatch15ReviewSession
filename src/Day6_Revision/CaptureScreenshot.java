package Day6_Revision;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.io.IOException;

public class CaptureScreenshot {

    public static void main(String[] args) throws IOException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://www.salesforce.com/au/");

        // Take the screenshot and save to a file
        TakesScreenshot ts = (TakesScreenshot) driver;
        File src = ts.getScreenshotAs(OutputType.FILE);

        // Save the screenshot to a specified location
        File target = new File("C:\\Users\\91886\\Pictures\\Screenshots\\salesforce.png");
        FileUtils.copyFile(src, target);
    }
}
