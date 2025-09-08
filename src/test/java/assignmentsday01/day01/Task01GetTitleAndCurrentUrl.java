package assignmentsday01.day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task01GetTitleAndCurrentUrl {
    //Create main method
    public static void main(String[] args) {
//Creat chrom driver
        WebDriver driver = new ChromeDriver();
//open google home page://www.google.com
        driver.navigate().to("https://www.google.com");

//get title on page
        String actualTitle = driver.getTitle();
        System.out.println("page Title is = " + actualTitle);
//get current url
        String currentUrl = driver.getCurrentUrl();
        System.out.println("current URL is: " + currentUrl);

//close  quit
        driver.close();
        driver.quit();

    }
}
