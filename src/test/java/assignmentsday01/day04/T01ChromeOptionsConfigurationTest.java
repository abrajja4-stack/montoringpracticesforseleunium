package assignmentsday01.day04;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class T01ChromeOptionsConfigurationTest {
    /*
    Task: Create a test method that opens a browser with the following configurations:
    Maximize window on startup
    Disable extensions
    Run in incognito mode
    Disable infobars Navigate to "https://www.example.com" and verify the title contains "Example"
     */

    WebDriver driver;

    @BeforeEach
    void setUp() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("disable-extensions ");
        //options.addArguments("--headless");
        options.addArguments("incognito");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    @AfterEach
    void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
    @Test
    void chromeOptionsTest() {
        driver.get("http://www.bestbuy.com");
        //WebElement bestBuyLogo1 = driver.findElement(By.xpath("//div[@lang='en']//img[@class='logo']"));
        //Assertions.assertTrue(bestBuyLogo1.isDisplayed());
    }

    }

