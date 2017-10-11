package com.sda.pdst.parzystosc;

import java.util.Scanner;

public class Fib {
    public static int fib(int n) {
        if ((n == 0) || (n == 1))
            return 1;
        else
            return fib(n - 1) + fib(n - 2);
    }

    public static int fibFor(int n) {
        int a = 1;
        int b = 1;

        int wynik = 0;

        if (n < 2) return n;

        System.out.println(a);
        System.out.println(b);
        for (int i = 2; i <= n; i++) {
            wynik = a + b;
            a = b;
            b = wynik;
            System.out.println(wynik);
        }
        return wynik;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Podaj ilość elementów:");
        String liczba = in.nextLine();

        try {
            Integer n = Integer.parseInt(liczba);
            //  System.out.println("Rekurencja:");
            //  System.out.println(n + "-ty wyraz ciagu: " + fib(n) + "\n");

            System.out.println("Pętla for:");
            System.out.println(n + "-ty wyraz ciągu:" + fibFor(n));
        } catch (NumberFormatException e) {
            System.out.println("Wprowadzono ciąg znaków!");
        }
    }
}

