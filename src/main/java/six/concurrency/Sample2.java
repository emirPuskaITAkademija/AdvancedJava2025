package six.concurrency;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;
import java.util.stream.IntStream;

/**
 * Kada će nam najčešće Thread biti potreban ?
 * <p>
 * Dvije vrste operacija kada rješavamo:
 * <li>1. Computational Intenzivne </li>
 * <p>
 * number_of_thread <= number_of_cores
 *
 * <li>2. I/O intenzivne operacije (read from file, to file, from DB, to DB, ..)</li>
 * 1
 * numbers_of_threads = ------------------------ * number_of_cores
 * 1-BLOCKING_FACTOR
 * <p>
 * 0 < BLOCKING_FACTOR < 1
 * <p>
 * Kolko TREBAM radnika/threads da uposlim da posao završim BRZO ?
 *
 *
 * </p>
 */
public class Sample2 {

    static final int ITERATIONS = 10000;

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        double result =
                IntStream.range(0, ITERATIONS)// 0, 1, 2, ....1500
                        .parallel()
                        .mapToDouble(Sample2::compute)
                        .sum();
        long end = System.currentTimeMillis();
        long period = end - start;
        System.out.println("Result : " + result + " dobijen za " + (period / 1000) + " sekundi");

    }


    static double compute(double value) {
        double result = 0;
        for (int i = 0; i < 1500; i++) {
            for (int j = 0; j < 1500; j++) {
                result += Math.sqrt(i * j);
            }
        }
        System.out.println("Thread " + Thread.currentThread().getName() + ": " + result);
        return result;
    }

}
