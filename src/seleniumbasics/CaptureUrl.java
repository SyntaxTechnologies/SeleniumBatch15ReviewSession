package seleniumbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureUrl {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        String pageUrl= driver.getCurrentUrl();
        System.out.println("Page URL : " + pageUrl);

    }
}
