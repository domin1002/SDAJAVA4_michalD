package sortowanie.sortowaniePrzezWymiane;


import mapy.Porzadek;
import sortowanie.Sortowanie;

public class SortowaniePrzezWymiane implements Sortowanie {
    @Override
    public int[] sortuj(int[] tablicaElementow, Porzadek porzadek) {

        int iloscOperacji = 0;
        for (int i = 0; i < tablicaElementow.length; i++) {
            int min = tablicaElementow[i];
            int index = i;
            for (int j = i + 1; j < tablicaElementow.length; j++) {
                switch (porzadek) {
                    case ROSNACO:
                        if (tablicaElementow[j] < min) {
                            index = j;
                            min = tablicaElementow[index];
                        }
                        break;
                    case MALEJACO:
                        if (tablicaElementow[j] > min) {
                            index = j;
                            min = tablicaElementow[index];
                        }
                        break;
                }

                iloscOperacji++;
            }

            tablicaElementow[index] = tablicaElementow[i];
            tablicaElementow[i] = min;
        }
        System.out.println("Ilość operacji: "+iloscOperacji);
        return tablicaElementow;
    }

}
