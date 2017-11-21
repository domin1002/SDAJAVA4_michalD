package pl.sda.testowanie;

import java.time.LocalDateTime;
import java.util.*;

public class App {
    public static void main(String[] args) {
        int number = 6;
        getClassification(number);


    }

    public static void getClassification( int number) {
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) sum += i;
        }
        if (number == sum) System.out.println("Perfect "+sum);
        else if (number < sum) System.out.println("Abundant "+sum);
        else System.out.println("Defficent "+sum);
    }
}
