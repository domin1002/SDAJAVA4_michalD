package pl.sda.testowanie;

import java.util.*;

public class App {

    public static void main(String[] args) {
        String str = "ABC\n" +
                     "123\n"+
                     "zx";

        StringBuilder sb = new StringBuilder();
        String[] tab = str.split("\n");
        int length = tab[0].length();
        for (int i = 0; i<tab.length; i++) {
            if(length>tab[i].length()) tab[i]+=(" ");
        }
        int index = tab[0].length();
        for (int i = 0; i < index; i++) {
            for (int j = 0; j < tab.length; j++) {
                System.out.print(tab[j].charAt(i));
            }
            System.out.print("\n");
        }
    }
}


