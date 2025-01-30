package five.concurrency.mysql;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;

/**
 * 1. SEKEVENCIJALNI KOD
 *     line 1
 *     line 2
 *     line 3
 *
 *     -> 1: line 1, 2: line 2, 3: line3
 * 2. Konkurentni kod
 *     -> 1. line 1 -> main
 *     -> 2. line 3 -> Thread 0
 *     -> 3. line 2 -> Thread 1
 *
 *     <p>
 *         SWITCH -> stream().parallel()
 *                  parallelStream()
 *     </p>
 */
public class Sample2 {

    public static void main(String[] args) {
        //Java 8 promijenila stil pisanja paralelnog izvršavanja koda
        // ne s jednim radnikom nego sa više radnika
        // MAIN -> worker0, worker1,
        List<Integer> numbers = Arrays.asList(1, 2, 34, 343, 5, 4, 54, 45, 45, 2323, 544, 5);
        // SUM
        //Initial Value - Inicijalna vrijednost
        int suma = 0;
        for (Integer number : numbers) {
            if (number % 2 == 0) {
                suma = suma + number;
            }
        }
        System.out.println("Suma = " + suma);
        int suma2 = numbers
//                .stream()
//                .parallel()
                .parallelStream()
                .filter(Sample2::isEven)
                .reduce(0, Integer::sum);
        System.out.println("Suma = " + suma2);
    }

    static boolean isOdd(int number){
        return number % 2 != 0;
    }

    static boolean isEven(int number){
        Thread thread = Thread.currentThread();
        System.out.println(thread.getName()+" izvršava funkciju isEven");
        return number % 2 == 0;
    }
}
