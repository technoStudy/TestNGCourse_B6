package Day6;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametrizedTestClass {

    @Test
    @Parameters({"item"})
    public void test(String item) {
        System.out.println(item);
    }

}
