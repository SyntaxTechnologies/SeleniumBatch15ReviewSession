package seleniumbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureTitle {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/"); // Chrome
        driver.navigate().to("https://www.facebook.com/");

        String pageTitle=driver.getTitle();
        System.out.println("The title of the page is : " + pageTitle);

    }
}
