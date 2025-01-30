package five.concurrency.mysql;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/**
 * 1. SEKEVENCIJALNI KOD
 * line 1
 * line 2
 * line 3
 * <p>
 * -> 1: line 1, 2: line 2, 3: line3
 * 2. Konkurentni kod
 * -> 1. line 1 -> main
 * -> 2. line 3 -> Thread 0
 * -> 3. line 2 -> Thread 1
 *
 * <p>
 * SWITCH -> stream().parallel()
 * parallelStream()
 * </p>
 *
 * Pitanje: Koliko i možemo li mi kreirati Threads i ručno startati ?
 * Pravo pitanje je: Koliko nama Thread treba ?
 * <p>
 *     Kako doći do toga koliko Thread kreira.
 *     <li>
 *         1. COMPUTATIONAL INTENSIVE operation
 *         numberOfThread <= brojJezgri
 *     </li>
 *     <li>
 *         2. IO INTENSIVE operation
 *                                  1
 *         numberOfThreads <=  -------------- ---      * cores
 *                              1 - BLOCKING_FACTOR
 *          BLOCKING_FACTOR - iznos vremena kada ne koristim CPU
 *
 *          0 < BLOCKING_FACTOR < 1
 *          BLOCKING_FACTOR = 1 -> DEAD LOCK
 *          ~ 1/2 = 0.5
 *
 *     </li>
 * </p>
 */
public class Sample3 {

    final static long MAX = 990000000L;

    public static void main(String[] args) throws InterruptedException {
        //Java 8 promijenila stil pisanja paralelnog izvršavanja koda
        // ne s jednim radnikom nego sa više radnika
        // MAIN -> worker0, worker1,
        int procesora = Runtime.getRuntime().availableProcessors();
        System.out.println("Procesora = " + procesora);
        List<Integer> numbers = Arrays.asList(1, 2, 34, 343, 5, 4, 54, 45, 45, 2323, 544, 5);
        long currentTime = System.currentTimeMillis();
        int sum = numbers
                .stream()
                .parallel()
                .map(Sample3::print)
                .map(Sample3::compute)
                .reduce(0, Integer::sum);
        long period = System.currentTimeMillis() - currentTime;
        System.out.println("Sum: " + sum);
        // 53 seconds -> main   490833
        // 54 second
        //Sum: 490833 -> svi threadovi + main
        //Period: 5 seconds
        System.out.println("Period: " + period / 1000 + " seconds");
    }

    static int print(int number){
        System.out.println("Thread Name  = " + Thread.currentThread().getName());
        return number;
    }

    static int compute(int number) {
//        Thread thread = Thread.currentThread();
//        System.out.println("Thread: " + thread.getName() + " izvršava compute");
        double result = 0;
        for (int i = 0; i < MAX; i++) {
            for (int j = 0; j < MAX; j++) {
                result = Math.sqrt(i * j);
            }
        }
        return (int) (result + number);
    }

    static boolean isOdd(int number) {
        return number % 2 != 0;
    }

    static boolean isEven(int number) {
        Thread thread = Thread.currentThread();
        System.out.println(thread.getName() + " izvršava funkciju isEven");
        return number % 2 == 0;
    }
}
