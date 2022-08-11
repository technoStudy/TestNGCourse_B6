package Day5;

import org.testng.annotations.*;

public class _01_TestNGXMLAnnotations {

    @BeforeSuite
    public void beforeSuiteMethod() {
        System.out.println("Before Suite");
    }

    @BeforeTest
    public void beforeTestMethod() {
        System.out.println("Before Test");
    }

    @Test
    public void test() {
        System.out.println("This is actual Test!");
    }

    @AfterTest
    public void afterTestMethod() {
        System.out.println("After Test");
    }

    @AfterSuite
    public void afterSuiteMethod() {
        System.out.println("After Suite");
    }

}
