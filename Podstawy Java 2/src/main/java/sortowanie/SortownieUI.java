package sortowanie;

import mapy.Porzadek;
import sortowanie.sortowanieBabelkowe.SortowanieBabelkowe;
import sortowanie.sortowaniePrzezWymiane.SortowaniePrzezWymiane;
import sortowanie.sortowaniePrzezZliczanie.SortowaniePrzezZliczanie;
import sortowanie.sortowanieSzybkie.SortowanieSzybkie;

public class SortownieUI {
    public static void main(String[] args) {
        int[] tablica = new int[]{2, 8, 5, 9, 6, 8, 5, 7, 5, 1};
        wyswietlTablice(tablica);
        //Sortowanie sortowanie = new SortowanieBabelkowe();
        //tablica = sortowanie.sortuj(tablica, Porzadek.MALEJACO);
        // wyswietlTablice(tablica);
        // Sortowanie sortowanie = new SortowaniePrzezWymiane();
        //Sortowanie sortowanie = new SortowanieSzybkie();
        //tablica = sortowanie.sortuj(tablica, Porzadek.MALEJACO);
        wyswietlTablice(tablica);

        Sortowanie[] sortowanie = new Sortowanie[5];
        sortowanie[0] = new SortowanieBabelkowe();

    }

    public static void wyswietlTablice(int[] tablica) {
        for (int elem : tablica) {
            System.out.print(elem + " ");
        }
        System.out.println();
    }
}
