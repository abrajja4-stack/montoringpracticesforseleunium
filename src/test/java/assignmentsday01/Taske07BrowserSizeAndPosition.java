package assignmentsday01;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Taske07BrowserSizeAndPosition {
    WebDriver driver;

    @Test
    void test1() {


         driver.manage().window().setSize(new Dimension(800, 600));
         Dimension getsize = driver.manage().window().getSize();
         Assertions.assertEquals(800,getsize.getWidth(),"not 800 ");
         Assertions.assertEquals(600,getsize.getHeight(),"not600");
        System.out.println(getsize);



    }


    @Test
    void test2() {

        driver.manage().window().setPosition(new Point(100,100));
        Point getposition =driver.manage().window().getPosition();
        Dimension getsize = driver.manage().window().getSize();
        Assertions.assertEquals(100,getposition.getX(),"x is not 100 ");
        Assertions.assertEquals(100,getposition.getY(),"y is not 100");
        System.out.println(getposition);

    }

    @BeforeEach
    void setUp(){
        driver = new ChromeDriver();
        driver.navigate().to("https://www.bbc.com/");
    }

    @AfterEach
    void tearDown(){
        driver.quit();

    }
}
