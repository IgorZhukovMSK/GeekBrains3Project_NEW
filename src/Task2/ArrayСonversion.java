package Task2;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayСonversion <T> {

    ArrayList<T> arrayСonversion (T[] array) {
        return new ArrayList<>(Arrays.asList(array));
    }
}
