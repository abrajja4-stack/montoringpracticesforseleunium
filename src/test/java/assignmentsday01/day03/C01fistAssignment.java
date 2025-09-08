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

import java.time.Duration;

public class C01fistAssignment {
    WebDriver driver;
    // TODO: Locate username using absolute XPath
    // TODO: Locate username using relative XPath
    // TODO: Locate password using both methods
    // TODO: Locate login button using both methods

    @BeforeEach
    void setUp() {
        // Navigate to: https://opensource-demo.orangehrmlive.com/
        driver = new ChromeDriver();//load browser
        driver.manage().window().maximize();//max size
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//wating until all element laod
        driver.get("https://opensource-demo.orangehrmlive.com/");//go to thes locition
    }

    @Test
    void absoltuXpathTest() {
        WebElement usernameab = driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input"));
        Assertions.assertTrue(usernameab.isDisplayed());
        WebElement userpassab = driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input"));
        Assertions.assertTrue(userpassab.isDisplayed());
        //usernameab.sendKeys("Admin");
        //userpassab.sendKeys("admin123", Keys.ENTER);
        WebElement bottonab = driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
        Assertions.assertTrue(bottonab.isDisplayed());
        
    }

    @Test
    void relativeXPathTest() {
        WebElement usernamerv  = driver.findElement(By.xpath("//input[@name='username']"));
        Assertions.assertTrue(usernamerv.isDisplayed());
        WebElement userpassrv  = driver.findElement(By.xpath("//input[@placeholder='password']"));
        Assertions.assertTrue(userpassrv.isDisplayed());
        //usernamerv.sendKeys("Admin");
        //userpassrv.sendKeys("admin123", Keys.ENTER);
        WebElement bottonrv  = driver.findElement(By.xpath("//button[@type='submit']"));
        Assertions.assertTrue(bottonrv.isDisplayed());
    }

    @AfterEach
    void tearDown() {
        driver.close();
        driver.quit();

    }


}
