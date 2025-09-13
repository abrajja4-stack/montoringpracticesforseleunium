package assignmentsday01.day06;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

public class T06JqueryEmojiPicke  extends TestBase{
    //Go to https://www.jqueryscript.net/demo/Easy-iFrame-based-Twitter-Emoji-Picker-Plugin-jQuery-Emoojis/
         //   1. Maximize the website
//2. Click on the second emoji
//3. Click on all second emoji items
//4. Return to the parent iframe
//5. Fill out the form and press the apply button

    Faker faker = new Faker();
    @Test
    void Picke() {
        driver.get("https://www.jqueryscript.net/demo/Easy-iFrame-based-Twitter-Emoji-Picker-Plugin-jQuery-Emoojis/");
        //   1. Maximize the website
        driver.manage().window().maximize();
        //2. Click on the second emoji
        driver.switchTo().frame(driver.findElement(By.id("emoojis")));
        //span[@style="left: 68.3333px; margin-left: -52px; top: 58px;"]
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/a[2]/span[2]")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/img[2]")).click();
        //4. Return to the parent iframe
        driver.switchTo().parentFrame();
        //5. Fill out the form and press the apply button
        driver.findElement(By.id("text")).sendKeys(faker.lorem().word());
        driver.findElement(By.id("smiles")).sendKeys(faker.lorem().word());
        driver.findElement(By.id("nature")).sendKeys(faker.lorem().word());
        driver.findElement(By.id("food")).sendKeys(faker.lorem().word());
        driver.findElement(By.id("activities")).sendKeys(faker.lorem().word());
        driver.findElement(By.id("places")).sendKeys(faker.lorem().word());
        driver.findElement(By.id("objects")).sendKeys(faker.lorem().word());
        driver.findElement(By.id("symbols")).sendKeys(faker.lorem().word());
        driver.findElement(By.id("flags")).sendKeys(faker.lorem().word());
        driver.findElement(By.id("hide")).sendKeys(faker.lorem().word());
        driver.findElement(By.id("active")).sendKeys(faker.lorem().word());
        driver.findElement(By.id("send")).click();
       // String result = driver.findElement(By.id("code")).getText();

        //System.out.println("result = " + result);
    }
}
