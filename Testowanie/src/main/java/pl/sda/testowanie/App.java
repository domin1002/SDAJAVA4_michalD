package pl.sda.testowanie;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class App {

    public static void main(String[] args) {
        String str = "Adncid--- cv s";
        String temp = str.replaceAll("[\\s\\-]", "");
        System.out.println(temp);
    }
}


