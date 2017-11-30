package pl.sda.testowanie;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {
        String stringToVerify = "3-598-21508-8";

        List<Integer> list = new ArrayList<>();
        char subStr;
        for (int i = 0; i < stringToVerify.length(); i++) {
            subStr = stringToVerify.charAt(i);
            if(i == stringToVerify.length()-1 && subStr == 'X') {
                list.add(10);
                continue;
            }
            list.add(Integer.parseInt(stringToVerify.substring(i, i+1)));
        }
        int wynik = 0;
        int multi = 10;
        for(int i = 0; i<list.size(); i++) {
            wynik = wynik + list.get(i)*multi;
            multi--;
        }

        System.out.println(wynik%11);
    }

}


