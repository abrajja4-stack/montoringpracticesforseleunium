package assignmentsday01.day05;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class CalculatorOperationsTest1 {
    //   Go to https://testpages.eviltester.com/styled/calculator
    //   Type any number in first and second input
    //   Click Calculate for each operation
    //   Get and verify results for all operations

    WebDriver driver;
    String URL="https://testpages.eviltester.com/styled/calculator";
    String num1 = "66";
    String num2 = "77";
    String []operatoin = {"plus","times","minus","divide"};
    By namder1 = By.id("number1");
    By namder2 = By.id("number2");
    By operationDrob = By.id("function");
    By calculate = By.id("calculate");
    By resultByid = By.id("answer");

    @Test
    void calcuatertest() {
        //   Go to https://testpages.eviltester.com/styled/calculator
        driver.get(URL);
        //   Type any number in first and second input
        driver.findElement(namder1).sendKeys(num1);
        driver.findElement(namder2).sendKeys(num2);
        Select select = new Select(driver.findElement(operationDrob));

        //   Click Calculate for each operation
        for (int i = 0; i<operatoin.length; i++){
            select.selectByIndex(i);
            driver.findElement(calculate).click();
            //WebElement operatinselackt = select.getFirstSelectedOption();
            WebElement OperationElament =new Select(driver.findElement(operationDrob)).getFirstSelectedOption();
           Double rusalt =  switch (OperationElament.getText()){
                case "plus" -> Double.parseDouble(num1) + Double.parseDouble(num2);
                case "times" -> Double.parseDouble(num1) * Double.parseDouble(num2);
                case "minus" -> Double.parseDouble(num1) - Double.parseDouble(num2);
                case "divide" -> Double.parseDouble(num1) / Double.parseDouble(num2);
               default -> null;
            };

            Assertions.assertEquals(String.valueOf(rusalt),driver.findElement(resultByid).getText()+".0");
        }

        //   Get and verify results for all operations



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
