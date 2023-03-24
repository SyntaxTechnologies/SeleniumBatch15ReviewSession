package Day5_Revision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HandlingDropdown3 {

    public static void main(String[] args) {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.hdfcbank.com/");
        driver.manage().window().maximize();
        WebElement productTypeDdl = driver.findElement(By.xpath("//a[text()='Select Product Type']"));
        productTypeDdl.click();
        List<WebElement> productType = driver.findElements(By.xpath("//div[@class='dropdown open']//li"));

        for (WebElement product : productType) {
            String productName = product.getText();
            if (productName.equalsIgnoreCase("Loans")) {
                product.click();
                break;
            }
        }


    }
}
