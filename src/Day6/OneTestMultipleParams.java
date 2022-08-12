package Day6;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class OneTestMultipleParams {

    @Test
    @Parameters({"parameter1", "parameter2"})
    public void test(String s1, String s2) {
        System.out.println(s1);
        System.out.println(s2);
    }

    @Test
    public void test2() {
        System.out.println("Hello Helooooo");
    }

}
