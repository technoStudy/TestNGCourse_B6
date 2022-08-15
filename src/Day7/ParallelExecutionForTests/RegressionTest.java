package Day7.ParallelExecutionForTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegressionTest {

    @Test
    public void navigateGoogle() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Library/Selenium/chromedriver/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/");

        Thread.sleep(5000);

        Assert.assertTrue(driver.getCurrentUrl().contains("google"));

        driver.quit();

    }

}
