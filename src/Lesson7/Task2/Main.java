package Lesson7.Task2;

import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

/**
 * Написать программу для проверки ДЗ
 * (Проанализировать папку с компилированными классами и вызвать методы, проверить результат)
 */

public class Main {

    public static void main(String[] args) throws MalformedURLException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class c = URLClassLoader.newInstance(new URL[] {
                new File("G:/Qnap/Java учеба/Geekbrains/GeekBrains1Project/src/Lesson1").toURL()}).loadClass("Main");

        Constructor constructor = c.getConstructor(String.class);

        Object main = constructor.newInstance("Vasy");

        Method m = c.getDeclaredMethod("nameOutput");

        m.invoke(main);

    }

}
