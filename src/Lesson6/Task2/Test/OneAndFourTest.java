package Lesson6.Task2.Test;

import Lesson6.Task2.IsOneAndFour;
import org.junit.Assert;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static Lesson6.Task2.IsOneAndFour.isOneAndFour;

@RunWith(Parameterized.class)

public class OneAndFourTest {

    IsOneAndFour isOneAndFour;
    private int[] arr;
    private boolean result;

    public OneAndFourTest (int[] arr, boolean result) {
        this.arr = arr;
        this.result = result;
    }

    @Parameterized.Parameters

    //public class OneAndFourTest
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{

                {new int[]{1, 3, 4, 2}, true},
                {new int[]{1, 3, 0, 2}, false},
                {new int[]{0, 3, 4, 2}, false},
                {new int[]{0, 3, 0, 2}, false},

        });
    }

    @Before
    public void start() {
        isOneAndFour = new IsOneAndFour();
    }

    @org.junit.Test
    public void test (){
        Assert.assertTrue(String.valueOf(isOneAndFour(arr)), result);
            }

    @org.junit.Test
    public void testTemp() {
        Assert.assertEquals(isOneAndFour(arr), result);
    }
}



