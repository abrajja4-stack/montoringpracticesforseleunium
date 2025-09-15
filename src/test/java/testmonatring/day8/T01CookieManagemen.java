package testmonatring.day8;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.Cookie;
import utilities.TestBase;

import java.util.Set;

public class T01CookieManagemen extends TestBase {
    /*
 Go to https://claruswaysda.github.io/CookiesWait.html
 Accept the alert if it is present
 Print the cookies
 Delete all cookies and assert
 */
String url = "https://claruswaysda.github.io/CookiesWait.html";
    @Test
    void cookies() {
        driver.get(url);
        // Accept the alert if it is present
        try {
            driver.switchTo().alert().accept();
        } catch (Exception e) {
            System.out.println("No alert present");

            Set<Cookie> cookies = driver.manage().getCookies();
            System.out.println("Cookies: " + cookies);
            driver.manage().deleteAllCookies();
            Set<Cookie> cookiesAfterDeletion = driver.manage().getCookies();
            System.out.println("Cookies after deletion: " + cookiesAfterDeletion);

    }
    }}
