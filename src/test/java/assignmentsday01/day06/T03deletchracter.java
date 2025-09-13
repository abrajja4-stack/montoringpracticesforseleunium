package assignmentsday01.day06;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

public class T03deletchracter extends TestBase {


    @Test
    void delet() {
        /*
 Go to https://claruswaysda.github.io/deleteChars.html

 Enter your full name
 Delete the letters
 Verify the message 'Deleted'
 */

    driver.get("https://claruswaysda.github.io/deleteChars.html");
    driver.findElement(By.id("inputText")).sendKeys("John Doe");
    driver.findElement(By.id("enterButton")).click();
       // Delete the letters use for loop
    for (int i = 0; i < 8; i++) {
        driver.findElement(By.id("deleteButton")).click();

    }

        //Verify the message 'Deleted'
    String deletedMessage = driver.findElement(By.id("deletedMessage")).getText();
        Assertions.assertEquals("Deleted", deletedMessage);
        System.out.println(deletedMessage);

    /*if (deletedMessage.equals("Deleted")) {
        System.out.println("Test Passed: The message is 'Deleted'");
    } else {
        System.out.println("Test Failed: The message is not 'Deleted'");
    }


     */







    }







}
