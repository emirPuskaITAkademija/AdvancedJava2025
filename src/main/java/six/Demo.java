package six;

import six.concurrency.HelloRunnable;
import six.concurrency.HelloThread;

/**
 * Procesi i Threads
 * <p>
 *     <li>1. Runnable</li>
 * </p>
 *
 * FP
 *
 * <p>
 *     int count = 0;
 *     Thread-0 access count = 0
 *     Thread-1 access count = 1
 *     Thread-0 change count++ -> 1
 *     Thread-1 change count-- -> -1
 *     Thread-0 return back count -> 1
 *     Thread-1 return back count -> -1
 * </p>
 */
public class Demo {
    public static void main(String[] args) {
        HelloRunnable runnable = new HelloRunnable();
//        runnable.run();
        Thread thread = new Thread(runnable);
        thread.start();

        HelloThread thread1 = new HelloThread();
        thread1.start();
    }
}
