package test;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WindowType;
import utilities.TestBase;

public class C019WindoHandels extends TestBase {
    /*


    Go to https://www.linkedin.com/ in the open tab
    Create new window
    Go to https://clarusway.com/ in the window that opens
*/

    @Test
    void Windo() {
       // Open empty window
       driver.get("about:blank");
       String Firsthandel = driver.getWindowHandle();
         System.out.println("Firsthandel = " + Firsthandel);
       //open new tab
       driver.switchTo().newWindow(WindowType.TAB);
       String sacondhandel = driver.getWindowHandle();


        //Go to https://www.google.com/ in the open tab
        driver.get("https://www.google.com/");

        //Create new tab
        driver.switchTo().newWindow(WindowType.TAB);
        String thirdhandel = driver.getWindowHandle();
        //Go to https://www.linkedin.com/ in the open tab
        driver.get("https://www.linkedin.com/");
        //Create new window
        driver.switchTo().newWindow(WindowType.WINDOW);
        String fourthhandel = driver.getWindowHandle();
        //Go to https://clarusway.com/ in the window that opens
        driver.get("https://clarusway.com/");



    }
}
