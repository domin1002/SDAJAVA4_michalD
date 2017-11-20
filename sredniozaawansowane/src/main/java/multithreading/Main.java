package multithreading;

import multithreading.deadlock_07.Bank;
import multithreading.lock_04.Lock;
import multithreading.my_thread_01.MyThread;
import multithreading.synchronized_03.Worker;
import multithreading.thread_pool_05.BasicPool;
import multithreading.volatile_02.Processor;
import multithreading.wait_notify_06.App;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        myThread();
//        myThread2();
//        runnable();
//        processor();
//        synchronizedThread();
//        lock();
//        pool();
//        waitNotify();
        deadlock();
    }

    private static void deadlock() {
        Bank bank = new Bank();
        bank.start();
    }

    private static void waitNotify() {
        App app = new App();
        app.work();
    }

    private static void pool() {
        BasicPool basicPool = new BasicPool();
        basicPool.run();
    }

    private static void lock() {
        Lock lock = new Lock();
        lock.work();
    }

    private static void synchronizedThread() {
        Worker worker = new Worker();
        worker.secondRun();
    }

    private static void processor() {
        Processor processor = new Processor();
        processor.start();
        new Scanner(System.in).nextLine();
        processor.stopThread();
    }

    //poniższe metody robią to samo, zapisane na różne sposoby
    private static void myThread2() {
        Thread thread = new Thread(new MyThread());
        thread.start();
    }

    private static void runnable() {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Hello " + Thread.currentThread().getId());
                }
            }
        });
        thread.start();
    }


    private static void myThread() {
        System.out.println("ID nowego wątku: " + Thread.currentThread().getId());
        MyThread myThread = new MyThread();
        myThread.start();

        MyThread myThread2 = new MyThread();
        myThread2.start();
    }
}
