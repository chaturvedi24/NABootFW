package appTesting;

import appCodes.AppforTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Junit_AppTest {

    AppforTest atest = new AppforTest();

    @Test
    public void testSum() {
        int res;
        res = atest.sumNbrs(1, 2);
        Assertions.assertEquals(res, 4,"sum mismatch");
        System.out.println("@Test1 method");
    }

    @Test
    public void test2() { //write and practice for the addString to pass and fail
        System.out.println("@Test2 method");
    }

    @Test
    public void test3() { //write and practice for the getArray to pass and fail
        System.out.println("@Test3 method");
    }
}
