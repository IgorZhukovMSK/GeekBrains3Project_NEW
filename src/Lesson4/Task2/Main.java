package Lesson4.Task2;

/**
 * Создать модель MFU (c возможность сканирования, печати и ксерокопии)
 */

public class Main {

    static final Object mfu = new Object();


    public static void main(String[] args) throws InterruptedException {

        User us1 = new User("V", "mfuPrinter");
        User us2 = new User("B", "mfuScanners");
        User us3 = new User("S", "mfuCopy");
        User us4 = new User("W", "mfuPrinter");

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {

            }
        });


        Thread threadUs1 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (mfu) {
                    if (us1.getMfu().equals("mfuPrinter")) {
                        System.out.println(String.format("Юзер %s подошел к МФУ и распечатал документ", us1.getName()));
                    } else if (us1.getMfu().equals("mfuScanners")) {
                        System.out.println(String.format("Юзер %s подошел к МФУ и сделал скан документа", us1.getName()));
                    } else {
                        System.out.println(String.format("Юзер %s подошел к МФУ и сделал копию документа", us1.getName()));
                    }
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(String.format("Юзер %s освободил МФУ", us1.getName()));
                }
            }
        });
        threadUs1.start();
        threadUs1.join();

        Thread threadUs2 = new Thread(new Runnable() {
            @Override
            public void run() {

                synchronized (mfu) {

                    if (us2.getMfu().equals("mfuPrinter")) {
                        System.out.println(String.format("Юзер %s подошел к МФУ и распечатал документ", us2.getName()));
                    } else if (us2.getMfu().equals("mfuScanners")) {
                        System.out.println(String.format("Юзер %s подошел к МФУ и сделал скан документа", us2.getName()));
                    } else {
                        System.out.println(String.format("Юзер %s подошел к МФУ и сделал копию документа", us2.getName()));
                    }

                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(String.format("Юзер %s освободил МФУ", us2.getName()));
                }
            }
        });
        threadUs2.start();
        threadUs2.join();

        Thread threadUs3 = new Thread(new Runnable() {
            @Override
            public void run() {

                synchronized (mfu) {

                    if (us3.getMfu().equals("mfuPrinter")) {
                        System.out.println(String.format("Юзер %s подошел к МФУ и распечатал документ", us3.getName()));
                    } else if (us3.getMfu().equals("mfuScanners")) {
                        System.out.println(String.format("Юзер %s подошел к МФУ и сделал скан документа", us3.getName()));
                    } else {
                        System.out.println(String.format("Юзер %s подошел к МФУ и сделал копию документа", us3.getName()));
                    }

                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(String.format("Юзер %s освободил МФУ", us3.getName()));
                }
            }
        });
        threadUs3.start();
        threadUs3.join();


        Thread threadUs4 = new Thread(new Runnable() {
            @Override
            public void run() {

                synchronized (mfu) {

                    if (us4.getMfu().equals("mfuPrinter")) {
                        System.out.println(String.format("Юзер %s подошел к МФУ и распечатал документ", us4.getName()));
                    } else if (us4.getMfu().equals("mfuScanners")) {
                        System.out.println(String.format("Юзер %s подошел к МФУ и сделал скан документа", us4.getName()));
                    } else {
                        System.out.println(String.format("Юзер %s подошел к МФУ и сделал копию документа", us4.getName()));
                    }

                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(String.format("Юзер %s освободил МФУ", us4.getName()));
                }
            }
        });
        threadUs4.start();
        threadUs4.join();

    }
}
