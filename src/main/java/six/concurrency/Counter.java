package six.concurrency;

public class Counter {
    private int count = 0;

    public synchronized void increment() {
//        synchronized (this) {
//            count++;
//        }
        count++;
    }

    public synchronized void decrement(){
        count--;
    }
}
