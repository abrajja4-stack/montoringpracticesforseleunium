package testmonatring.day7;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

import java.awt.*;
import java.awt.event.KeyEvent;

public class T02 extends TestBase {
    /*
 Go to https://claruswaysda.github.io/downloadUpload.html
 Click on 'Upload'
 Close the opening page using 'CTRL+F4'
 */
By uploadButton = By.xpath("//label[@class=\"upload-btn\"][1]");
    @Test
    void name() throws AWTException {
        driver.get("https://claruswaysda.github.io/downloadUpload.html");
        driver.findElement(uploadButton).click();
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_F4);
        robot.keyRelease(KeyEvent.VK_F4);
        robot.keyRelease(KeyEvent.VK_CONTROL);
    }

}
