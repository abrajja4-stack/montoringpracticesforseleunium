package assignmentsday01.day07;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

import java.util.Set;

public class T02ActionsClassPractice  extends TestBase {
/*
 Go to https://claruswaysda.github.io/submit-button.html
 Click on submit
 Verify link contains 'actionsClickDrag'
 Drag 'Drag me' to 'Drop here'
 Right-click on 'Right-click' me
 Double-click on 'Double-click me'
 Hover on 'Hover over me'
 Verify all actions' success messages.
 */
String url = "https://claruswaysda.github.io/submit-button.html";
By submitById = By.id("submitButton");
By dragByxpath =By.xpath("//div[@class=\"box\"]");
By DrobByxpathe = By.xpath("//div[@class=\"drop-zone\"]");
By rightClickByxpath = By.xpath("//button[@id=\"showSuccessButton\"]");
By DubelClickByxpath = By.xpath("//button[@id=\"doubleClickButton\"]");
By HoverByxpath = By.xpath("//button[@id=\"hoverButton\"]");
By SuccessDrobClickByxpath = By.xpath("//div[@id=\"dragSuccessMessage\"]");
By SuccessrightClickByxpath = By.xpath("//div[@id=\"rightClickSuccessMessage\"]");
By SuccessDouldeClickByxpath = By.xpath("//div[@id=\"doubleClickSuccessMessage\"]");
By SucceshoverClickByxpath = By.xpath("//div[@id=\"hoverSuccessMessage\"]");



    @Test
    void ActionClass() {
        driver.get(url);
        String minHandel = driver.getWindowHandle();
        driver.findElement(submitById).click();

        Set <String> allHandels = driver.getWindowHandles();
        for (String w: allHandels) {
            if (!w.equals(minHandel)) {
                driver.switchTo().window(w);
            }

        }
        Assertions.assertTrue(driver.getCurrentUrl().contains("actionsClickDrag"));
        Actions actions = new Actions(driver);

        actions
               .dragAndDrop(driver.findElement(dragByxpath),driver.findElement(DrobByxpathe))
                .contextClick(driver.findElement(rightClickByxpath))
                .doubleClick(driver.findElement(DubelClickByxpath))
                .moveToElement(driver.findElement(HoverByxpath))
                .perform();

        Assertions.assertTrue(driver.findElement(SuccessDrobClickByxpath).getText().contains("Item successfully dropped!"));
        Assertions.assertTrue(driver.findElement(SuccessrightClickByxpath).getText().contains("Button right-clicked!"));
       Assertions.assertTrue(driver.findElement(SuccessDouldeClickByxpath).getText().contains("Button double-clicked!"));
        Assertions.assertTrue(driver.findElement(SucceshoverClickByxpath).getText().contains("Button hovered!"));








    }
}
