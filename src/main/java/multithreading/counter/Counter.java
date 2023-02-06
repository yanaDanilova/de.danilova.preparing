package multithreading.counter;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Counter {
    Lock lock = new ReentrantLock();

    private  int i;

    public void increment(){
        lock.lock();
        System.out.println(++i + " inc " + Thread.currentThread().getName());
        lock.unlock();

    }

    public void decrement(){
        lock.lock();
        System.out.println(--i +" dec  "+ Thread.currentThread().getName());
        lock.unlock();
    }
}
