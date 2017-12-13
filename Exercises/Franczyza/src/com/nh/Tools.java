package com.nh;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Tools {
    public static List<Map<String, Object>> wczytajPlik(String path) {
        List<Map<String, Object>> wyniki = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));
            String linia = reader.readLine();

            while (linia != null) {
                Map<String, Object> wiersz = new HashMap<>();
                String[] wierszPliku = linia.split(";");
                if (wierszPliku.length < 9) {
                    linia = reader.readLine();
                    continue;
                }

                wiersz.put("Miasto", wierszPliku[1]);
                wiersz.put("Typ", wierszPliku[2]);
                wiersz.put("Skrót nazwy", wierszPliku[3]);
                wiersz.put("Oddział", wierszPliku[4]);
                wiersz.put("Adres", wierszPliku[5]);
                wiersz.put("Osoba kontaktowa", wierszPliku[6]);
                wiersz.put("Email", wierszPliku[7]);
                wiersz.put("Nr telefonu", wierszPliku[8]);
                wyniki.add(wiersz);
                linia = reader.readLine();
            }
            reader.close();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
        return wyniki;
    }

    public static List<PunktFranczyzowy> wczytajObiekty(List<Map<String, Object>> listaMap) {
        List<PunktFranczyzowy> listaPunktow = new ArrayList<>();
        for (int i = 1; i < listaMap.size(); i++) {
            Map<String, Object> wiersz = listaMap.get(i);
            PunktFranczyzowy punkt = new PunktFranczyzowy();
            punkt.setMiasto((String) wiersz.get("Miasto"));
            punkt.setTyp((String) wiersz.get("Typ"));
            punkt.setSkrotNazwy((String) wiersz.get("Skrót nazwy"));
            punkt.setOddzial((String) wiersz.get("Oddział"));
            punkt.setAdres((String) wiersz.get("Adres"));
            punkt.setOsobaKontaktowa((String) wiersz.get("Osoba kontaktowa"));
            punkt.setEmail((String) wiersz.get("Email"));
            String nrTel = (String) wiersz.get("Nr telefonu");
            String nrTrim = nrTel.trim();


            punkt.setNrTelefonu(nrTrim);
            listaPunktow.add(punkt);
        }
        return listaPunktow;
    }

    public static void wyswietlListe(List<PunktFranczyzowy> lista) {
        for (PunktFranczyzowy pkt : lista){
            System.out.println(pkt);
        }
    }

    public static void dodajPunkt(String m, String t, String s, String o, String a, String ok, String e, String nr, List lista) {
        PunktFranczyzowy pkt = new PunktFranczyzowy(m, t, s, o, a, ok, e, nr);
        lista.add(pkt);
    }

    public static PunktFranczyzowy searchInCity (String s) {


        return new PunktFranczyzowy();
    }
}




