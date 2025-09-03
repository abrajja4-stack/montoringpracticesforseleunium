package assignmentsday01;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task08MultipleNanigationAndVerification {
    WebDriver driver;

    @Test
    void test1() {
        driver.navigate().to("https://www.google.com");
        String titelgoogle = driver.getTitle();
        Assertions.assertFalse(titelgoogle.contains("google"));
        System.out.println("titelgoogle = " + titelgoogle);

        driver.navigate().to("https://www.youtube.com/");
        String titelyoutube= driver.getTitle();
        Assertions.assertFalse(titelgoogle.contains("youtube"));
        System.out.println("titelyoutube = " + titelyoutube);

        driver.navigate().to("https://www.linkedin.com/feed/");
        String titellinkedin = driver.getTitle();
        Assertions.assertFalse(titelgoogle.contains("linkedin"));
        System.out.println("titellinkedin = " + titellinkedin);


    }


    @Test
    void test2() {
        driver.navigate().back();
        driver.navigate().back();
        String linkgoogle = driver.getCurrentUrl();
        Assertions.assertFalse(linkgoogle.contains("google"));


        driver.navigate().forward();
        String linklinkedin = driver.getCurrentUrl();
        Assertions.assertFalse(driver.getCurrentUrl().contains("linkedin"));


    }


    @BeforeEach
    void setUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }
    @AfterEach
    void tearDown(){
        driver.quit();

    }

}
