package multithreading.deadlock_07;

import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Bank {

    private Account acc1 = new Account();
    private Account acc2 = new Account();
    private Random rand = new Random();

    private Lock lock1 = new ReentrantLock();
    private Lock lock2 = new ReentrantLock();

    public void start() {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                firstAction();
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                secondAction();
            }
        });

        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("ACC1: "+acc1.getBalance());
        System.out.println("ACC2: "+acc2.getBalance());
        System.out.println(" SUM: "+(acc1.getBalance()+acc2.getBalance()));

    }

    //należy uważać z kolejnością blokowania wątków, jeśli ją źle ustawimy
    // to zakleszczą się i będzie pusta konsola. Nastąpi tzw deadlock
    private void firstAction() {
        for (int i = 0; i < 1000; i++) {
            lock1.lock();
            lock2.lock();
            Account.transfer(acc1,acc2, rand.nextInt(100));
            lock2.unlock();
            lock1.unlock();
        }
    }

    private void secondAction() {
        for (int i = 0; i < 1000; i++) {
            lock1.lock();
            lock2.lock();
            Account.transfer(acc2,acc1,rand.nextInt(100));
            lock2.unlock();
            lock1.unlock();
        }
    }
}
