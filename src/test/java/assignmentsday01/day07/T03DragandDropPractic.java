package assignmentsday01.day07;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class T03DragandDropPractic extends TestBase {

    /*
     Go to https://claruswaysda.github.io/dragAndDrop.html
     Drag the items in their right places
     Assert the success message
     */
    String url = "https://claruswaysda.github.io/dragAndDrop.html";
    By drag1ById = By.id("piece1");
    By drag2ById = By.id("piece2");
    By drag3ById = By.id("piece3");
    By slot1ById = By.id("slot1");
    By slot2ById = By.id("slot2");
    By slot3ById = By.id("slot3");
    By successMessageByTagName = By.id("celebrate");
    @Test
    void Drag() {
       driver.get(url);

        Actions actions = new Actions(driver);

       actions.dragAndDrop(driver.findElement(drag1ById),driver.findElement(slot1ById)).perform();
        actions .dragAndDrop(driver.findElement(drag2ById),driver.findElement(slot2ById)).perform();
        actions.dragAndDrop(driver.findElement(drag3ById),driver.findElement(slot3ById)).perform();


Assertions.assertEquals("Congratulations!",driver.findElement(By.id("celebrate")).getText());

    }
}
