package assignmentsday01.day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Task02VerifyTitleTest {
    public static void main(String[] args) throws InterruptedException {

        String expTitel = "video";
        WebDriver driver = new FirefoxDriver();

        driver.navigate().to("https://www.youtube.com/");

        String actualTitle = driver.getTitle();

        if (actualTitle.contains(expTitel)) {
            System.out.println("page title appear as expted");
        } else {
            System.out.println("Page title does not appear as expected");
        }
        driver.close();
        driver.quit();

    }
}
