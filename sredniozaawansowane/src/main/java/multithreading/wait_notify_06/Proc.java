package multithreading.wait_notify_06;

import java.util.Scanner;

public class Proc {

    public void produce() throws InterruptedException {

        //jeśli chcemy by jeden obiekt pilnował dwa bloki możemy użyć this, w tym przypadku przekazujemy instancję klasy Proc
        synchronized (this){
            System.out.println("T2 - oczekuje");
            wait();
            System.out.println("T2 - zakonczono oczekiwanie");
        }
    }

    public void consume() throws InterruptedException {
        Thread.sleep(5000);
        Scanner scanner = new Scanner(System.in);
        synchronized (this){
            System.out.println("T1 - oczekiwanie na enter");

            scanner.nextLine();
            System.out.println("T1 - kliknięto Enter");

            //metoda notify wybudza miejsce w który staneliśmy w wait, powiadomi dopiero jak cały blok
            //synchronized się zakończy
            notify();



            System.out.println("Zakończono blok synchronized");
        }
    }

}
