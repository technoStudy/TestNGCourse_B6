package Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AssertionTask {

    /**

     Test 1 - Validate click me button
        -Navigate to https://demoqa.com/buttons
        -Click on "click me" button
        -Validate displayed message after click is equal to "You have done a dynamic click"

     Test 2 - Validate right click me button
        -Navigate to https://demoqa.com/buttons
        -Click on "right click me" button
        -Validate displayed message after click is equal to "You have done a right click"

     Test 3 - Validate double click me button
        -Navigate to https://demoqa.com/buttons
        -Click on "double click me" button
        -Validate displayed message after click is equal to "You have done a double click"


     */

    WebDriver driver; // If we declare and initialize WebDriver inside setup() method we won't be able to access from test methods
                      // so we need to declare WebDriver as a global variable for this class so we can access from all methods!

    @BeforeMethod
    public void setup() {

        System.setProperty("webdriver.chrome.driver", "/Library/Selenium/chromedriver/chromedriver");

        driver = new ChromeDriver();

        driver.get("https://demoqa.com/buttons");

    }

    @Test
    public void clickMeButtonTest() {

        String expected = "You have done a dynamic click";

        WebElement clickMeButton = driver.findElement(By.xpath("//button[text()='Click Me']"));
        clickMeButton.click();

        WebElement dynamicClickMessage = driver.findElement(By.id("dynamicClickMessage"));
        String actual = dynamicClickMessage.getText();

        boolean isMessageDisplayed = dynamicClickMessage.isDisplayed();

        Assert.assertTrue(isMessageDisplayed);
        Assert.assertEquals(actual, expected);

        driver.quit();

    }

    @Test
    public void rightClickMeButtonTest() {

        String expected = "You have done a right click";

        Actions actions = new Actions(driver);

        WebElement rightClickMeButton = driver.findElement(By.id("rightClickBtn"));
        actions.contextClick(rightClickMeButton).perform();

        WebElement rightClickMessage = driver.findElement(By.id("rightClickMessage"));
        String actual = rightClickMessage.getText();

        boolean isMessageDisplayed = rightClickMessage.isDisplayed();

        Assert.assertTrue(isMessageDisplayed);
        Assert.assertEquals(actual, expected);

        driver.quit();

    }

    @Test
    public void doubleClickMeButtonTest() {

        String expected = "You have done a double click";

        Actions actions = new Actions(driver);

        WebElement doubleClickButton = driver.findElement(By.id("doubleClickBtn"));
        actions.doubleClick(doubleClickButton).perform();

        WebElement doubleClickMessage = driver.findElement(By.id("doubleClickMessage"));
        String actual = doubleClickMessage.getText();

        boolean isMessageDisplayed = doubleClickMessage.isDisplayed();

        Assert.assertTrue(isMessageDisplayed);
        Assert.assertEquals(actual, expected);

    }

    @AfterMethod
    public void tearDown() {

        driver.quit();

    }

}
