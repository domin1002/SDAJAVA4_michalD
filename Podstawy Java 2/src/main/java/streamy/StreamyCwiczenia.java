package streamy;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamyCwiczenia {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            lista.add(i + 1);
        }
        //chcemy zwrocic wszystkie liczby podzielne przez 2
        List<Integer> podzielnaPrzez2 = lista.stream().filter(new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer % 2 == 0;
            }
        }).collect(Collectors.toList());

        List<Integer> podzielnePrzez2PlusLambda = lista.stream().filter(liczba -> liczba % 2 == 0).collect(Collectors.toList());

        //podzielne przez 3 i wieksze do 20
        List<Integer> podzielneIwieksze = lista.stream().filter(liczba -> liczba % 3 == 0 && liczba > 20).collect(Collectors.toList());

        //skomplikowane warunki możemy umieszczać w blokach kodu {}, w nich zawieramy kod javy, musi zwracać return
        List<Integer> wynik1 = lista.stream().filter(liczba -> {
            if (liczba < 51) {
                return liczba % 2 == 0;
            } else {
                return liczba % 3 == 0;
            }
        }).collect(Collectors.toList());

        List<Integer> wynik2 = lista.stream().filter(liczba -> {
            if (liczba >= 0 && liczba <= 20) {
                return liczba % 3 == 0 && liczba % 7 == 0;
            } else if (liczba >= 20 && liczba <= 40) {
                return liczba % 2 == 0 && liczba % 3 == 0;
            } else if (liczba >= 40 && liczba <= 100) {
                return liczba % 4 == 0 && liczba % 6 == 0;
            } else {
                return false;
            }
        }).collect(Collectors.toList());

        //gdzy nie chcemy filtrowac tylko modyfikowac uzywamy .map()
        List<Integer> wynik3 = lista.stream().map(liczba -> liczba * 3).collect(Collectors.toList());

        List<Integer> wynik4 = lista.stream().map(liczba -> {
            if (liczba >= 0 && liczba <= 20) {
                return liczba * 3 + 2;
            } else if (liczba >= 21 && liczba <= 40) {
                return liczba * 5 - 50;
            } else if (liczba >= 41 && liczba <= 100) {
                return (int) Math.pow(liczba, 2);
            } else {
                return 0;
            }
        }).filter(liczba -> liczba % 4 == 0).collect(Collectors.toList());


        Integer zad1 = lista.stream().mapToInt(liczba -> liczba * random.nextInt(100))
                .max().getAsInt();
        System.out.println(zad1);


        //ponizej jesezli uzyjemy getAsInt() zwroci nam wyjatek, nie ma takiego elementu
        OptionalInt max2 = lista.stream().mapToInt(liczba -> liczba).filter(liczba -> liczba > 1000).max();

        if (max2.isPresent()) {
            System.out.println(max2.getAsInt());
        } else {
            System.out.println("Zbiór jest pusty");
        }

        Double avr = lista.stream().mapToDouble(liczba -> liczba * random.nextInt(100)).average().getAsDouble();
        System.out.println("Średnia wynosi: " + avr);

        OptionalInt zad3 = lista.stream().mapToInt(liczba -> liczba * random.nextInt(100)).filter(liczba -> liczba % 2 == 0).findFirst();
        System.out.println(zad3);


        Optional<Integer> zad33 = lista.stream().map(liczba -> liczba * random.nextInt(100)).filter(liczba -> liczba % 2 == 0).findFirst();
        if (zad33.isPresent()) {
            System.out.println(zad33.get());
        } else {
            System.out.println("Nie znaleziono wyników");
        }


//        System.out.println("Lista podzielna przez 2:");
//        System.out.println(podzielnaPrzez2);
//        System.out.println("Lisa podzielna przez 2 za pomocą wyrażenia lambda:");
//        System.out.println(podzielnePrzez2PlusLambda);
//        System.out.println("Liczby podzielne przez 3 i wieksze od 20:");
//        System.out.println(podzielneIwieksze);
//        System.out.println("=========================================");
//        System.out.println(wynik1);
//        System.out.println("=========================================");
//        System.out.println(wynik2);
//        System.out.println("=========================================");
//
//        //org lista jest niezmieniona
//        System.out.println(lista);
//        System.out.println("Lista zamieniana na stream mapowana i filtrowana:");
//        System.out.println(wynik4);
    }
}
