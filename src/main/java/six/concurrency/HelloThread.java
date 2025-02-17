package six.concurrency;

public class HelloThread extends Thread {

    @Override
    public void run() {
        System.out.println("Hello World kaze Thread: " + Thread.currentThread().getName());
    }
}
