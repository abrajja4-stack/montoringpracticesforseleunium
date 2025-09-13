package assignmentsday01.day06;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import utilities.TestBase;

public class T02iFramewithAlert extends TestBase {
     /*
 Go to https://claruswaysda.github.io/iframe.html
 Type your name in input
 Click on 'Bold' button
 Assert the alert message
 */

    @Test
    void Alert() {
        driver.get("https://claruswaysda.github.io/iframe.html");
        driver.switchTo().frame("mce_0_ifr");//id="mce_0_ifr"
driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("John");
        driver.switchTo().defaultContent();
driver.findElement(By.xpath("//button[@aria-label='Bold']")).click();



       Assertions.assertEquals(driver.switchTo().alert().getText(),"Bold button clicked");
        Alert alert = driver.switchTo().alert();
                alert.accept();

        //alert.accept();
    }
}
