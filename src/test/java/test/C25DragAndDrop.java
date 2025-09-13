package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.TestBase;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C25DragAndDrop extends TestBase {
    /*
     Go to URL: http://demo.guru99.com/test/drag_drop.html
    Drag and drop the BANK button to the Account section in DEBIT SIDE
    Drag and drop the SALES button to the Account section in CREDIT SIDE
    Drag and drop the 5000 button to the Amount section in DEBIT SIDE
    Drag and drop the second 5000 button to the Amount section in CREDIT SIDE
    Verify the visibility of Perfect text.
     */
    String url = "http://demo.guru99.com/test/drag_drop.html";
    By bankButtonBy = By.id("credit2");
    By salesButtonBy = By.id("credit1");
    By fiveThousandsButton1By = By.xpath("//li[@id='fourth'][1]");
    By fiveThousandsButton2By = By.xpath("//li[@id='fourth'][2]");
    By debitAccountFieldBy = By.id("bank");
    By creditAccountFieldBy = By.id("loan");
    By debitAmountFieldBy = By.id("amt7");
    By creditAmountFieldBy = By.id("amt8");
    By successBy = By.xpath("//a[@class='button button-green'][.='Perfect!']");

    @Test
    void test() {
        //SOURCES




        // Go to URL: http://demo.guru99.com/test/drag_drop.html
        driver.get(url);
        //SOURCES
        WebElement bank = driver.findElement(bankButtonBy);
        WebElement sales = driver.findElement(salesButtonBy);
        WebElement fiveThousands1 = driver.findElement(fiveThousandsButton1By);
        WebElement fiveThousands2 = driver.findElement(fiveThousandsButton2By);

        //target
        WebElement debitAccount = driver.findElement(debitAccountFieldBy);
        WebElement creditAccount = driver.findElement(creditAccountFieldBy);
        WebElement debitAmount = driver.findElement(debitAmountFieldBy);
        WebElement creditAmount = driver.findElement(creditAmountFieldBy);
        //Drag and drop the BANK button to the Account section in DEBIT SIDE
        Actions actions = new Actions(driver);
actions
        .dragAndDrop(bank,debitAccount)//Drag and drop the BANK button to the Account section in DEBIT SIDE
        .dragAndDrop(sales,creditAccount) //Drag and drop the SALES button to the Account section in CREDIT SIDE
        .dragAndDrop(fiveThousands1,debitAmount)//Drag and drop the 5000 button to the Amount section in DEBIT SIDE
        .dragAndDrop(fiveThousands2,creditAmount)//Drag and drop the second 5000 button to the Amount section in CREDIT SIDE
        .perform();




        //Verify the visibility of Perfect text.
        Assertions.assertTrue(driver.findElement(successBy).isDisplayed());
    }
}