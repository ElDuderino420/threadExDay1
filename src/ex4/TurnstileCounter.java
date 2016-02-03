package ex4;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;

public class TurnstileCounter {

    static final long DELAY_VAL = 10000;
    long count = 0;
//    2)
    private AtomicInteger AI = new AtomicInteger(0);

//    3)
    private final ReentrantLock lock = new ReentrantLock();

    public long getValue() {
//        2)
//        count = AI.get();
        return count;
    }

//    public void incr() {
//        count++;
//    }
    
//    3)
    public void incr() {
        lock.lock();
        try {
            count++;
        } finally {
            lock.unlock();
        }
    }

//    1)
//    public synchronized void incr() {
//        count++;
//    }
//    2)
//    public void incr() {
//        AI.addAndGet(1);
//    }
}
