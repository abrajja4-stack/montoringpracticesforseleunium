package assignmentsday01;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task03PositionAndSize {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://www.amazon.com/");

        Point position =  driver.manage().window().getPosition();
        System.out.println("position.getX() = " + position.getX());
        System.out.println("position.getY() = " + position.getY());
        System.out.println("position = " + position);


        Dimension dimension = driver.manage().window().getSize();
        System.out.println("dimension.getWidth() = " + dimension.getWidth());
        System.out.println("dimension.getHeight() = " + dimension.getHeight());
        System.out.println("dimension = " + dimension);


        // Adjust the position and size of the page as desired.
        driver.manage().window().setPosition(new Point(200, 200));
        driver.manage().window().setSize(new Dimension(600, 600));



// Test that the page is in the position and size you want. // Close the page.
        driver.close();
        driver.quit();

    }
}
