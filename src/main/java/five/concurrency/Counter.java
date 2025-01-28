package five.concurrency;

/**
 * čak i kad uvodite LOCK
 * Thread 1-> ja uzeo i LOCK
 * Thread 1-> ja izmijenio i LOCK još prisutan
 * Thread 1 -> ja vratio i LOCKa NEMA SKINUO sam ga
 * Thread 2 -> ja uzimam i LOCK
 *
 *
 * ...
 *
 * DEAD LOCK
 * STARVATION
 * LIVELOCK
 *
 *
 * Dvije vrste operacija kada možemo iskoristiti više Threadova
 * a da imamo benefit:
 * <li>1. COMPUTATIONAL intensive</li>
 * <li>2. IO intensive</li>
 */
public class Counter {
    private int number = 23;

    public synchronized void increment(){
        number++;
    }

    public synchronized void decrement(){
        number--;
    }
}
