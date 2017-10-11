package com.sda.pdst.parzystosc;

import java.util.Scanner;

public class Wielokrotnosc {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String liczba;

        System.out.println("Podaj liczbę:");
        liczba = in.nextLine();

        try {
            Integer a = Integer.parseInt(liczba);
            System.out.println("Podaj wielokrotność:");
            liczba = in.nextLine();
            Integer b = Integer.parseInt(liczba);
            if (b < 0) {
                System.out.println("Wielokrotność nie może być na minus");
            } else {
                System.out.println("Wielokrotność to: " + (a * b));
            }

        } catch (NumberFormatException e) {
            System.out.println("Wprowadzono ciąg znaków!");
        }
    }
}
