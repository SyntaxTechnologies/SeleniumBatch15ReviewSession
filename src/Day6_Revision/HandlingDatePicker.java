package Day6_Revision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

public class HandlingDatePicker {

    public static void main(String[] args) {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://www.redbus.in/");

        //1. Identify the date that i want to select
        String year = "2023";
        String month = "Aug";
        String date = "19";

        //2. Click on Calender
        driver.findElement(By.xpath("//input[@id='onward_cal']")).click();

        while(true)
        {
            //3. Capture Year and Month
            String monthYear=driver.findElement(By.xpath("//td[@class='monthTitle']")).getText();
            String [] ym=monthYear.split(" ");
            if(ym[0].equalsIgnoreCase(month) && ym[1].equalsIgnoreCase(year))
            {
                // perform some operation
                List<WebElement> dates= driver.findElements(By.xpath("//table[@class='rb-monthTable first last']//tr/td"));
                for(WebElement dt : dates)
                {
                    if(dt.getText().equals(date))
                    {
                        dt.click();
                        break;
                    }
                }
            }
            else
            {
                 driver.findElement(By.xpath("//td[@class='next']")).click();
            }

        }
    }

}
