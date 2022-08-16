package Day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginFunctionWithDataProvider {

    @Test(dataProvider = "LoginData")
    public void loginPositiveTest(String username, String password) {

        System.setProperty("webdriver.chrome.driver", "/Library/Selenium/chromedriver/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("http://opencart.abstracta.us/index.php?route=common/home");

        WebElement myAccountButton = driver.findElement(By.xpath("//a[@title='My Account']"));
        myAccountButton.click();

        WebElement loginButton = driver.findElement(By.linkText("Login"));
        loginButton.click();

        WebElement usernameInput = driver.findElement(By.id("input-email"));
        usernameInput.sendKeys(username);

        WebElement passwordInput = driver.findElement(By.id("input-password"));
        passwordInput.sendKeys(password);

        WebElement submitLoginButton = driver.findElement(By.xpath("//input[@type='submit']"));
        submitLoginButton.click();

        Assert.assertTrue(driver.findElement(By.xpath("//h2[text()='My Account']")).isDisplayed());

        driver.quit();

    }

    @DataProvider(name = "LoginData")
    public Object[][] loginTestDataProvider() {

        return new Object[][] { {"test@technostudy.com", "Test12345.."}, {"test@testblah.com", "123456789"} };

    }

}
