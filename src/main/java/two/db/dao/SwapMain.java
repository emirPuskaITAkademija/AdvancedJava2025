package two.db.dao;

public class SwapMain {

    public static void main(String[] args) {
        //location123 = 23
        int number1 = 23;
        //location345 = 42
        int number2 = 42;
        System.out.println("Number1: " + number1 + " Number2: " + number2);
        swap(number1, number2);
        System.out.println("Number1: " + number1 + " Number2: " + number2);

        IntNumber intNumber1 = new IntNumber(23);
        IntNumber intNumber2 = new IntNumber(42);
        System.out.println("Number1: " + intNumber1 + " Number2: " + intNumber2);
        swap(intNumber1, intNumber2);
        System.out.println("Number1: " + intNumber1 + " Number2: " + intNumber2);

    }

    //pass/proslijedili samo VALUE bez informacije o MEMORIJSKOJ lokaciji..pass by value: Java to radi
    // kod PRIMITIVNIH TIPOVA
    static void swap(int number1, int number2) {
        int temp = number1;
        number1 = number2;
        number2 = temp;
        System.out.println("FUNCTION -> Number1: " + number1 + " Number2: " + number2);
    }

    //PASS by value of reference : Proslijedili smo i podatak i referencu
    static void swap(IntNumber number1, IntNumber number2) {
        IntNumber temp = new IntNumber(number1.getValue());
        number1.setValue(number2.getValue());
        number2.setValue(temp.getValue());
        System.out.println("FUNCTION -> Number1: " + number1 + " Number2: " + number2);
    }
}
