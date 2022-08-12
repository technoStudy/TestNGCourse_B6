package Day5;

import org.testng.annotations.Test;

public class _04_SecondGroups {


    @Test(priority = 1)
    public void Test1() {
        System.out.println("Test 1");
    }

    @Test(groups = "SmokeTest", priority = 3)
    public void Test2() {
        System.out.println("Test 2");
    }

    @Test(groups = "Regression", priority = 5)
    public void Test3() {
        System.out.println("Test 3");
    }

    @Test(groups = "SmokeTest", priority = 2)
    public void Test4() {
        System.out.println("Test 4");
    }

    @Test(groups = "Regression", priority = 7)
    public void Test5() {
        System.out.println("Test 5");
    }

    @Test(groups = "SmokeTest", priority = 4)
    public void Test6() {
        System.out.println("Test 6");
    }

    // You can add 1 test in multiple groups
    @Test(groups = {"Regression", "SmokeTest"}, priority = 6)
    public void Test7() {
        System.out.println("Test 7");
    }

}
