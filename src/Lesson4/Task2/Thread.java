//package Lesson4.Task2;
//
//public class Thread extends java.lang.Thread implements Runnable {
//
//    public Thread(Object obj) {
//
//    }
//
//    public Thread(Runnable runnable, Object obj, User user) {
//
//    }
//    public void run (Object obj, User userName) {
//            synchronized (obj) {
//                if (userName.getMfu().equals("mfuPrinter")) {
//                    System.out.println(String.format("Юзер %s подошел к МФУ и распечатал документ", userName.getName()));
//                } else if (userName.getMfu().equals("mfuScanners")) {
//                    System.out.println(String.format("Юзер %s подошел к МФУ и сделал скан документа", userName.getName()));
//                } else {
//                    System.out.println(String.format("Юзер %s подошел к МФУ и сделал копию документа", userName.getName()));
//                }
//                try {
//                    Thread.sleep(2000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                System.out.println(String.format("Юзер %s освободил МФУ", userName.getName()));
//            }
//
//    }
////
////    Thread threadUs1 = new Thread(new Runnable() {
////        @Override
////        public void run() {
////            synchronized (mfu) {
////                if (us1.getMfu().equals("mfuPrinter")) {
////                    System.out.println(String.format("Юзер %s подошел к МФУ и распечатал документ", us1.getName()));
////                } else if (us1.getMfu().equals("mfuScanners")) {
////                    System.out.println(String.format("Юзер %s подошел к МФУ и сделал скан документа", us1.getName()));
////                } else {
////                    System.out.println(String.format("Юзер %s подошел к МФУ и сделал копию документа", us1.getName()));
////                }
////                try {
////                    Thread.sleep(2000);
////                } catch (InterruptedException e) {
////                    e.printStackTrace();
////                }
////                System.out.println(String.format("Юзер %s освободил МФУ", us1.getName()));
////            }
////        }
////    });
////        threadUs1.start();
////        threadUs1.join();
//
//
//
//
//
//
//
//
//    public Thread(Runnable target, String name) {
//        super(target, name);
//    }
//}
