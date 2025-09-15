package assignmentsday01.day07;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class T05FormHandlingwithJavaScriptExecutor extends TestBase {
 /*
 Go to https://claruswaysda.github.io/form.html
 Create a method to flash the elements you are working on and use it.
 Register a user
 Login
 Celebrate the login!
*/
    String url = "https://claruswaysda.github.io/form.html";

    public void flash(WebDriver driver, WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        String originalStyle = element.getAttribute("style");
        js.executeScript("arguments[0].setAttribute('style', arguments[1]);", element, "border: 2px solid red; border-style: dashed;");
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        js.executeScript("arguments[0].setAttribute('style', arguments[1]);", element, originalStyle);
    }

    @Test
    void java() {
        driver.get(url);
        WebElement SNN = driver.findElement(By.xpath("//input[@id=\"ssn\"]"));
        flash(driver, SNN);
        SNN.sendKeys("123-45-6789");
        WebElement firstname = driver.findElement(By.xpath("//input[@id=\"first-name\"]"));
        flash(driver, firstname);
        firstname.sendKeys("John");
        WebElement lastname = driver.findElement(By.xpath("//input[@id=\"last-name\"]"));
        flash(driver, lastname);
        lastname.sendKeys("Doe");
        WebElement Addres = driver.findElement(By.xpath("//input[@id=\"address\"]"));
        flash(driver, Addres);
        Addres.sendKeys("123 Main St");
        WebElement phone = driver.findElement(By.xpath("//input[@id=\"phone\"]"));
        flash(driver, phone);
        phone.sendKeys("9875898644");
        WebElement USERNAME = driver.findElement(By.xpath("//input[@id=\"username\"]"));
        flash(driver, USERNAME);
        USERNAME.sendKeys("johndoe");
        WebElement emil = driver.findElement(By.xpath("//input[@id=\"email\"]"));
        flash(driver, emil);
        emil.sendKeys("oiuytfvb@gmile.com");
        WebElement pass = driver.findElement(By.xpath("//input[@id=\"password\"]"));
        flash(driver, pass);
        pass.sendKeys("12345");
        WebElement pass2 = driver.findElement(By.xpath("//input[@id=\"confirm-password\"]"));
        flash(driver, pass2);
        pass2.sendKeys("12345");
        WebElement submint = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
        flash(driver, submint);
        submint.click();
        WebElement mussg = driver.findElement(By.xpath("//div[@id=\"successMessage\"]"));
        Assertions.assertTrue(mussg.isEnabled());
        WebElement loginusername = driver.findElement(By.xpath("//button[@class=\"login-button\"]"));
        loginusername.click();

    }


   }



