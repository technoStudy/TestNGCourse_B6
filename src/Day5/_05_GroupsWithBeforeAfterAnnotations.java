package Day5;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class _05_GroupsWithBeforeAfterAnnotations {

    @BeforeMethod(alwaysRun = true)
    public void beforeMethod() {
        System.out.println("Before Method");
    }

    @AfterMethod(alwaysRun = true)
    public void afterMethod() {
        System.out.println("After Method");
    }

    @Test(groups = "Regression")
    public void test1() {
        System.out.println("Test 1");
    }

    @Test(groups = "SmokeTest")
    public void test2() {
        System.out.println("Test 2");
    }

}
