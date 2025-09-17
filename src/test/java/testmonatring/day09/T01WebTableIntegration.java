package testmonatring.day09;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilities.TestBase;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class T01WebTableIntegration extends TestBase {
   // Objective: Go to https://claruswaysda.github.io/addRecordWebTable.html and add 10 records to the
   // table by taking data (Name, Age, Country) from Excel.
   String url = "https://claruswaysda.github.io/addRecordWebTable.html";
    @Test
    void name() throws IOException {
        String [][] contacts = new String[10][3];
        List<String> nameList = new ArrayList<>();
        List<String> ageList = new ArrayList<>();
        List<String> countryList = new ArrayList<>();
            // Create an object of FileInputStream class to read Excel file.
        Workbook workBook;
        try (FileInputStream fis = new FileInputStream(Path.of(System.getProperty("user.dir"),"resources", "Countries.xlsx").toString())) {
            workBook = WorkbookFactory.create(fis);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


        Sheet sheet = workBook.getSheetAt(0);

        for (int i=1; i<=sheet.getLastRowNum();i++) {
            String [] contactArr = new String[3];
            Row row = sheet.getRow(i);

            contactArr[0] =row.getCell(0).toString();
            contactArr[1] =row.getCell(1).toString();
            contactArr[2] =row.getCell(2).toString();

            contacts[i-1] =contactArr;
        }
        workBook.close();
        System.out.println(Arrays.deepToString(contacts));

        driver.get("https://claruswaysda.github.io/addRecordWebTable.html");

        for (int i = 0; i < contacts.length; i++) {
            WebElement nameInput = driver.findElement(By.id("nameInput"));
            WebElement ageInput = driver.findElement(By.id("ageInput"));
            WebElement countryDropdown = driver.findElement(By.id("countrySelect"));
            WebElement addBtn = driver.findElement(By.xpath("//button[text()='Add Record']"));

            nameInput.clear();
            nameInput.sendKeys(contacts[i][0]);

            ageInput.clear();
            ageInput.sendKeys(contacts[i][1]);

            new Select(countryDropdown).selectByVisibleText(contacts[i][2]);

            addBtn.click();
        }




    }
}