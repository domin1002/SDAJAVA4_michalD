package mapy;

public class Narzedzia {
    public static Ksiazka utworzKsiazke(String imie, String nazwisko,
                                        Integer wiek, String tytul,
                                        String isbn, Integer liczbaStron,
                                        Kategoria kategoria){
        Autor autor = new Autor(imie, nazwisko, wiek);
        Ksiazka ksiazka = new Ksiazka(tytul, liczbaStron, isbn, autor, kategoria);
        return ksiazka;
    }
}
