package assignmentsday01.day05;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class T03Growing1 {
    //Go to https://testpages.herokuapp.com/styled/challenges/growing-clickable.html--done
    //Click "click me" button
    //Verify "Event Triggered" appears

 WebDriver driver;
 String url = "https://testpages.herokuapp.com/styled/challenges/growing-clickable.html";
By growingBuxpathe = By.xpath("//button[@class='styled-click-button showgrow grown']");
    By text = By.id("growbuttonstatus");


    @Test
    void growing() {
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        driver.get(url);
        wait.until(ExpectedConditions.elementToBeClickable(growingBuxpathe)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(text));
        Assertions.assertEquals("Event Triggered",driver.findElement(text).getText());
    }

    @BeforeEach
    void setUp() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }

    @AfterEach
    void tearDown() {
        driver.quit();

    }

}
