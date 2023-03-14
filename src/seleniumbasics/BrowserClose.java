package seleniumbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class BrowserClose {
    public static void main(String[] args) {
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.facebook.com/");
        driver.close();

    }
}
