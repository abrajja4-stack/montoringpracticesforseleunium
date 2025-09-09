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

public class T02OldStyleSelectMenu {
    //Launch browser
    //Open https://demoqa.com/select-menu
    //Select Old Style Select Menu using element id
    //Print all dropdown options
    //Select 'Purple' using index
    //Select 'Magenta' using visible text
    //Select an option using value
    //Close browse
    WebDriver driver;
    String url ="https://demoqa.com/select-menu";
    By oldstyle = By.id("oldSelectMenu");


    @Test
    void test() {
        driver.get(url);
        WebElement dropdownElement = driver.findElement(oldstyle);
        Select select = new Select(dropdownElement);

        //Print all dropdown options
        select.selectByValue("red");
        System.out.println(select.getFirstSelectedOption().getText());
        select.selectByIndex(1);
        System.out.println(select.getFirstSelectedOption().getText());
        select.selectByIndex(2);
        System.out.println(select.getFirstSelectedOption().getText());
        select.selectByIndex(3);
        System.out.println(select.getFirstSelectedOption().getText());
        select.selectByIndex(4);
        System.out.println(select.getFirstSelectedOption().getText());
        select.selectByIndex(5);
        System.out.println(select.getFirstSelectedOption().getText());
        select.selectByIndex(6);
        System.out.println(select.getFirstSelectedOption().getText());
        select.selectByIndex(7);
        System.out.println(select.getFirstSelectedOption().getText());
        select.selectByIndex(8);
        System.out.println(select.getFirstSelectedOption().getText());
        select.selectByIndex(9);
        System.out.println(select.getFirstSelectedOption().getText());
        select.selectByIndex(10);
        System.out.println(select.getFirstSelectedOption().getText());
        //Select 'Purple' using index
         select.selectByIndex(4);
        System.out.println(select.getFirstSelectedOption().getText());
        //Select 'Magenta' using visible text
        select.selectByVisibleText("Magenta");
        System.out.println(select.getFirstSelectedOption().getText());
        //Select an option using value
        select.selectByValue("6");
        System.out.println(select.getFirstSelectedOption().getText());
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
