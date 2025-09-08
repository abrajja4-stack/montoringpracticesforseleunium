package assignmentsday01.day01;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task04MaximizAndMinimize {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.google.com/");

        driver.manage().window().maximize();
//Thread.sleep(1000);
        Point position = driver.manage().window().getPosition();
        System.out.println("position = " + position);

        Dimension dimension = driver.manage().window().getSize();
        System.out.println("dimension = " + dimension);

        driver.manage().window().minimize();

        Thread.sleep(5000);


        System.out.println("position = " + position);


        System.out.println("dimension = " + dimension);


        driver.manage().window().fullscreen();
//Thread.sleep(1000);
        driver.close();
        driver.quit();



    }
}
