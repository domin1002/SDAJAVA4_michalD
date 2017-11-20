package pl.sda.testowanie;

import java.time.LocalDateTime;
import java.util.*;

public class App {
    public static void main(String[] args) {
        //int number = 3;
        List<Signal> list = new ArrayList<>();
       // String temp = Integer.toBinaryString(number);
        String temp = "101";
        int length = temp.length(); // 2
        int[] tab = new int[5]; //4
                    //4           i=4>2
        for (int i = tab.length-1; i > temp.length(); i--) {
            //tab[4] = temp.substring(1, 2)
            tab[i]

        if (tab[4] == 1) list.add(Signal.WINK);
        if (tab[3] == 1) list.add(Signal.DOUBLE_BLINK);
        if (tab[2] == 1) list.add(Signal.CLOSE_YOUR_EYES);
        if (tab[1] == 1) list.add(Signal.JUMP);
        if (tab[0] == 1) Collections.reverse(list);

        System.out.println(list);
    }
}
