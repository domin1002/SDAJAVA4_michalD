package Cwiczenia;

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

        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));
            String linia = reader.readLine();
            while (linia != null){
                Map<String, Object> wiersz = new HashMap<>();
                String[] wierszTablicy = linia.split(";");
                if(wierszTablicy.length < 12){
                    linia = reader.readLine();
                    continue;
                }
                if(wierszTablicy[8].equals("Age")) {
                    linia = reader.readLine();
                    continue;
                }
                Integer age1 = Integer.parseInt(wierszTablicy[8]);
                if(age1 >= 21 && age1 <=40){
                    wiersz.put("Imie", wierszTablicy[1]);
                    wiersz.put("Nazwisko", wierszTablicy[2]);
                    wiersz.put("Stanowisko", wierszTablicy[10]);
                    wiersz.put("Zarobki", wierszTablicy[11]);
                    wyniki.add(wiersz);
                }
                linia = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return wyniki;
    }


}
