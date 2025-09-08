package assignmentsday01.day03;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.security.Key;

public class C02SecondAssingment {
    // TODO: Navigate to test pages
// TODO: Click on "Locators - Find By Playground Test Page"
// TODO: Print current URL
// TODO: Navigate back
// TODO: Print URL after going back
// TODO: Click on "WebDriver Example Page"
// TODO: Print current URL
// TODO: Enter value 20 in number input
// TODO: Verify 'two, zero' message appears


    WebDriver driver;
    String url = "https://testpages.herokuapp.com/styled/index.html";

    @BeforeEach
    void setUp() {
        driver = new ChromeDriver();
        driver.get(url);

    }

    @Test
    void testnavigation() {
        String url = "https://testpages.herokuapp.com/styled/index.html";
        driver.get(url);
        driver.findElement(By.linkText("Locators - Find By Playground Test Page")).click();
        System.out.println("Current URL"+driver.getCurrentUrl());

        driver.navigate().back();
        System.out.println(" URL after going back"+driver.getCurrentUrl());

        driver.findElement(By.linkText("WebDriver Example Page")).click();
        System.out.println("Webdriver page url"+driver.getCurrentUrl());


        WebElement numberInput = driver.findElement(By.id("numentry"));
        Assertions.assertTrue(numberInput.isDisplayed());
        numberInput.sendKeys("20");
        numberInput.sendKeys(Keys.ENTER);


        WebElement massege = driver.findElement(By.id("message"));
        Assertions.assertTrue(massege.getText().contains("two, zero"));

    }

    @AfterEach
    void tearDown() {
        driver.quit();

    }
}
