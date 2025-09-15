package assignmentsday01.day08;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

import java.awt.*;
import java.awt.event.KeyEvent;

public class T02JavaScriptEventsTesting extends TestBase {
    /*
 Go to https://testpages.herokuapp.com/styled/events/javascript-events.html
 Click all the buttons and verify they are all clicked
 */
By onblur = By.xpath("//button[@id=\"onblur\"]");
   By onekeydown = By.xpath("//button[@id=\"onkeydown\"]");
   By onekeyup = By.xpath("//button[@id=\"onkeyup\"]");
   By onekypreess = By.xpath("//button[@id=\"onkeypress\"]");
   By onmusdown = By.xpath("//button[@id=\"onmousedown\"]");

    @Test
    void java() throws AWTException {
        driver.get(" https://testpages.herokuapp.com/styled/events/javascript-events.html");
        driver.findElement(onblur).click();
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
        driver.findElement(onekeydown).click();
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_DOWN);
        driver.findElement(onekeyup).click();
        robot.keyPress(KeyEvent.VK_UP);
        robot.keyRelease(KeyEvent.VK_UP);
        driver.findElement(onekypreess).click();
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        driver.findElement(onmusdown).click();
        robot.mousePress( KeyEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease( KeyEvent.BUTTON1_DOWN_MASK);



WebElement onclick = driver.findElement(By.xpath("//button[@id=\"onclick\"]"));
WebElement ondblclick = driver.findElement(By.xpath("//button[@id=\"oncontextmenu\"]"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
       js.executeScript("arguments[0].click();", onclick);
       js.executeScript("arguments[0].dispatchEvent(new MouseEvent('contextmenu',{bubbles:true}));", ondblclick);




        Actions actions = new Actions(driver);
WebElement Dublclick = driver.findElement(By.xpath("//button[@id=\"ondoubleclick\"]"));
WebElement onfocus = driver.findElement(By.xpath("//button[@id=\"onfocus\"]"));
//WebElement onkeydown = driver.findElement(By.xpath("//button[@id=\"onkeydown\"]"));
 WebElement onmouseover =  driver.findElement(By.xpath("//button[@id=\"onmouseover\"]"));
 WebElement mousleve = driver.findElement(By.xpath("//button[@id=\"onmouseleave\"]"));
 //WebElement onmusdown = driver.findElement(By.xpath("//button[@id=\"onmousedown\"]"));
actions
    .doubleClick(Dublclick)
    .click(onfocus)
    .moveToElement(onmouseover)
    .moveToElement(mousleve)
        .perform();

//verify they are all clicked

        WebElement result = driver.findElement(By.xpath("//p[@class=\"challenge-completed-notification\"]"));
        Assertions.assertTrue(result.isEnabled());















    }
}
