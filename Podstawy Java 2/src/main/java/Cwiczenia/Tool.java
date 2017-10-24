package Cwiczenia;

import ksiegowosc.Persona;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Tool {
    public static List<Map<String, Object>> wczytajPlik (String path) throws FileNotFoundException {
        List<Map<String, Object>> wyniki = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(path));
        try {
            String linia = reader.readLine();
            while(linia != null){
                Map<String, Object> wiersz = new HashMap<>();
                String[] wierszTablica = linia.split(";");
                if(wierszTablica.length < 12) {
                    linia = reader.readLine();
                    continue;
                }
                wiersz.put("Płeć", wierszTablica[0]);
                wiersz.put("Imię", wierszTablica[1]);
                wiersz.put("Nazwisko", wierszTablica[2]);
                wiersz.put("Miasto", wierszTablica[3]);
                wiersz.put("Ulica", wierszTablica[4]);
                wiersz.put("KodPocztowy", wierszTablica[5]);
                wiersz.put("Wiek", wierszTablica[8]);
                wiersz.put("DataUrodzenia", wierszTablica[9]);
                wiersz.put("Zawód", wierszTablica[10]);
                wiersz.put("Zarobki", wierszTablica[11]);
                wyniki.add(wiersz);
                linia = reader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return wyniki;
    }

    public static List<Persona> wczytajPersony (List<Map<String, Object>> lista){
        for(int i=1; i<lista.size(); i++){
            Map<String, Object> wiersz = lista.get(i);
            Persona persona = new Persona();

        }
        return new ArrayList<>();
    }

}
