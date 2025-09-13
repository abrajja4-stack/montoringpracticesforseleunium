package assignmentsday01.day07;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class T04DrawingPractic extends TestBase {

    /*
 Go to https://claruswaysda.github.io/Draw.html
 Draw a triangle
 Reset
 */
    String url = "https://claruswaysda.github.io/Draw.html";
By canvas = By.xpath("//canvas[@id=\"myCanvas\"]");
        By reset = By.tagName("button");

    @Test
    void Drage() {
        driver.get(url);
        Actions actions = new Actions(driver);
        actions
                .moveByOffset(600, 300).clickAndHold().moveByOffset(100, 200).moveByOffset(-200, 0).moveByOffset(100, -200).release().perform();

        driver.findElement(reset).click();

    }
}
