package multithreading.synchronized_03;

public class Worker {
    private int count = 0;

    //synchronized nam gwarantuje że w danym momencie tą metodę wywołuje tylko jeden wątek
    private synchronized void increment() {
        count++;
        System.out.println("Thread: "+Thread.currentThread().getId() + " Value: " + count);
    }

    public void secondRun() {
        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    increment();
                }
            }
        });

        Thread t4 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    increment();
                }
            }
        });

        t3.start();
        t4.start();

        try {
            t3.join();
            t4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Count(2): "+count);
    }

    public void firstRun() {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0; i<10_000; i++){
                    count++;
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0; i<10_000; i++) {
                    count++;
                }
            }
        });
//jeżeli nie poczekamy aż praca się zakończy to możliwe że count będzie równy zero poniewaz wyświetliwy
// jego wartość zanim zdążą się odpalić pętle

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Count: "+count);
    }
}
