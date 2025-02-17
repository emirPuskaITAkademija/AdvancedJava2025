package six.concurrency;

public class HelloRunnable implements Runnable {
    public void run() {
        System.out.println("Hello World kaže Thread: " + Thread.currentThread().getName());
    }
}
