package Lesson6.Task1.Teast;

import Lesson6.Task1.MethodAfterFour;
import org.junit.Assert;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static Lesson6.Task1.MethodAfterFour.methodAfterFour;

@RunWith(Parameterized.class)

public class Test {

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{

                {new int[]{1, 2, 4, 4, 2, 3, 4, 1, 7}, new int [] {1,7}},
                {new int[]{1, 2, 4, 8, 2, 3, 0, 1, 7}, new int []{ 8, 2, 3, 0, 1, 7}},
                {new int[]{1, 2, 4, 0, 2, 3, 12, 1, 7}, new int []{ 0, 2, 3, 12, 1, 7}}

        });

    }
    private int [] arr;
    private int [] arrResult;

    public Test(int[] arr, int[] arrResult) {
        this.arr = arr;
        this.arrResult = arrResult;
    }

    MethodAfterFour methodAfterFour;

    @Before
    public void init (){
        methodAfterFour = new MethodAfterFour();

    }

    @org.junit.Test
    public void test () {
        Assert.assertArrayEquals (arrResult, methodAfterFour(arr));
    }

    @org.junit.Test(expected = RuntimeException.class)
    public void testEx() {
        methodAfterFour(new int[]{1, 2, 0, 0, 2, 3, 12, 1, 7});
    }

}
