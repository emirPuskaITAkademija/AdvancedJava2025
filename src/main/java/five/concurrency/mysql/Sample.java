package five.concurrency.mysql;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;

/**
 * 1. Proces
 * 2. Thread - manje jedinice unutar procesa
 * synchronized, volatile
 */
public class Sample {

    public static void main(String[] args) {
        //Java 8 promijenila stil pisanja paralelnog izvršavanja koda
        // ne s jednim radnikom nego sa više radnika
        // MAIN -> worker0, worker1,
        List<Integer> numbers = Arrays.asList(1, 2, 34, 343, 5, 4, 54, 45, 45, 2323, 544, 5);
        // SUM
        //Initial Value - Inicijalna vrijednost
        int suma = 0;
        for (Integer number : numbers) {
            if (number % 2 != 0) {
                suma = suma + number;
            }
        }
        System.out.println("Suma = " + suma);
        //Suma = 3405
        //Suma parnih= 638
        //Suma neparnih = 2767
        //Martin Fowler, Brian Goetz
        //functional style Identity Value
        // Kada koristimo LAMBDA ?
        // Kada kreiramo varijablu TIPA FUNKCIONALNOG interfejsa
        // =>  ->
        BinaryOperator<Integer> operacija = (n1, n2) -> n1 + n2;
        BinaryOperator<Integer> operacija2 = (n1, n2) -> Integer.sum(n1, n2);
        BinaryOperator<Integer> operacija3 = Integer::sum;

//        int result = operacija.apply(23, 34);
//        int result2 = operacija.apply(234, 343);
        Predicate<Integer> testNeparniBroj = Sample::isOdd;
        Predicate<Integer> testerParniBroj = Sample::isEven;
        int sumaFunctional = numbers
                .stream() // Stream<Integer>
                .filter(testNeparniBroj) // Stream<Integer>
                .reduce(0, Integer::sum);
        System.out.println("Suma = " + sumaFunctional);
    }

    static boolean isOdd(int number){
        return number % 2 != 0;
    }

    static boolean isEven(int number){
        return number % 2 == 0;
    }
}
