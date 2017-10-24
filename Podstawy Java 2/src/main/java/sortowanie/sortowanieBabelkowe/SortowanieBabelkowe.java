package sortowanie.sortowanieBabelkowe;

import mapy.Porzadek;
import sortowanie.Sortowanie;
import sortowanie.SortownieUI;

import static mapy.Porzadek.MALEJACO;

public class SortowanieBabelkowe implements Sortowanie {

    public int[] sortuj(int[] tablicaElementow, Porzadek porzadek){
        int iloscOperacji = 0;
        for(int i=0; i<tablicaElementow.length; i++){
            for(int j=i+1; j<tablicaElementow.length; j++){
                iloscOperacji++;
                if(i != j){  // nie chcemy porównywać tego samego elementu
                    switch (porzadek){
                        case ROSNACO:
                            //czy element o indeksie 0 > element o indeksie 1...
                            if(tablicaElementow[j] < tablicaElementow[i]) {
                                //zamien wartosci w tablicy
                                int tmp = tablicaElementow[i];
                                tablicaElementow[i] = tablicaElementow[j];
                                tablicaElementow[j] = tmp;
                            }
                            break;
                        case MALEJACO:
                            //czy element o indeksie 0 > element o indeksie 1...
                            if(tablicaElementow[j] > tablicaElementow[i]) {
                                //zamien wartosci w tablicy
                                int tmp = tablicaElementow[i];
                                tablicaElementow[i] = tablicaElementow[j];
                                tablicaElementow[j] = tmp;
                            }
                            break;
                    }

                }
            }
        }
        SortownieUI.wyswietlTablice(tablicaElementow);
        System.out.println("Ilość operacji: "+iloscOperacji);
        return tablicaElementow;
    }



}


