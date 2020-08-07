package Task1;

public class Main {
    public static void main (String [] args){
        ClassGeneric<Integer> num = new ClassGeneric<>(1, 2, 3, 4, 10);
        ClassGeneric<String> str = new ClassGeneric<>("gtnhj", "shhss", "jdhdfjhfd", "dhhfsdhd");

        num.swapsElements(num.getObj(), 3, 2);
        str.swapsElements(str.getObj(), 0, 2);

        num.showValue();
        str.showValue();

        num.swapsElements2(num.getObj());
        str.swapsElements2(str.getObj());
        num.showValue();
        str.showValue();

    }
}
