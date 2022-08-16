package Day7.ParallelExecutionForMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ParallelTestForMethods {

    @Test
    public void navigateGoogle() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Library/Selenium/chromedriver/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/");

        Thread.sleep(5000);

        Assert.assertTrue(driver.getCurrentUrl().contains("google"));

        driver.quit();

    }

    @Test
    public void navigateFacebook() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Library/Selenium/chromedriver/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com/");

        Thread.sleep(5000);

        Assert.assertTrue(driver.getCurrentUrl().contains("facebook"));

        driver.quit();

    }

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

    @Test
    public void test2() throws InterruptedException {

        String expectedURL = "https://techno.study/sdet";

        System.setProperty("webdriver.chrome.driver", "/Library/Selenium/chromedriver/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://techno.study/");

        WebElement sdetCourseButton = driver.findElement(By.xpath("//a[text()='SDET course']"));
        sdetCourseButton.click();

        Thread.sleep(5000);

        String actualURL = driver.getCurrentUrl();

        Assert.assertEquals(actualURL, expectedURL);

        driver.quit();

    }

}
