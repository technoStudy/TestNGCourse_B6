package Day2;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Random;

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

    @Test
    public void assertNotEquals() {

        String expected = "Hello";
        String actual = "Bye";

        Assert.assertNotEquals(actual, expected);

    }

    @Test
    public void assertEqualsNoOrder() {

        String[] expected = {"Hello", "Twenty"};
        String[] actual = {"Twenty", "Hello"};

        Assert.assertEqualsNoOrder(actual, expected, "Actual result should be equal to Expected result!");

    }

    @Test
    public void assertSame() {

        String[] expected = {"TechnoStudy"};
        String[] actual = {"TechnoStudy"};

        Assert.assertSame(actual, expected);

    }

    @Test
    public void assertSame2() {

        String[] expected = {"TechnoStudy"};
        String[] actual = expected;

        Assert.assertSame(actual, expected);

    }

    @Test
    public void assertNotSame() {

        String[] expected = {"TestNG"};
        String[] actual = {"TestNG"};

        Assert.assertNotSame(actual, expected);

    }

    @Test
    public void assertNull() {

        String nullString = null;

        Assert.assertNull(nullString);

    }

    @Test
    public void assertNotNull() {

        String str = "Hey";

        Assert.assertNotNull(str);

    }

    public boolean isDataAvailable() {

        Random rnd = new Random();
        return rnd.nextBoolean();

    }

    @Test
    public void assertTrue() {

        boolean actual = isDataAvailable();

        Assert.assertTrue(actual);

    }

    @Test
    public void assertFalse() {

        boolean actual = isDataAvailable();

        Assert.assertFalse(actual);

    }

}
