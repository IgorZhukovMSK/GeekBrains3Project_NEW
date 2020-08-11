package Task1;

public class SwapsElements<T> {

    public void swapsElements(T[] arr, int index1, int index2) {

        T tempElements;

        tempElements = arr[index1];

        arr[index1] = arr[index2];
        arr[index2] = tempElements;
    }


    /**
    Второй способ (последний элемент становится первым, первый - последним).
     */

    public void swapsElements2(T[] arr) {
        T tempElements;
        T firstElement;
        T lastElement;

        firstElement = arr[0];
        lastElement = arr[arr.length-1];
        tempElements = lastElement;
        arr [0] = tempElements;
        arr [arr.length - 1] = firstElement;

    }

}