package com.nh;

import javax.tools.Tool;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

import static javafx.application.Platform.exit;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String path = "E:\\Michał SDA\\Exercises\\Franczyza\\naszeCentra.csv";
        List<Map<String, Object>> wczytanyPlik = Tools.wczytajPlik(path);
        List<PunktFranczyzowy> wczytaneObiekty = Tools.wczytajObiekty(wczytanyPlik);
        String wybor;
        int option = 0;

        ////////////////////////MENU/////////////////////////
        while (option != -1) {
            System.out.println("Wybierz opcję:");
            System.out.println("1. Wyświetl listę punktów franczyzowych");
            System.out.println("2. Dodaj punkt");
            System.out.println("3. Wyszukaj punkty w danym mieście");
            System.out.println("(-1 kończy program)");
            wybor = scanner.nextLine();

            try {
                option = Integer.parseInt(wybor);
            } catch (NumberFormatException e) {
                System.out.println("Wprowadź cyfrę!!! Błąd: " + e.getMessage() + "\n\n");
            }

            switch (option) {
                case 1:
                    Tools.wyswietlListe(wczytaneObiekty);
                    break;
                case 2:
                    String miasto, typ, skrotNazwy, oddzial, adres, osobaKontaktowa, email, nrTel;
                    System.out.println("Podaj miasto:");
                    scanner.nextLine();
                    miasto = scanner.nextLine();
                    System.out.println("Podaj typ (S/M):");
                    typ = scanner.nextLine();
                    System.out.println("Podaj skrót nazwy:");
                    skrotNazwy = scanner.nextLine();
                    System.out.println("Podaj oddział:");
                    oddzial = scanner.nextLine();
                    System.out.println("Podaj adres:");
                    adres = scanner.nextLine();
                    System.out.println("Podaj osobę do kontaktu:");
                    osobaKontaktowa = scanner.nextLine();
                    System.out.println("Podaj email:");
                    email = scanner.nextLine();
                    System.out.println("Podaj nr telefonu:");
                    nrTel = scanner.nextLine();
                    Tools.dodajPunkt(miasto, typ, skrotNazwy, oddzial, adres, osobaKontaktowa, email, nrTel, wczytaneObiekty);
                    Tools.wyswietlListe(wczytaneObiekty);
                    break;
                case 3:
                    String city;
                    System.out.println("Podaj miasto:");
                    city = scanner.nextLine();
                    List<PunktFranczyzowy> pkt = wczytaneObiekty.stream().filter(punkt -> {
                        if(city.equals(punkt.getMiasto())) return true;
                        else return false;
                    }).collect(Collectors.toList());
                    if(pkt.size()>0) Tools.wyswietlListe(pkt);
                    else System.out.println("Nie znaleziono punktów franczyzowych w danym mieście\n\n");
                    break;
                case -1:
                    exit();
                    break;
            }
        }
    }
}
