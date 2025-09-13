package assignmentsday01.day07;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WindowType;
import utilities.TestBase;

public class T01WindowHandlePractice extends TestBase {
     /*
 Go to https://claruswaysda.github.io/
 Click on Window Handle
 Click on 'Open Index Page'
 Verify the link 'https://claruswaysda.github.io/index.html'
 */



By windowHandleByXpath = By.xpath("//a[@href=\"#\"]");
By openindxpageById = By.tagName("a");
    String URL = "https://claruswaysda.github.io/";


    @Test
    void clickwindow() {

       driver.get(URL);
       String FirstHandel = driver.getWindowHandle();
       driver.findElement(windowHandleByXpath).click();
        String SecndHandle = driver.getWindowHandle();
       driver.switchTo().window(SecndHandle);
       //String secondHandle = driver.getWindowHandle();
        driver.findElement(openindxpageById).click();
        String TherdHandle = driver.getWindowHandle();

        Assertions.assertEquals(FirstHandel,TherdHandle);


        //Verify the link 'https://claruswaysda.github.io/index.html'





    }
}
