package assignmentsday01.day07;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import utilities.TestBase;

public class T06DropdownHandling extends TestBase {

     /*
 Go to https://claruswaysda.github.io/Dropdowns.html
 In 1. Traditional Dropdown select 'Ford'
 In 2. Multi-Select Dropdown select 'Mercedes'
 In 3. Custom Dropdown (Bootstrap-like) select 'BMW'
 In 4. Static Auto-Suggest Dropdown select 'Tesla Model 3'
 In 5. Dynamic Auto-Suggest Dropdown select 'Toyota'
 */
    String url = "https://claruswaysda.github.io/Dropdowns.html";

    @Test
    void select() {
         driver.get(url);

        Select select = new Select(driver.findElement(By.xpath("//select[@id=\"carSelect\"]")));
        select.selectByVisibleText("Ford");
        driver.findElement(By.xpath("//select[@id=\"multiCarSelect\"]"));
        select.selectByIndex(4);
        driver.findElement(By.xpath("//div[@id=\"customDropdown\"]")).click();
        driver.findElement(By.xpath("//div[@class=\"custom-dropdown\"][2]")).click();
        driver.findElement(By.xpath("//input[@id=\"staticInput\"]")).sendKeys("Tesla Model 3");
        driver.findElement(By.xpath("//input[@id=\"dynamicInput\"]")).sendKeys("Toyota");


    }
}
