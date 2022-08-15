package Day7.ParallelExecutionForClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ParallelTestClass3 {

    @Test
    public void test1() throws InterruptedException {

        String expectedURL = "https://techno.study/";

        System.setProperty("webdriver.chrome.driver", "/Library/Selenium/chromedriver/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://techno.study/");

        Thread.sleep(5000);

        String actualURL = driver.getCurrentUrl();

        // each test should have at least 1 Assertion (Validation)
        Assert.assertEquals(actualURL, expectedURL);

        driver.quit();

    }

}
