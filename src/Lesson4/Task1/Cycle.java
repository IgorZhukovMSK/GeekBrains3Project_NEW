package Lesson4.Task1;

public class Cycle extends Main {

    public static void сycle(Object obj, char a, char b) throws InterruptedException {

        synchronized (obj) {
            for (int i = 0; i < 5; i++) {
                while (aChar != a) {
                    obj.wait();
                }
                System.out.print(a);
                aChar = b;
                obj.notifyAll();

            }
        }
    }
}
