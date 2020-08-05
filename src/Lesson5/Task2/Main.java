package Lesson5.Task2;

public class Main {
    public static void main(String[] args) {

        Operationable operationAdd = ((x, y) -> x + y);
        System.out.println(operationAdd.calculate(1, 3));

        Operationable operationMultiplication = ((x, y) -> x * y);
        System.out.println(operationMultiplication.calculate(10, 5));

        Operationable operationSubtraction = ((x, y) -> x - y);
        System.out.println(operationSubtraction.calculate(10, 5));

        Operationable operationDivision = ((x, y) -> x / y);
        System.out.println(operationDivision.calculate(10, 5));

    }
}



