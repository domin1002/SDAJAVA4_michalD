package pl.sda.wzorce;

import pl.sda.wzorce.builder.User;
import pl.sda.wzorce.facade.Facade;
import pl.sda.wzorce.factory.Document;
import pl.sda.wzorce.factory.DocumentGenerator;
import pl.sda.wzorce.observer.Person;
import pl.sda.wzorce.observer.Weather;
import pl.sda.wzorce.singleton.DataBase;
import pl.sda.wzorce.startegy.Calculator;
import pl.sda.wzorce.startegy.OperationAdd;
import pl.sda.wzorce.startegy.OperationSubtract;

import java.util.Scanner;

import static pl.sda.wzorce.factory.DocumentGenerator.*;

public class Main {
    public static void main(String[] args) {
//        builder();
//        factory();
//        facade();
//        observer();
//        singleton();
        strategy();
    }
/** definiujemy wspólny interfejs dla wszystkich strategii. Następnie w poszczególnych klasach implementujemy metody
   z konkretnymi algorytmami. Dzięki temu obiekty operacji możemy podmieniać w konstruktorze kalkulatora wedle potrzeb.
 */
    private static void strategy() {
        Calculator calculator = new Calculator(new OperationAdd());
        int result = calculator.executeStrategy(10, 5);
        System.out.println("10 + 5 = " + result);

        calculator = new Calculator(new OperationSubtract());
        result = calculator.executeStrategy(10, 5);
        System.out.println("10 - 5 = " + result);

        calculator = new Calculator(new OperationDivide());
        result = calculator.executeStrategy(10, 5);
        System.out.println("10 / 5 = " + result);

        calculator = new Calculator(new OperationMultiply());
        result = calculator.executeStrategy(10, 5);
        System.out.println("10 * 5 = "+result);
    }

    private static void singleton() {
        DataBase db1 = DataBase.getInstance();
        db1.saveData("aaa");
        db1.saveData("bbb");

        DataBase db2 = DataBase.getInstance();
        db2.saveData("ccc");
        db2.saveData("ddd");
        db1.displayData();
    }

    private static void observer() {
        Person p1 = new Person("Kuba", 10);
        Person p2 = new Person("Ola", 22);
        Person p3 = new Person("Michał", 15);

        Weather weather = new Weather();
        weather.addObserver(p1);
        weather.addObserver(p2);
        weather.addObserver(p3);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Podaj aktualną temperaturę:");
            int currentTemperature = scanner.nextInt();
            weather.update(currentTemperature);
            System.out.println();
        }
    }

    private static void facade() {
        Facade system = new Facade();
        system.activate();
        System.out.println("----------------------");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        system.deactivate();
    }

    private static void factory() {
        DocumentGenerator generator = new DocumentGenerator();
        String myText = "Największa w Polsce\r\nakademia programowania";

        Document txt = generator.createDocument(myText, DocumentType.TXT);
        txt.saveFile();

        System.out.println();

        Document html = generator.createDocument(myText, DocumentType.HTML);
        html.saveFile();

    }

    private static void builder() {
        User user = new User.UserBuilder("Anna")
                .lastName("Nowak")
                .age(12)
                .adress("Łódź")
                .phone(666333555)
                .build();

        User user2 = new User.UserBuilder("Michał")
                .lastName("Dominiak")
                .build();

        System.out.println(user.toString());
        System.out.println(user2.toString());
    }
}
