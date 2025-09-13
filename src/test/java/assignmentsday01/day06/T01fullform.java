package assignmentsday01.day06;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import utilities.TestBase;

public class T01fullform extends TestBase {


    //Generate Passcode
    //Use passcode to submit form


    @Test
    void full() {
        //Go to https://claruswaysda.github.io/ActionsForm.html
        driver.get("https://claruswaysda.github.io/ActionsForm.html");
//Fill the form
        driver.findElement(By.id("name")).sendKeys("John");
        driver.findElement(By.id("age")).sendKeys("20");
        Select select = new Select(driver.findElement(By.id("options")));
        select.selectByVisibleText("IT Department");
        driver.findElement(By.xpath("//input[@type='checkbox'][1]")).click();
        driver.findElement(By.xpath("//input[@value=\"female\"]")).click();
        driver.findElement(By.xpath("//button[@type='button']")).click();
        //Generate Passcode
        Alert alert = driver.switchTo().alert();
        String alertText = alert.getText();
        String passcode = alertText.substring(alertText.indexOf(":") +1).trim();
        System.out.println("Passcode is: " + passcode);
        alert.accept();
        alert.sendKeys(passcode);
        alert.accept();
        driver.switchTo().frame("iframeSubmit");
        driver.findElement(By.xpath("//button[@id='submitButton']")).click();






    }





}

