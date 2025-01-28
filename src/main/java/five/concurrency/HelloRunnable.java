package five.concurrency;

public class HelloRunnable implements Runnable {
    @Override
    public void run() {
        Thread thread = Thread.currentThread();
        String name = thread.getName();
        System.out.println("Hello " + name + " je kazao thread: " + name);
    }
}
