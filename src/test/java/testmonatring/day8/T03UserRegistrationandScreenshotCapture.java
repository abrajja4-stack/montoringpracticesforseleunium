package testmonatring.day8;

import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import utilities.TestBase;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class T03UserRegistrationandScreenshotCapture extends TestBase {
     /*
 Go to https://claruswaysda.github.io/homepage.html
 Register a user
 Sign in with the registered user
 Take all pages' screenshots
 Take 'Celebrate Login' button's screenshot.
 Capture a screenshot of the page with confetti.
 */

    @Test
    void test() throws IOException, InterruptedException {
        driver.get("https://claruswaysda.github.io/homepage.html");


        WebElement USERicon = driver.findElement(By.xpath("//div[@id=\"userIcon\"]"));
        USERicon.click();
        WebElement register = driver.findElement(By.linkText("Register"));
        register.click();

        TakesScreenshot ss = (TakesScreenshot) driver;
        String timeStamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd:HH-mm-ss"));




        WebElement SNN = driver.findElement(By.xpath("//input[@id=\"ssn\"]"));
        SNN.sendKeys("123-45-6789");
        WebElement firstname = driver.findElement(By.xpath("//input[@id=\"first-name\"]"));
        firstname.sendKeys("John");
        WebElement lastname = driver.findElement(By.xpath("//input[@id=\"last-name\"]"));
        lastname.sendKeys("Doe");
        WebElement Addres = driver.findElement(By.xpath("//input[@id=\"address\"]"));
        Addres.sendKeys("123 Main St");
        WebElement phone = driver.findElement(By.xpath("//input[@id=\"phone\"]"));
        phone.sendKeys("9875898644");
        WebElement USERNAME = driver.findElement(By.xpath("//input[@id=\"username\"]"));
        USERNAME.sendKeys("johndoe");
        WebElement emil = driver.findElement(By.xpath("//input[@id=\"email\"]"));
        emil.sendKeys("oiuytfvb@gmile.com");
        WebElement pass = driver.findElement(By.xpath("//input[@id=\"password\"]"));
        pass.sendKeys("12345");
        WebElement pass2 = driver.findElement(By.xpath("//input[@id=\"confirm-password\"]"));
        pass2.sendKeys("12345");
        WebElement submint = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
        submint.click();
        WebElement mussg = driver.findElement(By.xpath("//div[@id=\"successMessage\"]"));
        Assertions.assertTrue(mussg.isEnabled());
       WebElement loginusername = driver.findElement(By.xpath("//button[@class=\"login-button\"]"));

        File screenShot1 = ss.getScreenshotAs(OutputType.FILE);
        Path path1 = Path.of(System.getProperty("user.dir"), "screenshot", "lastScreenshot1.png" );
        FileUtils.copyFile(screenShot1, path1.toFile());
        Thread.sleep(3000);
        loginusername.click();


        //driver.findElement(By.className("login-button")).click();
        driver.findElement(By.id("username")).sendKeys("username");
        driver.findElement(By.id("password")).sendKeys("password");
        File screenShot2 = ss.getScreenshotAs(OutputType.FILE);
        Path path2 = Path.of(System.getProperty("user.dir"), "screenshot", "lastScreenshot2.png");
        FileUtils.copyFile(screenShot2, path2.toFile());
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@type='submit']")).click();


        Thread.sleep(3000);
        File screenShot3 = ss.getScreenshotAs(OutputType.FILE);
        Path path3 = Path.of(System.getProperty("user.dir"), "screenshot", "lastScreenshot3.png");
        FileUtils.copyFile(screenShot3, path3.toFile());




    }
}
