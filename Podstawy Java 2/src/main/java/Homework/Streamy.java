package Homework;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Streamy {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();

        list1.add("Piekielna Głębia");
        list1.add("300: Początek Imperium");
        list1.add("Armageddon");
        list1.add("Avatar");
        list1.add("Tańczący z wilkami");
        list1.add("Braveheart");
        list1.add("Star Wars: Ostatni Jedi");
        list1.add("Prawdziwe kłamstwa");
        list1.add("Terminator");
        list1.add("Rocky");
        list1.add("Rambo");
        list1.add("Kickboxer");
        list1.add("Epoka Lodowcowa");
        list1.add("Wejście smoka");
        list1.add("Troja");
        list1.add("Batman początek");
        list1.add("X-men");
        list1.add("Władca pierścieni - dwie wieże");
        list1.add("Gwiezdne wrota");
        list1.add("Botox");

        /////////////////zad1//////////////////

        List<String> zad1 = list1.stream().filter(film -> {
            String znak = film.substring(0, 1);
            if(znak.equals("A")) return true;
            else return false;
        }).collect(Collectors.toList());

        System.out.println("Lista wszystkich filmów rozpoczynających się literą A:");
        display(zad1);
        System.out.println();

        /////////////////zad2///////////////////

        List<String> zad2 = list1.stream().filter( film -> {
            String[] word = film.split(" ");
            int liczba = 0;
            if(word.length == 2) {
                liczba++;
                return true;
            }
            else return false;
        }).collect(Collectors.toList());

        System.out.println("Lista filmów zawierająca tytuły składające się z kilku słów:");
        display(zad2);
        System.out.println();

        /////////////////zad3///////////////////

        List<String> zad3 = list1.stream().filter(film -> {
            if(film.length() > 5)return true;
            else return false;
        }).collect(Collectors.toList());
        System.out.println("Lista filmów składająca się z więcej niż 5 znaków:");
        display(zad3);
        System.out.println();


        /////////////////zad4///////////////////
        String word = "";
        for (String lista : list1){
            if (lista.length() > word.length()){
                word = lista;
            }
        }
        System.out.println("Film o najdłuższej nazwie to: "+word);

        String zad4 = list1.stream().map(film -> {
            String slowo = "";
            if (film.length()> slowo.length()){
                slowo = film;
                return true;
            } else return false;
        }).toString();

        System.out.println(zad4);




    }

    public static void display(List<String> lista){
        for (String vol : lista){
            System.out.println(vol);
        }
    }
}
