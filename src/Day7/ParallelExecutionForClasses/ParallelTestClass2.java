package Day7.ParallelExecutionForClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ParallelTestClass2 {

    @Test
    public void navigateFacebook() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Library/Selenium/chromedriver/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com/");

        Thread.sleep(5000);

        Assert.assertTrue(driver.getCurrentUrl().contains("facebook"));

        driver.quit();

    }

}
