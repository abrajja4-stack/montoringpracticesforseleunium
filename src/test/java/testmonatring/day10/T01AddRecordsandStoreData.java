package testmonatring.day10;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilities.TestBase2;

import java.util.Arrays;
import java.util.List;

public class T01AddRecordsandStoreData  extends TestBase2 {
 /*
 Go to https://claruswaysda.github.io/addRecordWebTable.html
 Add 10 records.
 Store the name, age, and country columns in separate arrays (not ArrayList).
 */

    @Test
    void name() {
        // Go to https://claruswaysda.github.io/addRecordWebTable.html
        driver.get("https://claruswaysda.github.io/addRecordWebTable.html");
        logger.info("claruswaysda  web site is opened......");
        // Add 10 records.
        logger.info("Adding 10 recorda........");
        for (int i = 0; i < 10; i++) {
            actionHelper.sendKeys(By.id("nameInput"), Faker.instance().name().firstName());
            actionHelper.sendKeys(By.id("ageInput"), (Faker.instance().number().numberBetween(18, 50) + ""));
            Select select = new Select(actionHelper.findElement(By.id("countrySelect")));
            int idx = Faker.instance().number().numberBetween(1, 5);
            select.selectByIndex(idx);
            actionHelper.click(By.xpath("//button[@onclick=\"addRecord()\"]"));


        }
        //Store the name, age, and country columns in separate arrays (not ArrayList).
        List<WebElement> nameList = driver.findElements(By.xpath("//table//td[1]"));


        String[] nameArr = new String[nameList.size()];
        for (int i = 0; i < nameList.size(); i++) {
            nameArr[i] = nameList.get(i).getText();
        }

        List<WebElement> ageList = driver.findElements(By.xpath("//table//td[2]"));
        String[] ageArr = new String[ageList.size()];
        for (int i = 0; i < ageList.size(); i++) {
            ageArr[i] = ageList.get(i).getText();
        }


        List<WebElement> countryList = driver.findElements(By.xpath("//table//td[3]"));
        String[] countryArr = new String[countryList.size()];
        for (int i = 0; i < ageList.size(); i++) {
            countryArr[i] = ageList.get(i).getText();
        }
        System.out.println("Names: ");
        for (String name : nameArr) {
            System.out.print(name + " ");
        }
            System.out.println(Arrays.asList(countryArr));
            System.out.println(Arrays.asList(ageArr));
        }
    }
