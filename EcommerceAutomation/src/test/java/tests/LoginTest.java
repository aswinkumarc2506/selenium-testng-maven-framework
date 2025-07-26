package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.LoginPage;

import java.time.Duration;

public class LoginTest {
    WebDriver driver;
    LoginPage loginPage;

    @BeforeClass
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aswin\\Downloads\\EcommerceAutomation\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.saucedemo.com/");
        loginPage = new LoginPage(driver);
    }


    @Test
    public void testLogin() {
        loginPage.enterUsername("standard_user");
        loginPage.enterPassword("secret_sauce");

        // ✅ Print the page source to check if the page loaded correctly
        System.out.println(driver.getPageSource());

        loginPage.clickLogin();
        Assert.assertTrue(driver.getCurrentUrl().contains("inventory"), "Login failed!");
    }


    @AfterClass
    public void teardown() {
        driver.quit();
    }
}
