package testmonatring.day8;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class T02FileDownloadVerification extends TestBase {
    /*
Go to https://claruswaysda.github.io/downloadUpload.html
Click on download
Verify that 'QAProgram.png' file is downloaded
*/

    @Test
    void FILE() throws InterruptedException, IOException {
        driver.get("https://claruswaysda.github.io/downloadUpload.html");
        WebElement download = driver.findElement(By.xpath("//a[@class=\"download-btn\"]"));
        download.click();
        Thread.sleep(2000);
      //  Verify that 'QAProgram.png' file is downloaded
        Path filepath = Path.of(System.getProperty("user.home"), "Downloads", "QAProgram.png");
        Assertions.assertTrue(Files.exists(filepath));
        Files.deleteIfExists(filepath);


    }
}
