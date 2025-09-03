package assignmentsday01;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task05BrowserHIstoryExploration {
    WebDriver driver;
    String url1  = "https://www.wikipedia.org/";
    String url2 = "https://www.google.com/";

    @Test
    void test1() {


        driver.navigate().back();
        String titelBack = driver.getTitle();

        Assertions.assertFalse(titelBack.contains("wikipedie"));
        System.out.println("titelBack = " + titelBack);

        driver.navigate().forward();
        String titelForward = driver.getTitle();

        Assertions.assertFalse(titelForward.contains("google"));
        System.out.println("titelForward = " + titelForward);


    }

    @Test
    void test2() {
        driver.navigate().refresh();
        String titel = driver.getTitle();
        Assertions.assertFalse(titel.contains("google"));


    }


    @BeforeEach
void setUp(){
        driver = new ChromeDriver();
        driver.get(url1);
        driver.get(url2);
    }

@AfterEach
    void tearDown(){

        driver.quit();
}






}
