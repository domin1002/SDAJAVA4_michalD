package com.sda.pdst.parzystosc;

import java.util.Scanner;

public class FibToTab {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Podaj ilość elementów:");
        String liczba = in.nextLine();

        try {
            Integer n = Integer.parseInt(liczba);

            System.out.println("Pętla for:");
            System.out.println(n + "-ty wyraz ciągu:" + fibFor(n));
        } catch (NumberFormatException e) {
            System.out.println("Wprowadzono ciąg znaków!");
        }
    }

    public static int fibFor(int n) {
        int[] tab = new int[n];
        int a = 1;
        int b = 1;
        tab[0] = a;
        tab[1] = b;

        int wynik = 0;

        if (n < 2) return n;

        for (int j = 2; j <n; j++) {
            wynik = a + b;
            a = b;
            b = wynik;
            tab[j] = wynik;
        }

        for (int i = 0; i <tab.length; i++) {
            System.out.println(tab[i]);
        }
        return wynik;
    }
}
