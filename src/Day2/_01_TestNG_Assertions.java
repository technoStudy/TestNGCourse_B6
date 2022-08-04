package Day2;

import org.testng.Assert;
import org.testng.annotations.Test;

public class _01_TestNG_Assertions {

    @Test
    public void assertEquals() {

        String expected = "Hello";
        String actual = "Hello";

        Assert.assertEquals(actual, expected);

    }

    @Test
    public void assertEquals2() {

        String expected = "Hello";
        String actual = "hello";

        Assert.assertEquals(actual, expected, "Actual result should be equal to Expected result!");

    }

    @Test
    public void assertEquals3() {

        String[] expected = {"Hello", "Twenty"};
        String[] actual = {"Twenty", "Hello"};

        Assert.assertEquals(actual, expected, "Actual result should be equal to Expected result!");

    }

}
