import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Hello {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        List<Integer> lista = new ArrayList<>();
        int size;

        System.out.println("Podaj liczbę elementów które chcesz wprowdzić:");
        size = s.nextInt();

        for(int i=0; i<size; i++){
            System.out.println("Podaj liczbę o indeksie "+i);
            int liczba = s.nextInt();
            lista.add(liczba);
        }

        System.out.println("Podaj liczbę operacji do wykonania:");
        size = s.nextInt();

        for(int i=0; i<size; i++){
            System.out.println("podaj nazwę polecenia które chcesz wykonać? (INSERT/DELETE)");
            String polecenie = s.next();
            if("Insert".equals(polecenie)){
                System.out.println("Podaj nr indeksu:");
                int index = s.nextInt();
                if(index>lista.size()){
                    System.out.println("Za duży index!!!");
                }
                else{
                    System.out.println("Podaj liczbę którą chcesz przypisać do podanego indexu:");
                    int liczba = s.nextInt();
                    lista.add(index, liczba);
                }

            }
            else if("Delete".equals(polecenie)){
                System.out.println("Podaj numer indexu który chcesz usunąć:");
                int index = s.nextInt();
                if(index+1>lista.size()){
                    System.out.println("Za duży index!");
                }
                else{
                    lista.remove(index);
                }

            }
        }
        System.out.println(lista);

    }
}
