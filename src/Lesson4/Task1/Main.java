package Lesson4.Task1;

import static Lesson4.Task1.Cycle.сycle;

public class Main {

    /**
     * Создать три потока,
     * каждый из которых выводит определенную букву (A, B и C)
     * 5 раз (порядок – ABСABСABС).
     * Используйте wait/notify/notifyAll.
     */

    private static final Object obj = new Object();
    protected static volatile char aChar = 'A';


    public static class myThread {

        // что то затупил, не могу сообразить как метод сделать потока. Требуется помощь.

//        public static void myThread (Thread nameThread, Thread thread) {
//
//            nameThread = new Thread(new Runnable() {
//                @Override
//                public void run() {
//                    try {
//                        thread.getName();
//
//                    } catch (Exception e) {
//                        e.printStackTrace();
//                    }
//                }
//            });
//        }

        public static void main(String[] args) throws InterruptedException {

            myThread m = new myThread();

            Thread t1 = new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        m.printCharA();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
            });
            Thread t2 = new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        m.printCharB();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
            Thread t3 = new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        m.printCharC();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });


            t1.start();
            t2.start();
            t3.start();

        }


        public void printCharA() throws InterruptedException {

            сycle(obj, 'A', 'B');

        }

        public void printCharB() throws InterruptedException {

            сycle(obj, 'B', 'C');

        }

        public void printCharC() throws InterruptedException {

            сycle(obj, 'C', 'A');

        }
    }
}



