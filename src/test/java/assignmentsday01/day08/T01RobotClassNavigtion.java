package assignmentsday01.day08;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

import java.awt.*;
import java.awt.event.KeyEvent;

public class T01RobotClassNavigtion  extends TestBase {
    /*
     * Open a demo login page (e.g. https://the-internet.herokuapp.com/login).
     * Click into the username field.
     * Type the username using sendKeys.
     * Use the Robot class to:
     * Press Tab → go to password field.
     * Type the password using sendKeys.
     * Press Enter → submit the form.
     * Verify login success or error message.
     */
By usernameField = By.xpath("//input[@id=\"username\"]");
    @Test
    void robot() throws AWTException {
        driver.get("https://the-internet.herokuapp.com/login");
        // Click into the username field.
        driver.findElement(usernameField).click();
        // Type the username using sendKeys.
        driver.findElement(usernameField).sendKeys("tomsmith");
        // Use the Robot class to:
        Robot robot = new Robot();
        // Press Tab → go to password field.
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
        // Type the password using sendKeys.SuperSecretPassword!
        robot.keyPress(KeyEvent.VK_S);
        robot.keyRelease(KeyEvent.VK_S);
        robot.keyPress(KeyEvent.VK_U);
        robot.keyRelease(KeyEvent.VK_U);
        robot.keyPress(KeyEvent.VK_P);
        robot.keyRelease(KeyEvent.VK_P);
        robot.keyPress(KeyEvent.VK_E);
        robot.keyRelease(KeyEvent.VK_E);
        robot.keyPress(KeyEvent.VK_R);
        robot.keyRelease(KeyEvent.VK_R);
        robot.keyPress(KeyEvent.VK_S);
        robot.keyRelease(KeyEvent.VK_S);
        robot.keyPress(KeyEvent.VK_E);
        robot.keyRelease(KeyEvent.VK_E);
        robot.keyPress(KeyEvent.VK_C);
        robot.keyRelease(KeyEvent.VK_C);
        robot.keyPress(KeyEvent.VK_R);
        robot.keyRelease(KeyEvent.VK_R);
        robot.keyPress(KeyEvent.VK_E);
        robot.keyRelease(KeyEvent.VK_E);
        robot.keyPress(KeyEvent.VK_T);
        robot.keyRelease(KeyEvent.VK_T);
        robot.keyPress(KeyEvent.VK_P);
        robot.keyRelease(KeyEvent.VK_P);
        robot.keyPress(KeyEvent.VK_A);
        robot.keyRelease(KeyEvent.VK_A);
        robot.keyPress(KeyEvent.VK_S);
        robot.keyRelease(KeyEvent.VK_S);
        robot.keyPress(KeyEvent.VK_S);
        robot.keyRelease(KeyEvent.VK_S);
        robot.keyPress(KeyEvent.VK_W);
        robot.keyRelease(KeyEvent.VK_W);
        robot.keyPress(KeyEvent.VK_O);
        robot.keyRelease(KeyEvent.VK_O);
        robot.keyPress(KeyEvent.VK_R);
        robot.keyRelease(KeyEvent.VK_R);
        robot.keyPress(KeyEvent.VK_D);
        robot.keyRelease(KeyEvent.VK_D);
robot.keyPress(KeyEvent.VK_ENTER);
robot.keyRelease(KeyEvent.VK_ENTER);
        // Verify login success or error message.

           Assertions.assertTrue(driver.findElement(By.xpath("//div[@id=\"flash\"]")).isEnabled());



}
}
