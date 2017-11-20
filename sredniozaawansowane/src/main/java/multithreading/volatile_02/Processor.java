package multithreading.volatile_02;

public class Processor extends Thread{
    //VOLATILE
    //pole jest wspólne dla wszyskich wątków, jeżeli dwa obiekty korzystają z tej samej zmiennej to jeden z nich może korzystać w danym czasie
    //jest to zabezpieczenie
    private volatile boolean running = true;
    @Override
    public void run() {
        while (running) {
            System.out.println("Running");
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("STOP");
    }

    public void stopThread() {
        running = false;
    }
}
