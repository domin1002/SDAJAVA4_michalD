package Cwiczenia;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) throws FileNotFoundException {
        String path = "D:/baza.csv";
        List<Map<String, Object>> wierszePliku = Tool.wczytajPlik(path);
        System.out.println(wierszePliku.get(1));
    }
}
