package assignmentsday01.day02;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task06PageSourceValidation {
    WebDriver driver;
    String url1 = "https://www.selenium.dev";
    String url2 = "https://www.python.org";
    @Test
    void test1() {
        driver.navigate().to(url1);
        Assertions.assertTrue(driver.getPageSource().contains("WebDriver"));
        System.out.println("it contains WebDriver");


    }


    @Test
    void test2() {
        driver.navigate().to(url2);
        Assertions.assertTrue(driver.getPageSource().contains("Python"));
        System.out.println("it contains python");
    }

    @BeforeEach
    void setup(){
        driver = new ChromeDriver();


    }


    @AfterEach
    void tearDown(){
        driver.quit();

    }
}
