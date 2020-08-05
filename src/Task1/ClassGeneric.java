package Task1;

public class ClassGeneric<T> extends SwapsElements {

    private T[] obj;

    public ClassGeneric(T... obj) {
        this.obj = obj;
    }

    public T[] getObj() {
        return obj;
    }

    public void setObj(T[] obj) {
        this.obj = obj;
    }

    public void showValue() {

        for (Object i : obj) {

            System.out.print(i + " ");
        }
        System.out.println();

    }

}