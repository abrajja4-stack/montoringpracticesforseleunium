package testmonatring.day7;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class T01JavaScriptExecutorwithElementStyling  extends TestBase {
     /*
 Go to https://claruswaysda.github.io/signIn.html
 enter username 'admin'
 enter password '123'
 Click on Sign In
 Assert the 'Employee Table' is visible
 Create a method to change border color and style of web elements.
 Use the method on each element you interact with.
 */
     public void highlightElement(WebDriver driver, WebElement element) {
         JavascriptExecutor js = (JavascriptExecutor) driver;
         js.executeScript("arguments[0].style.border='3px solid red'", element);
     }

    @Test
    void signInTest() {



        driver.get("https://claruswaysda.github.io/signIn.html");


        WebElement username = driver.findElement(By.id("username"));
        highlightElement(driver, username);
        username.sendKeys("admin");


        WebElement password = driver.findElement(By.id("password"));
        highlightElement(driver, password);
        password.sendKeys("123");


        WebElement signInBtn = driver.findElement(By.xpath("//button[@type='submit']"));
        highlightElement(driver, signInBtn);
        signInBtn.click();


        WebElement employeeTable = driver.findElement(By.id("employeeTable"));
        highlightElement(driver, employeeTable);
       Assertions.assertTrue(employeeTable.getText().contains("Employee Table"));



    }
}