package testmonatring.day7;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

import java.awt.*;
import java.nio.file.Path;

public class T03FileUploadTesting extends TestBase {
  /*
Go to https://claruswaysda.github.io/downloadUpload.html
Upload a PDF using single upload button
Verify that 'Files uploaded successfully!'
Do negative test (No file or other than PDF)
Verify that 'Please upload at least one PDF file. Only PDF files are allowed!'
Test multiple PDFs as well
*/

    @Test
    void upload() throws AWTException, InterruptedException {
        driver.get("https://claruswaysda.github.io/downloadUpload.html");

//positive test
        Path path = Path.of(System.getProperty("user.home"),"Downloads", "sample3.pdf");
        Path path1 = Path.of(System.getProperty("user.home"), "Downloads", "AST Theory ass1.pdf");
        driver.findElement(By.id("uploadInput")).sendKeys(path.toString());
        driver.findElement(By.className("submit-btn")).click();
        Assertions.assertTrue(driver.findElement(By.id("successBox")).isDisplayed());



//nagative test
        driver.navigate().refresh();
        driver.findElement(By.className("submit-btn")).click();
        Assertions.assertTrue(driver.findElement(By.id("alertBox")).isDisplayed());


//multiple file upload
        driver.navigate().refresh();
        driver.findElement(By.id("multiUploadInput")).sendKeys(path.toString() + "\n" + path1.toString());
        driver.findElement(By.cssSelector("button[type='submit']")).click();
        Assertions.assertTrue(driver.findElement(By.id("successBox")).isDisplayed());











    }
}
