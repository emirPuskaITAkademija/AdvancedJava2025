package seven.structure;

public class DynamicDemo {
    public static void main(String[] args) {
        DynamicIntegerStructure integerStructure = new DynamicIntegerStructure();
        integerStructure.addInteger(23);
        integerStructure.addInteger(234);
        for(Integer number : integerStructure) {
            System.out.println(number);
        }

        DynamicNumberStructure<Float> floatNumbers = new DynamicNumberStructure<>();
        floatNumbers.addNumber(23f);
        floatNumbers.addNumber(234f);
        floatNumbers.addNumber(1232443f);
        for(Float number : floatNumbers) {
            System.out.println(number);
        }
    }
}
