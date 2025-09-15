package assignmentsday01.day05;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class T04MultSelectOperations1 {
    //Launch browser
    //Open https://demoqa.com/select-menu--done
    //Select Standard Multi-Select using element id---done
    //Verify element is multi-select---i dont understod


    //deselect all options
    //Close browser
    WebDriver driver;
    String url = "https://demoqa.com/select-menu";
By multiselect = By.id("cars");

    @Test
    void MULTI() {
      driver.get(url);
        WebElement dropdownElement = driver.findElement(multiselect);
        Select select =new Select(dropdownElement);

        select.selectByIndex(0);
        System.out.println(select.getFirstSelectedOption().getText());
        select.deselectAll();


        //Select 'Saab' using value, then deselect using value
        select.selectByValue("saab");
        System.out.println(select.getFirstSelectedOption().getText());
        select.deselectByValue("saab");





        select.selectByIndex(3);
        System.out.println(select.getFirstSelectedOption().getText());
        select.deselectAll();





        //Select 'Opel' using index, then deselect using index

        select.selectByIndex(2);
        System.out.println(select.getFirstSelectedOption().getText());
        select.deselectByIndex(2);











    }

    @BeforeEach
    void setUp() {
        driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }

    @AfterEach
    void tearDown() {
        driver.quit();
    }
}
