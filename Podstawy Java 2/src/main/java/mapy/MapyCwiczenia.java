package mapy;

import java.util.HashMap;
import java.util.Map;

public class MapyCwiczenia {
    public static void main(String[] args) {
        Map<String, Ksiazka> mapa = new HashMap<>();
        Ksiazka ksiazka1 = Narzedzia.utworzKsiazke("Adam", "Mickiewicz", 300,
                "Pan Tadeusz", "12345678", 400, Kategoria.EPOPEJA);
        Ksiazka ksiazka2 = Narzedzia.utworzKsiazke("Adam", "Mickiewicz", 300,
                "Dziady", "13464776767", 400, Kategoria.EPOPEJA);
        mapa.put("1", ksiazka1);
        mapa.put("2", ksiazka2);
        Ksiazka poprzednia = mapa.put("1", ksiazka2);
        Ksiazka poprzedniaPod3 = mapa.put("3", ksiazka1);
        Ksiazka ksiazkaPod1 = mapa.get("1");

//        System.out.println(mapa);
        System.out.println(poprzednia);

        System.out.println("Mapa zawiera klucz 2: " + mapa.containsKey("2"));
        System.out.println("Mapa zawiera klucz 1: " + mapa.containsKey("1"));

//Wyswietlamy wszystkie klucze znajdujace sie w mapie
        System.out.println("Klucze:");
        for (String key : mapa.keySet()) {
            System.out.println(key);
        }
        System.out.println("Wartości:");
        for (Ksiazka ksiazka : mapa.values()) {
            System.out.println(ksiazka);
        }

        //w ramach jednej iteracji entry zwraca zarowno klucz i wartosc
        //klucz mozemy sobie pobrac za pomoca entry.getKey() a wartosc .getValue()
        for (Map.Entry<String, Ksiazka> entry : mapa.entrySet()) {
            System.out.println("Klucz: " + entry.getKey());
            System.out.println("Wartość: " + entry.getValue());
        }
    }
}
