package ksiegowosc;

import jdk.nashorn.internal.runtime.ListAdapter;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class Interfejs {
    public static void main(String[] args) {
        String sciezkaDoPliku = "D:/baza.csv";
        List<Map<String, Object>> wierszPliku = NarzedziaCsv.wczytajCsvZPliku(sciezkaDoPliku);
        //       System.out.println(wierszPliku.get(0));
        List<Persona> osoby = NarzedziaCsv.zamienMapeNaPersona(wierszPliku);

/*        //Wszystkie osoby o imieniu Dariusz
        List<Persona> imiona = osoby.stream().filter(persona -> persona.getImie().equals("Dariusz")).collect(Collectors.toList());
        wyswietlListe(imiona);
        System.out.println(imiona.size());

        //zwracamy liste wszystkich nazwisk
        List<String> nazwiska = osoby.stream().map(persona -> persona.getNazwisko()).collect(Collectors.toList());
        System.out.println(nazwiska);

        //aby wyswietlic nazwiska unikalne wrzucamy to do SET
        Set<String> nazwiskaUnikalne = osoby.stream().map(persona -> persona.getNazwisko()).collect(Collectors.toSet());
        System.out.println(nazwiskaUnikalne);*/

        //osoby starsze niz 35 lat i nazwiska zaczynajace sie na S
        List<Persona> zad1 = osoby.stream().filter(persona -> {
            String nazwisko = persona.getNazwisko();
            String litera = nazwisko.substring(0, 1);
            if (persona.getWiek() > 35 && litera.equals("S"))
                return true;
            else return false;

        }).collect(Collectors.toList());
        System.out.println("Lista osób starsza niż 35 lat z nazwiskiem rozpoczynającym się na S:");
        System.out.println(zad1);
        System.out.println();

        //osoby w wieku produkcyjnym
        List<Persona> zad2 = osoby.stream().filter(persona -> {
            if (persona.getPlec() == Plec.MEZCZYZNA && persona.getWiek() >= 18 && persona.getWiek() <= 65) return true;
            else if (persona.getPlec() == Plec.KOBIETA && persona.getWiek() >= 18 && persona.getWiek() <= 60)
                return true;
            else return false;
        }).collect(Collectors.toList());
        System.out.println("Lista osób w wieku produkcyjnym:");
        System.out.println(zad2);
        System.out.println();

        //osoby mieszkajace w Gdańsku lub Warszawie
        List<Persona> zad3 = osoby.stream().filter(persona -> persona.getMiasto().equals("Gdańsk") || persona.getMiasto().equals("Warszawa"))
                .collect(Collectors.toList());
        System.out.println("Lista osób z Gdańska lub Warszawy:");
        System.out.println(zad3);
        System.out.println();

        //osoby urodzone w maju
        List<Persona> zad4 = osoby.stream().filter(persona -> persona.getDataUrodzenia().getMonthValue() == 5).collect(Collectors.toList());
        System.out.println(zad4);
        System.out.println();

        //osoby których kod pocztowy zaczyna się od cyfry 9
        List<Persona> zad5 = osoby.stream().filter(persona -> {
            String kod = persona.getKodPocztowy().substring(0, 1);
            if (kod.equals("9")) return true;
            else return false;
        }).collect(Collectors.toList());
        System.out.println("Lista osób z kodem pocztowym rozpoczynającym się od 9:");
        System.out.println(zad5);
        System.out.println();

        //zwracamy liste unikalnych zawodow
        Set<String> zad6 = osoby.stream().map(persona -> persona.getZawod()).collect(Collectors.toSet());
        System.out.println("Lista unikalnych zawodów");
        System.out.println(zad6);
        System.out.println();

        //Pierwsze 20 osob z najwyższymi dochodami
        List<Persona> burzuje = osoby.stream().sorted(((o1, o2) -> o2.getZarobki().compareTo(o1.getZarobki()))).limit(20).collect(Collectors.toList());
        wyswietlListe(burzuje);
        System.out.println();

        //wyswietlamy pierwsze 20 osob z najwyzszymi dochodami analog

        List<Persona> sortowanie = new ArrayList<>(osoby);
        Collections.sort(sortowanie, new Comparator<Persona>() {
            @Override
            public int compare(Persona o1, Persona o2) {
                return o2.getZarobki().compareTo(o1.getZarobki());
            }
        });
        List<Persona> posortowane20 = sortowanie.subList(0, 20);
        System.out.println("Analog:");
        wyswietlListe(posortowane20);


        //wyswietlamy srednia zarobkow dla osob w przedziale 21-30
        Double zad7 = osoby.stream().filter(persona -> persona.getWiek() >= 21 && persona.getWiek() <= 30)
                .mapToInt(persona -> persona.getZarobki()).average().getAsDouble();
        System.out.println("Średnia zarobków osób w przedziale wiekowym 21-30: " + zad7);


        //ilosc kobiet i mezczyzn
        long male = osoby.stream().filter(persona -> persona.getPlec() == Plec.MEZCZYZNA).count();
        System.out.println("Liczba mężczyzn: "+male);
        long female = osoby.stream().filter(persona -> persona.getPlec() == Plec.KOBIETA).count();
        System.out.println("Liczba kobiet: " + female);

        //ilosc kobiet i mezczyzn za pomoca jednego streama
        int[] count = osoby.stream().map(persona -> {
            if(persona.getPlec().equals(Plec.KOBIETA)) return new int[] {1,0};
            else return new int[]{0,1};
        }).reduce(new int[2], (a, b) ->{
            a[0] = a[0] + b[0]; //ilosc kobiet
            a[1] = a[1] + b[1]; //ilosc mezczyzn
            return a;
        });

        System.out.println(count[0] + " " + count[1]);

        System.out.println(iloscPracownikowWMiastach("Warszawa", osoby));

/*        Map<String, Integer> zarobkiWgStanowisk = new HashMap<>();
        zarobkiWgStanowisk = osoby.stream().map(persona -> {

        })*/

    }




    private static void wyswietlListe(List<Persona> lista) {
        for (Persona persona : lista) {
            System.out.println(persona);
        }
    }

    public static long iloscPracownikowWMiastach (String miasto, List<Persona>osoby){
        long iloscPracwonikow = osoby.stream().filter(persona -> persona.getMiasto().equals(miasto)).count();
        return iloscPracwonikow;
    }
}
