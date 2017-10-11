package com.sda.pdst.parzystosc;

public class TabliceExamples {
    public static void main(String[] args) {
        int[] tablica = new int[10];
        uzupelnij(tablica);
        wyswietl(tablica);

        zwieksz(tablica);
        wyswietl(tablica);
        parzyste(tablica);
        wyswietl(tablica);
        suma(tablica);

    }

    private static void wyswietl(int[] tab) {
        for (int i = 0; i< tab.length; i++){
            System.out.print(tab[i]+" ");
        }
    }

    public static int[] uzupelnij(int[] tab){
        System.out.println("Uzupełniamy tablicę");
        for(int i=0; i<tab.length; i++){
            tab[i] = i+1;
        }
        return tab;
    }

    public static void suma(int[] tab){
        int suma = 0;
        for (int i=0; i<tab.length; i++){
            suma += tab[i];
        }
        System.out.println("\nSuma wynosi: "+suma);
    }

    public static int[] parzyste(int[] tab){
        System.out.println("\nParzyste dzielimy przez dwa:");
        for (int i=0; i<tab.length; i++){
            if(tab[i]%2 == 0){
               tab[i] = tab[i]/2;
            }
        }
        return tab;
    }

    public static int[] zwieksz(int[] tab){
        System.out.println("\nFunkcja zwiększ co 3 indeks o poprzedni:");

        for(int i=2; i<tab.length; i+=3){
            tab[i] = tab[i] + tab[i-1];

        }
        return tab;
    }
}
