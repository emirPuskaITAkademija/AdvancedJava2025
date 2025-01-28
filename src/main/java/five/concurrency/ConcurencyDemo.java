package five.concurrency;

/**
 * <p>
 *     1. Proces
 *     <p>
 *         memoriju
 *         execution Runtime Environment
 *
 *     </p>
 *     3. Thread ili Programska Nit  - lagani proces
 * </p>
 *
 */
public class ConcurencyDemo {
    public static void main(String[] args) {
        //Proces -> MAIN
        String mainName = Thread.currentThread().getName();
        System.out.println(mainName);
        int number = 23;
        System.out.println(number + " rekao je " + mainName+" Thread");

        //1. način da osim MAIN thread uposlite još jedan Thread
        Runnable runnable = new HelloRunnable();
        Thread radnik = new Thread(runnable);
        radnik.setName("Rudar 1");
        radnik.start();

        //2. način da osim MAIN thread uposlite još jedan Thread
        Thread radnik2 = new HelloThread();
        radnik2.setName("Rudar 2");
        radnik2.start();
    }
}
