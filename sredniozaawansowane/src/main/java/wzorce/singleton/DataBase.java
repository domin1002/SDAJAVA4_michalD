package wzorce.singleton;

import java.util.ArrayList;

public class DataBase {

    private static DataBase instance = null;
    private ArrayList<String> list = null;

    //modyfikator prywatny żeby java nie utorzyła konstruktora domyślnego o dostępie publicznym czyli blokujemy domyślny konstruktor
    private DataBase() {
        list = new ArrayList<>();
    }

    //jeśli to pole nie jest zainicjalizowane to utwórz, a jeśli jest to je zwróć.
    public static DataBase getInstance() {
        if(instance ==null) {
            instance = new DataBase();
        }
        return instance;
    }

    public void saveData(String value) {
        list.add(value);
    }

    public void displayData() {
        System.out.println(list);
    }
}
