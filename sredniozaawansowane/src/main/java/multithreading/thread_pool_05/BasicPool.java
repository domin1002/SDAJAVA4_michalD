package multithreading.thread_pool_05;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class BasicPool {
    public void run() {
        //liczba "osób" do obsługi zadań
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        for (int i = 0; i < 10; i++) {
            executorService.submit(new Task(i));
        }

        //po tej metodzie nie możemy dodać kolejnych zadań
        executorService.shutdown();
        System.out.println("Wszystkie zadania zostały dodane.");


    }
}

