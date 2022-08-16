package Day8;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class _01_DataProviderIntro {

    @Test(dataProvider = "TestData")
    public void test1(String testData) {
        System.out.println(testData);
    }

    @DataProvider(name = "TestData")
    public Object [][] testDataProvider() {

        return new Object[][] { {"Test1"}, {"Test2"}, {"Test3"}, {"Test4"} };

    }



    // *********************************************



    @Test(dataProvider = "NameProvider")
    public void printFullName(String firstName, String lastName, String homeTown) {

        System.out.println("FirstName: " + firstName + " LastName: " + lastName + " HomeTown: " + homeTown);

    }


    @DataProvider(name = "NameProvider")
    public Object[][] fullNameProvider() {

        return new Object[][] { {"Mark", "Russo", "Paris"}, {"Emily", "Frank", "New York"}, {"Fernando", "Torres", "Madrid"} };

    }

}
