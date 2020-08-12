package Lesson7.Task1;

public class MyClass {

    @BeforeSuite
    public void start() {
        System.out.println("srart");
    }

    @Test(priority = 1)
    public void test1() {
        System.out.println("test1");
    }

    @Test(priority = 2)
    public void test2() {
        System.out.println("test2");
    }

    @Test(priority = 9)
    public void test3() {
        System.out.println("test3");
    }

    @Test(priority = 4)
    public void test4() {
        System.out.println("test4");
    }

    public void method() {
        System.out.println("method");
    }


    @AfterSuite
    public void stop() {
        System.out.println("stop");
    }

}
