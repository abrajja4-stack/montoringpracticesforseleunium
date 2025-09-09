package assignmentsday01.day04;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class T02CheckboxInteraction {
    /*
    Task: Go to "https://the-internet.herokuapp.com/checkboxes"-----done
.   Write a method that:

    Checks the current state of both checkboxes
    Ensures both checkboxes are selected (click only if not already selected)
    Verify both checkboxes are checked after the operations
    Print the status of each checkbox to console */
   WebDriver driver;

    @Test
    void chack() {

        String url = "https://the-internet.herokuapp.com/checkboxes";

        By checkBox1ByXpath = By.xpath("//input[@type='checkbox'][1]");
        By checkBox2ByXpath = By.xpath("//input[@type='checkbox'][2]");
       By checkBoxesByXpath = By.xpath("//input[@type='checkbox']");
        //Go to "https://the-internet.herokuapp.com/checkboxes"
        driver.get(url);
        WebElement checkBox1 = driver.findElement(checkBox1ByXpath);
        WebElement checkBox2 = driver.findElement(checkBox2ByXpath);
        if (!checkBox1.isSelected()){;
            checkBox1.click();
        }


        if (!checkBox2.isSelected()){
            checkBox2.click();
        }



        List<WebElement> checkBoxList = driver.findElements(checkBoxesByXpath);

        for (WebElement checkBox : checkBoxList){
            Assertions.assertTrue(checkBox.isSelected());
        }
        checkBoxList.forEach(t-> System.out.println(t.isSelected()));








    }




    @BeforeEach
    void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterEach
    void tearDown() throws InterruptedException {
        Thread.sleep(3000);

        driver.quit();
    }

}