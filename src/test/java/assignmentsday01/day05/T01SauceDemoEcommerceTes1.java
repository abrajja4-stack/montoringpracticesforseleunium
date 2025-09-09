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
import java.util.List;

public class T01SauceDemoEcommerceTes1 {
   /* Given: Go to https://www.saucedemo.com/---done
    When: Enter username as "standard_user"
    And: Enter password as "secret_sauce"
    And: Click login button
    And: Order products by "Price (low to high)"
    Then: Assert last product costs $49.99, first product costs $7.99
*/

WebDriver driver;
String url="https://www.saucedemo.com/";

  By usernameById = By.id("user-name") ;
By userpassByid = By.id("password");
By LoginBotton = By.id("login-button");
//By Drobdowen = By.cssSelector("product_sort_container");
String name ="standard_user" ;
String Pasword = "secret_sauce";
    String visibleText = "Price (low to high)";
    By dropDownByCss = By.cssSelector(".product_sort_container");
    By priceByXpath = By.xpath("//div[@class='inventory_item_price']");









    @Test
    void name() {
         // Given: Go to https://www.saucedemo.com/
    driver.get(url);
    driver.findElement(usernameById).sendKeys(name);
    driver.findElement(userpassByid).sendKeys(Pasword);
    driver.findElement(LoginBotton).click();

        Select select = new Select(driver.findElement(dropDownByCss ));
        select.selectByVisibleText(visibleText);


        List<WebElement> priceList= driver.findElements(priceByXpath);

        Assertions.assertEquals("7.99",priceList.get(0).getText().substring(1));
        Assertions.assertEquals("$49.99",priceList.getLast().getText());
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

