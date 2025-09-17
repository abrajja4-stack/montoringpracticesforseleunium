package testmonatring.day10;

import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;
import utilities.TestBase2;

import java.awt.*;

public class T02CalculateTableTotal  extends TestBase2 {
 /*
 Go to https://claruswaysda.github.io/webTable.html
 Calculate and assert the total price in Table 2.
 */

    @Test
    void name() {
        driver.get("https://claruswaysda.github.io/webTable.html");
        logger.info("claruswaysda  web site is opened......");
        // Calculate and assert the total price in Table 2.
        java.util.List<WebElement> price= driver.findElements(By.xpath("//table[2]//td[3]"));
        int total = 0;
     for (int i=0; i< price.size();i++){
         String prc= price.get(i).getText();
         prc=prc.replace("$","");
         total+=Integer.parseInt(prc);
     }
        System.out.println("Total Price: "+total);




    }
}
