package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03BrowserComments {

    public static void main(String[] args) {
// TC – 03

// Expected Title
// Set Path of the Chrome driver
// Launch Chrome browser
// Open URL of Website
// Maximize Window
// Get Title of current Page
// Validate/Compare Page Title
// Close Browser


// Expected Title
        String expTitel = "Google";
        // Launch Chrome browser
        WebDriver driver = new ChromeDriver();
        // Open URL of Website
        driver.get("https://www.google.com");

// Maximize Window
        driver.manage().window().maximize();

        // Get Title of current Page
        String actualTitle = driver.getTitle();
        //System.out.println("actualTitle = " + actualTitle);

        // Validate/Compare Page Title
        if (actualTitle.equals(expTitel)) {
            System.out.println("page title appear as expted");
        } else {
            System.out.println("Page title does not appear as expected");
        }
        driver.quit();

    }
}
