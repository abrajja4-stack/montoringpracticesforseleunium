package assignmentsday01.day06;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WindowType;
import utilities.TestBase;

public class T07MultipleiFrames extends TestBase {
    /*
 Go to URL: http://demo.guru99.com/test/guru99home/--done
 1. Find the number of iframes on the page---done
 2. Switch to the third iframe (JMeter Made Easy)--jest 2 ferm there
 3. Click the link (https://www.guru99.com/live-selenium-project.html)
 4. Exit the iframe and return to the main page
 */

    @Test
    void ifrem() {
        driver.get("http://demo.guru99.com/test/guru99home/");


        //1. Find the number of iframes on the page
        int numberOfIframes = driver.findElements(By.tagName("iframe")).size();
        System.out.println("Number of iframes on the page: " + numberOfIframes);


        //2. Switch to the third iframe (JMeter Made Easy)
        driver.switchTo().frame(1);
        driver.findElement(By.xpath("//img[@src=\"Jmeter720.png\"]")).click();//img[@src="Jmeter720.png"]


        //3. Click the link (https://www.guru99.com/live-selenium-project.html)

        driver.switchTo().newWindow(WindowType.TAB);
        driver.switchTo().defaultContent();
        //String firsthandel = driver.getWindowHandle();
      //  driver.get("https://www.guru99.com/live-selenium-project.html");




    }
}
