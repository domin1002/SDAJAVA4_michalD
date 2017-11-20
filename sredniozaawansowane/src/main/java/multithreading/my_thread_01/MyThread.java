package multithreading.my_thread_01;

public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("Startuje nowy wątek.");
        for(int i=0; i<10; i++) {
            System.out.println("Hello "+ i + " Thread: " + Thread.currentThread().getId());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Wątek zakończył pracę.");
    }
}
