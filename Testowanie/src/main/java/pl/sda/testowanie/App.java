package pl.sda.testowanie;

import java.lang.reflect.Array;
import java.time.LocalDateTime;
import java.util.*;
import java.util.regex.Pattern;

public class App {
    public static void main(String[] args) {
        int verseNumber = 12;
        StringBuilder str = new StringBuilder("On the first day of Christmas my true love gave to me,");
        StringBuilder str2 = new StringBuilder("a Partridge in a Pear Tree.\n");

        if (verseNumber == 1) System.out.println(str.append(str2).toString());
        else{
            str.re
            String s = "twelve Drummers Drumming, eleven Pipers Piping, ten Lords-a-Leaping, nine Ladies Dancing, eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves";
            String[] tab = s.split(",");

            for (int i = tab.length-verseNumber+1; i < tab.length ; i++) {
                str.append(tab[i]+",");
            }
            System.out.println(str.append(" and "+str2).toString());
        }
    }
}


